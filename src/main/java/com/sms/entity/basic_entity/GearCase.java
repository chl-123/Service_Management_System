package com.sms.entity.basic_entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GearCase {
    private Integer id;

    private String clientName;

    private String productDrawingNum;

    private String gearCaseNum;

    private String power;

    private String velocityRatio;

    private Date assemblyDate;

    private Date releaseDate;

    private String windField;

    private String windTurbineNum;

    private Date gridConnectedDate;

    private Date startWarrantyDate;

    private String qualityProblemsNote;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public String getVelocityRatio() {
        return velocityRatio;
    }

    public void setVelocityRatio(String velocityRatio) {
        this.velocityRatio = velocityRatio == null ? null : velocityRatio.trim();
    }

    public Date getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(Date assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getWindField() {
        return windField;
    }

    public void setWindField(String windField) {
        this.windField = windField == null ? null : windField.trim();
    }

    public String getWindTurbineNum() {
        return windTurbineNum;
    }

    public void setWindTurbineNum(String windTurbineNum) {
        this.windTurbineNum = windTurbineNum == null ? null : windTurbineNum.trim();
    }

    public Date getGridConnectedDate() {
        return gridConnectedDate;
    }

    public void setGridConnectedDate(Date gridConnectedDate) {
        this.gridConnectedDate = gridConnectedDate;
    }

    public Date getStartWarrantyDate() {
        return startWarrantyDate;
    }

    public void setStartWarrantyDate(Date startWarrantyDate) {
        this.startWarrantyDate = startWarrantyDate;
    }

    public String getQualityProblemsNote() {
        return qualityProblemsNote;
    }

    public void setQualityProblemsNote(String qualityProblemsNote) {
        this.qualityProblemsNote = qualityProblemsNote == null ? null : qualityProblemsNote.trim();
    }
}