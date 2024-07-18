package com.example.DatabaseEntities.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserAccountsDto {
    private Long userId;
    private String userName;
    private List<String> accountNumbers;


}
