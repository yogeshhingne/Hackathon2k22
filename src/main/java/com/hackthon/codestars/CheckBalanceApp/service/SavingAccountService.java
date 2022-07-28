package com.hackthon.codestars.service;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;

public interface SavingAccountService {
    public String saveSaving(SavingAccount savingAccount);
    public String updateBalance(int id, long accNo,int amount, String typeOfTransaction);

}
