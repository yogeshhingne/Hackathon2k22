//package com.hackthon.codestars.CheckBalanceApp.controller;
//
//
//import com.hackthon.codestars.CheckBalanceApp.helper.JwtUtil;
//import com.hackthon.codestars.CheckBalanceApp.model.JwtRequest;
//import com.hackthon.codestars.CheckBalanceApp.model.JwtResponse;
//import com.hackthon.codestars.CheckBalanceApp.service.CustomeUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins="http://localhost:4200")
//
//public class JwtController {
//
//    @Autowired
//    AuthenticationManager authenticationManager;
//    @Autowired
//    CustomeUserDetailsService customeUserDetailsService;
//    @Autowired
//    JwtUtil jwtUtil;
//    @RequestMapping(value="/token",method= RequestMethod.POST)
//    public  ResponseEntity<?> generatetoken(@RequestBody JwtRequest jwtRequest) throws Exception {
//        System.out.println(jwtRequest);
//        try {
//            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
//        } catch (UsernameNotFoundException e) {
//            e.printStackTrace();
//            throw new Exception("bad crediantial");
//        }catch (BadCredentialsException e){
//            e.printStackTrace();
//            throw new Exception("bad crediantial");
//
//        }
//
//        UserDetails userDetails = this.customeUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
//        String token = this.jwtUtil.generateToken(userDetails);
//        System.out.println(" token"+token);
//        return ResponseEntity.ok(new JwtResponse(token));
//    }
//}
