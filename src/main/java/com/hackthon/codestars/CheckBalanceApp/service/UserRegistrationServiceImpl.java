package com.hackthon.codestars.CheckBalanceApp.service;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;
import com.hackthon.codestars.CheckBalanceApp.repository.UserRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    @Autowired
    UserRegistrationRepo userRegistrationRepo;

    @Override
    public String inserUser(UserRegistration userRegistration) {
        String password=userRegistration.getPassword();
        Base64.Encoder encoder = Base64.getEncoder();
        String epassword=encoder.encodeToString(password.getBytes());
        userRegistration.setPassword(epassword);
        userRegistrationRepo.save(userRegistration);
        return "Record Inserted Successfully";
    }

    @Override
    public String findByUserNameAndPass(String userName, String password) {
        UserRegistration userRegistration=userRegistrationRepo.findByUserName(userName);
        String newPass = userRegistration.getPassword();
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(newPass);
        byte[] byteArrray = password.getBytes();
        boolean b = Arrays.equals(bytes, byteArrray);
        System.out.println(b);

        if (b) {
            return "User login Successfully";
        } else {
            return "User not available";
        }
    }

//    @Override
//    public List<String> findByUserNamepasswordusing(String username) {
//       return  userRegistrationRepo.findByUserNamepassword(username);
//
//    }

}
