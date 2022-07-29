package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.UserRegistration;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.request.UserDeatils;

public interface UserRegistrationService {
    String inserUser(UserRegistration userRegistration);
    String findByUserNameAndPass(String userName, String password);

public UserDeatils findByUserName(String userName);
}
