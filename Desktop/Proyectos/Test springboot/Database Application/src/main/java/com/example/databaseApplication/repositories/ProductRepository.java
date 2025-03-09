package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
