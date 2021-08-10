package com.sms.entity.business_entity;

import java.util.Date;

public class ServiceRegistration {
    private Integer id;

    private String archiveNum;

    private String clientName;

    private String productDrawingNum;

    private String gearCaseNum;

    private Date releaseDate;

    private Date startWarrantyDate;

    private String disposerName;

    private String disposeMethod;

    private Date disposeDate;

    private String errorDescription;

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

    public String getDisposerName() {
        return disposerName;
    }

    public void setDisposerName(String disposerName) {
        this.disposerName = disposerName == null ? null : disposerName.trim();
    }

    public String getDisposeMethod() {
        return disposeMethod;
    }

    public void setDisposeMethod(String disposeMethod) {
        this.disposeMethod = disposeMethod == null ? null : disposeMethod.trim();
    }

    public Date getDisposeDate() {
        return disposeDate;
    }

    public void setDisposeDate(Date disposeDate) {
        this.disposeDate = disposeDate;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription == null ? null : errorDescription.trim();
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath == null ? null : attachmentPath.trim();
    }
}