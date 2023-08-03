<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
    <soapenv:Envelope 
	xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	xmlns="http://fedex.com/ws/ship/v17">
   <soapenv:Body>
			<ProcessShipmentRequest>
				<WebAuthenticationDetail>
					<UserCredential>
						<xsl:for-each select="Shipment/WebAuthenticationDetail/UserCredential">
							<Key>
								<xsl:value-of select="@Key" />
							</Key>
							<Password>
								<xsl:value-of select="@Password" />
							</Password> 
						</xsl:for-each>
					</UserCredential>
				</WebAuthenticationDetail>
				<ClientDetail>
					<xsl:for-each select="Shipment/ClientDetail">
						<AccountNumber>
							<xsl:value-of select="AccountNumber" />
						</AccountNumber>
						<MeterNumber>
							<xsl:value-of select="MeterNumber" />
						</MeterNumber> 
					</xsl:for-each>
				</ClientDetail>
				<Version>
					<xsl:for-each select="Shipment/Version">
						<ServiceId>
							<xsl:value-of select="ServiceId" />
						</ServiceId>
						<Major>
							<xsl:value-of select="Major" />
						</Major> 
						<Intermediate>
							<xsl:value-of select="Intermediate" />
						</Intermediate>
						<Minor>
							<xsl:value-of select="Minor" />
						</Minor> 
						</xsl:for-each>
				</Version>
				<RequestedShipment>
					<xsl:for-each select="Shipment/RequestedShipment">
						<ShipTimestamp>
							<xsl:value-of select="ShipTimestamp" />
						</ShipTimestamp>
						<DropoffType>
							<xsl:value-of select="DropoffType" />
						</DropoffType>
						</xsl:for-each>
							<ServiceType>
								<xsl:for-each select="Shipment/ServiceVal/HostServiceType/HostNaming/HostName">
									<xsl:value-of select="Service"/>
								</xsl:for-each>
							</ServiceType>
							<xsl:for-each select="Shipment/RequestedShipment">
								<PackagingType>
									<xsl:value-of select="PackagingType" />
								</PackagingType>
							</xsl:for-each>
						
						<Shipper>
							<Contact>
								<xsl:for-each select="Shipment/Sender/Contact">
									<PersonName>
										<xsl:value-of select="PersonName" />
									</PersonName>
									<CompanyName>
										<xsl:value-of select="CompanyName" />
									</CompanyName>
									<PhoneNumber>
										<xsl:value-of select="PhoneNumber" />
									</PhoneNumber>								
								</xsl:for-each>
							</Contact>		
							<Address>
								<xsl:for-each select="Shipment/Sender/Address">
									<StreetLines>
										<xsl:value-of select="StreetLine1" />
									</StreetLines>
									<StreetLines>
										<xsl:value-of select="StreetLine2" />
									</StreetLines>
									<City>
										<xsl:value-of select="City" />
									</City>
									<StateOrProvinceCode>
										<xsl:value-of select="StateOrProvinceCode" />
									</StateOrProvinceCode>										
									<PostalCode>
										<xsl:value-of select="PostalCode" />
									</PostalCode>	
									<CountryCode>
										<xsl:value-of select="CountryCode" />
									</CountryCode>
								</xsl:for-each>
							</Address>		
						</Shipper>	
						
						<Recipient>
							<Contact>
								<xsl:for-each select="Shipment/Recipient/Contact">
									<PersonName>
										<xsl:value-of select="PersonName" />
									</PersonName>
									<CompanyName>
										<xsl:value-of select="CompanyName" />
									</CompanyName>
									<PhoneNumber>
										<xsl:value-of select="PhoneNumber" />
									</PhoneNumber>
								</xsl:for-each>
							</Contact>		
							<Address>
								<xsl:for-each select="Shipment/Recipient/Address">
									<StreetLine1>
										<xsl:value-of select="StreetLine1" />
									</StreetLine1>
									<StreetLine2>
										<xsl:value-of select="StreetLine2" />
									</StreetLine2>
									<City>
										<xsl:value-of select="City" />
									</City>
									<StateOrProvinceCode>
										<xsl:value-of select="StateOrProvinceCode" />
									</StateOrProvinceCode>
										<PostalCode>
										<xsl:value-of select="PostalCode" />
									</PostalCode>	
									<CountryCode>
										<xsl:value-of select="CountryCode" />
									</CountryCode>
								</xsl:for-each>
							</Address>		
						</Recipient>		
						
						<ShippingChargesPayment>
							<xsl:for-each select="Shipment/ShippingChargesPayment">
								<PaymentType>
									<xsl:value-of select="PaymentType" />
								</PaymentType>
							</xsl:for-each>	
							<Payor>
								<ResponsibleParty>
									<xsl:for-each select="Shipment/ClientDetail">
										<AccountNumber>
											<xsl:value-of select="AccountNumber" />
										</AccountNumber>
									</xsl:for-each>
										<Address>
											<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillShipper/ShipperAddress">
												<PostalCode>
													<xsl:value-of select="PostalCode" />
												</PostalCode>
												<CountryCode>
													<xsl:value-of select="CountryCode" />
												</CountryCode>
											</xsl:for-each>
										</Address>		
								</ResponsibleParty>		
							</Payor>		
						</ShippingChargesPayment>			
						
						<LabelSpecification>
							<xsl:for-each select="Shipment/LabelSpecification">
								<LabelFormatType>
									<xsl:value-of select="LabelFormatType" />
								</LabelFormatType>
								<ImageType>
									<xsl:value-of select="ImageType" />
								</ImageType>
							</xsl:for-each>	
						</LabelSpecification>
						
						<xsl:for-each select="Shipment/Packages">
							<PackageCount>
								<xsl:value-of select="PackageCount" />
							</PackageCount>
						</xsl:for-each>	
							
						<RequestedPackageLineItems>
							<Weight>
								<xsl:for-each select="Shipment/Packages/Package/Weight">
									<Units>
										<xsl:value-of select="Units" />
									</Units>
									<Value>
										<xsl:value-of select="Value" />
									</Value>
								</xsl:for-each>	
							</Weight>
							
							<Dimensions>
								<xsl:for-each select="Shipment/Packages/Package/Dimensions">
									<Length>
										<xsl:value-of select="Length" />
									</Length>
									<Width>
										<xsl:value-of select="Width" />
									</Width>
									<Height>
										<xsl:value-of select="Height" />
									</Height>
									<Units>
										<xsl:value-of select="Units" />
									</Units>
								</xsl:for-each>	
							</Dimensions>
						</RequestedPackageLineItems>
					</RequestedShipment>
				</ProcessShipmentRequest>
			  </soapenv:Body>
			</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>