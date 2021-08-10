package com.sms.component.service.impl.basic_impl;

import com.sms.component.mapper.basic_mapper.GearCaseMapper;
import com.sms.component.service.interf.basic_interf.GearCaseService;
import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.basic_entity.GearCaseInfo;
import com.sms.entity.basic_entity.example.GearCaseExample;
import com.sms.entity.system_entity.Role;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GearCaseServiceImpl implements GearCaseService {
    @Autowired
    private GearCaseMapper gearCaseMapper;
    @Override
    public ResultEntity<String> saveGearCase(GearCase gearCase) {
        try {
            gearCaseMapper.insertSelective(gearCase);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteGearCase(Integer id) {
        try {
            gearCaseMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateGearCaseBySelective(GearCase gearCase) {
        try {
            gearCaseMapper.updateByPrimaryKeySelective(gearCase);

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
    public PageInfo<GearCase> getGearCaseBySelective(Integer pageNum, Integer pageSize, GearCaseInfo gearCaseInfo) {
        PageHelper.startPage(pageNum,pageSize);
        /*shiro*/
        List<GearCase> GearCases = gearCaseMapper.selectGearCaseBySelective(gearCaseInfo);
        return new PageInfo<>(GearCases);
    }

    @Override
    public ResultEntity<List<GearCase>> getGearCase() {
        try {
            GearCaseExample gearCaseExample=new GearCaseExample();
            GearCaseExample.Criteria criteria = gearCaseExample.createCriteria();
            List<GearCase> gearCases = gearCaseMapper.selectByExample(gearCaseExample);
            return ResultEntity.successWithData(gearCases);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }


    }
}
