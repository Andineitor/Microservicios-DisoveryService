package com.ajlc.msa.product_service.repository;


import com.ajlc.msa.product_service.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
