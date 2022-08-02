package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;
import com.hackthon.codestars.CheckBalanceApp.repository.CreditAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditAccountServiceImpl implements CreditAccountService {
    @Autowired
    CreditAccountRepo creditAccountRepo;

    @Override
    public String saveCredit(CreditAccount creditAccount) {
         creditAccountRepo.save(creditAccount);
         return "Record inserted successfully";
    }

    @Override
    public double getBalance1(long mobileNo, String panNo, String dateOfBirth) {
        return creditAccountRepo.findByMobileNoAndDateOfBirth(mobileNo,panNo,dateOfBirth);
    }

    @Override
    public String updateBalance(int id, long accNo, int amount, String typeOfTransaction) {
        CreditAccount creditAccount=creditAccountRepo.findById(id).get();
        if(creditAccount.getAccountNo()==accNo && typeOfTransaction.equalsIgnoreCase("withdraw") ){
           creditAccount.setCreditAccountBalance(creditAccount.getCreditAccountBalance()-amount);
           creditAccountRepo.save(creditAccount);
           return "balance updated after withdrawal";
        } else if (creditAccount.getAccountNo() == accNo && typeOfTransaction.equalsIgnoreCase("deposit")) {
            creditAccount.setCreditAccountBalance(creditAccount.getCreditAccountBalance()+amount);
            creditAccountRepo.save(creditAccount);
            return "balance updated after deposit";
        }
      return "something went wrong";
    }

}
