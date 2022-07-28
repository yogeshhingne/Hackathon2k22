package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.PrepaidAccount;
import com.hackthon.codestars.CheckBalanceApp.service.PrepaidAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/PrepaidAccounts")
public class PrepaidAccountController {
    @Autowired
    PrepaidAccountService prepaidAccountService;
    @PostMapping("/")
    public String insertPrepaid(@RequestBody PrepaidAccount prepaidAccount){
        return prepaidAccountService.savePrepaid(prepaidAccount);

    }
}
