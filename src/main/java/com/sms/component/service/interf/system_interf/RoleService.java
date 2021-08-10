package com.sms.component.service.interf.system_interf;

import com.sms.entity.system_entity.Role;
import com.sms.entity.system_entity.Staff;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

public interface RoleService {
    ResultEntity<String> saveRole(Role role);

    ResultEntity<String> deleteRole(Integer id);

    ResultEntity<String> updateRoleBySelective(Role role);

    PageInfo<Role> getRolesBySelective(Integer pageNum, Integer pageSize, Role role);
}
