package com.example.DatabaseEntities.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,targetEntity = AccountEntity.class)
    @JsonBackReference
    private List<AccountEntity> accounts;


}