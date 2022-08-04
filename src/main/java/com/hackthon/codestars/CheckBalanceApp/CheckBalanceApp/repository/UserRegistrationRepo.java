package com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.response.AccountBalances;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hackthon.codestars.CheckBalanceApp.CheckBalanceApp.dto.request.UserDeatils;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "select * from public.user_registration where user_registration.user_name=?1", nativeQuery = true)
    UserRegistration findByUserName(String userName);

    @Query(value = "select mobile_no as mobileNo, pan_no as panNo, date_of_birth as dateOfBirth from user_registration  where user_name=?1", nativeQuery = true)
    public UserDeatils findByUname(String userName);
@Query(value = "select cast(uuuu.id as float) as id, uuuu.credit_bal, uuuu.current_bal, uuuu.saving_bal, sum(pr.prepaid_account_balance) as prepaid_bal\n" +
        "from\n" +
        "(select uuu.id, uuu.credit_bal, uuu.current_bal, sum(s.saving_account_balance) as saving_bal\n" +
        "from\n" +
        "(select uu.id, uu.credit_bal, sum(cu.current_account_balance) as current_bal\n" +
        "from\n" +
        "(select u.id, sum(cr.credit_account_balance) as credit_bal\n" +
        "from public.user_registration u\n" +
        "left join credit_account cr \n" +
        "on u.id = cr.register_fk\n" +
        "group by u.id\n" +
        "having u.mobile_no =?1 and u.pan_no = ?2 and u.date_of_birth  = ?3) uu\n" +
        "left JOIN current_account cu \n" +
        "ON uu.id=cu.register_fk\n" +
        "group by uu.id, uu.credit_bal) uuu\n" +
        "left JOIN saving_account s\n" +
        "ON uuu.id=s.register_fk\n" +
        "group by uuu.id, uuu.credit_bal, uuu.current_bal) uuuu\n" +
        "left JOIN prepaid_account pr\n" +
        "ON uuuu.id=pr.register_fk\n" +
        "group by uuuu.id, uuuu.credit_bal, uuuu.current_bal, uuuu.saving_bal",nativeQuery = true)
    public Map<String,Double> findBalancesByCredential(long mobileNo, String panNo, String dateOfBirth);
}

