package com.example.databaseApplication.services;

import com.example.databaseApplication.entities.Address;
import com.example.databaseApplication.entities.User;
import com.example.databaseApplication.repositories.AddressRepository;
import com.example.databaseApplication.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AddressRepository addressRepository;
    private final EntityManager entityManager;

    public UserService(UserRepository userRepository, AddressRepository addressRepository, EntityManager entityManager) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.entityManager = entityManager;
    }


    public void showEntityStates() {
        Address address = new Address("street2", "city2", "zip2", "state2");
        User user = new User("John", "john4@gmail.com", "password");
        user.addAddress(address);

        this.userRepository.save(user);

        if (this.entityManager.contains(address)) System.out.println("persistent");
        else System.out.println("transient/detached");
    }

    @Transactional
    public void showRelatedEntities() {
        Address address = addressRepository.findById(1L).orElseThrow();
        System.out.println(address);
    }

    public void deleteUser() {
        userRepository.deleteById(5L);
    }

    @Transactional
    public void deleteAddress() {
        User user = userRepository.findById(2L).orElseThrow();
        Address address = user.getAddresses().getFirst();
        user.removeAddress(address);
        userRepository.save(user);
    }
}
