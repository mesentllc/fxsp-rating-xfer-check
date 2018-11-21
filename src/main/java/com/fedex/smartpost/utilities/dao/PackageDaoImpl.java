package com.fedex.smartpost.utilities.dao;

import com.fedex.smartpost.utilities.helper.ResourceHelper;
import com.fedex.smartpost.utilities.model.Package;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class PackageDaoImpl extends NamedParameterJdbcTemplate implements PackageDao {
	private static final String PACKAGES_BY_ID = ResourceHelper.classPathResource("sql/retrievePackages.sql");

	final RowMapper<Package> rowMapper = new RowMapper() {
		public Package mapRow(final ResultSet resultSet, final int row) throws SQLException {
			Package pkg = new Package();
			pkg.setPackageSeq(resultSet.getLong("PACKAGE_SEQ"));
			pkg.setTransmissionSeq(resultSet.getLong("TRANSMISSION_SEQ"));
			pkg.setPkgId(resultSet.getString("PKG_ID").trim());
			pkg.setFxgSvcCd(resultSet.getInt("FXG_SVC_CD"));
			pkg.setFxgHubCd(resultSet.getString("FXG_HUB_CD").trim());
			pkg.setDestPstlCd(resultSet.getString("DEST_PSTL_CD").trim());
			pkg.setChanlAppId(resultSet.getString("CHANL_APP_ID").trim());
			pkg.setMailerId(resultSet.getString("MAILER_ID").trim());
			pkg.setPackagingTyp(resultSet.getString("PACKAGING_TYP").trim());
			pkg.setPerishableFlag(resultSet.getString("PERISHABLE_FLAG").trim());
			pkg.setDangdCd(resultSet.getString("DANGD_CD").trim());
			pkg.setDispositionFlag(resultSet.getString("DISPOSITION_FLAG").trim());
			pkg.setPkgVldFlag(resultSet.getString("PKG_VLD_FLAG").trim());
			pkg.setBlockShpmtFlag(resultSet.getString("BLOCK_SHPMT_FLAG").trim());
			pkg.setDelConfReqdFlag(resultSet.getString("DEL_CONF_REQD_FLAG").trim());
			pkg.setWgtSrcCd(resultSet.getString("WGT_SRC_CD").trim());
			pkg.setDimSrcCd(resultSet.getString("DIM_SRC_CD").trim());
			pkg.setPkgWgt(resultSet.getFloat("PKG_WGT"));
			pkg.setPkgWidth(resultSet.getFloat("PKG_WIDTH"));
			pkg.setPkgLength(resultSet.getFloat("PKG_LENGTH"));
			pkg.setPkgHeight(resultSet.getFloat("PKG_HEIGHT"));
			pkg.setPkgWgtUomCd(resultSet.getString("PKG_WGT_UOM_CD").trim());
			pkg.setPkgDimUomCd(resultSet.getString("PKG_DIM_UOM_CD").trim());
			pkg.setMailClassCd(resultSet.getString("MAIL_CLASS_CD").trim());
			pkg.setMailSubClassCd(resultSet.getString("MAIL_SUB_CLASS_CD").trim());
			pkg.setPrcsSizeCd(resultSet.getString("PRCS_SIZE_CD").trim());
			pkg.setPrcsCatCd(resultSet.getString("PRCS_CAT_CD").trim());
			pkg.setPstlCdTyp(resultSet.getString("PSTL_CD_TYP").trim());
			pkg.setInvoiceNum(resultSet.getString("INVOICE_NUM").trim());
			pkg.setPoNum(resultSet.getString("PO_NUM").trim());
			pkg.setRmaNum(resultSet.getString("RMA_NUM").trim());
			pkg.setMeterNum(resultSet.getString("METER_NUM").trim());
			pkg.setPayorTyp(resultSet.getString("PAYOR_TYP").trim());
			pkg.setReturnTyp(resultSet.getString("RETURN_TYP").trim());
			pkg.setLabelFmt(resultSet.getString("LABEL_FMT").trim());
			pkg.setHashValue(resultSet.getString("HASH_VALUE").trim());
			pkg.setCreatedDt(resultSet.getTimestamp("CREATED_DT"));
			pkg.setCreatedBy(resultSet.getString("CREATED_BY").trim());
			pkg.setUpdatedDt(resultSet.getTimestamp("UPDATED_DT"));
			pkg.setUpdatedBy(resultSet.getString("UPDATED_BY").trim());
			pkg.setFclUuidNm(resultSet.getString("FCL_UUID_NM").trim());
			pkg.setFxgMbrNm(resultSet.getString("FXG_MBR_NM").trim());
			pkg.setEvntUuidNm(resultSet.getString("EVNT_UUID_NM").trim());
			pkg.setUnvslPkgNbr(resultSet.getLong("UNVSL_PKG_NBR"));
			pkg.setFedexCustAcctNbr(resultSet.getString("FEDEX_CUST_ACCT_NBR").trim());
			pkg.setSpCustId(resultSet.getString("SP_CUST_ID").trim());
			pkg.setDistCtrId(resultSet.getString("DIST_CTR_ID").trim());
			pkg.setDistCtrCntryCd(resultSet.getString("DIST_CTR_CNTRY_CD").trim());
			pkg.setCustMfstId(resultSet.getString("CUST_MFST_ID").trim());
			pkg.setMfstId(resultSet.getString("MFST_ID").trim());
			pkg.setMfstGrpTxt(resultSet.getString("MFST_GRP_TXT").trim());
			pkg.setXmtVldFlag(resultSet.getString("XMT_VLD_FLAG").trim());
			pkg.setXmtCmpltFlag(resultSet.getString("XMT_CMPLT_FLAG").trim());
			pkg.setMessageHeaderId(resultSet.getString("MESSAGE_HEADER_ID").trim());
			pkg.setPkgCnt(resultSet.getInt("PKG_CNT"));
			pkg.setXmtBol(resultSet.getString("XMT_BOL").trim());
			pkg.setShipDt(resultSet.getTimestamp("SHIP_DT"));
			pkg.setExpArrDt(resultSet.getTimestamp("EXP_ARR_DT"));
			pkg.setShpSftwrSyst(resultSet.getString("SHP_SFTWR_SYST").trim());
			pkg.setShpSftwrVers(resultSet.getString("SHP_SFTWR_VERS").trim());
			pkg.setShpSftwrVend(resultSet.getString("SHP_SFTWR_VEND").trim());
			pkg.setTestOnlyFlag(resultSet.getString("TEST_ONLY_FLAG").trim());
			pkg.setXmtDt(resultSet.getTimestamp("XMT_DT"));
			pkg.setXmtFmtVers(resultSet.getString("XMT_FMT_VERS").trim());
			pkg.setXmlGenSrc(resultSet.getString("XML_GEN_SRC").trim());
			pkg.setFxgXmtId(resultSet.getString("FXG_XMT_ID").trim());
			return pkg;
		}
	};

	public PackageDaoImpl(DataSource dataSource) {
		super(dataSource);
	}

	public List<Package> retrievePackages(Collection<String> packageIds) {
		MapSqlParameterSource params = new MapSqlParameterSource("packageIds", packageIds);

		return query(PACKAGES_BY_ID, params, rowMapper);
	}
}
