package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;
import com.hackthon.codestars.CheckBalanceApp.service.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CurrentAccounts")
public class CurrentAccountController {
    @Autowired
    CurrentAccountService currentAccountService;
    @PostMapping("/")
    public String insertCurrent(@RequestBody CurrentAccount currentAccount){
        return currentAccountService.saveCurrent(currentAccount);

    }
}
