package com.springsport.backend.module.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.springsport.common.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
@CrossOrigin(origins = "http://localhost:3000")
@RepositoryRestResource(path = "product")
@JsonIgnoreProperties({"_links"})
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByProductNameContaining(@RequestParam("prdname") String prdName, Pageable pageable);
}
