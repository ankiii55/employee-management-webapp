package com.ankit.employee_management_webapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // No-args constructor (required by JPA)
    public Role() {}

    // Constructor with name
    public Role(String name) {
        this.name = name;
    }


    // Getters and Setters
}