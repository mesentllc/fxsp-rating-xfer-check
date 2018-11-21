package com.fedex.smartpost.utilities.dao;

import com.fedex.smartpost.utilities.helper.ResourceHelper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.fedex.smartpost.utilities.model.PackageDetail;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PackageDetailXrefImpl extends NamedParameterJdbcTemplate implements PackageDetailXref {
	private static final String retreivePackageDetails = ResourceHelper.classPathResource("sql/packageDetails.sql");

	public PackageDetailXrefImpl(DataSource dataSource) {
		super(dataSource);
	}

	final RowMapper<PackageDetail> rowMapper =
		new RowMapper() {
			public PackageDetail mapRow(final ResultSet resultSet, final int row) throws SQLException {
				PackageDetail packageDetail = new PackageDetail();
				packageDetail.setSpShipperNum9(resultSet.getString("SP_SHIPPER_NUM_9").trim());
				packageDetail.setSpPackageNum(resultSet.getString("SP_PACKAGE_NUM").trim());
				packageDetail.setSpManifestNum(resultSet.getString("SP_MANIFEST_NUM").trim());
				packageDetail.setSpSortEndDate(resultSet.getString("SP_SORT_END_DATE").trim());
				packageDetail.setSpPickupDate(resultSet.getString("SP_PICKUP_DATE").trim());
				packageDetail.setSpArrivalDate(resultSet.getString("SP_ARRIVAL_DATE").trim());
				packageDetail.setSpCustWgtUom(resultSet.getString("SP_CUST_WGT_UOM").trim());
				packageDetail.setSpCustWgt(resultSet.getString("SP_CUST_WGT").trim());
				packageDetail.setSpCustDimUom(resultSet.getString("SP_CUST_DIM_UOM").trim());
				packageDetail.setSpCustLength(resultSet.getString("SP_CUST_LENGTH").trim());
				packageDetail.setSpCustWidth(resultSet.getString("SP_CUST_WIDTH").trim());
				packageDetail.setSpCustHeight(resultSet.getString("SP_CUST_HEIGHT").trim());
				packageDetail.setSpActualWgtUom(resultSet.getString("SP_ACTUAL_WGT_UOM").trim());
				packageDetail.setSpActualWgt(resultSet.getString("SP_ACTUAL_WGT").trim());
				packageDetail.setSpActualDimUom(resultSet.getString("SP_ACTUAL_DIM_UOM").trim());
				packageDetail.setSpActualLength(resultSet.getString("SP_ACTUAL_LENGTH").trim());
				packageDetail.setSpActualWidth(resultSet.getString("SP_ACTUAL_WIDTH").trim());
				packageDetail.setSpActualHeight(resultSet.getString("SP_ACTUAL_HEIGHT").trim());
				packageDetail.setSpDestZip(resultSet.getString("SP_DEST_ZIP").trim());
				packageDetail.setSpSortLocation(resultSet.getString("SP_SORT_LOCATION").trim());
				packageDetail.setSpDelvConfFlag(resultSet.getString("SP_DELV_CONF_FLAG").trim());
				packageDetail.setSpCustReference(resultSet.getString("SP_CUST_REFERENCE").trim());
				packageDetail.setSpPostalSubClass(resultSet.getString("SP_POSTAL_SUBCLASS").trim());
				packageDetail.setSpProcCategory(resultSet.getString("SP_PROC_CATEGORY").trim());
				packageDetail.setSpSortStartDate(resultSet.getString("SP_SORT_START_DATE").trim());
				packageDetail.setSpProductCode(resultSet.getString("SP_PRODUCT_CODE").trim());
				packageDetail.setSpHandlingType(resultSet.getString("SP_HANDLING_TYPE").trim());
				packageDetail.setSpCustomerManifest(resultSet.getString("SP_CUSTOMER_MANIFEST").trim());
				packageDetail.setSpDeliveryDate(resultSet.getString("SP_DELIVERY_DATE").trim());
				packageDetail.setSpInboundManifestId(resultSet.getString("SP_INBOUND_MANIFEST_ID").trim());
				packageDetail.setSpOriginPostalCode(resultSet.getString("SP_ORIGIN_POSTAL_CODE").trim());
				packageDetail.setSpPurchaseOrderNumber(resultSet.getString("SP_PURCHASE_ORDER_NUMBER").trim());
				packageDetail.setSpMeterNumber(resultSet.getString("SP_METER_NUMBER").trim());
				packageDetail.setSpThirdPartyBillingNumber(resultSet.getString("SP_THIRD_PARTY_BILLING_NUMBER").trim());
				packageDetail.setSpSendAddrName(resultSet.getString("SP_SEND_ADDR_NAME").trim());
				packageDetail.setSpSendAddrCompany(resultSet.getString("SP_SEND_ADDR_COMPANY").trim());
				packageDetail.setSpSendAddrLine1(resultSet.getString("SP_SEND_ADDR_LINE_1").trim());
				packageDetail.setSpSendAddrLine2(resultSet.getString("SP_SEND_ADDR_LINE_2").trim());
				packageDetail.setSpSendAddrCity(resultSet.getString("SP_SEND_ADDR_CITY").trim());
				packageDetail.setSpSendAddrState(resultSet.getString("SP_SEND_ADDR_STATE").trim());
				packageDetail.setSpSendAddrZip(resultSet.getString("SP_SEND_ADDR_ZIP").trim());
				packageDetail.setSpSendAddrCountry(resultSet.getString("SP_SEND_ADDR_COUNTRY").trim());
				packageDetail.setSpRecipAddrName(resultSet.getString("SP_RECIP_ADDR_NAME").trim());
				packageDetail.setSpRecipAddrCompany(resultSet.getString("SP_RECIP_ADDR_COMPANY").trim());
				packageDetail.setSpRecipAddrLine1(resultSet.getString("SP_RECIP_ADDR_LINE_1").trim());
				packageDetail.setSpRecipAddrLine2(resultSet.getString("SP_RECIP_ADDR_LINE_2").trim());
				packageDetail.setSpRecipAddrCity(resultSet.getString("SP_RECIP_ADDR_CITY").trim());
				packageDetail.setSpRecipAddrState(resultSet.getString("SP_RECIP_ADDR_STATE").trim());
				packageDetail.setSpRecipAddrZip(resultSet.getString("SP_RECIP_ADDR_ZIP").trim());
				packageDetail.setSpRecipAddrCountry(resultSet.getString("SP_RECIP_ADDR_COUNTRY").trim());
				packageDetail.setSpAltPackageId(resultSet.getString("SP_ALT_PACKAGE_ID").trim());
				packageDetail.setSpFirstScanZip(resultSet.getString("SP_FIRST_SCAN_ZIP").trim());
				packageDetail.setSpTrueShipper(resultSet.getString("SP_TRUE_SHIPPER").trim());
				String fieldPrefix = "SP_STATUS_CODE_";
				for (int cntr = 1; cntr < 11; cntr++) {
					String value = resultSet.getString(fieldPrefix + String.format("%02d", cntr));
					if ((value != null) && (value.trim().length() > 0)) {
						packageDetail.getStatusCodes().add(value);
					}
				}
				fieldPrefix = "SP_PACKAGE_CHARGE_";
				for (int cntr = 1; cntr < 21; cntr++) {
					String value = resultSet.getString(fieldPrefix + String.format("%02d", cntr));
					if ((value != null) && (value.trim().length() > 0)) {
						packageDetail.getChargeCodes().add(value);
					}
				}
				return packageDetail;
			}
		};

	public Map<String, PackageDetail> retrievePackageDetails(List<String> packageIds) {
		MapSqlParameterSource params;
		Map<String, PackageDetail> returnMap = new HashMap<String, PackageDetail>();
		int index;
		int offset = 0;

		if (packageIds == null) {
			return null;
		}
		int max = packageIds.size();
		while (offset < max) {
			index = Math.min(max - offset, 1000);
			params = new MapSqlParameterSource();
			params.addValue("pkgIds", packageIds.subList(offset, offset + index));
			offset += index;
			for (PackageDetail packageDetail : query(retreivePackageDetails, params, rowMapper)) {
				returnMap.put(packageDetail.getSpPackageNum(), packageDetail);
			}
		}
		return returnMap;
	}
}
