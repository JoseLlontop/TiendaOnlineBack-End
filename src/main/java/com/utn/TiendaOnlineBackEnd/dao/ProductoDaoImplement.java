package com.utn.TiendaOnlineBackEnd.dao;

import com.utn.TiendaOnlineBackEnd.models.Producto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

//Referencia a que esta clase se va a usar para la conexión a la BD
@Repository
@Transactional //Agrega funcionalidad a la clase de poder armar las consultas SQL a la BD
public class ProductoDaoImplement implements ProductoDao {

    //EntityManager se encarga de administrar la comunicación con la BD,
    //incluyendo operaciones como guardar, actualizar, eliminar y consultar datos en la BD.
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Producto> getProductos() {
        //Es una consulta que se está haciendo sobre Hibernate
        //No se está haciendo referencia a una tabla sino a una clase
        String query = "FROM Producto";
        //El encargado de administrar la BD ejecuta esa consulta y el resultado lo transformamos en una lista:
        return entityManager.createQuery(query, Producto.class).getResultList();

    }

}
