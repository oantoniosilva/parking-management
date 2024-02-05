package com.antoniosilva.parkingmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniosilva.parkingmanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
