package com.sms.component.mvc.controller.system_controller;

import com.sms.component.service.interf.system_interf.DepartmentService;
import com.sms.entity.system_entity.Department;
import com.sms.utils.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/get/departments/info.json")
    @ResponseBody
    public ResultEntity<List<Department>> getDepartments(){
        ResultEntity<List<Department>> allDepartments = departmentService.getAllDepartments();
        return allDepartments;
    }
}
