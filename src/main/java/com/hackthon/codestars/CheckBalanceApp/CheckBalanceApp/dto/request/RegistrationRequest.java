package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.request;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.UserRegistration;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class RegistrationRequest {
    private UserRegistration userRegistration;
}
