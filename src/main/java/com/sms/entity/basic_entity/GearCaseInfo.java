package com.sms.entity.basic_entity;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GearCaseInfo {
    private Integer id;

    private String clientName;

    private String productDrawingNum;

    private String gearCaseNum;

    private String power;

    private String velocityRatio;

    private Date assemblyDateStart;

    private Date assemblyDateEnd;

    private Date releaseDateStart;

    private Date releaseDateEnd;

    private String windField;

    private String windTurbineNum;

    private Date gridConnectedDateStart;

    private Date gridConnectedDateEnd;

    private Date startWarrantyDateStart;

    private Date startWarrantyDateEnd;

    private String qualityProblemsNote;

}
