package com.sms.component.service.interf.business_interf;


import com.sms.entity.business_entity.ApprovalForm;
import com.sms.entity.business_entity.ApprovalFormInfo;
import com.sms.entity.business_entity.ServiceRegistration;
import com.sms.entity.business_entity.ServiceRegistrationInfo;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

public interface ServiceRegistrationService {
    ResultEntity<String> saveRegistrationInfo(ServiceRegistration serviceRegistration);

    ResultEntity<String> deleteRegistrationInfo(Integer id);

    ResultEntity<String> updateRegistrationInfoBySelective(ServiceRegistration serviceRegistration);

    PageInfo<ServiceRegistration> getRegistrationInfoBySelective(Integer pageNum, Integer pageSize,  ServiceRegistrationInfo serviceRegistrationInfo);
}
