package com.sms.component.service.interf.system_interf;

import com.sms.entity.system_entity.Staff;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

public interface StaffService {

    ResultEntity<String> saveStaff(Staff staff);

    ResultEntity<String> deleteStaff(Integer id);

    ResultEntity<String> updateStaff(Staff staff);

    PageInfo<Staff> getStaffsByKeyword(Integer pageNum, Integer pageSize, String keyword);
}
