package com.springsport.backend.module.product;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springsport.common.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductService {
    private final ObjectMapper objectMapper;
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository,
                          ObjectMapper objectMapper  ){
        this.productRepository = productRepository;
        this.objectMapper = objectMapper;
    }

}
