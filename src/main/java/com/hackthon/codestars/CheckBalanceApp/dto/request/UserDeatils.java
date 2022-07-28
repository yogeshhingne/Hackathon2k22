package com.hackthon.codestars.CheckBalanceApp.dto.request;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDeatils {
    private long mobileNo;
    private Date dateOfBirth;
    private String PanNo;
}
