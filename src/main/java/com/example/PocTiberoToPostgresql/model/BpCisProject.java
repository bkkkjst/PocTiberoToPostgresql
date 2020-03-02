package com.example.PocTiberoToPostgresql.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the BP_CIS_PROJECT database table.
 * 
 */
@Entity
@Table(name="BP_CIS_PROJECT")
@NamedQuery(name="BpCisProject.findAll", query="SELECT b FROM BpCisProject b")
public class BpCisProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CIS_PROJECT_ID")
	private long cisProjectId;

	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="CREATE_BY")
	private BigDecimal createBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="PROJECT_NAME")
	private String projectName;

	@Column(name="UPDATE_BY")
	private BigDecimal updateBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="USE_FLAG")
	private String useFlag;

	//bi-directional many-to-one association to BpCisProjectDetail
	@OneToMany(mappedBy="bpCisProject")
	private List<BpCisProjectDetail> bpCisProjectDetails;

	public BpCisProject() {
	}

	public long getCisProjectId() {
		return this.cisProjectId;
	}

	public void setCisProjectId(long cisProjectId) {
		this.cisProjectId = cisProjectId;
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public BigDecimal getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(BigDecimal updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUseFlag() {
		return this.useFlag;
	}

	public void setUseFlag(String useFlag) {
		this.useFlag = useFlag;
	}

	public List<BpCisProjectDetail> getBpCisProjectDetails() {
		return this.bpCisProjectDetails;
	}

	public void setBpCisProjectDetails(List<BpCisProjectDetail> bpCisProjectDetails) {
		this.bpCisProjectDetails = bpCisProjectDetails;
	}

	public BpCisProjectDetail addBpCisProjectDetail(BpCisProjectDetail bpCisProjectDetail) {
		getBpCisProjectDetails().add(bpCisProjectDetail);
		bpCisProjectDetail.setBpCisProject(this);

		return bpCisProjectDetail;
	}

	public BpCisProjectDetail removeBpCisProjectDetail(BpCisProjectDetail bpCisProjectDetail) {
		getBpCisProjectDetails().remove(bpCisProjectDetail);
		bpCisProjectDetail.setBpCisProject(null);

		return bpCisProjectDetail;
	}

}