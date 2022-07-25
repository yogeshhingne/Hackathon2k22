package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name ="prepaid_account",uniqueConstraints= @UniqueConstraint(columnNames={"accountNo", "mobileNo","panNo"}))
public class PrepaidAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int prepaidId;
    private String bankName;
    private long accountNo;
    private String accountType;
    private long mobileNo;
    private String dateOfBirth;
    private String panNo;
    private double prepaidAccountBalance;
}
