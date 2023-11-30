package com.sanket.ecommerce.dao;

import com.sanket.ecommerce.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
