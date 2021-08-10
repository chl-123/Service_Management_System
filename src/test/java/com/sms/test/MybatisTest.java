package com.sms.test;


import com.sms.component.service.interf.basic_interf.ClientService;
import com.sms.component.service.interf.basic_interf.GearCaseService;
import com.sms.component.service.interf.basic_interf.ProblemService;
import com.sms.component.service.interf.system_interf.DepartmentService;
import com.sms.component.service.interf.system_interf.RoleService;
import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.system_entity.Staff;
import com.sms.utils.util.ResultEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/*.xml"})
public class MybatisTest {

    Staff staff=new Staff();
    @Autowired
    DepartmentService departmentService;

    @Autowired
    ProblemService problemService;
    @Autowired
    RoleService roleService;
    @Autowired

    GearCaseService gearCaseService;
    @Autowired

    ClientService clientService;
    @Test
    public void test(){
//        Problem problem=new Problem();
//
//
//        PageInfo<Problem> problemBySelective = problemService.getProblemBySelective(1, 5, problem);
//        for (Problem problems: problemBySelective.getList()
//             ) {
//            System.out.println(problems.toString());
//        }
//        Role role=new Role();
//        role.setRoleName("资管科");
//        role.setRoleLevel("2");
//        role.setRoleStatus(1);
//        role.setRoleId("1001");
//        ResultEntity<String> stringResultEntity = roleService.saveRole(role);
//        System.out.println(stringResultEntity.toString());

        ResultEntity<List<GearCase>> gearCase = gearCaseService.getGearCase();
        System.out.println(gearCase);

    }

}
