package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.controller;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.request.RegistrationRequest;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.UserRegistration;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.request.UserDeatils;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.repository.CreditAccountRepo;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.repository.UserRegistrationRepo;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/userRegistrations")
public class UserRegistrationController {
    @Autowired
    UserRegistrationService userRegistrationService;
@Autowired
UserRegistrationRepo userRegstrationRepo;
@Autowired
CreditAccountRepo creditAccountRepo;

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
    @PostMapping("/joinregistration")
public UserRegistration placeRegistration(@RequestBody RegistrationRequest request){
       return userRegstrationRepo.save(request.getUserRegistration());

}
@GetMapping("/findAllRegist")
    public List<UserRegistration> getAllRegistration(){
        return userRegstrationRepo.findAll();
}
}
