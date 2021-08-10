package com.sms.component.mvc.controller.system_controller;



import com.sms.component.service.interf.system_interf.AdminService;
import com.sms.entity.system_entity.AdDepPageJSON;
import com.sms.entity.system_entity.Admin;
import com.sms.entity.system_entity.Department;
import com.sms.entity.system_entity.Staff;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/admin/test/page.json")
    @ResponseBody
    public ResultEntity<String> getStaffInfo(@RequestBody AdDepPageJSON adDepPageJSON){

        String adminBySelective = adminService.getStaffInfoBySelective(adDepPageJSON.getPageNum(), adDepPageJSON.getPageSize(), adDepPageJSON.getAdmin(),adDepPageJSON.getDepartment());


        return ResultEntity.successWithData(adminBySelective);

    }
    @RequestMapping("/admin/test3/page.json")
    @ResponseBody
    public ResultEntity<Admin> Test3(
            @RequestBody Department department
           ){


        System.out.println(department.getDepartmentName());

        return ResultEntity.successWithoutData();

    }
}
