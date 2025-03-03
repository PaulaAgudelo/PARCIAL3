package com.example.EjercicioPractico.controller;

import com.example.EjercicioPractico.service.ProductoService;
import com.example.EjercicioPractico.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    // Endpoint para listar los productos
    @GetMapping
    public Flux<Producto> listarProductos() {
        return productoService.obtenerProductos();
    }

}