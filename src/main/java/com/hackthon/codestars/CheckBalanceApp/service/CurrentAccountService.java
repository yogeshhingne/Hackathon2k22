package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;

public interface CurrentAccountService {
    public String saveCurrent(CurrentAccount currentAccount);
    //public List<Map<String,String>> getBalance1(long mobileNo, String panNo, String dateOfBirth);
    public String updateBalance(int id, long accountNo,int amount, String typeOfTransaction);

}
