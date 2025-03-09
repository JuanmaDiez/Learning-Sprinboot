package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
