package com.sms.component.service.impl.system_impl;

import com.sms.component.service.interf.system_interf.StaffService;
import com.sms.entity.system_entity.Staff;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {
    @Override
    public ResultEntity<String> saveStaff(Staff staff) {
        return null;
    }

    @Override
    public ResultEntity<String> deleteStaff(Integer id) {
        return null;
    }

    @Override
    public ResultEntity<String> updateStaff(Staff staff) {
        return null;
    }

    @Override
    public PageInfo<Staff> getStaffsByKeyword(Integer pageNum, Integer pageSize, String keyword) {
        return null;
    }
}
