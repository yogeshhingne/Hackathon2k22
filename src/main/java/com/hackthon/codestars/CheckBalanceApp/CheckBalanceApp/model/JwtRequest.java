package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class JwtRequest {
    private String username;
    private String password;
}
