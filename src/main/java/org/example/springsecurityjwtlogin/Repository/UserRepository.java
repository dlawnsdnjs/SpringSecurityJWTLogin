package org.example.springsecurityjwtlogin.Repository;

import org.example.springsecurityjwtlogin.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);
    UserEntity findByUsername(String username);
}
