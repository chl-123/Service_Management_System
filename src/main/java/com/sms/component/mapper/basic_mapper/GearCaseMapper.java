package com.sms.component.mapper.basic_mapper;

import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.basic_entity.GearCaseInfo;
import com.sms.entity.basic_entity.example.GearCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GearCaseMapper {
    int countByExample(GearCaseExample example);

    int deleteByExample(GearCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GearCase record);

    int insertSelective(GearCase record);

    List<GearCase> selectByExample(GearCaseExample example);

    GearCase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GearCase record, @Param("example") GearCaseExample example);

    int updateByExample(@Param("record") GearCase record, @Param("example") GearCaseExample example);

    int updateByPrimaryKeySelective(GearCase record);

    int updateByPrimaryKey(GearCase record);

    List<GearCase> selectGearCaseBySelective(GearCaseInfo gearCaseInfo);
}