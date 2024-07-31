package com.springsport.common.entity.product;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.springsport.common.common.AbstractEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Table(name = "IMAGES")
@Entity
public class Image extends AbstractEntity {
    @Column(name = "img_code", nullable = false, length = 10, unique = true)
    private String imgCode;

    @Column(name = "img_name", nullable = false, length = 100)
    private String imgName;

    @Column(name = "img_path",length = 1024, nullable = false)
    private String imgPath;

    @Column(name = "img_resouce",columnDefinition = "LONGTEXT", nullable = false)
    @Lob
    private String imgResouce;

    @Column(name = "is_main_img")
    private boolean mainImg;

    @Column(name = "is_icon")
    private boolean icon;

    @Column(name = "is_cate")
    private boolean isCate;

    @Column(name = "is_brand")
    private boolean isBrand;

    @ManyToOne
    @JoinColumn(name = "prod_id")
    @JsonBackReference
    private Product product;
}
