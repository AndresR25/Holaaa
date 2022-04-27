/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jorge
 */
@Entity
@Table (name="roles")
public class Roles {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String rol;

    public Roles(){
    }
    
    public Roles(long id, String rol) {
        this.id = id;
        this.rol = rol;
    }
    
    public Roles(Roles roles){
        this.id = roles.getId();
        this.rol = roles.getRol();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public List<String> getRoleList() {
        if (this.rol.length() > 0) {
            return Arrays.asList(this.rol.split(","));
        }
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Roles{" + "id=" + id + ", rol=" + rol + '}';
    }

}
