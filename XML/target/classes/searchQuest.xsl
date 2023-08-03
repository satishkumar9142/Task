<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="xml" version="1.0" indent="yes" encoding="UTF-8"
              omit-xml-declaration="yes"
              xslt:indent-amount="2"
              xmlns:xslt="http://xml.apache.org/xslt" />  

  <xsl:template match="/">
    <soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope/">
      <soap:Header/>
      <soap:Body>
		 <wor:SearchDocuments xmlns:wor="http://worksite.imangine.com">
       		  <xsl:for-each select = "SEARCHREQUEST">
			<wor:Database>
				<wor:string>
					<xsl:value-of select = "PSSSEARCHPARAM1" />
				</wor:string>
			</wor:Database>
			<wor:profileSearchParameters>
				<wor:AttributeID>
					<xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDescriptor</xsl:text>
						</xsl:otherwise>
					</xsl:choose>
				</wor:AttributeID>
				<wor:SearchValue>
					<xsl:value-of select = "PSSSEARCHPARAM2" />
				</wor:SearchValue>
			</wor:profileSearchParameters>
			<wor:profileSearchParameters>
				<wor:AttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDescriptor3</xsl:text>
						</xsl:otherwise>
					</xsl:choose>
				</wor:AttributeID>
				<wor:SearchValue>
					<xsl:value-of select = "PSSSEARCHPARAM4" />
				</wor:SearchValue>
			</wor:profileSearchParameters>
			<wor:profileSearchParameters>
				<wor:AttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDescriptor4</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
				</wor:AttributeID>
				<wor:SearchValue>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>App,20</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
				</wor:SearchValue>
			</wor:profileSearchParameters>
			<wor:profileSearchParameters>
				<wor:AttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDocNum</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
				</wor:AttributeID>
				<wor:SearchValue>
					<xsl:value-of select = "PSSSEARCHPARAM3" />
				</wor:SearchValue>
			</wor:profileSearchParameters>
			<wor:profileSearchParameters>
				<wor:SearchEmail>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imSearchDocumentsOnly</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
				</wor:SearchEmail>
				<wor:OutputMask>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>Profile</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
				</wor:OutputMask>
			</wor:profileSearchParameters>
			<wor:OutputProfile>
				<wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDocNum</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
			    </wor:imProfileAttributeID>
			    <wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDescription</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
			    </wor:imProfileAttributeID>
			    <wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileVersion</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
				</wor:imProfileAttributeID>
				<wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileCustom16</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
				</wor:imProfileAttributeID>
				<wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileCustom3</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
				</wor:imProfileAttributeID>
				<wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileDatabase</xsl:text>
						</xsl:otherwise>
				     </xsl:choose>
				</wor:imProfileAttributeID>
				<wor:imProfileAttributeID>
					 <xsl:choose>
						<xsl:when test ="AttributeID=''" ></xsl:when>
						<xsl:otherwise>
							<xsl:text>imProfileExtension</xsl:text>
						</xsl:otherwise>
				     </xsl:choose> 
				</wor:imProfileAttributeID>
			</wor:OutputProfile>
		  </xsl:for-each>
		 </wor:SearchDocuments>
      </soap:Body>
    </soap:Envelope>
  </xsl:template>
</xsl:stylesheet>