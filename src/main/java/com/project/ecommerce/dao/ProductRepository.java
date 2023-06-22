package com.project.ecommerce.dao;

import com.project.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
