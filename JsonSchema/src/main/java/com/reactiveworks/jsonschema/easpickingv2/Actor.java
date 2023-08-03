package com.reactiveworks.jsonschema.easpickingv2;

public class Actor {
	private String actortype;
	private String name;
	private String link;
	private String id;
	private Content content;
	public String getActortype() {
		return actortype;
	}
	public void setActortype(String actortype) {
		this.actortype = actortype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
}
