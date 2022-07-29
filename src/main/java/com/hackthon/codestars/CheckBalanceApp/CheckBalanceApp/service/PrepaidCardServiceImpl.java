package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.repository.PrepaidAccountRepo;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.PrepaidAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrepaidCardServiceImpl implements PrepaidAccountService{
    @Autowired
    PrepaidAccountRepo prepaidAccountRepo;
    @Override
    public String savePrepaid(PrepaidAccount prepaidAccount) {
        prepaidAccountRepo.save(prepaidAccount);
        return "Record inserted successfully";
    }

    @Override
    public String updateBalance(int id, long accNo, int amount, String typeOfTransaction) {
        PrepaidAccount prepaidAccount=prepaidAccountRepo.findById(id).get();
        if(prepaidAccount.getAccountNo()==accNo && typeOfTransaction.equalsIgnoreCase("withdraw") ){
            prepaidAccount.setPrepaidAccountBalance(prepaidAccount.getPrepaidAccountBalance()-amount);
            prepaidAccountRepo.save(prepaidAccount);
            return "balance updated after withdrawal";
        } else if (prepaidAccount.getAccountNo() == accNo && typeOfTransaction.equalsIgnoreCase("deposit")) {
            prepaidAccount.setPrepaidAccountBalance(prepaidAccount.getPrepaidAccountBalance()+amount);
            prepaidAccountRepo.save(prepaidAccount);
            return "balance updated after deposit";
        }
        return "something went wrong";
    }
    }

