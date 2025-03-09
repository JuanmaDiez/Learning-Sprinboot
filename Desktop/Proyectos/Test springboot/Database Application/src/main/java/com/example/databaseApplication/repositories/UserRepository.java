package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
