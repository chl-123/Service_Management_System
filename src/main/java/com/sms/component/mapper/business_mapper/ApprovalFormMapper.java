package com.sms.component.mapper.business_mapper;

import com.sms.entity.business_entity.ApprovalForm;
import com.sms.entity.business_entity.ApprovalFormInfo;
import com.sms.entity.business_entity.example.ApprovalFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalFormMapper {
    int countByExample(ApprovalFormExample example);

    int deleteByExample(ApprovalFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApprovalForm record);

    int insertSelective(ApprovalForm record);

    List<ApprovalForm> selectByExample(ApprovalFormExample example);

    ApprovalForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApprovalForm record, @Param("example") ApprovalFormExample example);

    int updateByExample(@Param("record") ApprovalForm record, @Param("example") ApprovalFormExample example);

    int updateByPrimaryKeySelective(ApprovalForm record);

    int updateByPrimaryKey(ApprovalForm record);

    List<ApprovalForm> selectApprovalFormBySelective(ApprovalFormInfo approvalFormInfo);
}