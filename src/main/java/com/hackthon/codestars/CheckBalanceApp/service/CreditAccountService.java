package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CreditAccount;

public interface CreditAccountService {
    public String saveCredit(CreditAccount creditAccount);
    public double getBalance1(long mobileNo, String panNo, String dateOfBirth);
}
