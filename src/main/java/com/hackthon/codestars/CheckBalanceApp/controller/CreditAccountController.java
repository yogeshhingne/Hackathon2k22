package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;
import com.hackthon.codestars.CheckBalanceApp.service.CreditAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/CreditAccounts")
public class CreditAccountController {
    @Autowired
    CreditAccountService creditAccountService;
    @PostMapping("/")
    public String creditAccountDetails(@RequestBody CreditAccount creditAccount){
       return creditAccountService.saveCredit(creditAccount);

    }
    @GetMapping("/{mobileNo}/{panNo}/{dateOfBirth}")
    public double getBalances(@PathVariable long mobileNo, @PathVariable String panNo, @PathVariable String dateOfBirth){
        return  creditAccountService.getBalance1(mobileNo,panNo,dateOfBirth);
    }
    @PatchMapping("/{id}/{accNo}/{amount}/{typeOfTransaction}")
    public String updateRecord(@PathVariable int id, @PathVariable long accNo, @PathVariable int amount, @PathVariable String typeOfTransaction){
        return  creditAccountService.updateBalance(id, accNo, amount, typeOfTransaction);
    }

}
