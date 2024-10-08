package com.springsport.backend.module.brand;

import com.springsport.common.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private BrandRepository brandRepository;

    @Autowired
    public BrandService(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }

    public List<Brand> getAll(){
      return (List<Brand>) brandRepository.findAll();
    }
}
