package com.hackthon.codestars.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.AccountDetails;
import com.hackthon.codestars.CheckBalanceApp.repository.CurrentAccountRepo;
import com.hackthon.codestars.CheckBalanceApp.repository.PrepaidAccountRepo;
import com.hackthon.codestars.CheckBalanceApp.repository.SavingAccountRepo;
import com.hackthon.codestars.CheckBalanceApp.service.AccountService;
import com.hackthon.codestars.repository.CreditAccountRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins="http://localhost:4200")

@RestController
@RequestMapping("/accontsDetails")
public class AccountDetailsController {
    @Autowired
    AccountService accountService;
    @Autowired
    CurrentAccountRepo currentAccountRepo;
    @Autowired
    CreditAccountRepo creditAccountRepo;
    @Autowired
    SavingAccountRepo savingAccountRepo;
    @Autowired
    PrepaidAccountRepo prepaidAccountRepo;
    @Autowired
    ModelMapper modelMapper;
    @PostMapping("/")
    public String insertAccountDetails(@RequestBody AccountDetails accountDetails){
       return accountService.saveAccountDetails(accountDetails);
    }

    @GetMapping("/{mobileNo}/{panNo}/{dateOfBirth}")
    public ResponseEntity<Map<String,Double>> getBalances(@PathVariable long mobileNo,@PathVariable String panNo, @PathVariable String dateOfBirth){
        Double a1=creditAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
        Double a2=currentAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
        Double a3=prepaidAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
        Double a4=savingAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
        Map<String,Double> map=new TreeMap<String,Double>();
        map.put("creditAccountBalance",a1);
        map.put("currentAccountBalance",a2);
        map.put("prepaidAccountBalance",a3);
        map.put("savingAccountBalance",a4);
        if (map.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    @GetMapping("/")
    public ResponseEntity<List<AccountDetails>> getAccountDetails(){
       List<AccountDetails>list= accountService.getAll();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}