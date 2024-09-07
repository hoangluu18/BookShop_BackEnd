package com.project.BookStore_Backend.config;

import com.project.BookStore_Backend.entity.Category;
import com.project.BookStore_Backend.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    @Autowired
    private EntityManager entityManager;
    private String url = "http://localhost:3000";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        //cho phep tra ve id cua entity
        HttpMethod[] theUnsupportedActionsCategory = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
                .map(Type::getJavaType)
                .toArray(Class[]::new));
        //config.exposeIdsFor(Category.class);  //chi cho phep lay id cua category

        //chan cac phuong thuc khong muon su dung
        disableHttpMethods(Category.class, config, theUnsupportedActionsCategory);
        HttpMethod[] theUnsupportedActionsUser = {HttpMethod.DELETE};
        disableHttpMethods(User.class, config, theUnsupportedActionsUser);

        //CORS configuration

        cors.addMapping("/**")
                .allowedOrigins(url)
                .allowedMethods("GET", "POST", "PUT", "DELETE");

    }

    // phuong thuc chan cac phuong thuc khong muon su dung
    private void disableHttpMethods(Class theClass, RepositoryRestConfiguration config, HttpMethod[] theUnsupportedActions) {
        config.getExposureConfiguration()
                .forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }
}
