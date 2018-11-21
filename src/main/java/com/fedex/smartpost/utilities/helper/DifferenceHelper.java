package com.fedex.smartpost.utilities.helper;

import com.fedex.smartpost.utilities.model.Difference;
import com.fedex.smartpost.utilities.model.PackageDetail;
import com.fedex.smartpost.utilities.types.PfiPackage;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class DifferenceHelper {
	private static Difference buildDifference(String packageId, String ratingField, String pfiValue, String dbValue) {
		return new Difference(packageId, ratingField, pfiValue, dbValue);
	}

	private static Difference dumpDifferences(String packageId, String ratingField, Collection<String> pfiSet, Collection<String> dbSet) {
		String pfiList = "";
		String dbList = "";

		for (String value : pfiSet) {
			if (pfiList.length() > 0) {
				pfiList += ", ";
			}
			pfiList += value;
		}
		for (String value : dbSet) {
			if (dbList.length() > 0) {
				dbList += ", ";
			}
			dbList += value;
		}
		return buildDifference(packageId, ratingField, pfiList, dbList);
	}

	private static boolean checkDate(String pfiDate, String rodsDate) {
		if ((pfiDate == null) || (pfiDate.length() < 10)) {
			return false;
		}
		String formatted = pfiDate.substring(0, 4) + pfiDate.substring(5, 7) + pfiDate.substring(8, 10);
		return formatted.equals(rodsDate);
	}

	private static boolean checkScanDate(String pfiDate, String rodsDate) throws ParseException {
		if ((pfiDate == null) || (pfiDate.length() < 10)) {
			return false;
		}
		String formatted = pfiDate.substring(0, 4) + pfiDate.substring(5, 7) + pfiDate.substring(8, 10);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(sdf.parse(formatted));
		calendar.add(Calendar.DATE, -1);
		formatted = sdf.format(calendar.getTime());
		return formatted.equals(rodsDate);
	}

	private static boolean safeFloatCheck(String pfi, String rods) {
		if (StringUtils.isEmpty(pfi) && StringUtils.isEmpty(rods)) {
			return true;
		}
		if (StringUtils.isEmpty(pfi)) {
			return false;
		}
		if (StringUtils.isEmpty(rods)) {
			return false;
		}
		return (Float.parseFloat(pfi) == Float.parseFloat(rods));
	}

	private static boolean safeStringCheck(String pfi, String rods) {
		if (pfi == null) {
			if (rods == null) {
				return true;
			}
			else {
				return StringUtils.isEmpty(rods.trim());
			}
		}
		if (rods == null) {
			return StringUtils.isEmpty(pfi.trim());
		}
		if (StringUtils.isEmpty(pfi.trim()) && StringUtils.isEmpty(rods.trim())) {
			return true;
		}
		return pfi.trim().equals(rods.trim());
	}

	private static boolean allValuesFoundInSet(Collection<String> pfi, Collection<String> rods) {
		if (pfi.size() < rods.size()) {
			return false;
		}
		for (String value : rods) {
			if (!pfi.contains(value)) {
				return false;
			}
		}
		return true;
	}

	public static List<Difference> findDifferences(PfiPackage pfi, PackageDetail rods) throws ParseException {
		List<Difference> differences = new ArrayList<Difference>();

		if (pfi == null) {
			pfi = new PfiPackage();
		}
		if (rods == null) {
			rods = new PackageDetail();
		}
		String packageId = pfi.getSpPackageNum();

		if (!safeStringCheck(pfi.getSpShipperNum9(), rods.getSpShipperNum9())) {
			differences.add(buildDifference(packageId, "SP_SHIPPER_NUM_9",
											pfi.getSpShipperNum9(), rods.getSpShipperNum9()));
		}
		if (!safeStringCheck(pfi.getSpManifestNum(), rods.getSpManifestNum())) {
			differences.add(buildDifference(packageId, "SP_MANIFEST_NUM",
											pfi.getSpManifestNum(), rods.getSpManifestNum()));
		}
		if (!checkDate(pfi.getSpSortEndDate(), rods.getSpSortEndDate())) {
			differences.add(buildDifference(packageId, "SP_SORT_END_DATE",
											pfi.getSpSortEndDate(), rods.getSpSortEndDate()));
		}
		if (!checkDate(pfi.getSpPickupDate(), rods.getSpPickupDate())) {
			differences.add(buildDifference(packageId, "SP_PICKUP_DATE",
											pfi.getSpPickupDate(), rods.getSpPickupDate()));
		}
		if (!checkDate(pfi.getSpArrivalDate(), rods.getSpArrivalDate())) {
			differences.add(buildDifference(packageId, "SP_ARRIVAL_DATE",
											pfi.getSpArrivalDate(), rods.getSpArrivalDate()));
		}
		if (!safeStringCheck(pfi.getSpCustWgtUom(), rods.getSpCustWgtUom())) {
			differences.add(buildDifference(packageId, "SP_CUST_WGT_UOM",
											pfi.getSpCustWgtUom(), rods.getSpCustWgtUom()));
		}
		if (!safeFloatCheck(pfi.getSpCustWgt(), rods.getSpCustWgt())) {
			differences.add(buildDifference(packageId, "SP_CUST_WGT",
											pfi.getSpCustWgt(), rods.getSpCustWgt()));
		}
		if (!safeStringCheck(pfi.getSpCustDimUom(), rods.getSpCustDimUom())) {
			differences.add(buildDifference(packageId, "SP_CUST_DIM_UOM",
											pfi.getSpCustDimUom(), rods.getSpCustDimUom()));
		}
		if (!safeFloatCheck(pfi.getSpCustLength(), rods.getSpCustLength())) {
			differences.add(buildDifference(packageId, "SP_CUST_LENGTH",
											pfi.getSpCustLength(), rods.getSpCustLength()));
		}
		if (!safeFloatCheck(pfi.getSpCustWidth(), rods.getSpCustWidth())) {
			differences.add(buildDifference(packageId, "SP_CUST_WIDTH",
											pfi.getSpCustWidth(), rods.getSpCustWidth()));
		}
		if (!safeFloatCheck(pfi.getSpCustHeight(), rods.getSpCustHeight())) {
			differences.add(buildDifference(packageId, "SP_CUST_HEIGHT",
											pfi.getSpCustHeight(), rods.getSpCustHeight()));
		}
		if (!safeStringCheck(pfi.getSpActualWgtUom(), rods.getSpActualWgtUom())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_WGT_UOM",
											pfi.getSpActualWgtUom(), rods.getSpActualWgtUom()));
		}
		if (!safeFloatCheck(pfi.getSpActualWgt(), rods.getSpActualWgt())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_WGT",
											pfi.getSpActualWgt(), rods.getSpActualWgt()));
		}
		if (!safeStringCheck(pfi.getSpActualDimUom(), rods.getSpActualDimUom())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_DIM_UOM",
											pfi.getSpActualDimUom(), rods.getSpActualDimUom()));
		}
		if (!safeFloatCheck(pfi.getSpActualLength(), rods.getSpActualLength())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_LENGTH",
											pfi.getSpActualLength(), rods.getSpActualLength()));
		}
		if (!safeFloatCheck(pfi.getSpActualWidth(), rods.getSpActualWidth())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_WIDTH",
											pfi.getSpActualWidth(), rods.getSpActualWidth()));
		}
		if (!safeFloatCheck(pfi.getSpActualHeight(), rods.getSpActualHeight())) {
			differences.add(buildDifference(packageId, "SP_ACTUAL_HEIGHT",
											pfi.getSpActualHeight(), rods.getSpActualHeight()));
		}
		if (!safeStringCheck(pfi.getSpDestZip(), rods.getSpDestZip())) {
			differences.add(buildDifference(packageId, "SP_DEST_ZIP",
											pfi.getSpDestZip(), rods.getSpDestZip()));
		}
		if (!safeStringCheck(pfi.getSpSortLocation(), rods.getSpSortLocation())) {
			differences.add(buildDifference(packageId, "SP_SORT_LOCATION",
											pfi.getSpSortLocation(), rods.getSpSortLocation()));
		}
		if (!safeStringCheck(pfi.getSpDelvConfFlag(), rods.getSpDelvConfFlag())) {
			differences.add(buildDifference(packageId, "SP_DELV_CONF_FLAG",
											pfi.getSpDelvConfFlag(), rods.getSpDelvConfFlag()));
		}
		if (!safeStringCheck(pfi.getSpCustReference(), rods.getSpCustReference())) {
			differences.add(buildDifference(packageId, "SP_CUST_REFERENCE",
											pfi.getSpCustReference(), rods.getSpCustReference()));
		}
		if (!safeStringCheck(pfi.getSpPostalSubClass(), rods.getSpPostalSubClass())) {
			differences.add(buildDifference(packageId, "SP_POSTAL_SUBCLASS",
											pfi.getSpPostalSubClass(), rods.getSpPostalSubClass()));
		}
		if (!safeStringCheck(pfi.getSpProcCategory(), rods.getSpProcCategory())) {
			differences.add(buildDifference(packageId, "SP_PROC_CATEGORY",
											pfi.getSpProcCategory(), rods.getSpProcCategory()));
		}
		if (!checkScanDate(pfi.getSpSortStartDate(), rods.getSpSortStartDate())) {
			differences.add(buildDifference(packageId, "SP_SORT_START_DATE",
											pfi.getSpSortStartDate(), rods.getSpSortStartDate()));
		}
		if (!safeStringCheck(pfi.getSpProductCode(), rods.getSpProductCode())) {
			differences.add(buildDifference(packageId, "SP_PRODUCT_CODE",
											pfi.getSpProductCode(), rods.getSpProductCode()));
		}
		if (!safeStringCheck(pfi.getSpHandlingType(), rods.getSpHandlingType())) {
			differences.add(buildDifference(packageId, "SP_HANDLING_TYPE",
											pfi.getSpHandlingType(), rods.getSpHandlingType()));
		}
		if (!safeStringCheck(pfi.getSpCustomerManifest(), rods.getSpCustomerManifest())) {
			differences.add(buildDifference(packageId, "SP_CUSTOMER_MANIFEST",
											pfi.getSpCustomerManifest(), rods.getSpCustomerManifest()));
		}
		if (!checkDate(pfi.getSpDeliveryDate(), rods.getSpDeliveryDate())) {
			differences.add(buildDifference(packageId, "SP_DELIVERY_DATE",
											pfi.getSpDeliveryDate(), rods.getSpDeliveryDate()));
		}
		if (!safeStringCheck(pfi.getSpInboundManifestId(), rods.getSpInboundManifestId())) {
			differences.add(buildDifference(packageId, "SP_INBOUND_MANIFEST_ID",
											pfi.getSpInboundManifestId(), rods.getSpInboundManifestId()));
		}
		if (!safeStringCheck(pfi.getSpOriginPostalCode(), rods.getSpOriginPostalCode())) {
			differences.add(buildDifference(packageId, "SP_ORIGIN_POSTAL_CODE",
											pfi.getSpOriginPostalCode(), rods.getSpOriginPostalCode()));
		}
		if (!safeStringCheck(pfi.getSpPurchaseOrderNumber(), rods.getSpPurchaseOrderNumber())) {
			differences.add(buildDifference(packageId, "SP_PURCHASE_ORDER_NUMBER",
											pfi.getSpPurchaseOrderNumber(), rods.getSpPurchaseOrderNumber()));
		}
		if (!safeStringCheck(pfi.getSpMeterNumber(), rods.getSpMeterNumber())) {
			differences.add(buildDifference(packageId, "SP_METER_NUMBER",
											pfi.getSpMeterNumber(), rods.getSpMeterNumber()));
		}
		if (!safeStringCheck(pfi.getSpThirdPartyBillingNumber(), rods.getSpThirdPartyBillingNumber())) {
			differences.add(buildDifference(packageId, "SP_THIRD_PARTY_BILLING_NUMBER",
											pfi.getSpThirdPartyBillingNumber(), rods.getSpThirdPartyBillingNumber()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrName(), rods.getSpSendAddrName())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_NAME",
											pfi.getSpSendAddrName(), rods.getSpSendAddrName()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrCompany(), rods.getSpSendAddrCompany())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_COMPANY",
											pfi.getSpSendAddrCompany(), rods.getSpSendAddrCompany()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrLine1(), rods.getSpSendAddrLine1())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_LINE_1",
											pfi.getSpSendAddrLine1(), rods.getSpSendAddrLine1()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrLine2(), rods.getSpSendAddrLine2())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_LINE_2",
											pfi.getSpSendAddrLine2(), rods.getSpSendAddrLine2()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrCity(), rods.getSpSendAddrCity())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_CITY",
											pfi.getSpSendAddrCity(), rods.getSpSendAddrCity()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrState(), rods.getSpSendAddrState())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_STATE",
											pfi.getSpSendAddrState(), rods.getSpSendAddrState()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrZip(), rods.getSpSendAddrZip())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_ZIP",
											pfi.getSpSendAddrZip(), rods.getSpSendAddrZip()));
		}
		if (!safeStringCheck(pfi.getSpSendAddrCountry(), rods.getSpSendAddrCountry())) {
			differences.add(buildDifference(packageId, "SP_SEND_ADDR_COUNTRY",
											pfi.getSpSendAddrCountry(), rods.getSpSendAddrCountry()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrName(), rods.getSpRecipAddrName())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_NAME",
											pfi.getSpRecipAddrName(), rods.getSpRecipAddrName()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrCompany(), rods.getSpRecipAddrCompany())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_COMPANY",
											pfi.getSpRecipAddrCompany(), rods.getSpRecipAddrCompany()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrLine1(), rods.getSpRecipAddrLine1())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_LINE_1",
											pfi.getSpRecipAddrLine1(), rods.getSpRecipAddrLine1()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrLine2(), rods.getSpRecipAddrLine2())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_LINE_2",
											pfi.getSpRecipAddrLine2(), rods.getSpRecipAddrLine2()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrCity(), rods.getSpRecipAddrCity())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_CITY",
											pfi.getSpRecipAddrCity(), rods.getSpRecipAddrCity()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrState(), rods.getSpRecipAddrState())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_STATE",
											pfi.getSpRecipAddrState(), rods.getSpRecipAddrState()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrZip(), rods.getSpRecipAddrZip())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_ZIP",
											pfi.getSpRecipAddrZip(), rods.getSpRecipAddrZip()));
		}
		if (!safeStringCheck(pfi.getSpRecipAddrCountry(), rods.getSpRecipAddrCountry())) {
			differences.add(buildDifference(packageId, "SP_RECIP_ADDR_COUNTRY",
											pfi.getSpRecipAddrCountry(), rods.getSpRecipAddrCountry()));
		}
		if (!safeStringCheck(pfi.getSpAltPackageId(), rods.getSpAltPackageId())) {
			differences.add(buildDifference(packageId, "SP_ALT_PACKAGE_ID",
											pfi.getSpAltPackageId(), rods.getSpAltPackageId()));
		}
		if (!safeStringCheck(pfi.getSpFirstScanZip(), rods.getSpFirstScanZip())) {
			differences.add(buildDifference(packageId, "SP_FIRST_SCAN_ZIP",
											pfi.getSpFirstScanZip(), rods.getSpFirstScanZip()));
		}
		if (!safeStringCheck(pfi.getSpTrueShipper(), rods.getSpTrueShipper())) {
			differences.add(buildDifference(packageId, "SP_TRUE_SHIPPER",
											pfi.getSpTrueShipper(), rods.getSpTrueShipper()));
		}
		if (!allValuesFoundInSet(pfi.getSpStatusCodes(), rods.getStatusCodes())) {
			differences.add(dumpDifferences(packageId, "SP_STATUS_CODE_xx",
											pfi.getSpStatusCodes(), rods.getStatusCodes()));
		}
		if (!allValuesFoundInSet(pfi.getSpChargeCodes(), rods.getChargeCodes())) {
			differences.add(dumpDifferences(packageId, "SP_PACKAGE_CHARGE_xx",
											pfi.getSpChargeCodes(), rods.getChargeCodes()));
		}
		return differences;
	}
}
