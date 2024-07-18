package com.example.DatabaseEntities.Service;

import com.example.DatabaseEntities.Entities.AccountEntity;
import com.example.DatabaseEntities.Entities.UserEntity;
import com.example.DatabaseEntities.Repository.AccountRepository;
import com.example.DatabaseEntities.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private UserRepository us;
    @Autowired
    private AccountRepository ac;

    public AccountEntity saveAccount(AccountEntity a) {
        UserEntity u = us.findByName(a.getName());
        if (u != null) {
            u.getAccounts().add(a);
            a.setUser(u);
            return ac.save(a);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public List<UserEntity> getAllUsersWithAccounts() {
        return us.findAll();
    }

    public UserEntity saveUser(UserEntity u) {
        return us.save(u);
    }
}
