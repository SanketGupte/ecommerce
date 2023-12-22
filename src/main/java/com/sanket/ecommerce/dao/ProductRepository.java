package com.sanket.ecommerce.dao;

import com.sanket.ecommerce.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Products, Long> {
}
