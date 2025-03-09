package com.example.databaseApplication.services;

import com.example.databaseApplication.repositories.ProfileRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Transactional
    public void getProfilesByLoyaltyPoints() {
        profileRepository.findByLoyaltyPointsGreaterThanOrderByUserEmail(2).forEach(profile -> {
                System.out.println(profile.getId());
                System.out.println(profile.getUser().getEmail());
            }
        );
    }

    @Transactional
    public void getProfilesByPointsWithQuery() {
        profileRepository.findLoyalProfiles(10).forEach(profile -> {
            System.out.println(profile.getId());
            System.out.println(profile.getUser().getEmail());
        });
    }
}
