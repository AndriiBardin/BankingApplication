package com.banking.application.services.impl;

import com.banking.application.entity.Role;
import com.banking.application.repository.RoleRepository;
import com.banking.application.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role getByName(String name) {
        return roleRepository.getByName(Role.RoleName.valueOf(name))
                .orElseThrow(() -> new RuntimeException("This role does not exist" + name));
    }
}
