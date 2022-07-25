package com.hackthon.codestars.CheckBalanceApp.repository;

import com.hackthon.codestars.CheckBalanceApp.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer> {
    @Query(value = "select * from public.user_registration where user_registration.user_name=?1", nativeQuery = true)
    UserRegistration findByUserName(String userName);
}
