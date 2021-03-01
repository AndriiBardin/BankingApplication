package com.banking.application.services;

import com.banking.application.entity.User;

public interface UserService {
    User save(User user);

    User getById(Long id);

    User getByPhoneNumber(String phoneNumber);

    void remove(Long id);
}
