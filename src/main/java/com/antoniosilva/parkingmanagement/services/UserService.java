package com.antoniosilva.parkingmanagement.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.antoniosilva.parkingmanagement.entities.User;
import com.antoniosilva.parkingmanagement.repositories.UserRepository;

@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Transactional
  public User save(User user) {
    return userRepository.save(user);
  }
}
