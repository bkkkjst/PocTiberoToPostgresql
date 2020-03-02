package com.example.PocTiberoToPostgresql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BP_CIS_PROJECT_DETAIL database table.
 * 
 */
@Entity
@Table(name="BP_CIS_PROJECT_DETAIL")
@NamedQuery(name="BpCisProjectDetail.findAll", query="SELECT b FROM BpCisProjectDetail b")
public class BpCisProjectDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CIS_PROJECT_DETAIL_ID")
	private long cisProjectDetailId;

	@Column(name="CREATE_BY")
	private BigDecimal createBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name="FILE_NAME")
	private String fileName;

	@Column(name="MAIL_LANGUAGE")
	private String mailLanguage;

	@Column(name="MAIL_SEND_FLAG")
	private String mailSendFlag;

	private BigDecimal retry;

	@Column(name="USE_FLAG")
	private String useFlag;

	//bi-directional many-to-one association to BpCisProject
	@ManyToOne
	@JoinColumn(name="CIS_PROJECT_ID")
	private BpCisProject bpCisProject;

	//bi-directional many-to-one association to BpCisUnauthorizeDetail
	@OneToMany(mappedBy="bpCisProjectDetail")
	private List<BpCisUnauthorizeDetail> bpCisUnauthorizeDetails;

	public BpCisProjectDetail() {
	}

	public long getCisProjectDetailId() {
		return this.cisProjectDetailId;
	}

	public void setCisProjectDetailId(long cisProjectDetailId) {
		this.cisProjectDetailId = cisProjectDetailId;
	}

	public BigDecimal getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(BigDecimal createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getMailLanguage() {
		return this.mailLanguage;
	}

	public void setMailLanguage(String mailLanguage) {
		this.mailLanguage = mailLanguage;
	}

	public String getMailSendFlag() {
		return this.mailSendFlag;
	}

	public void setMailSendFlag(String mailSendFlag) {
		this.mailSendFlag = mailSendFlag;
	}

	public BigDecimal getRetry() {
		return this.retry;
	}

	public void setRetry(BigDecimal retry) {
		this.retry = retry;
	}

	public String getUseFlag() {
		return this.useFlag;
	}

	public void setUseFlag(String useFlag) {
		this.useFlag = useFlag;
	}

	public BpCisProject getBpCisProject() {
		return this.bpCisProject;
	}

	public void setBpCisProject(BpCisProject bpCisProject) {
		this.bpCisProject = bpCisProject;
	}

	public List<BpCisUnauthorizeDetail> getBpCisUnauthorizeDetails() {
		return this.bpCisUnauthorizeDetails;
	}

	public void setBpCisUnauthorizeDetails(List<BpCisUnauthorizeDetail> bpCisUnauthorizeDetails) {
		this.bpCisUnauthorizeDetails = bpCisUnauthorizeDetails;
	}

	public BpCisUnauthorizeDetail addBpCisUnauthorizeDetail(BpCisUnauthorizeDetail bpCisUnauthorizeDetail) {
		getBpCisUnauthorizeDetails().add(bpCisUnauthorizeDetail);
		bpCisUnauthorizeDetail.setBpCisProjectDetail(this);

		return bpCisUnauthorizeDetail;
	}

	public BpCisUnauthorizeDetail removeBpCisUnauthorizeDetail(BpCisUnauthorizeDetail bpCisUnauthorizeDetail) {
		getBpCisUnauthorizeDetails().remove(bpCisUnauthorizeDetail);
		bpCisUnauthorizeDetail.setBpCisProjectDetail(null);

		return bpCisUnauthorizeDetail;
	}

}