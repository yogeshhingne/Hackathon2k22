package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.PrepaidAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.PrepaidAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrepaidCardServiceImpl implements PrepaidAccountService{
    @Autowired
    PrepaidAccountRepo prepaidAccountRepo;
    @Override
    public String savePrepaid(PrepaidAccount prepaidAccount) {
        prepaidAccountRepo.save(prepaidAccount);
        return "Record inserted successfully";
    }
}
