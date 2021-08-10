package com.sms.component.service.impl.system_impl;

import com.alibaba.fastjson.JSON;
import com.sms.component.mapper.system_mapper.AdminMapper;
import com.sms.component.mapper.system_mapper.DepartmentMapper;
import com.sms.component.service.interf.system_interf.AdminService;
import com.sms.component.service.interf.system_interf.DepartmentService;
import com.sms.entity.system_entity.Admin;
import com.sms.entity.system_entity.Department;
import com.sms.entity.system_entity.Staff;
import com.sms.entity.system_entity.example.AdminExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private  AdminMapper adminMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    DepartmentService departmentService;
    public Admin getAdmin(Integer id){
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public Admin getAdminByLoginAccount(String loginAccount, String loginPassword) {
        return null;
    }

    @Override
    public String getStaffInfoBySelective(Integer pageNum, Integer pageSize, Admin admin ,Department department) {

        List<Integer> departmentIds=new ArrayList<>();
        List<Department> departmentsList = departmentService.getDepartmentsBySelective(department);
        for (Department departments:departmentsList) {
            departmentIds.add(departments.getId());
        }
        List<Integer> adminIdListByDepartmentId = departmentMapper.selectAdminIdListByDepartmentId(departmentIds);
        List<Integer> newAdminList=new ArrayList<>();
        List<Integer> adminListBySelective = adminMapper.selectBySelective(admin);
        for (Integer adminId1:adminIdListByDepartmentId) {
            for (Integer id:adminListBySelective) {
                if (adminId1 == id) {
                    newAdminList.add(id);
                }
            }
        }
        PageHelper.startPage(pageNum,pageSize);
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andIdIn(newAdminList);
        List<Staff> admins = adminMapper.selectByExample2(adminExample);
        PageInfo pageInfo=new PageInfo<>(admins);
        String jsonString = JSON.toJSONString(pageInfo);
        return jsonString;
    }


}
