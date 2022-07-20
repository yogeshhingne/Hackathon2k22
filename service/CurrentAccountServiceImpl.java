package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.CurrentAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService{
@Autowired
    CurrentAccountRepo currentAccountRepo;
    @Override
    public String saveCurrent(CurrentAccount currentAccount) {
        currentAccountRepo.save(currentAccount);
        return "Record inserted successfully";
    }
}
