package com.springsport.common.entity.product;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "PRODUCTS")
@Entity
public class Product extends AbstractEntity {

    @Column(name = "prd_code", nullable = false, length = 10, unique = true)
    private String productCode;

    @Column(name = "prd_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "short_descr",length = 1024, nullable = true)
    private String shortDescription;


    @Column(name = "long_descr",length = 4096, nullable = true)
    private String longDescription;

    @Column(name = "discount_id")
    private Long discountId;

    private boolean enabled;

    @Column(name = "in_stock")
    private boolean inStock;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    @JsonBackReference
    private Brand brand; //customize

    @ManyToOne
    @JoinColumn(name = "cate_id", nullable = false)
    @JsonBackReference
    public Category category; //customize

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    public List<Image> images;

}
