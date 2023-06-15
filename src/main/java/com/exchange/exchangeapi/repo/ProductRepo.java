package com.exchange.exchangeapi.repo;

import com.exchange.exchangeapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
}
