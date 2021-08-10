package com.sms.entity.business_entity;

import java.util.Date;

public class ApprovalForm {
    private Integer id;

    private String archiveNum;

    private String clientName;

    private String productDrawingNum;

    private String gearCaseNum;

    private Date releaseDate;

    private Date startWarrantyDate;

    private String feedbackInfo;

    private String creatorName;

    private Date createTime;

    private String modifierName;

    private Date modifyDate;

    private String attachmentPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArchiveNum() {
        return archiveNum;
    }

    public void setArchiveNum(String archiveNum) {
        this.archiveNum = archiveNum == null ? null : archiveNum.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getProductDrawingNum() {
        return productDrawingNum;
    }

    public void setProductDrawingNum(String productDrawingNum) {
        this.productDrawingNum = productDrawingNum == null ? null : productDrawingNum.trim();
    }

    public String getGearCaseNum() {
        return gearCaseNum;
    }

    public void setGearCaseNum(String gearCaseNum) {
        this.gearCaseNum = gearCaseNum == null ? null : gearCaseNum.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getStartWarrantyDate() {
        return startWarrantyDate;
    }

    public void setStartWarrantyDate(Date startWarrantyDate) {
        this.startWarrantyDate = startWarrantyDate;
    }

    public String getFeedbackInfo() {
        return feedbackInfo;
    }

    public void setFeedbackInfo(String feedbackInfo) {
        this.feedbackInfo = feedbackInfo == null ? null : feedbackInfo.trim();
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath == null ? null : attachmentPath.trim();
    }
}