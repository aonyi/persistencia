

import com.aonyi.persistencia.controlador.*;
import com.aonyi.persistencia.modelo.*;
import com.aonyi.persistencia.vista.*;

public class app {
    public static void main (String [] args){
       

        // Se crea la clase controladora y se pide la vista
        ControladorCliente controlador = new ControladorCliente();
        

        // llama a la ventana y la muestra
        controlador.mostrarVentanaListaCliente();


    }


}
