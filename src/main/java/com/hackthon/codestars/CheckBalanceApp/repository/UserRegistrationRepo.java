package com.hackthon.codestars.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "select * from public.user_registration where user_registration.user_name=?1", nativeQuery = true)
    UserRegistration findByUserName(String userName);
//@Query(value="select user_registration.mobile_no,user_registration.pan_no,user_registration.date_of_birth from public.user_registration where user_registration.user_name=?1",nativeQuery = true)
//    List<String> findByUserNamepassword(String username);

}

