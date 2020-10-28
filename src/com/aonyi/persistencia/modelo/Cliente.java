package com.aonyi.persistencia.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private List<Venta> ventas = new ArrayList<Venta>();
    
    public Cliente(){
        
    }

    /**
     * Constructor que inicializa al objeto creado
     * @param id
     * @param nombre
     * @param apellido 
     */
    public Cliente(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }
    public void setId(int id) {
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
    /**
     * Devuelve las ventas de un cliente
     * @return 
     */
    public List<Venta> getVentas(){
        return this.ventas;
    }

    /**
     * @param ventas the ventas to set
     */
    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
    
}
