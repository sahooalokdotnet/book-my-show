package com.scalar.alok.oops.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String username;
    private String password;
    private String email;
    private String name;
}
