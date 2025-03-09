package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
