package com.example.DatabaseEntities.Repository;

import com.example.DatabaseEntities.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByName(String name);
}
