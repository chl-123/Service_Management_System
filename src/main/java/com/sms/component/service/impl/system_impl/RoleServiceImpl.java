package com.sms.component.service.impl.system_impl;

import com.sms.component.mapper.system_mapper.RoleMapper;
import com.sms.component.service.interf.system_interf.RoleService;
import com.sms.entity.system_entity.Role;
import com.sms.entity.system_entity.Staff;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public ResultEntity<String> saveRole(Role role) {

        try {
            Date date=new Date();
            role.setCreateTime(date);
            roleMapper.insertSelective(role);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteRole(Integer id) {
        try {
            roleMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateRoleBySelective(Role role) {
        try {
            roleMapper.updateByPrimaryKeySelective(role);

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
    public PageInfo<Role> getRolesBySelective(Integer pageNum, Integer pageSize, Role role) {
        PageHelper.startPage(pageNum,pageSize);
        /*shiro*/
        List<Role> roles = roleMapper.selectRoleBySelective(role);
        return new PageInfo<>(roles);
    }


}
