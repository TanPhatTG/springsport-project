package com.springsport.backend.module.product;

import com.springsport.common.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
public interface ProductRepository extends JpaRepository<Product, Long> {
}
