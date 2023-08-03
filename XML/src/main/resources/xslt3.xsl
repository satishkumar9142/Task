<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="xml" version="1.0" indent="yes" encoding="UTF-8"
              omit-xml-declaration="yes"
              xslt:indent-amount="2"
              xmlns:xslt="http://xml.apache.org/xslt" />  

  <xsl:template match="/">
    <soapenv:Envelope
        xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
		xmlns:tem="http://tempuri.org/"
        xmlns:key="http://schemas.datacontract.org/2004/07/Key2Act.OnPremiseServices.TTTrx.eTimeTrackService/" >
		
      <soapenv:Header/>
      <soapenv:Body>
        <tem:InsertTransaction>
		   <xsl:for-each select ="InsertTransaction">
			 <tem:Tenant>
			    <xsl:value-of select="Tenant" />
			 </tem:Tenant>
			 <tem:Companydbname>
			    <xsl:value-of select="Companydbname" />
			 </tem:Companydbname> 
			 <tem:trx>
			    <xsl:apply-templates select="trx/*"/>
			 </tem:trx>
		  </xsl:for-each>
        </tem:InsertTransaction>
      </soapenv:Body>
    </soapenv:Envelope>
  </xsl:template>
  
  <xsl:template match="*" >
    <xsl:element name="key:{local-name()}">
      <xsl:value-of select="."/>
    </xsl:element>
  </xsl:template>
  
</xsl:stylesheet>