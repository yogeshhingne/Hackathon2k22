package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(targetEntity = CreditAccount.class,cascade =  CascadeType.ALL)
    @JoinColumn(name="register_fk",referencedColumnName = "id",nullable = false, updatable = false)
private List<CreditAccount> creditAccountList;

    @OneToMany(targetEntity = CurrentAccount.class,cascade =  CascadeType.ALL)
    @JoinColumn(name="register_fk",referencedColumnName = "id",nullable = false, updatable = false)
    private List<CurrentAccount> currentAccountList;

    @OneToMany(targetEntity = PrepaidAccount.class,cascade =  CascadeType.ALL)
    @JoinColumn(name="register_fk",referencedColumnName = "id",nullable = false, updatable = false)
    private List<PrepaidAccount> prepaidAccountList;

    @OneToMany(targetEntity = SavingAccount.class,cascade =  CascadeType.ALL)
    @JoinColumn(name="register_fk",referencedColumnName = "id",nullable = false, updatable = false)
    private List<SavingAccount> savingAccountList;

}
