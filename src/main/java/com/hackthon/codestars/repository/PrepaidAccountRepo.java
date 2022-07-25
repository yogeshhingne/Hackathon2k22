package com.hackthon.codestars.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.PrepaidAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface PrepaidAccountRepo extends JpaRepository<PrepaidAccount, Integer> {
    @Query(value = "select prepaid_account_balance from prepaid_account where mobile_no=?1 and pan_no=?2 and date_of_birth=?3", nativeQuery = true)
    public Double findByMobileNoAndDateOfBirth(long mobileNo, String panNo, String dateOfBirth);
}
