package com.example.PocTiberoToPostgresql.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BP_CIS_UNAUTHORIZE_DETAIL database table.
 * 
 */
@Entity
@Table(name="BP_CIS_UNAUTHORIZE_DETAIL")
@NamedQuery(name="BpCisUnauthorizeDetail.findAll", query="SELECT b FROM BpCisUnauthorizeDetail b")
public class BpCisUnauthorizeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CIS_UNAUTHORIZE_DETAIL_ID")
	private long cisUnauthorizeDetailId;

	@Column(name="CIS_INFO_DETAIL")
	private String cisInfoDetail;

	@Column(name="UNAUTHOR_REASON")
	private String unauthorReason;

	//bi-directional many-to-one association to BpCisProjectDetail
	@ManyToOne
	@JoinColumn(name="CIS_PROJECT_DETAIL_ID")
	private BpCisProjectDetail bpCisProjectDetail;

	public BpCisUnauthorizeDetail() {
	}

	public long getCisUnauthorizeDetailId() {
		return this.cisUnauthorizeDetailId;
	}

	public void setCisUnauthorizeDetailId(long cisUnauthorizeDetailId) {
		this.cisUnauthorizeDetailId = cisUnauthorizeDetailId;
	}

	public String getCisInfoDetail() {
		return this.cisInfoDetail;
	}

	public void setCisInfoDetail(String cisInfoDetail) {
		this.cisInfoDetail = cisInfoDetail;
	}

	public String getUnauthorReason() {
		return this.unauthorReason;
	}

	public void setUnauthorReason(String unauthorReason) {
		this.unauthorReason = unauthorReason;
	}

	public BpCisProjectDetail getBpCisProjectDetail() {
		return this.bpCisProjectDetail;
	}

	public void setBpCisProjectDetail(BpCisProjectDetail bpCisProjectDetail) {
		this.bpCisProjectDetail = bpCisProjectDetail;
	}

}