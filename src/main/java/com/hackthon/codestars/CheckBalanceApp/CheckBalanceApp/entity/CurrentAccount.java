package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Table(name ="current_account",uniqueConstraints= @UniqueConstraint(columnNames={"accountNo", "mobileNo","panNo"}))
public class CurrentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int currentId;
    private String bankName;
//    private String accountType;
    @Column(unique=true)
    private long accountNo;
//    @Column(unique=true)
//    private long mobileNo;
//    private String dateOfBirth;
//    @Column(unique=true)
//    private String panNo;
    private double currentAccountBalance;
}
