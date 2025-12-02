package com.example.Login.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class LoginDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="username" ,length=255)
    private String userName;

    @Column(name="password",length=25)
    private String Password;

    @Column(name = "email", unique = true)
    private String Email;
}
