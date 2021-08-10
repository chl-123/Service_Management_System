package com.sms.component.service.interf.basic_interf;


import com.sms.entity.basic_entity.Client;
import com.sms.entity.basic_entity.GearCase;
import com.sms.entity.basic_entity.GearCaseInfo;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ClientService {
    ResultEntity<String> saveClient(Client client);

    ResultEntity<String> deleteClient(Integer id);

    ResultEntity<String> updateClientBySelective(Client client);

    PageInfo<Client> getClientBySelective(Integer pageNum, Integer pageSize, Client client);

    ResultEntity<List<Client>> getClients();
}
