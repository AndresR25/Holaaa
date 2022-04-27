package com.Pizzeria.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "comentarios")
public class comentarios {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private Date fecha;
    
    private String titulo ;
    
    private String comentario;
    
    private int calificacion;
    
    private String autor;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Productos producto;

    public comentarios(Long id, Date fecha, String titulo, String comentario, int calificacion, String autor, Productos producto) {
        this.id = id;
        this.fecha = fecha;
        this.titulo = titulo;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.autor = autor;
        this.producto = producto;
    }

    
    
   

    public comentarios() {
    }

    @PrePersist
    protected void onCreate() {
        this.fecha = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    

    
}
