package com.example.databaseApplication.repositories;

import com.example.databaseApplication.entities.Profile;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
    @EntityGraph(attributePaths = "user")
    List<Profile> findByLoyaltyPointsGreaterThanOrderByUserEmail(Integer points);

    @Query("select p from Profile p where p.loyaltyPoints > :points order by p.user.email")
    @EntityGraph(attributePaths = "user")
    List<Profile> findLoyalProfiles(@Param("points") Integer points);
}
