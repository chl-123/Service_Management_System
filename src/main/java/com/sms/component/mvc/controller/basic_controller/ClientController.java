package com.sms.component.mvc.controller.basic_controller;

import com.sms.component.service.interf.basic_interf.ClientService;
import com.sms.entity.basic_entity.Client;
import com.sms.utils.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    ClientService clientService;

    @RequestMapping("/get/clients/info.json")
    @ResponseBody
    public ResultEntity<List<Client>>  getClients(){
        ResultEntity<List<Client>> clients = clientService.getClients();
        return clients;
    }
}
