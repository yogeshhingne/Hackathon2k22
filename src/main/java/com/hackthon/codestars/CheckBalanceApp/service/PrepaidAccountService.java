package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.PrepaidAccount;

public interface PrepaidAccountService {
    public String savePrepaid(PrepaidAccount prepaidAccount);
    public String updateBalance(int id, long accNo,int amount, String typeOfTransaction);

}
