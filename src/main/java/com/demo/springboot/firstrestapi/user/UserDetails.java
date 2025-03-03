package com.demo.springboot.firstrestapi.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class UserDetails
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;

    public UserDetails() {

    }

    public UserDetails(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserDetails [id=" + id + ", name=" + name + ", role=" + role + "]";
    }



}
