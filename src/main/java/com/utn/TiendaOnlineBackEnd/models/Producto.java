package com.utn.TiendaOnlineBackEnd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@Entity //Referencia a que es una entidad de la BD
@Table(name= "Producto") //Tabla a la que tiene que ir
public class Producto {

    @Id
    @Column(name = "ID")
    private int ID;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private float precio;

    @Column(name = "imagenUrl")
    private String imagenUrl;

}
