package com.sms.component.service.impl.system_impl;

import com.sms.component.mapper.system_mapper.DepartmentMapper;
import com.sms.component.service.interf.system_interf.DepartmentService;
import com.sms.entity.system_entity.Department;
import com.sms.entity.system_entity.example.DepartmentExample;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    public List<Department> getDepartmentsBySelective(Department department){
        List<Department> departments=departmentMapper.selectBySelective(department);
        return departments;
    }

    @Override
    public ResultEntity<List<Department>> getAllDepartments() {
        try {
            DepartmentExample departmentExample=new DepartmentExample();
            List<Department> departments = departmentMapper.selectByExample(departmentExample);

            return ResultEntity.successWithData(departments);
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }


    }

    @Override
    public ResultEntity<String> updateDepartmentBySelective(Department department) {
        try {
            departmentMapper.updateByPrimaryKeySelective(department);

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
    public ResultEntity<String> deleteDepartment(Integer id) {
        try {
            departmentMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> addDepartmentBySelective(Department department) {
        try {
            departmentMapper.insertSelective(department);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public PageInfo<Department> getDepartments(Integer pageNum,Integer pageSize,Department department) {
        PageHelper.startPage(pageNum,pageSize);
        List<Department> departments=departmentMapper.selectBySelective(department);
        return new PageInfo<>(departments);
    }

    public List<Integer> getAdminListByDepartmentId(List<Integer> idList){
        List<Integer> adminIdList=departmentMapper.selectAdminIdListByDepartmentId(idList);
        return adminIdList;
    }
}
