package com.hackthon.codestars.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.CurrentAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService{
@Autowired
    CurrentAccountRepo currentAccountRepo;
    @Override
    public String saveCurrent(CurrentAccount currentAccount) {
        currentAccountRepo.save(currentAccount);
        return "Record inserted successfully";
    }

    @Override
    public String updateBalance(int id, long accNo, int amount, String typeOfTransaction) {
        CurrentAccount currentAccount=currentAccountRepo.findById(id).get();
        if(currentAccount.getAccountNo()==accNo && typeOfTransaction.equalsIgnoreCase("withdraw") ){
            currentAccount.setCurrentAccountBalance(currentAccount.getCurrentAccountBalance()-amount);
            currentAccountRepo.save(currentAccount);
            return "balance updated after withdrawal";
        } else if (currentAccount.getAccountNo() == accNo && typeOfTransaction.equalsIgnoreCase("deposit")) {
            currentAccount.setCurrentAccountBalance(currentAccount.getCurrentAccountBalance()+amount);
            currentAccountRepo.save(currentAccount);
            return "balance updated after deposit";
        }
        return "something went wrong";
    }

}
