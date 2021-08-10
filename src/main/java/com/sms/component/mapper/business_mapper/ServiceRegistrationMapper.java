package com.sms.component.mapper.business_mapper;

import com.sms.entity.business_entity.ServiceRegistration;
import com.sms.entity.business_entity.ServiceRegistrationInfo;
import com.sms.entity.business_entity.example.ServiceRegistrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceRegistrationMapper {
    int countByExample(ServiceRegistrationExample example);

    int deleteByExample(ServiceRegistrationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceRegistration record);

    int insertSelective(ServiceRegistration record);

    List<ServiceRegistration> selectByExample(ServiceRegistrationExample example);

    ServiceRegistration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceRegistration record, @Param("example") ServiceRegistrationExample example);

    int updateByExample(@Param("record") ServiceRegistration record, @Param("example") ServiceRegistrationExample example);

    int updateByPrimaryKeySelective(ServiceRegistration record);

    int updateByPrimaryKey(ServiceRegistration record);

    List<ServiceRegistration> selectServiceRegistrationBySelective(ServiceRegistrationInfo serviceRegistrationInfo);
}