package com.aonyi.persistencia.controlador;

import com.aonyi.persistencia.dao.*;
import com.aonyi.persistencia.modelo.Cliente;
import com.aonyi.persistencia.vista.*;
import java.util.List;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class ControladorCliente {

        //objetos vista y modelo
        private FrmListaClientes vListaCliente;
        private FrmCliente vCliente;
        
        private Cliente modelo;

        //constructor para inicializar el modelo y la vista
        public ControladorCliente() {            
            
        }

        //getters y setters para el modelo
        public Integer getId() {
            return modelo.getId();
        }
        public void setId(int id) {
            this.modelo.setId(id);
        }
        public String getNombre() {
            return modelo.getNombre();
        }
        public void setNombre(String nombre) {
            this.modelo.setNombre(nombre);
        }
        public String getApellido() {
            return modelo.getApellido();
        }
        public void setApellido(String apellido) {
            this.modelo.setApellido(apellido);
        }       
        
        public void nuevoCliente(){
            this.modelo = new Cliente();
        }
        
        public void guardarCliente(){
            // Crea una instancia de DAO
            ClienteDaoImplHibernate cd =  new ClienteDaoImplHibernate();
            cd.save(modelo);
        }

        //mostrar la ventana de la vista
        public void mostrarVentanaListaCliente(){
            // Crea la vista cliente para mostrar y se envia si mismo como
            // parámetro
            this.vListaCliente = new FrmListaClientes(this);
            vListaCliente.setVisible(true);
        }        
        
        public void mostrarVentanaCliente(){     
            this.vCliente = new FrmCliente(this);
            // Setea la operacion de cierre con DISPOSE (no con CLOSE)
            vCliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            vCliente.setVisible(true);
        }
        
        // obtiene un cliente a partir del id enviado como parametro
        public Cliente getCliente(Integer Id){
            // Crea una instancia de DAO
            ClienteDaoImplHibernate cd =  new ClienteDaoImplHibernate();
            modelo = cd.get(Id);           
            return modelo;
        }
        
        /**
         * Devuelve la lista de clientes
         * @return Lista de Clientes
         */
        public List<Cliente> getListaClientes(){
            // Crea una instancia de DAO
            ClienteDaoImplHibernate cd =  new ClienteDaoImplHibernate();
            return cd.getLista();
        }

}
