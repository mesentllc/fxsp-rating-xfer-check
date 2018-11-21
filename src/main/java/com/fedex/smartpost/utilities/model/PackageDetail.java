package com.fedex.smartpost.utilities.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PackageDetail {
	private String spShipperNum9;
	private String spPackageNum;
	private String spManifestNum;
	private String spSortEndDate;
	private String spPickupDate;
	private String spArrivalDate;
	private String spCustWgtUom;
	private String spCustWgt;
	private String spCustDimUom;
	private String spCustLength;
	private String spCustWidth;
	private String spCustHeight;
	private String spActualWgtUom;
	private String spActualWgt;
	private String spActualDimUom;
	private String spActualLength;
	private String spActualWidth;
	private String spActualHeight;
	private String spDestZip;
	private String spSortLocation;
	private String spDelvConfFlag;
	private String spCustReference;
	private String spPostalSubClass;
	private String spProcCategory;
	private String spSortStartDate;
	private String spProductCode;
	private String spHandlingType;
	private String spCustomerManifest;
	private String spDeliveryDate;
	private String spInboundManifestId;
	private String spOriginPostalCode;
	private String spPurchaseOrderNumber;
	private String spMeterNumber;
	private String spThirdPartyBillingNumber;
	private String spSendAddrName;
	private String spSendAddrCompany;
	private String spSendAddrLine1;
	private String spSendAddrLine2;
	private String spSendAddrCity;
	private String spSendAddrState;
	private String spSendAddrZip;
	private String spSendAddrCountry;
	private String spRecipAddrName;
	private String spRecipAddrCompany;
	private String spRecipAddrLine1;
	private String spRecipAddrLine2;
	private String spRecipAddrCity;
	private String spRecipAddrState;
	private String spRecipAddrZip;
	private String spRecipAddrCountry;
	private String spAltPackageId;
	private String spFirstScanZip;
	private String spTrueShipper;
	private String spManifestGroup;
	private String spEpdiAuditFlag;
	private String spPostalBalOvrFlag;
	private String spRatingBalOvrFlag;
	private String spParcelRcvdFlag;
	private String spParcelExpectedFlag;
	private String spCodAmount;
	private String spPostalNmoFlag;
	private String spRatingNmoFlag;
	private String spPostalClass;
	private String spPostalSubclass;
	private String spDistribCenter;
	private String spBillingNumber;
	private String spCodSpecArticle;
	private String spDeliveryFlag;
	private String spDestCountryCode;
	private String spOriginCountryCode;
	private String spDestroyedFlag;
	private String createdDt;
	private String spApplicationId;
	private String spRmaNumber;
	private String spThirdPartyId;
	private String spThirdPartyIdSource;
	private String spReturnLabelType;
	private String spBillToAcctNum;
	private String spSendAddrShareId;
	private String spSendAddrIdType;
	private String spSendAddrId;
	private String spSendAddrRawId;
	private String spRecipAddrShareId;
	private String spRecipAddrIdType;
	private String spRecipAddrId;
	private String spRecipAddrRawId;
	private String spPayerType;
	private String spUniversalPackageNum;
	private String spStatusCode01;
	private String spStatusCode02;
	private String spStatusCode03;
	private String spStatusCode04;
	private String spStatusCode05;
	private String spStatusCode06;
	private String spStatusCode07;
	private String spStatusCode08;
	private String spStatusCode09;
	private String spStatusCode10;
	private String spPackageCharge01;
	private String spPackageCharge02;
	private String spPackageCharge03;
	private String spPackageCharge04;
	private String spPackageCharge05;
	private String spPackageCharge06;
	private String spPackageCharge07;
	private String spPackageCharge08;
	private String spPackageCharge09;
	private String spPackageCharge10;
	private String spPackageCharge11;
	private String spPackageCharge12;
	private String spPackageCharge13;
	private String spPackageCharge14;
	private String spPackageCharge15;
	private String spPackageCharge16;
	private String spPackageCharge17;
	private String spPackageCharge18;
	private String spPackageCharge19;
	private String spPackageCharge20;
	private String spAltPackageIdType;
	private Set<String> statusCodes = new HashSet<String>();
	private Set<String> chargeCodes = new HashSet<String>();

	public Set<String> getStatusCodes() {
		return statusCodes;
	}

	public Set<String> getChargeCodes() {
		return chargeCodes;
	}

	public String getSpShipperNum9() {
		return spShipperNum9;
	}

	public void setSpShipperNum9(String spShipperNum9) {
		this.spShipperNum9 = spShipperNum9;
	}

	public String getSpPackageNum() {
		return spPackageNum;
	}

	public void setSpPackageNum(String spPackageNum) {
		this.spPackageNum = spPackageNum;
	}

	public String getSpManifestNum() {
		return spManifestNum;
	}

	public void setSpManifestNum(String spManifestNum) {
		this.spManifestNum = spManifestNum;
	}

	public String getSpSortEndDate() {
		return spSortEndDate;
	}

	public void setSpSortEndDate(String spSortEndDate) {
		this.spSortEndDate = spSortEndDate;
	}

	public String getSpPickupDate() {
		return spPickupDate;
	}

	public void setSpPickupDate(String spPickupDate) {
		this.spPickupDate = spPickupDate;
	}

	public String getSpArrivalDate() {
		return spArrivalDate;
	}

	public void setSpArrivalDate(String spArrivalDate) {
		this.spArrivalDate = spArrivalDate;
	}

	public String getSpCustWgtUom() {
		return spCustWgtUom;
	}

	public void setSpCustWgtUom(String spCustWgtUom) {
		this.spCustWgtUom = spCustWgtUom;
	}

	public String getSpCustWgt() {
		return spCustWgt;
	}

	public void setSpCustWgt(String spCustWgt) {
		this.spCustWgt = spCustWgt;
	}

	public String getSpCustDimUom() {
		return spCustDimUom;
	}

	public void setSpCustDimUom(String spCustDimUom) {
		this.spCustDimUom = spCustDimUom;
	}

	public String getSpCustLength() {
		return spCustLength;
	}

	public void setSpCustLength(String spCustLength) {
		this.spCustLength = spCustLength;
	}

	public String getSpCustWidth() {

		return spCustWidth;
	}

	public void setSpCustWidth(String spCustWidth) {
		this.spCustWidth = spCustWidth;
	}

	public String getSpCustHeight() {
		return spCustHeight;
	}

	public void setSpCustHeight(String spCustHeight) {
		this.spCustHeight = spCustHeight;
	}

	public String getSpActualWgtUom() {
		return spActualWgtUom;
	}

	public void setSpActualWgtUom(String spActualWgtUom) {
		this.spActualWgtUom = spActualWgtUom;
	}

	public String getSpActualWgt() {
		return spActualWgt;
	}

	public void setSpActualWgt(String spActualWgt) {
		this.spActualWgt = spActualWgt;
	}

	public String getSpActualDimUom() {
		return spActualDimUom;
	}

	public void setSpActualDimUom(String spActualDimUom) {
		this.spActualDimUom = spActualDimUom;
	}

	public String getSpActualLength() {
		return spActualLength;
	}

	public void setSpActualLength(String spActualLength) {
		this.spActualLength = spActualLength;
	}

	public String getSpActualWidth() {
		return spActualWidth;
	}

	public void setSpActualWidth(String spActualWidth) {
		this.spActualWidth = spActualWidth;
	}

	public String getSpActualHeight() {
		return spActualHeight;
	}

	public void setSpActualHeight(String spActualHeight) {
		this.spActualHeight = spActualHeight;
	}

	public String getSpDestZip() {
		return spDestZip;
	}

	public void setSpDestZip(String spDestZip) {
		this.spDestZip = spDestZip;
	}

	public String getSpSortLocation() {
		return spSortLocation;
	}

	public void setSpSortLocation(String spSortLocation) {
		this.spSortLocation = spSortLocation;
	}

	public String getSpDelvConfFlag() {
		return spDelvConfFlag;
	}

	public void setSpDelvConfFlag(String spDelvConfFlag) {
		this.spDelvConfFlag = spDelvConfFlag;
	}

	public String getSpCustReference() {
		return spCustReference;
	}

	public void setSpCustReference(String spCustReference) {
		this.spCustReference = spCustReference;
	}

	public String getSpPostalSubClass() {
		return spPostalSubClass;
	}

	public void setSpPostalSubClass(String spPostalSubClass) {
		this.spPostalSubClass = spPostalSubClass;
	}

	public String getSpProcCategory() {
		return spProcCategory;
	}

	public void setSpProcCategory(String spProcCategory) {
		this.spProcCategory = spProcCategory;
	}

	public String getSpSortStartDate() {
		return spSortStartDate;
	}

	public void setSpSortStartDate(String spSortStartDate) {
		this.spSortStartDate = spSortStartDate;
	}

	public String getSpProductCode() {
		return spProductCode;
	}

	public void setSpProductCode(String spProductCode) {
		this.spProductCode = spProductCode;
	}

	public String getSpHandlingType() {
		return spHandlingType;
	}

	public void setSpHandlingType(String spHandlingType) {
		this.spHandlingType = spHandlingType;
	}

	public String getSpCustomerManifest() {
		return spCustomerManifest;
	}

	public void setSpCustomerManifest(String spCustomerManifest) {
		this.spCustomerManifest = spCustomerManifest;
	}

	public String getSpDeliveryDate() {
		return spDeliveryDate;
	}

	public void setSpDeliveryDate(String spDeliveryDate) {
		this.spDeliveryDate = spDeliveryDate;
	}

	public String getSpInboundManifestId() {
		return spInboundManifestId;
	}

	public void setSpInboundManifestId(String spInboundManifestId) {
		this.spInboundManifestId = spInboundManifestId;
	}

	public String getSpOriginPostalCode() {
		return spOriginPostalCode;
	}

	public void setSpOriginPostalCode(String spOriginPostalCode) {
		this.spOriginPostalCode = spOriginPostalCode;
	}

	public String getSpPurchaseOrderNumber() {
		return spPurchaseOrderNumber;
	}

	public void setSpPurchaseOrderNumber(String spPurchaseOrderNumber) {
		this.spPurchaseOrderNumber = spPurchaseOrderNumber;
	}

	public String getSpMeterNumber() {
		return spMeterNumber;
	}

	public void setSpMeterNumber(String spMeterNumber) {
		this.spMeterNumber = spMeterNumber;
	}

	public String getSpThirdPartyBillingNumber() {
		return spThirdPartyBillingNumber;
	}

	public void setSpThirdPartyBillingNumber(String spThirdPartyBillingNumber) {
		this.spThirdPartyBillingNumber = spThirdPartyBillingNumber;
	}

	public String getSpSendAddrName() {
		return spSendAddrName;
	}

	public void setSpSendAddrName(String spSendAddrName) {
		this.spSendAddrName = spSendAddrName;
	}

	public String getSpSendAddrCompany() {
		return spSendAddrCompany;
	}

	public void setSpSendAddrCompany(String spSendAddrCompany) {
		this.spSendAddrCompany = spSendAddrCompany;
	}

	public String getSpSendAddrLine1() {
		return spSendAddrLine1;
	}

	public void setSpSendAddrLine1(String spSendAddrLine1) {
		this.spSendAddrLine1 = spSendAddrLine1;
	}

	public String getSpSendAddrLine2() {
		return spSendAddrLine2;
	}

	public void setSpSendAddrLine2(String spSendAddrLine2) {
		this.spSendAddrLine2 = spSendAddrLine2;
	}

	public String getSpSendAddrCity() {
		return spSendAddrCity;
	}

	public void setSpSendAddrCity(String spSendAddrCity) {
		this.spSendAddrCity = spSendAddrCity;
	}

	public String getSpSendAddrState() {
		return spSendAddrState;
	}

	public void setSpSendAddrState(String spSendAddrState) {
		this.spSendAddrState = spSendAddrState;
	}

	public String getSpSendAddrZip() {
		return spSendAddrZip;
	}

	public void setSpSendAddrZip(String spSendAddrZip) {
		this.spSendAddrZip = spSendAddrZip;
	}

	public String getSpSendAddrCountry() {
		return spSendAddrCountry;
	}

	public void setSpSendAddrCountry(String spSendAddrCountry) {
		this.spSendAddrCountry = spSendAddrCountry;
	}

	public String getSpRecipAddrName() {
		return spRecipAddrName;
	}

	public void setSpRecipAddrName(String spRecipAddrName) {
		this.spRecipAddrName = spRecipAddrName;
	}

	public String getSpRecipAddrCompany() {
		return spRecipAddrCompany;
	}

	public void setSpRecipAddrCompany(String spRecipAddrCompany) {
		this.spRecipAddrCompany = spRecipAddrCompany;
	}

	public String getSpRecipAddrLine1() {
		return spRecipAddrLine1;
	}

	public void setSpRecipAddrLine1(String spRecipAddrLine1) {
		this.spRecipAddrLine1 = spRecipAddrLine1;
	}

	public String getSpRecipAddrLine2() {
		return spRecipAddrLine2;
	}

	public void setSpRecipAddrLine2(String spRecipAddrLine2) {
		this.spRecipAddrLine2 = spRecipAddrLine2;
	}

	public String getSpRecipAddrCity() {
		return spRecipAddrCity;
	}

	public void setSpRecipAddrCity(String spRecipAddrCity) {
		this.spRecipAddrCity = spRecipAddrCity;
	}

	public String getSpRecipAddrState() {
		return spRecipAddrState;
	}

	public void setSpRecipAddrState(String spRecipAddrState) {
		this.spRecipAddrState = spRecipAddrState;
	}

	public String getSpRecipAddrZip() {
		return spRecipAddrZip;
	}

	public void setSpRecipAddrZip(String spRecipAddrZip) {
		this.spRecipAddrZip = spRecipAddrZip;
	}

	public String getSpRecipAddrCountry() {
		return spRecipAddrCountry;
	}

	public void setSpRecipAddrCountry(String spRecipAddrCountry) {
		this.spRecipAddrCountry = spRecipAddrCountry;
	}

	public String getSpAltPackageId() {
		return spAltPackageId;
	}

	public void setSpAltPackageId(String spAltPackageId) {
		this.spAltPackageId = spAltPackageId;
	}

	public String getSpFirstScanZip() {
		return spFirstScanZip;
	}

	public void setSpFirstScanZip(String spFirstScanZip) {
		this.spFirstScanZip = spFirstScanZip;
	}

	public String getSpTrueShipper() {
		return spTrueShipper;
	}

	public void setSpTrueShipper(String spTrueShipper) {
		this.spTrueShipper = spTrueShipper;
	}

	public String getSpManifestGroup() {
		return spManifestGroup;
	}

	public void setSpManifestGroup(String spManifestGroup) {
		this.spManifestGroup = spManifestGroup;
	}

	public String getSpEpdiAuditFlag() {
		return spEpdiAuditFlag;
	}

	public void setSpEpdiAuditFlag(String spEpdiAuditFlag) {
		this.spEpdiAuditFlag = spEpdiAuditFlag;
	}

	public String getSpPostalBalOvrFlag() {
		return spPostalBalOvrFlag;
	}

	public void setSpPostalBalOvrFlag(String spPostalBalOvrFlag) {
		this.spPostalBalOvrFlag = spPostalBalOvrFlag;
	}

	public String getSpRatingBalOvrFlag() {
		return spRatingBalOvrFlag;
	}

	public void setSpRatingBalOvrFlag(String spRatingBalOvrFlag) {
		this.spRatingBalOvrFlag = spRatingBalOvrFlag;
	}

	public String getSpParcelRcvdFlag() {
		return spParcelRcvdFlag;
	}

	public void setSpParcelRcvdFlag(String spParcelRcvdFlag) {
		this.spParcelRcvdFlag = spParcelRcvdFlag;
	}

	public String getSpParcelExpectedFlag() {
		return spParcelExpectedFlag;
	}

	public void setSpParcelExpectedFlag(String spParcelExpectedFlag) {
		this.spParcelExpectedFlag = spParcelExpectedFlag;
	}

	public String getSpCodAmount() {
		return spCodAmount;
	}

	public void setSpCodAmount(String spCodAmount) {
		this.spCodAmount = spCodAmount;
	}

	public String getSpPostalNmoFlag() {
		return spPostalNmoFlag;
	}

	public void setSpPostalNmoFlag(String spPostalNmoFlag) {
		this.spPostalNmoFlag = spPostalNmoFlag;
	}

	public String getSpRatingNmoFlag() {
		return spRatingNmoFlag;
	}

	public void setSpRatingNmoFlag(String spRatingNmoFlag) {
		this.spRatingNmoFlag = spRatingNmoFlag;
	}

	public String getSpPostalClass() {
		return spPostalClass;
	}

	public void setSpPostalClass(String spPostalClass) {
		this.spPostalClass = spPostalClass;
	}

	public String getSpPostalSubclass() {
		return spPostalSubclass;
	}

	public void setSpPostalSubclass(String spPostalSubclass) {
		this.spPostalSubclass = spPostalSubclass;
	}

	public String getSpDistribCenter() {
		return spDistribCenter;
	}

	public void setSpDistribCenter(String spDistribCenter) {
		this.spDistribCenter = spDistribCenter;
	}

	public String getSpBillingNumber() {
		return spBillingNumber;
	}

	public void setSpBillingNumber(String spBillingNumber) {
		this.spBillingNumber = spBillingNumber;
	}

	public String getSpCodSpecArticle() {
		return spCodSpecArticle;
	}

	public void setSpCodSpecArticle(String spCodSpecArticle) {
		this.spCodSpecArticle = spCodSpecArticle;
	}

	public String getSpDeliveryFlag() {
		return spDeliveryFlag;
	}

	public void setSpDeliveryFlag(String spDeliveryFlag) {
		this.spDeliveryFlag = spDeliveryFlag;
	}

	public String getSpDestCountryCode() {
		return spDestCountryCode;
	}

	public void setSpDestCountryCode(String spDestCountryCode) {
		this.spDestCountryCode = spDestCountryCode;
	}

	public String getSpOriginCountryCode() {
		return spOriginCountryCode;
	}

	public void setSpOriginCountryCode(String spOriginCountryCode) {
		this.spOriginCountryCode = spOriginCountryCode;
	}

	public String getSpDestroyedFlag() {
		return spDestroyedFlag;
	}

	public void setSpDestroyedFlag(String spDestroyedFlag) {
		this.spDestroyedFlag = spDestroyedFlag;
	}

	public String getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(String createdDt) {
		this.createdDt = createdDt;
	}

	public String getSpApplicationId() {
		return spApplicationId;
	}

	public void setSpApplicationId(String spApplicationId) {
		this.spApplicationId = spApplicationId;
	}

	public String getSpRmaNumber() {
		return spRmaNumber;
	}

	public void setSpRmaNumber(String spRmaNumber) {
		this.spRmaNumber = spRmaNumber;
	}

	public String getSpThirdPartyId() {
		return spThirdPartyId;
	}

	public void setSpThirdPartyId(String spThirdPartyId) {
		this.spThirdPartyId = spThirdPartyId;
	}

	public String getSpThirdPartyIdSource() {
		return spThirdPartyIdSource;
	}

	public void setSpThirdPartyIdSource(String spThirdPartyIdSource) {
		this.spThirdPartyIdSource = spThirdPartyIdSource;
	}

	public String getSpReturnLabelType() {
		return spReturnLabelType;
	}

	public void setSpReturnLabelType(String spReturnLabelType) {
		this.spReturnLabelType = spReturnLabelType;
	}

	public String getSpBillToAcctNum() {
		return spBillToAcctNum;
	}

	public void setSpBillToAcctNum(String spBillToAcctNum) {
		this.spBillToAcctNum = spBillToAcctNum;
	}

	public String getSpSendAddrShareId() {
		return spSendAddrShareId;
	}

	public void setSpSendAddrShareId(String spSendAddrShareId) {
		this.spSendAddrShareId = spSendAddrShareId;
	}

	public String getSpSendAddrIdType() {
		return spSendAddrIdType;
	}

	public void setSpSendAddrIdType(String spSendAddrIdType) {
		this.spSendAddrIdType = spSendAddrIdType;
	}

	public String getSpSendAddrId() {
		return spSendAddrId;
	}

	public void setSpSendAddrId(String spSendAddrId) {
		this.spSendAddrId = spSendAddrId;
	}

	public String getSpSendAddrRawId() {
		return spSendAddrRawId;
	}

	public void setSpSendAddrRawId(String spSendAddrRawId) {
		this.spSendAddrRawId = spSendAddrRawId;
	}

	public String getSpRecipAddrShareId() {
		return spRecipAddrShareId;
	}

	public void setSpRecipAddrShareId(String spRecipAddrShareId) {
		this.spRecipAddrShareId = spRecipAddrShareId;
	}

	public String getSpRecipAddrIdType() {
		return spRecipAddrIdType;
	}

	public void setSpRecipAddrIdType(String spRecipAddrIdType) {
		this.spRecipAddrIdType = spRecipAddrIdType;
	}

	public String getSpRecipAddrId() {
		return spRecipAddrId;
	}

	public void setSpRecipAddrId(String spRecipAddrId) {
		this.spRecipAddrId = spRecipAddrId;
	}

	public String getSpRecipAddrRawId() {
		return spRecipAddrRawId;
	}

	public void setSpRecipAddrRawId(String spRecipAddrRawId) {
		this.spRecipAddrRawId = spRecipAddrRawId;
	}

	public String getSpPayerType() {
		return spPayerType;
	}

	public void setSpPayerType(String spPayerType) {
		this.spPayerType = spPayerType;
	}

	public String getSpUniversalPackageNum() {
		return spUniversalPackageNum;
	}

	public void setSpUniversalPackageNum(String spUniversalPackageNum) {
		this.spUniversalPackageNum = spUniversalPackageNum;
	}

	public String getSpStatusCode01() {
		return spStatusCode01;
	}

	public void setSpStatusCode01(String spStatusCode01) {
		this.spStatusCode01 = spStatusCode01;
	}

	public String getSpStatusCode02() {
		return spStatusCode02;
	}

	public void setSpStatusCode02(String spStatusCode02) {
		this.spStatusCode02 = spStatusCode02;
	}

	public String getSpStatusCode03() {
		return spStatusCode03;
	}

	public void setSpStatusCode03(String spStatusCode03) {
		this.spStatusCode03 = spStatusCode03;
	}

	public String getSpStatusCode04() {
		return spStatusCode04;
	}

	public void setSpStatusCode04(String spStatusCode04) {
		this.spStatusCode04 = spStatusCode04;
	}

	public String getSpStatusCode05() {
		return spStatusCode05;
	}

	public void setSpStatusCode05(String spStatusCode05) {
		this.spStatusCode05 = spStatusCode05;
	}

	public String getSpStatusCode06() {
		return spStatusCode06;
	}

	public void setSpStatusCode06(String spStatusCode06) {
		this.spStatusCode06 = spStatusCode06;
	}

	public String getSpStatusCode07() {
		return spStatusCode07;
	}

	public void setSpStatusCode07(String spStatusCode07) {
		this.spStatusCode07 = spStatusCode07;
	}

	public String getSpStatusCode08() {
		return spStatusCode08;
	}

	public void setSpStatusCode08(String spStatusCode08) {
		this.spStatusCode08 = spStatusCode08;
	}

	public String getSpStatusCode09() {
		return spStatusCode09;
	}

	public void setSpStatusCode09(String spStatusCode09) {
		this.spStatusCode09 = spStatusCode09;
	}

	public String getSpStatusCode10() {
		return spStatusCode10;
	}

	public void setSpStatusCode10(String spStatusCode10) {
		this.spStatusCode10 = spStatusCode10;
	}

	public String getSpPackageCharge01() {
		return spPackageCharge01;
	}

	public void setSpPackageCharge01(String spPackageCharge01) {
		this.spPackageCharge01 = spPackageCharge01;
	}

	public String getSpPackageCharge02() {
		return spPackageCharge02;
	}

	public void setSpPackageCharge02(String spPackageCharge02) {
		this.spPackageCharge02 = spPackageCharge02;
	}

	public String getSpPackageCharge03() {
		return spPackageCharge03;
	}

	public void setSpPackageCharge03(String spPackageCharge03) {
		this.spPackageCharge03 = spPackageCharge03;
	}

	public String getSpPackageCharge04() {
		return spPackageCharge04;
	}

	public void setSpPackageCharge04(String spPackageCharge04) {
		this.spPackageCharge04 = spPackageCharge04;
	}

	public String getSpPackageCharge05() {
		return spPackageCharge05;
	}

	public void setSpPackageCharge05(String spPackageCharge05) {
		this.spPackageCharge05 = spPackageCharge05;
	}

	public String getSpPackageCharge06() {
		return spPackageCharge06;
	}

	public void setSpPackageCharge06(String spPackageCharge06) {
		this.spPackageCharge06 = spPackageCharge06;
	}

	public String getSpPackageCharge07() {
		return spPackageCharge07;
	}

	public void setSpPackageCharge07(String spPackageCharge07) {
		this.spPackageCharge07 = spPackageCharge07;
	}

	public String getSpPackageCharge08() {
		return spPackageCharge08;
	}

	public void setSpPackageCharge08(String spPackageCharge08) {
		this.spPackageCharge08 = spPackageCharge08;
	}

	public String getSpPackageCharge09() {
		return spPackageCharge09;
	}

	public void setSpPackageCharge09(String spPackageCharge09) {
		this.spPackageCharge09 = spPackageCharge09;
	}

	public String getSpPackageCharge10() {
		return spPackageCharge10;
	}

	public void setSpPackageCharge10(String spPackageCharge10) {
		this.spPackageCharge10 = spPackageCharge10;
	}

	public String getSpPackageCharge11() {
		return spPackageCharge11;
	}

	public void setSpPackageCharge11(String spPackageCharge11) {
		this.spPackageCharge11 = spPackageCharge11;
	}

	public String getSpPackageCharge12() {
		return spPackageCharge12;
	}

	public void setSpPackageCharge12(String spPackageCharge12) {
		this.spPackageCharge12 = spPackageCharge12;
	}

	public String getSpPackageCharge13() {
		return spPackageCharge13;
	}

	public void setSpPackageCharge13(String spPackageCharge13) {
		this.spPackageCharge13 = spPackageCharge13;
	}

	public String getSpPackageCharge14() {
		return spPackageCharge14;
	}

	public void setSpPackageCharge14(String spPackageCharge14) {
		this.spPackageCharge14 = spPackageCharge14;
	}

	public String getSpPackageCharge15() {
		return spPackageCharge15;
	}

	public void setSpPackageCharge15(String spPackageCharge15) {
		this.spPackageCharge15 = spPackageCharge15;
	}

	public String getSpPackageCharge16() {
		return spPackageCharge16;
	}

	public void setSpPackageCharge16(String spPackageCharge16) {
		this.spPackageCharge16 = spPackageCharge16;
	}

	public String getSpPackageCharge17() {
		return spPackageCharge17;
	}

	public void setSpPackageCharge17(String spPackageCharge17) {
		this.spPackageCharge17 = spPackageCharge17;
	}

	public String getSpPackageCharge18() {
		return spPackageCharge18;
	}

	public void setSpPackageCharge18(String spPackageCharge18) {
		this.spPackageCharge18 = spPackageCharge18;
	}

	public String getSpPackageCharge19() {
		return spPackageCharge19;
	}

	public void setSpPackageCharge19(String spPackageCharge19) {
		this.spPackageCharge19 = spPackageCharge19;
	}

	public String getSpPackageCharge20() {
		return spPackageCharge20;
	}

	public void setSpPackageCharge20(String spPackageCharge20) {
		this.spPackageCharge20 = spPackageCharge20;
	}

	public String getSpAltPackageIdType() {
		return spAltPackageIdType;
	}

	public void setSpAltPackageIdType(String spAltPackageIdType) {
		this.spAltPackageIdType = spAltPackageIdType;
	}
}
