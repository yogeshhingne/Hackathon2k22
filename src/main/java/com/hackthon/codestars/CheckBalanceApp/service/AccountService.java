package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.AccountDetails;

import java.util.List;
import java.util.Map;

public interface AccountService {
    public String saveAccountDetails(AccountDetails accountDetails);
    public List<Map<String,String>> getBalance1(long mobileNo, String panNo, String dateOfBirth);
    public List<AccountDetails> getAll();
}
