/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Oraclep;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Eparrales
 */
public class Orden extends javax.swing.JFrame {
    DefaultTableModel modta2;
    Oraclep ora2;
    
    public Orden() {
        initComponents();
        modta2 = new DefaultTableModel();
        ora2= new Oraclep();
        idClientesField.setEditable(false);
        fechafield.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idClientesLabel = new javax.swing.JLabel();
        idClientesField = new javax.swing.JTextField();
        observacionesLabel = new javax.swing.JLabel();
        fechaRegistroLabel = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        comboestado = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();
        lbestado = new javax.swing.JLabel();
        fechafield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaorden = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbcod = new javax.swing.JLabel();
        selectorfecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        selectestadifiltro = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnfiltrarestado = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscodord = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnNuevoRegistro2 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnasigequiposcliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de servicio Soluciones E&S");
        setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        idClientesLabel.setText("Id Clientes:");

        observacionesLabel.setText("Observaciones:");

        fechaRegistroLabel.setText("Fecha Registro:");

        estadoLabel.setText("Estado:");

        comboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Creada", "Asignada", "Anulada", "Finalizada" }));

        txtArea1.setColumns(20);
        txtArea1.setRows(5);
        jScrollPane2.setViewportView(txtArea1);

        lbestado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        fechafield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechafieldMouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconclientes.jpg"))); // NOI18N
        jButton2.setText("Clientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fechaRegistroLabel)
                        .addGap(18, 18, 18)
                        .addComponent(fechafield, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idClientesLabel)
                            .addComponent(observacionesLabel)
                            .addComponent(estadoLabel))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(lbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(idClientesField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idClientesLabel)
                        .addComponent(idClientesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observacionesLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaRegistroLabel)
                    .addComponent(fechafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(estadoLabel)
                        .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        tablaorden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaordenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaorden);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREACION DE ORDENES DE SERVICIO");

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CODIGO:");

        lbcod.setFont(new java.awt.Font("Andalus", 1, 12)); // NOI18N
        lbcod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbcod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        selectestadifiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Creada", "Asignada", "Anulada", "Finalizada" }));

        jLabel2.setText("Codigo Orden:");

        btnfiltrarestado.setText("Filtrar");
        btnfiltrarestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiltrarestadoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscodord, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBuscar)
                .addGap(37, 37, 37)
                .addComponent(selectestadifiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnfiltrarestado)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel2)
                    .addComponent(txtbuscodord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfiltrarestado)
                    .addComponent(selectestadifiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevoRegistro2.setText("Nuevo");
        btnNuevoRegistro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistro2ActionPerformed(evt);
            }
        });

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Refresh");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoRegistro2)
                .addGap(51, 51, 51)
                .addComponent(btnguardar)
                .addGap(41, 41, 41)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(30, 30, 30)
                .addComponent(btnActualizar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro2)
                    .addComponent(btnguardar)
                    .addComponent(btnModificar)
                    .addComponent(btneliminar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        btnasigequiposcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconpc.png"))); // NOI18N
        btnasigequiposcliente.setText("Vincular a Ingreso Equipo");
        btnasigequiposcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnasigequiposclienteActionPerformed(evt);
            }
        });

        jMenu1.setText("Ingresos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconpc.png"))); // NOI18N
        jMenuItem1.setText("Equipos cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bd.jpg"))); // NOI18N
        jMenu2.setText("Registros");

        jMenuItem2.setText("Asignaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconimpre.png"))); // NOI18N
        jMenu3.setText("Imprimir");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbcod, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnasigequiposcliente))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbcod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnasigequiposcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            String cod= txtbuscodord.getText();
            modta2 = new DefaultTableModel();
     
        ora2.consultar("select * from ordenes where COD_ORDENES="+"'"+cod+"'");

        try {
            int numCol = ora2.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta2.addColumn(ora2.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora2.getRst().next()) {
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i] = ora2.getRst().getObject(i + 1);
                }

                modta2.addRow(fila);
                tablaorden.setModel(modta2);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta2.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros "+cod);
            }
        
        }

       

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        refresh();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       
         String sql;
        String cod = lbcod.getText();
        int respuesta = JOptionPane.showConfirmDialog(null, " ¿Esta seguro que desea elminiar el registro? " + cod, "Eliminar Registro", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (respuesta) {
            case JOptionPane.YES_OPTION:

                break;
            case JOptionPane.NO_OPTION:

                break;
            case JOptionPane.CANCEL_OPTION:

                break;
        }

        if (respuesta == 0) {

            try {
                sql = "delete from ordenes where COD_ORDENES='"+cod+"'";
                ora2.regisData(sql);

            } catch (Exception e) {
            }

        }


        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
          
          String  cod,idClien,observa,estado,sql,fechatxt="";
         try {
            cod = lbcod.getText();
            idClien = idClientesField.getText();
            observa = txtArea1.getText();
            fechatxt = fechafield.getText();
            estado = comboestado.getSelectedItem().toString();

            sql = "update ordenes set ID_CLIENTES='" + idClien + "',OBSERVACIONES='" + observa + "',FECHA_REGISTRO='" + fechatxt + "',ESTADO='" + estado + "' where COD_ORDENES='"+cod+"'";

            ora2.regisData(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoRegistro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistro2ActionPerformed
        // Limpiar los campos para ingresar un registro nuevo

     limpCampos();
        


    }//GEN-LAST:event_btnNuevoRegistro2ActionPerformed

    private void tablaordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaordenMouseClicked
        String f;
        int fila = tablaorden.getSelectedRow();
        lbcod.setText(tablaorden.getModel().getValueAt(fila, 0).toString());
        idClientesField.setText(tablaorden.getModel().getValueAt(fila, 1).toString());
        txtArea1.setText(tablaorden.getModel().getValueAt(fila, 2).toString());
        f=bdfecha(tablaorden.getModel().getValueAt(fila, 3).toString());
        fechafield.setText(f);
        lbestado.setText(tablaorden.getModel().getValueAt(fila, 4).toString());
    
    }//GEN-LAST:event_tablaordenMouseClicked

    private void fechafieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechafieldMouseClicked
         Date date = selectorfecha.getDate();
         fechafield.setText(getFechatxt(date));
    }//GEN-LAST:event_fechafieldMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      String idClien, observa, sql, fechatxt;
        String estado = comboestado.getSelectedItem().toString();
        try {
            idClien = idClientesField.getText();
            observa = txtArea1.getText();
            fechatxt = fechafield.getText();

            sql = "insert into ordenes values(null,'" + idClien + "','" + observa + "','" + fechatxt + "','" + estado + "')";
            ora2.regisData(sql);
        } catch (Exception  e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnasigequiposclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnasigequiposclienteActionPerformed
        // TODO add your handling code here:
        try {

            EquipoCliente.idOrdenesField.setText(lbcod.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Debe seleccionar una orden y abrir ingreso equipos ", " Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnasigequiposclienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
        EquipoCliente eqpcl = new EquipoCliente();
        eqpcl.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        AsignacionOrden asord = new AsignacionOrden();
        asord.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnfiltrarestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiltrarestadoActionPerformed
        //Creada, Asignada, Anulada, Finalizada
        modta2 = new DefaultTableModel();
     
        String estado = selectestadifiltro.getSelectedItem().toString();
        String sql="";
        switch (estado) {
            case "Asignada":
                sql = "select * from ordenes where estado='Asignada'";
                break;
            case "Finalizada":
                sql = "select * from ordenes where estado='Finalizada'";
                break;
            case "Creada":
                sql = "select * from ordenes where estado='Creada'";
                break;
            case "Anulada":
                sql = "select * from ordenes where estado='Anulada'";
                break;
        }
            ora2.consultar(sql);
        try {
            
            int numCol = ora2.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta2.addColumn(ora2.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora2.getRst().next()) {
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i] = ora2.getRst().getObject(i + 1);
                }

                modta2.addRow(fila);
                tablaorden.setModel(modta2);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta2.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros ");
            }
        
        }

       
        
        
        
        
        
    }//GEN-LAST:event_btnfiltrarestadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Cliente cl = new Cliente();
       cl.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Metodos utilitarios 
     public void limpCampos() {
         txtArea1.setText("");
         lbcod.setText("");
         idClientesField.setText("");
         lbestado.setText("");
         fechafield.setText("");


    }
      public void refresh(){
          
             modta2= new DefaultTableModel();
          String sql="select * from ordenes order by COD_ORDENES DESC";
          ora2.consultar(sql);
           
         try {
             int numCol = ora2.getRstmdata().getColumnCount();
             for (int i = 0; i < numCol; i++) {
                 modta2.addColumn(ora2.getRstmdata().getColumnLabel(i + 1));

             }

             while (ora2.getRst().next()) {
                 Object[] fila = new Object[numCol];
                 for (int i = 0; i < numCol; i++) {
                     fila[i] = ora2.getRst().getObject(i + 1);
                 }

                 modta2.addRow(fila);
                 tablaorden.setModel(modta2);
             }

         } catch (Exception e) {
         } 
          
          
          
          
      }
      
      // Metodos para la manipulcion de fechas
      
      public String getFechatxt(Date d){
  
        try {
            String formato = selectorfecha.getDateFormatString();
            //Formato
            
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String txtfechap = sdf.format(d);
            return txtfechap;
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Al menos selecciona una fecha válida!", "Error!", JOptionPane.INFORMATION_MESSAGE);
            return null;

        }


    
    }
    public Date fechadate(String f){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat(selectorfecha.getDateFormatString());

        Date fecha;
        try {

            fecha = formatoDelTexto.parse(f);
            return fecha;

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String bdfecha(String f){
        String fechabd,año="",mes="",dia="";
        for (int i = 0; i < f.length(); i++) {
            if (i < 4) {
                año += f.charAt(i);
            }
            if (i > 4 && i < 7) {
                mes += f.charAt(i);
            }
            if (i > 7 && i < 10) {
                dia += f.charAt(i);
            }
        }

        fechabd=dia+"/"+mes+"/"+año;
        return fechabd;
        
    }
      
      
      
      
      
      
      
      

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro2;
    private javax.swing.JButton btnasigequiposcliente;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfiltrarestado;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox comboestado;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel fechaRegistroLabel;
    private javax.swing.JTextField fechafield;
    public static javax.swing.JTextField idClientesField;
    private javax.swing.JLabel idClientesLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbcod;
    private javax.swing.JLabel lbestado;
    private javax.swing.JLabel observacionesLabel;
    private javax.swing.JComboBox selectestadifiltro;
    private com.toedter.calendar.JDateChooser selectorfecha;
    private javax.swing.JTable tablaorden;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JTextField txtbuscodord;
    // End of variables declaration//GEN-END:variables
}
