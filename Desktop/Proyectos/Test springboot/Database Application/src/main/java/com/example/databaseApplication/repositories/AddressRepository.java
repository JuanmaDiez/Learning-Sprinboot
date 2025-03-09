package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
