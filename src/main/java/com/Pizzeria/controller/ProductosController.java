/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Pizzeria.controller;

import com.Pizzeria.entity.Productos;
import com.Pizzeria.entity.Estilos;
import com.Pizzeria.entity.Permisos;
import com.Pizzeria.entity.Roles;
import com.Pizzeria.entity.Usuario;
import com.Pizzeria.entity.comentarios;
import com.Pizzeria.service.ComentariosService;
import com.Pizzeria.service.EstilosService;
import com.Pizzeria.service.ProductosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author jorge
 */
@Controller
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @Autowired
    private EstilosService estilosService;

    @Autowired
    private ComentariosService comentariosService;

    @GetMapping("/menu")
    public String index(Model model) {
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        return "Menu";
    }

    @GetMapping("/nuevoproducto")
    public String nuevoProducto(Model model) {
        List<Estilos> listaEstilos = estilosService.getAllEstilos();
        model.addAttribute("producto", new Productos());
        model.addAttribute("estilos", listaEstilos);
        return "CrearProducto";
    }

    @PostMapping("/save")
    public String guardarProducto(@ModelAttribute Productos producto) {
        productosService.saveProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/productos")
    public String listarProductos(Model model) {
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("titulo", "Productos");
        model.addAttribute("productos", listaProductos);
        return "Productos";
    }

    @GetMapping("/editarproducto/{id}")
    public String editarProducto(@PathVariable("id") Long idProducto, Model model) {
        Productos producto = productosService.getProductoById(idProducto);
        List<Estilos> listaEstilos = estilosService.getAllEstilos();
        model.addAttribute("producto", producto);
        model.addAttribute("estilos", listaEstilos);
        return "CrearProducto";
    }

    @GetMapping("/comentariosproducto/{id}")
    public String comentarioProducto(@PathVariable("id") Long idProducto, Model model) {
        Productos producto = productosService.getProductoById(idProducto);
        List<Productos> listaProductos = productosService.getAllProductos();
        model.addAttribute("comentario", new comentarios());
        List<comentarios> comentarioslist = comentariosService.getAllComentarios();
        model.addAttribute("comentarios", comentarioslist);
        model.addAttribute("producto", producto);
        model.addAttribute("productos", listaProductos);
        return "ComentariosProducto";
    }

    @GetMapping("/borrarproducto/{id}")
    public String borrarProducto(@PathVariable("id") Long idProducto) {
        productosService.deleteProducto(idProducto);
        return "redirect:/productos";
    }
    
    
    @PostMapping("/guardarcomentario")
    public String guardarcomentario(@ModelAttribute comentarios comentario){
        comentariosService.saveComentario(comentario);
        return "redirect:/productos";
    }
}
