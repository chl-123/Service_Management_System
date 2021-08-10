package com.sms.component.service.impl.business_impl;

import com.sms.component.mapper.business_mapper.ApprovalFormMapper;
import com.sms.component.service.interf.business_interf.ApprovalFormService;
import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.business_entity.ApprovalForm;
import com.sms.entity.business_entity.ApprovalFormInfo;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ApprovalFormServiceImpl implements ApprovalFormService {
    @Autowired
    private ApprovalFormMapper approvalFormMapper;
    @Override
    public ResultEntity<String> saveApprovalForm(ApprovalForm approvalForm) {
        try {
            approvalForm.setCreateTime(new Date());
            approvalFormMapper.insertSelective(approvalForm);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteApprovalForm(Integer id) {
        try {
            approvalFormMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateApprovalFormBySelective(ApprovalForm approvalForm) {
        try {
            approvalForm.setModifyDate(new Date());
            approvalFormMapper.updateByPrimaryKeySelective(approvalForm);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof DuplicateKeyException) {
                return ResultEntity.failed(Constant.MESSAGE_DATE_DUPLICATE);
            }
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public PageInfo<ApprovalForm> getApprovalFormBySelective(Integer pageNum, Integer pageSize, ApprovalFormInfo approvalFormInfo) {
        PageHelper.startPage(pageNum,pageSize);
        List<ApprovalForm> approvalForms = approvalFormMapper.selectApprovalFormBySelective(approvalFormInfo);
        return new PageInfo<>(approvalForms);
    }
}
