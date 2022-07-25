package com.hackthon.codestars.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Integer> {
    @Query(value = "select credit_card_account_balance,current_account_balance,prepaid_card_account_balance,saving_account_balance from account_details_tbl where mobile_no=?1 and pan_no=?2 and date=?3", nativeQuery = true)
    public List<Map<String, String>> findByMobileNoAndDateOfBirth(long mobileNo, String panNo, String dateOfBirth);
}
