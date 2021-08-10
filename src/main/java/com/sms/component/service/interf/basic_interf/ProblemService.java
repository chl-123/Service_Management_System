package com.sms.component.service.interf.basic_interf;


import com.sms.entity.basic_entity.Client;
import com.sms.entity.basic_entity.Problem;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProblemService {
    ResultEntity<String> saveProblem(Problem problem);

    ResultEntity<String> deleteProblem(Integer id);

    ResultEntity<String> updateProblemBySelective(Problem problem);

    PageInfo<Problem> getProblemBySelective(Integer pageNum, Integer pageSize, Problem problem);

    ResultEntity<List<Problem>> getProblems();
}
