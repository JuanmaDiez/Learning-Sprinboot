package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
}
