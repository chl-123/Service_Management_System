package com.sms.component.service.interf.system_interf;

import com.sms.entity.system_entity.Department;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DepartmentService {
    public List<Integer> getAdminListByDepartmentId(List<Integer> idList);
    public List<Department> getDepartmentsBySelective(Department department);
    public ResultEntity<List<Department>> getAllDepartments();
    public ResultEntity<String> updateDepartmentBySelective(Department department);
    public ResultEntity<String> deleteDepartment(Integer id);
    public ResultEntity<String> addDepartmentBySelective(Department department);
    public PageInfo<Department> getDepartments(Integer pageNum,Integer pageSize,Department department);
}
