package com.sms.component.service.interf.basic_interf;


import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.basic_entity.GearCaseInfo;
import com.sms.entity.system_entity.Role;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GearCaseService {
    ResultEntity<String> saveGearCase(GearCase gearCase);

    ResultEntity<String> deleteGearCase(Integer id);

    ResultEntity<String> updateGearCaseBySelective(GearCase gearCase);

    PageInfo<GearCase> getGearCaseBySelective(Integer pageNum, Integer pageSize, GearCaseInfo gearCaseInfo);

    ResultEntity<List<GearCase>> getGearCase();
}
