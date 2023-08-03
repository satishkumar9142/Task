<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
xmlns:hm="http://fedex.com/ws/ship/v17"
exclude-result-prefixes="hm">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">                                                         						
	<ShipReply>                                                                  							
		<xsl:for-each select="//hm:Notifications">
			<Notification>
				<xsl:value-of select="hm:Severity"/>
			</Notification>    																				
			<Code>
				<xsl:value-of select="hm:Code"/>
			</Code>  																							 
			<Message>
				<xsl:value-of select="hm:Message"/>
			</Message>  																						
		</xsl:for-each> 
		
		<CompletedShipmentDetail>    																			 
			 <xsl:for-each select="//hm:MasterTrackingId">
				<Carrier>
					<xsl:value-of select="hm:TrackingIdType"/>
				</Carrier>																						
				<ServiceType>
					<xsl:value-of select="hm:TrackingIdType" />
				</ServiceType>
			 </xsl:for-each>   																				     
			<CommitDetails>  																				     
				<CommitTimestamp> 
				  <xsl:for-each select="//hm:OperationalDetail">
					 <xsl:value-of select="hm:TransitTime" />
				  </xsl:for-each> 
				</CommitTimestamp>   																			 
			</CommitDetails>  																					 
				
			<SequenceNumber>  
				 <xsl:for-each select="//hm:CompletedPackageDetails">
					 <xsl:value-of select="hm:SequenceNumber" />
				  </xsl:for-each> 
			</SequenceNumber> 																					 
			
			<MasterTrackingId>       																			 
				<TrackingNumber>
					<xsl:choose>
					<xsl:when test ="TrackingNumber=''" ></xsl:when>
					<xsl:otherwise>
						<xsl:text>No MasterTrackingId</xsl:text>
					</xsl:otherwise>
				</xsl:choose>
				</TrackingNumber>   																			 
			</MasterTrackingId>  																				 
			
			<TrackingIds>        																				 
				<TrackingNumber>
					 <xsl:for-each select="//hm:MasterTrackingId">
						 <xsl:value-of select="hm:TrackingNumber" />
					  </xsl:for-each> 
				</TrackingNumber>  																				 
			</TrackingIds>  																					
			
			<ManifestMsn>
				<xsl:choose>
					<xsl:when test ="ManifestMsn=''" >  
				    </xsl:when>
					<xsl:otherwise>
						<xsl:text>Not Available</xsl:text>
					</xsl:otherwise>
				</xsl:choose>
			</ManifestMsn>   																					 
			
			<Label>        																						
				<xsl:for-each select="//hm:Label">
					<Type>
						<xsl:value-of select="hm:Type" />
					</Type> 																					 
					<ImageType>
						<xsl:value-of select="hm:ImageType" />
					</ImageType> 																				 
					<Resolution>
						<xsl:value-of select="hm:Resolution" />
					</Resolution> 																				  
				</xsl:for-each> 
				<xsl:for-each select="//hm:Parts">
					<Image>
						<xsl:value-of select="hm:Image" />
					</Image>   																					
				</xsl:for-each> 
			</Label>  																							
		 </CompletedShipmentDetail>																			    
	</ShipReply>
</xsl:template>
</xsl:stylesheet>  
