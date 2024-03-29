package com.aonyi.ntbpersistencia.modelo;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
        
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
    
}
