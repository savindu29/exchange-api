package com.exchange.exchangeapi.repo;

import com.exchange.exchangeapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,String> {
    @Query(value = "SELECT * from user where role_id=?",nativeQuery = true)
    List<User> findAllAdmins(String admin);
}
