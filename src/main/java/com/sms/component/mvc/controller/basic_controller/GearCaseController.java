package com.sms.component.mvc.controller.basic_controller;

import com.sms.component.service.interf.basic_interf.GearCaseService;
import com.sms.entity.basic_entity.GearCase;
import com.sms.utils.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GearCaseController {
    @Autowired
    private GearCaseService gearCaseService;
    @RequestMapping("/get/GearCase/info.json")
    @ResponseBody
    public ResultEntity<List<GearCase>> getGearCase(){
        ResultEntity<List<GearCase>> gearCase = gearCaseService.getGearCase();
        return gearCase;
    }
}
