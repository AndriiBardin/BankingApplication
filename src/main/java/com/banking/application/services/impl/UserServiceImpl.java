package com.banking.application.services.impl;

import com.banking.application.entity.User;
import com.banking.application.repository.UserRepository;
import com.banking.application.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user with ID " + id));
    }

    @Override
    public User getByPhoneNumber(String phoneNumber) {
        return userRepository.getByPhoneNumber(phoneNumber)
                .orElseThrow(() -> new RuntimeException(
                        "No user with phone number " + phoneNumber));
    }

    @Override
    public void remove(Long id) {
        userRepository.deleteById(id);
    }
}
