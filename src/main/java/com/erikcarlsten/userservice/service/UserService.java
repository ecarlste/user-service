package com.erikcarlsten.userservice.service;

import com.erikcarlsten.userservice.domain.User;

public interface UserService {

    User getUserById(Long id);
    User getUserByUsername(String username);

}
