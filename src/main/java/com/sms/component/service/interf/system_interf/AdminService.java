package com.sms.component.service.interf.system_interf;

import com.sms.entity.system_entity.Admin;
import com.sms.entity.system_entity.Department;
import com.sms.entity.system_entity.Staff;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AdminService {
    public Admin getAdmin(Integer id);

    Admin getAdminByLoginAccount(String loginAccount,String loginPassword);


    public String getStaffInfoBySelective(Integer pageNum, Integer pageSize, Admin admin , Department department);
}
