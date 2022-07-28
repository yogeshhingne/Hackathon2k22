package com.hackthon.codestars.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.hackthon.codestars.CheckBalanceApp.dto.request.UserDeatils;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "select * from public.user_registration where user_registration.user_name=?1", nativeQuery = true)
    UserRegistration findByUserName(String userName);
    @Query(value = "select mobile_no as mobileNo, pan_no as panNo, date_of_birth as dateOfBirth from user_registration  where user_name=?1", nativeQuery = true)
    public UserDeatils findByUname(String userName);

}
