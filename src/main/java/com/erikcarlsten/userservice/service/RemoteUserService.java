package com.erikcarlsten.userservice.service;

import com.erikcarlsten.userservice.domain.User;
import com.erikcarlsten.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoteUserService implements UserService {

    private UserRepository userRepository;

    @Autowired
    public RemoteUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
