package com.citiustech.mrr;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CPMM1 implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.Column(name = "CPMM_CHSE_CD")
	private java.lang.String cpmmChseCd;

	@javax.persistence.Column(name = "MEM_ID")
	private java.lang.Long memId;

	@javax.persistence.Column(name = "CMPG_CD")
	private java.lang.String cmpgCd;

	@javax.persistence.Column(name = "MSR_VER")
	private java.lang.String msrVer;

	@javax.persistence.Column(name = "MSR_CD")
	private java.lang.String msrCd;

	@javax.persistence.Column(name = "SUBMSR_CD")
	private java.lang.String submsrCd;

	@javax.persistence.Column(name = "CPMM_CHSE_STS_CD")
	private java.lang.String cpmmChseStsCd;

	@javax.persistence.Column(name = "ASSGD_TO_USER")
	private java.lang.String assgdToUser;

	@javax.persistence.Column(name = "RAW_CHSE_ID")
	private java.lang.Long rawChseId;

	@javax.persistence.Column(name = "CHSE_DUE_DT")
	private java.util.Date chseDueDt;

	@javax.persistence.Column(name = "MOC_DTL_ID")
	private java.lang.Long mocDtlId;

	@javax.persistence.Column(name = "PROV_ID")
	private java.lang.Long provId;

	@javax.persistence.Column(name = "ADDR_ID")
	private java.lang.Long addrId;

	@javax.persistence.Column(name = "ADDR_ZIP_CD")
	private java.lang.Long addrZipCd;

	@javax.persistence.Column(name = "ACT_CD")
	private java.lang.String action;

	@javax.persistence.Column(name = "LOGIN_USR")
	private java.lang.String loginUser;

	@javax.persistence.Column(name = "PRVS_ACTY")
	private java.lang.String previousActivity;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CPMM_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "CPMM_ID_GENERATOR", sequenceName = "CPMM_ID_SEQ")
	private java.lang.Long id;

	public CPMM1() {
	}

	public java.lang.String getCpmmChseCd() {
		return this.cpmmChseCd;
	}

	public void setCpmmChseCd(java.lang.String cpmmChseCd) {
		this.cpmmChseCd = cpmmChseCd;
	}

	public java.lang.Long getMemId() {
		return this.memId;
	}

	public void setMemId(java.lang.Long memId) {
		this.memId = memId;
	}

	public java.lang.String getCmpgCd() {
		return this.cmpgCd;
	}

	public void setCmpgCd(java.lang.String cmpgCd) {
		this.cmpgCd = cmpgCd;
	}

	public java.lang.String getMsrVer() {
		return this.msrVer;
	}

	public void setMsrVer(java.lang.String msrVer) {
		this.msrVer = msrVer;
	}

	public java.lang.String getMsrCd() {
		return this.msrCd;
	}

	public void setMsrCd(java.lang.String msrCd) {
		this.msrCd = msrCd;
	}

	public java.lang.String getSubmsrCd() {
		return this.submsrCd;
	}

	public void setSubmsrCd(java.lang.String submsrCd) {
		this.submsrCd = submsrCd;
	}

	public java.lang.String getCpmmChseStsCd() {
		return this.cpmmChseStsCd;
	}

	public void setCpmmChseStsCd(java.lang.String cpmmChseStsCd) {
		this.cpmmChseStsCd = cpmmChseStsCd;
	}

	public java.lang.String getAssgdToUser() {
		return this.assgdToUser;
	}

	public void setAssgdToUser(java.lang.String assgdToUser) {
		this.assgdToUser = assgdToUser;
	}

	public java.lang.Long getRawChseId() {
		return this.rawChseId;
	}

	public void setRawChseId(java.lang.Long rawChseId) {
		this.rawChseId = rawChseId;
	}

	public java.util.Date getChseDueDt() {
		return this.chseDueDt;
	}

	public void setChseDueDt(java.util.Date chseDueDt) {
		this.chseDueDt = chseDueDt;
	}

	public java.lang.Long getMocDtlId() {
		return this.mocDtlId;
	}

	public void setMocDtlId(java.lang.Long mocDtlId) {
		this.mocDtlId = mocDtlId;
	}

	public java.lang.Long getProvId() {
		return this.provId;
	}

	public void setProvId(java.lang.Long provId) {
		this.provId = provId;
	}

	public java.lang.Long getAddrId() {
		return this.addrId;
	}

	public void setAddrId(java.lang.Long addrId) {
		this.addrId = addrId;
	}

	public java.lang.Long getAddrZipCd() {
		return this.addrZipCd;
	}

	public void setAddrZipCd(java.lang.Long addrZipCd) {
		this.addrZipCd = addrZipCd;
	}

	public java.lang.String getAction() {
		return this.action;
	}

	public void setAction(java.lang.String action) {
		this.action = action;
	}

	public java.lang.String getLoginUser() {
		return this.loginUser;
	}

	public void setLoginUser(java.lang.String loginUser) {
		this.loginUser = loginUser;
	}

	public java.lang.String getPreviousActivity() {
		return this.previousActivity;
	}

	public void setPreviousActivity(java.lang.String previousActivity) {
		this.previousActivity = previousActivity;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public CPMM1(java.lang.String cpmmChseCd, java.lang.Long memId,
			java.lang.String cmpgCd, java.lang.String msrVer,
			java.lang.String msrCd, java.lang.String submsrCd,
			java.lang.String cpmmChseStsCd, java.lang.String assgdToUser,
			java.lang.Long rawChseId, java.util.Date chseDueDt,
			java.lang.Long mocDtlId, java.lang.Long provId,
			java.lang.Long addrId, java.lang.Long addrZipCd,
			java.lang.String action, java.lang.String loginUser,
			java.lang.String previousActivity, java.lang.Long id) {
		this.cpmmChseCd = cpmmChseCd;
		this.memId = memId;
		this.cmpgCd = cmpgCd;
		this.msrVer = msrVer;
		this.msrCd = msrCd;
		this.submsrCd = submsrCd;
		this.cpmmChseStsCd = cpmmChseStsCd;
		this.assgdToUser = assgdToUser;
		this.rawChseId = rawChseId;
		this.chseDueDt = chseDueDt;
		this.mocDtlId = mocDtlId;
		this.provId = provId;
		this.addrId = addrId;
		this.addrZipCd = addrZipCd;
		this.action = action;
		this.loginUser = loginUser;
		this.previousActivity = previousActivity;
		this.id = id;
	}

}
