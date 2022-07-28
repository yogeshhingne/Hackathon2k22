package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;

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
    @Column(unique=true)
    private String userName;
    private String password;
    private String confirmPassword;
    @Column(unique=true)
    private long mobileNo;
    private String dateOfBirth;
    @Column(unique=true)
    private String panNo;
}
