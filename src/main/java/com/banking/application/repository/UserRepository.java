package com.banking.application.repository;

import com.banking.application.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> getById(Long id);

    @Query("from users u left join fetch u.roles where u.phoneNumber = ?1")
    Optional<User> getByPhoneNumber(String phoneNumber);
}
