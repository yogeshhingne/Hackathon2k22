package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;
import com.hackthon.codestars.CheckBalanceApp.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SavingAccounts")
public class SavingAccountController{
    @Autowired
    SavingAccountService savingAccountService;
    @PostMapping("/")
    public String insertSaving(@RequestBody SavingAccount savingAccount){
        return savingAccountService.saveSaving(savingAccount);
    }
    @PatchMapping("/{id}/{accNo}/{amount}/{typeOfTransaction}")
    public String updateRecord(@PathVariable int id, @PathVariable long accNo, @PathVariable int amount, @PathVariable String typeOfTransaction){
        return  savingAccountService.updateBalance(id, accNo, amount, typeOfTransaction);
    }

}
