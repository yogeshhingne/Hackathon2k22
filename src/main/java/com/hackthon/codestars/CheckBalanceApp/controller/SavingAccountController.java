package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;
import com.hackthon.codestars.CheckBalanceApp.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SavingAccounts")
public class SavingAccountController{
    @Autowired
    SavingAccountService savingAccountService;
    @PostMapping("/")
    public String insertSaving(@RequestBody SavingAccount savingAccount){
        return savingAccountService.saveSaving(savingAccount);

    }

}
