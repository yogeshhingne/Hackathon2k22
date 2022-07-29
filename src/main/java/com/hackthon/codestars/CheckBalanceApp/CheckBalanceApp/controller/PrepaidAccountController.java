package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.PrepaidAccount;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service.PrepaidAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/PrepaidAccounts")
public class PrepaidAccountController {
    @Autowired
    PrepaidAccountService prepaidAccountService;
    @PostMapping("/")
    public String insertPrepaid(@RequestBody PrepaidAccount prepaidAccount){
        return prepaidAccountService.savePrepaid(prepaidAccount);
    }
    @PatchMapping("/{id}/{accNo}/{amount}/{typeOfTransaction}")
    public String updateRecord(@PathVariable int id, @PathVariable long accNo, @PathVariable int amount, @PathVariable String typeOfTransaction){
        return  prepaidAccountService.updateBalance(id, accNo, amount, typeOfTransaction);
    }

}
