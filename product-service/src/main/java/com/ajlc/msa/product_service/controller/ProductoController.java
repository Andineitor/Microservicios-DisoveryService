package com.ajlc.msa.product_service.controller;


import com.ajlc.msa.product_service.entity.ProductEntity;
import com.ajlc.msa.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductoController {

    @Autowired
    private ProductRepository productRepository;

    ///para obtener todos los datos de la colecion
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    /////////para crear un nuevo producto
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    // Editar un producto existente
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 200 OK
    public ProductEntity updateProduct(@PathVariable String id, @RequestBody ProductEntity updatedProduct) {
       updatedProduct.setId(id); // Asegúrate de que el id no cambie
        return productRepository.save(updatedProduct);
    }

    // Eliminar un producto
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK) // 204 No Content
    public ResponseEntity<String> deleteProduct(@PathVariable String id) {
        productRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("producto elimnado  " + id);
    }
}
