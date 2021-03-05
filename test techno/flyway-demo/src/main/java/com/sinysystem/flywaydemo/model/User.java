package com.sinysystem.flywaydemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="REGISTRATION_USERS")
public class User {
    @Id @GeneratedValue
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
}
