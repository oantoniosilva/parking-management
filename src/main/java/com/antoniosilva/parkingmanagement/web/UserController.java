package com.antoniosilva.parkingmanagement.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antoniosilva.parkingmanagement.entities.User;
import com.antoniosilva.parkingmanagement.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping
  public ResponseEntity<User> create(@RequestBody User user) {
    var createUser = userService.save(user);
    return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
  }
}
