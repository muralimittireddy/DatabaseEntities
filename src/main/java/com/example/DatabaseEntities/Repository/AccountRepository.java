package com.example.DatabaseEntities.Repository;

import com.example.DatabaseEntities.Entities.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity,Long> {
}
