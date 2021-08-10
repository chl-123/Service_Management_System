package com.sms.component.service.impl.basic_impl;

import com.sms.component.mapper.basic_mapper.ClientMapper;
import com.sms.component.service.interf.basic_interf.ClientService;
import com.sms.entity.basic_entity.Client;
import com.sms.entity.basic_entity.example.ClientExample;
import com.sms.entity.system_entity.Role;
import com.sms.utils.constant.Constant;
import com.sms.utils.util.ResultEntity;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired

    private ClientMapper clientMapper;
    @Override
    public ResultEntity<String> saveClient(Client client) {
        try {
            client.setCreateTime(new Date());
            clientMapper.insertSelective(client);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> deleteClient(Integer id) {
        try {
            clientMapper.deleteByPrimaryKey(id);

            return ResultEntity.successWithoutData();
        } catch (Exception e) {

            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<String> updateClientBySelective(Client client) {
        try {
            clientMapper.updateByPrimaryKeySelective(client);

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
    public PageInfo<Client> getClientBySelective(Integer pageNum, Integer pageSize, Client client) {

        PageHelper.startPage(pageNum,pageSize);
        List<Client> clients = clientMapper.selectClientBySelective(client);
        return new PageInfo<>(clients);
    }

    @Override
    public ResultEntity<List<Client>> getClients() {

        try {
            ClientExample clientExample=new ClientExample();
            List<Client> clients = clientMapper.selectByExample(clientExample);
            return ResultEntity.successWithData(clients);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }
}
