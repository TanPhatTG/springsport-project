package com.springsport.common.entity;

import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "BRANDS")
@Entity
public class Brand extends AbstractEntity {
    @Column(name = "brand_code", nullable = false, length = 10, unique = true)
    private String CateCode;

    @Column(name = "brand_name", nullable = false, length = 100)
    private String CateName;

    @Column(name = "brand_image", nullable = false)
    private String CateImage;

    private boolean enabled;

    @OneToMany(mappedBy = "brand", cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })//1-N
    @OrderBy("productName asc")//các categories trả về được sắp xếp theo name tăng dần, name là tên thuộc tính trong entity
    public Set<Product> products;
}
