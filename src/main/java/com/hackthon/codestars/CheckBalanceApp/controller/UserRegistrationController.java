package com.hackthon.codestars.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;
import com.hackthon.codestars.CheckBalanceApp.dto.request.UserDeatils;
import com.hackthon.codestars.CheckBalanceApp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/userRegistrations")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService userRegistrationService;


    @PostMapping("/")
    public String saveUser(@RequestBody UserRegistration userRegistration){
        return userRegistrationService.inserUser(userRegistration);
    }
    @GetMapping("/")
    public ResponseEntity<String> findByUsernameAndPassword(@RequestParam("userName") String userName,
                                                            @RequestParam("password") String password) {
           String response = userRegistrationService.findByUserNameAndPass(userName,password);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/mpd/")
    public ResponseEntity<UserDeatils> findByUsername(@RequestParam("userName") String userName){
        UserDeatils response = userRegistrationService.findByUserName(userName);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
