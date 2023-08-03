package com.reactiveWork.ProductCategory.util;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class CassandraConnection {
	private Cluster cluster;
	private Session session;

	public void connectdb(String node, int port)
	{
		this.cluster = Cluster.builder().addContactPoint(node).withPort(port).build();
		final Metadata metadata = cluster.getMetadata();
		for (final Host host : metadata.getAllHosts())
		{
			System.out.println("driver version : "+host.getCassandraVersion());
		}
		this.session = cluster.connect();
	}
	public Session getSession()
	{
		return this.session;
	}
	public void close()
	{
		cluster.close();
	}
}
