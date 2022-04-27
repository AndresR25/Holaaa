/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jorge
 */
@Entity
@Table (name="Usuario")
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String telefono;
    private String direccion;
    private String email;
    private String password;
    private int activo;
    
    @ManyToOne
    @JoinColumn(name="id_roles")
    private Roles roles;
    
    @ManyToOne
    @JoinColumn(name="id_permisos")
    private Permisos permisos;
    

    public Usuario() {
    }

    public Usuario(long id, String nombre, String apellido, String cedula, String telefono, String direccion, String email, String password, int activo, Roles roles, Permisos permisos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.password = password;
        this.activo = activo;
        this.roles = roles;
        this.permisos = permisos;
    }

    public Usuario(Usuario usuario){
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.cedula = usuario.getCedula();
        this.direccion = usuario.getDireccion();
        this.email = usuario.getEmail();
        this.password = usuario.getPassword();
        this.activo = usuario.getActivo();
        this.roles = new Roles(usuario.roles);
        this.permisos = new Permisos(usuario.permisos);
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Permisos getPermisos() {
        return permisos;
    }

    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", password=" + password + ", activo=" + activo + ", roles=" + roles + ", permisos=" + permisos + '}';
    }

}
