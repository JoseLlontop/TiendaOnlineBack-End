package com.utn.TiendaOnlineBackEnd.controllers;

import com.utn.TiendaOnlineBackEnd.dao.ProductoDao;
import com.utn.TiendaOnlineBackEnd.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//Indicamos que esta va a ser un controlador
@RestController
public class ProductoController {

    @Autowired //La anotación automáticamente hace que la clase ProductoDaoImplement se cree un objeto y la guarda en productoDao (se está inyectando una instancia de una clase que implementa la interfaz)
    ProductoDao productoDao;

    //Indicamos la URL en la cual se va a retornar el contenido de la función
    @RequestMapping("/api/producto/1")
    public Producto getProducto() {

        Producto producto = new Producto();
        producto.setID(1);
        producto.setNombre("Alfajor");
        producto.setDescripcion("Caro");
        producto.setPrecio(300);

        return producto;
    }

    @RequestMapping(value="/api/productos", method = RequestMethod.GET)
    public List<Producto> getProductos() {

        return productoDao.getProductos();
    }
}
