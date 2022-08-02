package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.SavingAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    SavingAccountRepo savingAccountRepo;
    @Override
    public String saveSaving(SavingAccount savingAccount) {
       savingAccountRepo.save(savingAccount);
        return "Record inserted Successfully";
    }

    @Override
    public String updateBalance(int id, long accNo, int amount, String typeOfTransaction) {
        SavingAccount savingAccount=savingAccountRepo.findById(id).get();
        if(savingAccount.getAccountNo()==accNo && typeOfTransaction.equalsIgnoreCase("withdraw") ){
            savingAccount.setSavingAccountBalance(savingAccount.getSavingAccountBalance()-amount);
            savingAccountRepo.save(savingAccount);
            return "balance updated after withdrawal";
        } else if (savingAccount.getAccountNo() == accNo && typeOfTransaction.equalsIgnoreCase("deposit")) {
            savingAccount.setSavingAccountBalance(savingAccount.getSavingAccountBalance()+amount);
            savingAccountRepo.save(savingAccount);
            return "balance updated after deposit";
        }
        return "something went wrong";
    }
}
