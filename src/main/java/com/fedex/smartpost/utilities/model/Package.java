package com.fedex.smartpost.utilities.model;

import java.util.Date;

public class Package {
	private Long packageSeq;
	private Long transmissionSeq;
	private String pkgId;
	private Integer fxgSvcCd;
	private String fxgHubCd;
	private String destPstlCd;
	private String chanlAppId;
	private String mailerId;
	private String packagingTyp;
	private String perishableFlag;
	private String dangdCd;
	private String dispositionFlag;
	private String pkgVldFlag;
	private String blockShpmtFlag;
	private String delConfReqdFlag;
	private String wgtSrcCd;
	private String dimSrcCd;
	private Float pkgWgt;
	private Float pkgWidth;
	private Float pkgLength;
	private Float pkgHeight;
	private String pkgWgtUomCd;
	private String pkgDimUomCd;
	private String mailClassCd;
	private String mailSubClassCd;
	private String prcsSizeCd;
	private String prcsCatCd;
	private String pstlCdTyp;
	private String invoiceNum;
	private String poNum;
	private String rmaNum;
	private String meterNum;
	private String payorTyp;
	private String returnTyp;
	private String labelFmt;
	private String hashValue;
	private Date createdDt;
	private String createdBy;
	private Date updatedDt;
	private String updatedBy;
	private String fclUuidNm;
	private String fxgMbrNm;
	private String evntUuidNm;
	private Long unvslPkgNbr;
	private String fedexCustAcctNbr;
	private String spCustId;
	private String distCtrId;
	private String distCtrCntryCd;
	private String custMfstId;
	private String mfstId;
	private String mfstGrpTxt;
	private String xmtVldFlag;
	private String xmtCmpltFlag;
	private String messageHeaderId;
	private Integer pkgCnt;
	private String xmtBol;
	private Date shipDt;
	private Date expArrDt;
	private String shpSftwrSyst;
	private String shpSftwrVers;
	private String shpSftwrVend;
	private String testOnlyFlag;
	private Date xmtDt;
	private String xmtFmtVers;
	private String xmlGenSrc;
	private String fxgXmtId;

	public String getPrcsSizeCd() {
		return prcsSizeCd;
	}

	public void setPrcsSizeCd(String prcsSizeCd) {
		this.prcsSizeCd = prcsSizeCd;
	}

	public String getHashValue() {
		return hashValue;
	}

	public void setHashValue(String hashValue) {
		this.hashValue = hashValue;
	}

	public Long getPackageSeq() {
		return packageSeq;
	}

	public void setPackageSeq(Long packageSeq) {
		this.packageSeq = packageSeq;
	}

	public Long getTransmissionSeq() {
		return transmissionSeq;
	}

	public void setTransmissionSeq(Long transmissionSeq) {
		this.transmissionSeq = transmissionSeq;
	}

	public String getPkgId() {
		return pkgId;
	}

	public void setPkgId(String pkgId) {
		this.pkgId = pkgId;
	}

	public Integer getFxgSvcCd() {
		return fxgSvcCd;
	}

	public void setFxgSvcCd(Integer fxgSvcCd) {
		this.fxgSvcCd = fxgSvcCd;
	}

	public String getFxgHubCd() {
		return fxgHubCd;
	}

	public void setFxgHubCd(String fxgHubCd) {
		this.fxgHubCd = fxgHubCd;
	}

	public String getDestPstlCd() {
		return destPstlCd;
	}

	public void setDestPstlCd(String destPstlCd) {
		this.destPstlCd = destPstlCd;
	}

	public String getChanlAppId() {
		return chanlAppId;
	}

	public void setChanlAppId(String chanlAppId) {
		this.chanlAppId = chanlAppId;
	}

	public String getMailerId() {
		return mailerId;
	}

	public void setMailerId(String mailerId) {
		this.mailerId = mailerId;
	}

	public String getPackagingTyp() {
		return packagingTyp;
	}

	public void setPackagingTyp(String packagingTyp) {
		this.packagingTyp = packagingTyp;
	}

	public String getPerishableFlag() {
		return perishableFlag;
	}

	public void setPerishableFlag(String perishableFlag) {
		this.perishableFlag = perishableFlag;
	}

	public String getDangdCd() {
		return dangdCd;
	}

	public void setDangdCd(String dangdCd) {
		this.dangdCd = dangdCd;
	}

	public String getDispositionFlag() {
		return dispositionFlag;
	}

	public void setDispositionFlag(String dispositionFlag) {
		this.dispositionFlag = dispositionFlag;
	}

	public String getPkgVldFlag() {
		return pkgVldFlag;
	}

	public void setPkgVldFlag(String pkgVldFlag) {
		this.pkgVldFlag = pkgVldFlag;
	}

	public String getBlockShpmtFlag() {
		return blockShpmtFlag;
	}

	public void setBlockShpmtFlag(String blockShpmtFlag) {
		this.blockShpmtFlag = blockShpmtFlag;
	}

	public String getDelConfReqdFlag() {
		return delConfReqdFlag;
	}

	public void setDelConfReqdFlag(String delConfReqdFlag) {
		this.delConfReqdFlag = delConfReqdFlag;
	}

	public String getWgtSrcCd() {
		return wgtSrcCd;
	}

	public void setWgtSrcCd(String wgtSrcCd) {
		this.wgtSrcCd = wgtSrcCd;
	}

	public String getDimSrcCd() {
		return dimSrcCd;
	}

	public void setDimSrcCd(String dimSrcCd) {
		this.dimSrcCd = dimSrcCd;
	}

	public Float getPkgWgt() {
		return pkgWgt;
	}

	public void setPkgWgt(Float pkgWgt) {
		this.pkgWgt = pkgWgt;
	}

	public Float getPkgWidth() {
		return pkgWidth;
	}

	public void setPkgWidth(Float pkgWidth) {
		this.pkgWidth = pkgWidth;
	}

	public Float getPkgLength() {
		return pkgLength;
	}

	public void setPkgLength(Float pkgLength) {
		this.pkgLength = pkgLength;
	}

	public Float getPkgHeight() {
		return pkgHeight;
	}

	public void setPkgHeight(Float pkgHeight) {
		this.pkgHeight = pkgHeight;
	}

	public String getPkgWgtUomCd() {
		return pkgWgtUomCd;
	}

	public void setPkgWgtUomCd(String pkgWgtUomCd) {
		this.pkgWgtUomCd = pkgWgtUomCd;
	}

	public String getPkgDimUomCd() {
		return pkgDimUomCd;
	}

	public void setPkgDimUomCd(String pkgDimUomCd) {
		this.pkgDimUomCd = pkgDimUomCd;
	}

	public String getMailClassCd() {
		return mailClassCd;
	}

	public void setMailClassCd(String mailClassCd) {
		this.mailClassCd = mailClassCd;
	}

	public String getMailSubClassCd() {
		return mailSubClassCd;
	}

	public void setMailSubClassCd(String mailSubClassCd) {
		this.mailSubClassCd = mailSubClassCd;
	}

	public String getPrcsCatCd() {
		return prcsCatCd;
	}

	public void setPrcsCatCd(String prcsCatCd) {
		this.prcsCatCd = prcsCatCd;
	}

	public String getPstlCdTyp() {
		return pstlCdTyp;
	}

	public void setPstlCdTyp(String pstlCdTyp) {
		this.pstlCdTyp = pstlCdTyp;
	}

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getPoNum() {
		return poNum;
	}

	public void setPoNum(String poNum) {
		this.poNum = poNum;
	}

	public String getRmaNum() {
		return rmaNum;
	}

	public void setRmaNum(String rmaNum) {
		this.rmaNum = rmaNum;
	}

	public String getMeterNum() {
		return meterNum;
	}

	public void setMeterNum(String meterNum) {
		this.meterNum = meterNum;
	}

	public String getPayorTyp() {
		return payorTyp;
	}

	public void setPayorTyp(String payorTyp) {
		this.payorTyp = payorTyp;
	}

	public String getReturnTyp() {
		return returnTyp;
	}

	public void setReturnTyp(String returnTyp) {
		this.returnTyp = returnTyp;
	}

	public String getLabelFmt() {
		return labelFmt;
	}

	public void setLabelFmt(String labelFmt) {
		this.labelFmt = labelFmt;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getFclUuidNm() {
		return fclUuidNm;
	}

	public void setFclUuidNm(String fclUuidNm) {
		this.fclUuidNm = fclUuidNm;
	}

	public String getFxgMbrNm() {
		return fxgMbrNm;
	}

	public void setFxgMbrNm(String fxgMbrNm) {
		this.fxgMbrNm = fxgMbrNm;
	}

	public String getEvntUuidNm() {
		return evntUuidNm;
	}

	public void setEvntUuidNm(String evntUuidNm) {
		this.evntUuidNm = evntUuidNm;
	}

	public Long getUnvslPkgNbr() {
		return unvslPkgNbr;
	}

	public void setUnvslPkgNbr(Long unvslPkgNbr) {
		this.unvslPkgNbr = unvslPkgNbr;
	}

	public String getFedexCustAcctNbr() {
		return fedexCustAcctNbr;
	}

	public void setFedexCustAcctNbr(String fedexCustAcctNbr) {
		this.fedexCustAcctNbr = fedexCustAcctNbr;
	}

	public String getSpCustId() {
		return spCustId;
	}

	public void setSpCustId(String spCustId) {
		this.spCustId = spCustId;
	}

	public String getDistCtrId() {
		return distCtrId;
	}

	public void setDistCtrId(String distCtrId) {
		this.distCtrId = distCtrId;
	}

	public String getDistCtrCntryCd() {
		return distCtrCntryCd;
	}

	public void setDistCtrCntryCd(String distCtrCntryCd) {
		this.distCtrCntryCd = distCtrCntryCd;
	}

	public String getCustMfstId() {
		return custMfstId;
	}

	public void setCustMfstId(String custMfstId) {
		this.custMfstId = custMfstId;
	}

	public String getMfstId() {
		return mfstId;
	}

	public void setMfstId(String mfstId) {
		this.mfstId = mfstId;
	}

	public String getMfstGrpTxt() {
		return mfstGrpTxt;
	}

	public void setMfstGrpTxt(String mfstGrpTxt) {
		this.mfstGrpTxt = mfstGrpTxt;
	}

	public String getXmtVldFlag() {
		return xmtVldFlag;
	}

	public void setXmtVldFlag(String xmtVldFlag) {
		this.xmtVldFlag = xmtVldFlag;
	}

	public String getXmtCmpltFlag() {
		return xmtCmpltFlag;
	}

	public void setXmtCmpltFlag(String xmtCmpltFlag) {
		this.xmtCmpltFlag = xmtCmpltFlag;
	}

	public String getMessageHeaderId() {
		return messageHeaderId;
	}

	public void setMessageHeaderId(String messageHeaderId) {
		this.messageHeaderId = messageHeaderId;
	}

	public Integer getPkgCnt() {
		return pkgCnt;
	}

	public void setPkgCnt(Integer pkgCnt) {
		this.pkgCnt = pkgCnt;
	}

	public String getXmtBol() {
		return xmtBol;
	}

	public void setXmtBol(String xmtBol) {
		this.xmtBol = xmtBol;
	}

	public Date getShipDt() {
		return shipDt;
	}

	public void setShipDt(Date shipDt) {
		this.shipDt = shipDt;
	}

	public Date getExpArrDt() {
		return expArrDt;
	}

	public void setExpArrDt(Date expArrDt) {
		this.expArrDt = expArrDt;
	}

	public String getShpSftwrSyst() {
		return shpSftwrSyst;
	}

	public void setShpSftwrSyst(String shpSftwrSyst) {
		this.shpSftwrSyst = shpSftwrSyst;
	}

	public String getShpSftwrVers() {
		return shpSftwrVers;
	}

	public void setShpSftwrVers(String shpSftwrVers) {
		this.shpSftwrVers = shpSftwrVers;
	}

	public String getShpSftwrVend() {
		return shpSftwrVend;
	}

	public void setShpSftwrVend(String shpSftwrVend) {
		this.shpSftwrVend = shpSftwrVend;
	}

	public String getTestOnlyFlag() {
		return testOnlyFlag;
	}

	public void setTestOnlyFlag(String testOnlyFlag) {
		this.testOnlyFlag = testOnlyFlag;
	}

	public Date getXmtDt() {
		return xmtDt;
	}

	public void setXmtDt(Date xmtDt) {
		this.xmtDt = xmtDt;
	}

	public String getXmtFmtVers() {
		return xmtFmtVers;
	}

	public void setXmtFmtVers(String xmtFmtVers) {
		this.xmtFmtVers = xmtFmtVers;
	}

	public String getXmlGenSrc() {
		return xmlGenSrc;
	}

	public void setXmlGenSrc(String xmlGenSrc) {
		this.xmlGenSrc = xmlGenSrc;
	}

	public String getFxgXmtId() {
		return fxgXmtId;
	}

	public void setFxgXmtId(String fxgXmtId) {
		this.fxgXmtId = fxgXmtId;
	}
}
