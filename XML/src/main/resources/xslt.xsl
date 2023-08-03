<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

<xsl:template match="/">
    <Shipment>
		<serviceVal>
			<HostServiceType>
				<HostNaming>
					<HostName>
						<xsl:for-each select="Shipment/Service/HostServiceType/HostNaming/HostName">
							<Carrier>
								<xsl:value-of select="Carrier" />
							</Carrier>
							<Service>
								<xsl:value-of select="Service" />
							</Service> 
							<Type>
								<xsl:value-of select="Type" />
							</Type>
							<AncillaryEndorsement>
								<xsl:value-of select="AncillaryEndorsement" />
							</AncillaryEndorsement> 
							<HubId>
								<xsl:value-of select="HubId" />
							</HubId>
						</xsl:for-each>
					</HostName>
				</HostNaming>
			</HostServiceType>
		</serviceVal>

		<Shipper>
			<xsl:for-each select="Shipment/Shipper">
				<shipper_id>
					<xsl:value-of select="shipper_id" />
				</shipper_id>
			</xsl:for-each>
		</Shipper>		
		
		<Sender>
			<Contact>
				<xsl:for-each select="Shipment/ShipFromAddress/FromContactAndAddress">
						<CompanyName>
							<xsl:value-of select="CompanyName" />
						</CompanyName>
						<PersonName>
							<xsl:value-of select="PersonName" />
						</PersonName>
						<PhoneNumber>
							<xsl:value-of select="PhoneNumber" />
						</PhoneNumber>
				</xsl:for-each>
			</Contact>
			
			<Address>
				<xsl:for-each select="Shipment/ShipFromAddress/FromContactAndAddress">
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
					<ResidentialAddressIndicator>
						<xsl:value-of select="ResidentialAddressIndicator" />
					</ResidentialAddressIndicator>
				</xsl:for-each>
			</Address>
		</Sender>
		
		<Recipient>
			<Contact>
				<xsl:for-each select="Shipment/ShipToAddress/ToContactAndAddress">
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
				<xsl:for-each select="Shipment/ShipToAddress/ToContactAndAddress">
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
						<ResidentialAddressIndicator>
							<xsl:value-of select="ResidentialAddressIndicator" />
						</ResidentialAddressIndicator>
				</xsl:for-each>
			</Address>
		</Recipient>
		
		<Packages>
				<xsl:for-each select="Shipment/Packages">
						<PackageCount>
								<xsl:value-of select="PackageCount" />
						</PackageCount>
				</xsl:for-each>
				
				<Package>
					<xsl:for-each select="Shipment/Packages/Package">
						<DropOffTime>
								<xsl:value-of select="DropOffTime" />
						</DropOffTime>
						<ShipDate>
								<xsl:value-of select="ShipDate" />
						</ShipDate>
					</xsl:for-each>
					<xsl:for-each select="Shipment/Packages/Package/PackagingType">
						<PackagingType>
								<PackagingTypeCode>
										<xsl:value-of select="PackagingTypeCode" />
								</PackagingTypeCode>
						</PackagingType>
					</xsl:for-each>
					<xsl:for-each select="Shipment/Packages">
						<PackageCount>
								<xsl:value-of select="PackageCount"/>
						</PackageCount>
					</xsl:for-each>
					<Weight>
					    <xsl:for-each select="Shipment/Packages/Package/Weight/WeightUnitOfMeasurement">
							<Units>
								<xsl:value-of select="WeightCode"/>
							</Units>
						</xsl:for-each> 
						<xsl:for-each select="Shipment/Packages/Package/Weight">
							<Value>
								<xsl:value-of select="Weight"/>
							</Value>
						</xsl:for-each>
					</Weight>
					
					<Dimensions>
					    <xsl:for-each select="Shipment/Packages/Package/Dimensions">
							<Length>
								<xsl:value-of select="Length"/>
							</Length>
							<Width>
								<xsl:value-of select="Width"/>
							</Width>
							<Height>
								<xsl:value-of select="Height"/>
							</Height>
							<Units>
								<xsl:value-of select="Units"/>
							</Units>
						</xsl:for-each> 
					</Dimensions>
				</Package>
		</Packages>
		
		
		<PaymentInformation>
			<ShipmentCharge>
				<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge">
					<Type>
						<xsl:value-of select="Type"/>
					</Type>
				</xsl:for-each>
				<BillShipper>
					<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillShipper">
						<AccountNumber>
							<xsl:value-of select="AccountNumber"/>
						</AccountNumber>
					</xsl:for-each>
						<ShipperAddress>
							<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillShipper/CreditCard/ShipperAddress">
								<PostalCode>
									<xsl:value-of select="PostalCode"/>
								</PostalCode>
								<CountryCode>
									<xsl:value-of select="CountryCode"/>
								</CountryCode>
							</xsl:for-each>
						</ShipperAddress>
				</BillShipper>
				
				<BillThirdParty>
					<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillThirdParty">
						<AccountNumber>
							<xsl:value-of select="AccountNumber"/>
						</AccountNumber>
					</xsl:for-each>
						<ThirdPartyAddress>
							<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillThirdParty/ThirdPartyAddress">
								<PostalCode>
									<xsl:value-of select="PostalCode"/>
								</PostalCode>
								<CountryCode>
									<xsl:value-of select="CountryCode"/>
								</CountryCode>
							</xsl:for-each>
						</ThirdPartyAddress>
				</BillThirdParty>
				
				<BillReceiver>
					<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillReceiver">
						<AccountNumber>
							<xsl:value-of select="AccountNumber"/>
						</AccountNumber>
					</xsl:for-each>
						<ReceiverAddress>
							<xsl:for-each select="Shipment/PaymentInformation/ShipmentCharge/BillReceiver/ReceiverAddress">
								<PostalCode>
									<xsl:value-of select="PostalCode"/>
								</PostalCode>
							</xsl:for-each>
						</ReceiverAddress>
				</BillReceiver>
			</ShipmentCharge>
		</PaymentInformation>

		<LabelSpecification>
			<xsl:for-each select="Shipment/LabelSpecification">
				<ImageType>
					<xsl:value-of select="ImageType"/>
				</ImageType>
			</xsl:for-each>
		</LabelSpecification>
    </Shipment>
	
</xsl:template>
</xsl:stylesheet>