<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:pfi="http://xmlns.fedex.com/FDXREV.PFIRated/1.1.1"
                xmlns:fxg="http://xmlns.fedex.com/FDXREV.PFIRated.FXG/1.1.1"
                xmlns:share="http://xmlns.fedex.com/FDXREV.PFIRated.Shared/1.1.1"
                version="1.0">
    <xsl:template match="/ECIPackages">
        <xsl:element name="ECIPackages">
            <xsl:for-each select="pfi:PFIRated">
                <xsl:element name="PfiPackage">
                    <xsl:element name="SpShipperNum9">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:billToAddr/@acctNbr" />
                    </xsl:element>
                    <xsl:element name="SpPackageNum">
                        <xsl:value-of select="concat(pfi:svcInfo/@trkngNbrPfx, pfi:svcInfo/@trkngNbr)" />
                    </xsl:element>
                    <xsl:element name="SpManifestNum">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:refNotes/@invoice" />
                    </xsl:element>
                    <xsl:element name="SpSortEndDate">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@actlDlvryDt" />
                    </xsl:element>
                    <xsl:element name="SpPickupDate">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@actlDlvryDt" />
                    </xsl:element>
                    <xsl:element name="SpArrivalDate">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@actlDlvryDt" />
                    </xsl:element>
                    <xsl:element name="SpCustWgtUom">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:weight/share:cust/@UOM" />
                    </xsl:element>
                    <xsl:element name="SpCustWgt">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:weight/share:cust/@val" />
                    </xsl:element>
                    <xsl:choose>
                        <xsl:when test="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:cust/@UOM">
                            <xsl:element name="SpCustDimUom">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:cust/@UOM" />
                            </xsl:element>
                            <xsl:element name="SpCustLength">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:cust/@lenQty" />
                            </xsl:element>
                            <xsl:element name="SpCustWidth">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:cust/@wdthQty" />
                            </xsl:element>
                            <xsl:element name="SpCustHeight">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:cust/@hghtQty" />
                            </xsl:element>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:element name="SpCustDimUom">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@UOM" />
                            </xsl:element>
                            <xsl:element name="SpCustLength">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@lenQty" />
                            </xsl:element>
                            <xsl:element name="SpCustWidth">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@wdthQty" />
                            </xsl:element>
                            <xsl:element name="SpCustHeight">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@hghtQty" />
                            </xsl:element>
                        </xsl:otherwise>
                    </xsl:choose>
                    <xsl:element name="SpActualWgtUom">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:weight/share:actual/@UOM" />
                    </xsl:element>
                    <xsl:element name="SpActualWgt">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:weight/share:actual/@val" />
                    </xsl:element>
                    <xsl:choose>
                        <xsl:when test="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:actual/@UOM">
                            <xsl:element name="SpActualDimUom">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:actual/@UOM" />
                            </xsl:element>
                            <xsl:element name="SpActualLength">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:actual/@lenQty" />
                            </xsl:element>
                            <xsl:element name="SpActualWidth">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:actual/@wdthQty" />
                            </xsl:element>
                            <xsl:element name="SpActualHeight">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:actual/@hghtQty" />
                            </xsl:element>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:element name="SpActualDimUom">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@UOM" />
                            </xsl:element>
                            <xsl:element name="SpActualLength">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@lenQty" />
                            </xsl:element>
                            <xsl:element name="SpActualWidth">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@wdthQty" />
                            </xsl:element>
                            <xsl:element name="SpActualHeight">
                                <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@hghtQty" />
                            </xsl:element>
                        </xsl:otherwise>
                    </xsl:choose>
                    <xsl:element name="SpDestZip">
                        <xsl:value-of select="pfi:svcInfo/pfi:ratedDest/@pstlCd" />
                    </xsl:element>
                    <xsl:element name="SpSortLocation">
                        <xsl:value-of select="pfi:svcInfo/pfi:ratedOrigin/@ID" />
                    </xsl:element>
                    <xsl:element name="SpDelvConfFlag">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@dlvryCnfrmFlg" />
                    </xsl:element>
                    <xsl:element name="SpCustReference">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:refNotes/@shpr" />
                    </xsl:element>
                    <xsl:element name="SpPostalSubClass">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/@subClassPstlCd" />
                    </xsl:element>
                    <xsl:element name="SpProcCategory">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/@prcsCtgCd" />
                    </xsl:element>
                    <xsl:element name="SpSortStartDate">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@actlDlvryDt" />
                    </xsl:element>
                    <xsl:element name="SpProductCode">
                        <xsl:value-of select="concat('0', pfi:rtngPrfl/pfi:opCoSpecific/fxg:FDXFXG.RatingData/@svcCd)" />
                    </xsl:element>
                    <xsl:element name="SpHandlingType">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dimensions/pfi:rated/@ovrSzCd" />
                    </xsl:element>
                    <xsl:element name="SpCustomerManifest">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:refNotes/@dept" />
                    </xsl:element>
                    <xsl:element name="SpDeliveryDate">
                        <xsl:value-of select="pfi:svcInfo/pfi:transportation/pfi:pkg/pfi:dlvryInfo/@actlDlvryDt" />
                    </xsl:element>
                    <xsl:element name="SpInboundManifestId">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:refNotes/@invoice" />
                    </xsl:element>
                    <xsl:element name="SpOriginPostalCode">
                        <xsl:value-of select="pfi:svcInfo/pfi:origin/@pstlCd" />
                    </xsl:element>
                    <xsl:element name="SpPurchaseOrderNumber">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:refNotes/@purchOrdr" />
                    </xsl:element>
                    <xsl:element name="SpMeterNumber">
                        <xsl:value-of select="pfi:svcInfo/pfi:automtnInfo/@mtrNbr" />
                    </xsl:element>
                    <xsl:element name="SpThirdPartyBillingNumber">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:billToAddr/@acctNbr" />
                    </xsl:element>
                    <xsl:element name="SpSendAddrName">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@custNm" />
                    </xsl:element>
                    <xsl:element name="SpSendAddrCompany">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@cmpnyNm" />
                    </xsl:element>
                    <xsl:for-each select="pfi:invcngRqstInfo/pfi:shpprAddr/share:addrLn">
                        <xsl:choose>
                            <xsl:when test="@lineNo = '1'">
                                <xsl:element name="SpSendAddrLine1">
                                    <xsl:value-of select="."/>
                                </xsl:element>
                            </xsl:when>
                            <xsl:when test="@lineNo = '2'">
                                <xsl:element name="SpSendAddrLine2">
                                    <xsl:value-of select="."/>
                                </xsl:element>
                            </xsl:when>
                        </xsl:choose>
                    </xsl:for-each>
                    <xsl:element name="SpSendAddrCity">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@city" />
                    </xsl:element>
                    <xsl:element name="SpSendAddrState">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@state" />
                    </xsl:element>
                    <xsl:element name="SpSendAddrZip">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@pstl" />
                    </xsl:element>
                    <xsl:element name="SpSendAddrCountry">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@cntryCd" />
                    </xsl:element>
                    <xsl:element name="SpRecipAddrName">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@custNm" />
                    </xsl:element>
                    <xsl:element name="SpRecipAddrCompany">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@cmpnyNm" />
                    </xsl:element>
                    <xsl:for-each select="pfi:invcngRqstInfo/pfi:rcpntAddr/share:addrLn">
                        <xsl:choose>
                            <xsl:when test="@lineNo = '1'">
                                <xsl:element name="SpRecipAddrLine1">
                                    <xsl:value-of select="."/>
                                </xsl:element>
                            </xsl:when>
                            <xsl:when test="@lineNo = '2'">
                                <xsl:element name="SpRecipAddrLine2">
                                    <xsl:value-of select="."/>
                                </xsl:element>
                            </xsl:when>
                        </xsl:choose>
                    </xsl:for-each>
                    <xsl:element name="SpRecipAddrCity">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@city" />
                    </xsl:element>
                    <xsl:element name="SpRecipAddrState">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@state" />
                    </xsl:element>
                    <xsl:element name="SpRecipAddrZip">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@pstl" />
                    </xsl:element>
                    <xsl:element name="SpRecipAddrCountry">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:rcpntAddr/@cntryCd" />
                    </xsl:element>
                    <xsl:element name="SpAltPackageId">
                        <xsl:value-of select="concat(pfi:rtngPrfl/pfi:opCoSpecific/fxg:FDXFXG.RatingData/fxg:alternateInfo/@pfxTrkngNbr, 
                                                     pfi:rtngPrfl/pfi:opCoSpecific/fxg:FDXFXG.RatingData/fxg:alternateInfo/@trkngNbr)" />
                    </xsl:element>
                    <xsl:element name="SpFirstScanZip">
                        <xsl:value-of select="pfi:svcInfo/pfi:origin/@pstlCd" />
                    </xsl:element>
                    <xsl:element name="SpTrueShipper">
                        <xsl:value-of select="pfi:invcngRqstInfo/pfi:shpprAddr/@acctNbr" />
                    </xsl:element>
                    <xsl:for-each select="pfi:rtngPrfl/pfi:charges/pfi:charge">
                        <xsl:element name="SpChargeCodes">
                            <xsl:value-of select="@code"/>
                        </xsl:element>
                    </xsl:for-each>
                    <xsl:for-each select="pfi:invcngRqstInfo/pfi:statCdInfo">
                        <xsl:element name="SpStatusCodes">
                            <xsl:value-of select="@code"/>
                        </xsl:element>
                    </xsl:for-each>
                </xsl:element>
            </xsl:for-each>
        </xsl:element>
    </xsl:template>
</xsl:stylesheet>