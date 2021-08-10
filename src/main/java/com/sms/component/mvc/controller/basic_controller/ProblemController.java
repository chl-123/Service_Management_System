package com.sms.component.mvc.controller.basic_controller;

import com.sms.component.service.interf.basic_interf.ProblemService;
import com.sms.component.service.interf.system_interf.DepartmentService;
import com.sms.entity.basic_entity.Problem;
import com.sms.entity.system_entity.Department;
import com.sms.utils.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProblemController {
    @Autowired
    ProblemService problemService;
    @RequestMapping("/get/problems/info.json")
    @ResponseBody
    public ResultEntity<List<Problem>> getProblems(){
        ResultEntity<List<Problem>> problems = problemService.getProblems();

        return problems;
    }
}
