package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String password;
    private String confirmPassword;
    private long mobileNo;
    private String dateOfBirth;
    private String panNo;
}
