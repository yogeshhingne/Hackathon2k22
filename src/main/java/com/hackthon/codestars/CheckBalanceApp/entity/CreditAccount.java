package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Table(name ="credit_account",uniqueConstraints= @UniqueConstraint(columnNames={"accountNo", "mobileNo","panNo"}))
public class CreditAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int creditId;
    private String bankName;
    private String accountType;
    @Column(unique=true)
    private long accountNo;
    @Column(unique=true)
    private long mobileNo;
    private String dateOfBirth;
    @Column(unique=true)
    private String panNo;
    private double creditAccountBalance;
}
