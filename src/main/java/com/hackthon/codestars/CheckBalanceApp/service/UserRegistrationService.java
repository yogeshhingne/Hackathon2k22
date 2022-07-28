package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;

import java.util.List;

public interface UserRegistrationService {
    String inserUser(UserRegistration userRegistration);
    String findByUserNameAndPass(String userName, String password);
//    public List<String> findByUserNamepasswordusing(String username);
}
