package com.exchange.exchangeapi.repo;

import com.exchange.exchangeapi.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface OrderRepo extends JpaRepository<Orders ,String> {
}
