package com.springsport.backend.module.brand;

import com.springsport.common.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandRestController {

    private BrandService brandService;

    @Autowired
    public BrandRestController(BrandService brandService){
        this.brandService = brandService;
    }

    @GetMapping("")
    public ResponseEntity<List<Brand>> getAllBrands() {
        List n = (List<Brand>) brandService.getAll();
        return ResponseEntity.ok(n) ;
    }
}
