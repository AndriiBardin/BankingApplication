package com.banking.application.services;

import com.banking.application.entity.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(String name);
}
