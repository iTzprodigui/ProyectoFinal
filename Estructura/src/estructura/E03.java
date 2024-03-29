/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class E03 extends javax.swing.JPanel {
    float sum;
    DefaultTableModel modelo;
    Queue<String> cola = new LinkedList<>();
    String tabla[] = new String[2];
    
    public E03() {
        initComponents();
        modelo = (DefaultTableModel) tablaClientes.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        personasAtendidas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        retiro = new javax.swing.JCheckBox();
        deposito = new javax.swing.JCheckBox();
        consulta = new javax.swing.JCheckBox();
        actualizacion = new javax.swing.JCheckBox();
        pagos = new javax.swing.JCheckBox();

        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("BANCO");

        jLabel4.setText("Personas atendidas:");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Personas", "Tiempo"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarCliente(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Transacciones"));

        retiro.setText("Retiro");

        deposito.setText("Depósito");

        consulta.setText("Consulta");

        actualizacion.setText("Actualización");

        pagos.setText("Pagos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retiro)
                    .addComponent(deposito)
                    .addComponent(consulta)
                    .addComponent(actualizacion)
                    .addComponent(pagos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(retiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagos))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton1))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personasAtendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel3)))
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(personasAtendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AgregarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarCliente
        sum=0;
        //Suma
        if(retiro.isSelected()){
            sum +=4;
        }
        if(deposito.isSelected()){
            sum +=2;
        }
        if(consulta.isSelected()){
            sum +=3.5;
        }
        if(actualizacion.isSelected()){
            sum +=5;
        }
        if(pagos.isSelected()){
            sum +=2;
        }
        //Insertamos los valores en la filas
        validarTabla();
        //Borrar todo
        borrar();

    }//GEN-LAST:event_jButton1AgregarCliente
    public void validarTabla(){
        for (int i=0; i < modelo.getRowCount(); i++){ //Recorremos toda la tabla
            if(modelo.getValueAt(i, 0).equals(campoNombre.getText())){ //Dentro del modelo en la fila iterada buscamos un valor sobre la columna 0
                JOptionPane.showMessageDialog(null, "Este cliente ya existe"); //Mensaje de error
                modelo.removeRow(i); //Eleminamos la fila repetida
                cola.poll(); //Eliminamos de la cola al ultimo que entro es decir el repetido
                
            }
        }
        if (campoNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No puedes registrar un campo vacio");
        }else{
            llenarTabla();
        }
    }
    public void llenarTabla(){
        //Insertamos los valores en la filas
        tabla[0] = campoNombre.getText();
        tabla[1] = String.valueOf(sum);
        
        modelo.addRow(tabla); //Insertamos los valores de las filas en la tabla
        cola.add(campoNombre.getText()); // Insertamos en la cola el nombre ingresado
        personasAtendidas.setText(Integer.toString(cola.size())); // Mostramos el numero de personas atendidas
        System.out.println(cola);
    }
    public void borrar(){
        campoNombre.setText("");
        
        if(retiro.isSelected()){
            retiro.setSelected(false);
        }
        if(deposito.isSelected()){
            deposito.setSelected(false);
        }
        if(consulta.isSelected()){
            consulta.setSelected(false);
        }
        if(actualizacion.isSelected()){
            actualizacion.setSelected(false);
        }
        if(pagos.isSelected()){
            pagos.setSelected(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox actualizacion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JCheckBox consulta;
    private javax.swing.JCheckBox deposito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox pagos;
    private javax.swing.JLabel personasAtendidas;
    private javax.swing.JCheckBox retiro;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
