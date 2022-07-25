package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;

public interface UserRegistrationService {
    String inserUser(UserRegistration userRegistration);
    String findByUserNameAndPass(String userName, String password);
}
