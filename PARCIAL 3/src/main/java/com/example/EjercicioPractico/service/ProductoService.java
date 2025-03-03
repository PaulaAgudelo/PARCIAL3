package com.example.EjercicioPractico.service;

import com.example.EjercicioPractico.model.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = List.of(
            new Producto("1", "Laptop", 1200.0),
            new Producto("2", "Mouse", 25.0),
            new Producto("3", "Teclado", 45.0)
    );


    // Método para obtener los productos en un flujo reactivo
    public Flux<Producto> obtenerProductos() {
        return Flux.fromIterable(productos);
    }
}
