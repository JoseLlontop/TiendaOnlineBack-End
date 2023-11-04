package com.utn.TiendaOnlineBackEnd.dao;

import com.utn.TiendaOnlineBackEnd.models.Producto;

import java.util.List;

//DAO: abstrae la capa de acceso a datos de la aplicación para que el resto
//del código no necesite conocer los detalles de como interactúa con la base de datos
public interface ProductoDao {

    //Operaciones que simplifican la interacción con la BD
    List<Producto> getProductos();
}
