package com.bmwmms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.annotations.Cache;


/**
 * The persistent class for the MMS_TOPIC database table.
 * 
 */
@Entity
@Table(name="MMS_TOPIC")
@NamedQuery(name="MmsTopic.findAll", query="SELECT m FROM MmsTopic m")
@Cache(alwaysRefresh=true,refreshOnlyIfNewer=true)
public class MmsTopic implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Id
	@Column(name="TOPIC_ID")
	private String topicId;
	
	@Column(name="TOPIC_CODE")
	private String topicCode;
	
	@Column(name="TOPIC_PERIOD")
	private String topicPeriod;
	
	@Column(name="TOPIC_NAME")
	private String topicName;
	
	@Column(name="TOPIC_DESC")
	private String topicDesc;
	
	@Column(name="TOPIC_URL")
	private String topicUrl;
	
	@Column(name="TOPIC_DEPT")
	private String topicDept;
	
	@Column(name="TOPIC_MMS_TEXT")
	private String topicMmsText;
	
	@Column(name="TOPIC_OWNER")
	private String topicOwner;

	@Column(name="TOPIC_OWNER_EMAIL")
	private String topicOwnerEmail;
	
	@Column(name="TOPIC_CAR_SERIES")
	private String topicCarSeries;
	
	@Column(name="TOPIC_IS_SHOWN_IN_MMS")
	private String topicIsShownInMms;
	
	@Column(name="TOPIC_MATERIAL_PROVIDER")
	private String topicMaterialProvider;
	
	@Column(name="TOPIC_SELECTION_CRITERIA")
	private String topicSelectionCriteria;
	
	@Column(name="TOPIC_TARGET_USER_GROUP")
	private String topicTargetUserGroup;
	
	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	
	@Column(name="ATTRIBUTE1")
	private String attribute1;

	@Column(name="ATTRIBUTE2")
	private String attribute2;

	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;

	@Column(name="ATTRIBUTE5")
	private String attribute5;

	public MmsTopic() {
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicCode() {
		return topicCode;
	}

	public void setTopicCode(String topicCode) {
		this.topicCode = topicCode;
	}

	public String getTopicPeriod() {
		return topicPeriod;
	}

	public void setTopicPeriod(String topicPeriod) {
		this.topicPeriod = topicPeriod;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public String getTopicUrl() {
		return topicUrl;
	}

	public void setTopicUrl(String topicUrl) {
		this.topicUrl = topicUrl;
	}

	public String getTopicDept() {
		return topicDept;
	}

	public void setTopicDept(String topicDept) {
		this.topicDept = topicDept;
	}

	public String getTopicMmsText() {
		return topicMmsText;
	}

	public void setTopicMmsText(String topicMmsText) {
		this.topicMmsText = topicMmsText;
	}

	public String getTopicOwner() {
		return topicOwner;
	}

	public void setTopicOwner(String topicOwner) {
		this.topicOwner = topicOwner;
	}

	public String getTopicOwnerEmail() {
		return topicOwnerEmail;
	}

	public void setTopicOwnerEmail(String topicOwnerEmail) {
		this.topicOwnerEmail = topicOwnerEmail;
	}

	public String getTopicCarSeries() {
		return topicCarSeries;
	}

	public void setTopicCarSeries(String topicCarSeries) {
		this.topicCarSeries = topicCarSeries;
	}

	public String getTopicIsShownInMms() {
		return topicIsShownInMms;
	}

	public void setTopicIsShownInMms(String topicIsShownInMms) {
		this.topicIsShownInMms = topicIsShownInMms;
	}

	public String getTopicMaterialProvider() {
		return topicMaterialProvider;
	}

	public void setTopicMaterialProvider(String topicMaterialProvider) {
		this.topicMaterialProvider = topicMaterialProvider;
	}

	public String getTopicSelectionCriteria() {
		return topicSelectionCriteria;
	}

	public void setTopicSelectionCriteria(String topicSelectionCriteria) {
		this.topicSelectionCriteria = topicSelectionCriteria;
	}

	public String getTopicTargetUserGroup() {
		return topicTargetUserGroup;
	}

	public void setTopicTargetUserGroup(String topicTargetUserGroup) {
		this.topicTargetUserGroup = topicTargetUserGroup;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}
}