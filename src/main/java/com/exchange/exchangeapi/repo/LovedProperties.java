package com.exchange.exchangeapi.repo;

import com.exchange.exchangeapi.entity.LovedProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface LovedProperties extends JpaRepository<LovedProperty,String> {
}
