package com.hackthon.codestars.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;
import com.hackthon.codestars.service.CurrentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CurrentAccounts")
public class CurrentAccountController {
    @Autowired
    CurrentAccountService currentAccountService;
    @PostMapping("/")
    public String insertCurrent(@RequestBody CurrentAccount currentAccount){
        return currentAccountService.saveCurrent(currentAccount);
    }
    @PatchMapping("/{id}/{accNo}/{amount}/{typeOfTransaction}")
    public String updateRecord(@PathVariable int id, @PathVariable long accNo, @PathVariable int amount, @PathVariable String typeOfTransaction){
        return  currentAccountService.updateBalance(id, accNo, amount, typeOfTransaction);
    }

}
