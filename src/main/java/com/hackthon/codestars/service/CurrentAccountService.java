package com.hackthon.codestars.service;

import com.hackthon.codestars.CheckBalanceApp.entity.CurrentAccount;

import java.util.List;
import java.util.Map;

public interface CurrentAccountService {
    public String saveCurrent(CurrentAccount currentAccount);
    //public List<Map<String,String>> getBalance1(long mobileNo, String panNo, String dateOfBirth);
    public String updateBalance(int id, long accountNo,int amount, String typeOfTransaction);

}
