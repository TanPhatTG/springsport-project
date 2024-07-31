package com.springsport.backend.module.brand;

import com.springsport.common.entity.product.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
