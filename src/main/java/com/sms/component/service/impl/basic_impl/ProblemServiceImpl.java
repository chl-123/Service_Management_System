package com.sms.component.service.impl.basic_impl;

import com.sms.component.mapper.basic_mapper.ProblemMapper;
import com.sms.component.service.interf.basic_interf.ProblemService;
import com.sms.entity.basic_entity.Client;
import com.sms.entity.basic_entity.Problem;
import com.sms.entity.basic_entity.example.ClientExample;
import com.sms.entity.basic_entity.example.ProblemExample;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
    private ProblemMapper problemMapper;
    @Override
    public ResultEntity<String> saveProblem(Problem problem) {
        try {
            problemMapper.insertSelective(problem);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteProblem(Integer id) {
        try {
            problemMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateProblemBySelective(Problem problem) {
        try {
            problemMapper.updateByPrimaryKeySelective(problem);

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
    public PageInfo<Problem> getProblemBySelective(Integer pageNum, Integer pageSize, Problem problem) {

        PageHelper.startPage(pageNum,pageSize);
        /*shiro*/
        List<Problem> problems = problemMapper.selectProblemBySelective(problem);
        return new PageInfo<>( problems);
    }

    @Override
    public ResultEntity<List<Problem>> getProblems() {
        try {
            ProblemExample problemExample=new ProblemExample();
            List<Problem> problems = problemMapper.selectByExample(problemExample);
            return ResultEntity.successWithData(problems);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }
}
