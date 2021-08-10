package com.sms.component.service.impl.business_impl;

import com.sms.component.mapper.business_mapper.ServiceRegistrationMapper;
import com.sms.component.service.interf.business_interf.ServiceRegistrationService;
import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.business_entity.ServiceRegistration;
import com.sms.entity.business_entity.ServiceRegistrationInfo;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRegistrationServiceImpl implements ServiceRegistrationService {
    @Autowired
    private ServiceRegistrationMapper serviceRegistrationMapper;
    @Override
    public ResultEntity<String> saveRegistrationInfo(ServiceRegistration serviceRegistration) {
        try {
            serviceRegistrationMapper.insertSelective(serviceRegistration);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteRegistrationInfo(Integer id) {
        try {
            serviceRegistrationMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateRegistrationInfoBySelective(ServiceRegistration serviceRegistration) {
        try {
            serviceRegistrationMapper.updateByPrimaryKeySelective(serviceRegistration);

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
    public PageInfo<ServiceRegistration> getRegistrationInfoBySelective(Integer pageNum, Integer pageSize, ServiceRegistrationInfo serviceRegistrationInfo) {
        PageHelper.startPage(pageNum,pageSize);
        /*shiro*/
        List<ServiceRegistration> serviceRegistrations = serviceRegistrationMapper.selectServiceRegistrationBySelective(serviceRegistrationInfo);
        return new PageInfo<>(serviceRegistrations);
    }
}
