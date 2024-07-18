package com.example.DatabaseEntities.Controller;


import com.example.DatabaseEntities.Entities.AccountEntity;
import com.example.DatabaseEntities.Entities.UserEntity;
import com.example.DatabaseEntities.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    private Service service;
    @PostMapping("/save")
    public AccountEntity saveAccount(@RequestBody AccountEntity a)
    {
        return service.saveAccount(a);
    }

    @PostMapping("/saveuser")
    public UserEntity saveUser(@RequestBody UserEntity a)
    {
        return service.saveUser(a);
    }

    @GetMapping("/accounts")
    public List<UserEntity> getUsersWithAccounts() {
        return service.getAllUsersWithAccounts();
    }
}
