package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.repository.AccountDetailsRepo;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.AccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccountDetailsServiceImpl implements AccountService {
    @Autowired
    AccountDetailsRepo accountDetailsRepo;

    @Override
    public String saveAccountDetails(AccountDetails accountDetails) {
        accountDetailsRepo.save(accountDetails);
        return "Data inserted successfully";
    }


    @Override
    public List<Map<String, String>> getBalance1(long mobileNo,  String panNo, String dateOfBirth) {
        return accountDetailsRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
    }

    @Override
    public List<AccountDetails> getAll() {
        return accountDetailsRepo.findAll();
    }

}


