package com.hackthon.codestars.CheckBalanceApp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="accountDetails_tbl",uniqueConstraints= @UniqueConstraint(columnNames={"accountNo", "mobileNo"}))

public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bankName;
    private long accountNo;
    private long mobileNo;
    private String dateOfBirth;
    private String panNo;

}
