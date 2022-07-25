package com.hackthon.codestars.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SavingAccountRepo extends JpaRepository<SavingAccount, Integer> {
    @Query(value = "select saving_account_balance from saving_account where mobile_no=?1 and pan_no=?2 and date_of_birth=?3", nativeQuery = true)
    public Double findByMobileNoAndDateOfBirth(long mobileNo,String panNO,String dateOfBirth);
}
