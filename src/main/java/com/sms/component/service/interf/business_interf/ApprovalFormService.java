package com.sms.component.service.interf.business_interf;


import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.basic_entity.GearCaseInfo;
import com.sms.entity.business_entity.ApprovalForm;
import com.sms.entity.business_entity.ApprovalFormInfo;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

public interface ApprovalFormService {
    ResultEntity<String> saveApprovalForm(ApprovalForm approvalForm);

    ResultEntity<String> deleteApprovalForm(Integer id);

    ResultEntity<String> updateApprovalFormBySelective(ApprovalForm approvalForm);

    PageInfo<ApprovalForm> getApprovalFormBySelective(Integer pageNum, Integer pageSize, ApprovalFormInfo approvalFormInfo);
}
