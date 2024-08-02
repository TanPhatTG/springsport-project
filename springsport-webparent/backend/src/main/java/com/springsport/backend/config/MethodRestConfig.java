package com.springsport.backend.config;

import com.springsport.common.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:8082";

    @Autowired
    private EntityManager entityManager;
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(
                Type::getJavaType).toArray(Class[]::new));

        cors.addMapping("http://localhost:3000")
                .allowedOrigins(url)
                .allowedMethods("GET","POST","PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);

        HttpMethod[] blockMethods = {
                HttpMethod.POST,
                HttpMethod.GET,
                HttpMethod.PUT,
                HttpMethod.DELETE,
                HttpMethod.PATCH
        };

        disableHttpMethods(Product.class, config, blockMethods);
        //RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
    }

    private void disableHttpMethods(Class c, RepositoryRestConfiguration config, HttpMethod[] methods){
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.enable(methods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.enable(methods));
    }
}
