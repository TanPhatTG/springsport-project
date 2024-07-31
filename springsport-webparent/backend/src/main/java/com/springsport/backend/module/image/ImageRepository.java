package com.springsport.backend.module.image;

import com.springsport.common.entity.product.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "image", path = "image")
@CrossOrigin(origins = "http://localhost:3000")
public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(@Param("prodId") Long prdId);
}
