package com.banking.application.repository;

import com.banking.application.entity.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query(value = "from roles where roleName = ?1")
    Optional<Role> getByName(Role.RoleName name);
}
