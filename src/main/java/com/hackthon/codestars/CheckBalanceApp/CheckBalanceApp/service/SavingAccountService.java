package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.SavingAccount;

public interface SavingAccountService {
    public String saveSaving(SavingAccount savingAccount);
    public String updateBalance(int id, long accNo,int amount, String typeOfTransaction);

}
