package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.SavingAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    SavingAccountRepo savingAccountRepo;
    @Override
    public String saveSaving(SavingAccount savingAccount) {
       savingAccountRepo.save(savingAccount);
        return "Record inserted Successfully";
    }
}
