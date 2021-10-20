/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aonyi.ntbpersistencia.vista;

import com.aonyi.ntbpersistencia.controlador.Controlador;
import com.aonyi.ntbpersistencia.modelo.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author faguirre
 */
public class FrmListaClientes extends javax.swing.JFrame {

    // La ventana conoce al controlador
    private Controlador miControl;
    /**
     * Creates new form FrmCliente
     */
    public FrmListaClientes() {
        initComponents();
    }
    
    /**
     * Constructor que inicializa la ventana con el controlador correspondiente
     * @param miControl 
     */
    public FrmListaClientes(Controlador miControl){
        initComponents();
        this.miControl = miControl;           
    }
    
    /**
     * Carga la grilla clientes
     */
    private void cargaGrillaClientes(){
        
        // La carga de un JTable se realiza a través de un TableModel
        // Se crea un DefaultTableModel que luego se asigna a la tblClientes
        DefaultTableModel model = new DefaultTableModel();        
        List<Cliente> listaClientes = this.miControl.getListaClientes();
        
        // Crea las columnas en el TableModel
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        
        // Carga las filas en el TableModel
        for (Cliente c : listaClientes) {
            Object[] fila = new Object[3];
            fila[0] = c.getId();
            fila[1] = c.getNombre();
            fila[2] = c.getApellido();
            model.addRow(fila);
        }
        
               
        // Carga el TableModel a la tabla
        this.tblClientes.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloVentana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloVentana.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloVentana.setText("LISTA DE CLIENTES");
        getContentPane().add(lblTituloVentana, java.awt.BorderLayout.PAGE_START);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setRowSelectionAllowed(true);
        tblClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblClientes.getTableHeader().setReorderingAllowed(false);
        tblClientes.setUpdateSelectionOnSort(false);
        tblClientes.setVerifyInputWhenFocusTarget(false);
        tblClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblClientesFocusGained(evt);
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Cuando se hace un click sobre la grilla despliga los datos 
    // del cliente seleccionado en una nueva ventana
    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // Obtiene el número de fila seleccionado
        int fila = this.tblClientes.getSelectedRow();
        
        // Recupera el valor de la primera celda ("0") en donde se encuentra
        // el ID del Cliente
        Integer id = (Integer) this.tblClientes.getModel().getValueAt(fila, 0);
        
        // Recupera el Cliente y lo carga en la controladora
        this.miControl.getCliente(id);
        
        // Abre la ventana Detalle del Cliente
        this.miControl.mostrarVentanaCliente();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblClientesFocusGained
        cargaGrillaClientes();
    }//GEN-LAST:event_tblClientesFocusGained
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}