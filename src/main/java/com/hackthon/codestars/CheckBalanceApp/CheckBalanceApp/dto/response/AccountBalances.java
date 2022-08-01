package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.response;

public interface AccountBalances {
    Integer getId();
    Double getCreditBalance();
    Double getCurrentBalance();
    Double getSavingBalance();
    Double getPrepaidBalance();

}
