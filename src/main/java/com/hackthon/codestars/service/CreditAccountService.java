package com.hackthon.codestars.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;

import java.util.List;
import java.util.Map;

public interface CreditAccountService {
    public String saveCredit(CreditAccount creditAccount);
    public double getBalance1(long mobileNo, String panNo, String dateOfBirth);
    public String updateBalance(int id, long accNo,int amount, String typeOfTransaction);
}
