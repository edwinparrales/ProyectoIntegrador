/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Oraclep;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static vista.Inventarios.txtprovee;

/**
 *
 * @author Eparrales
 */
public class AsignacionOrden extends javax.swing.JFrame {
      DefaultTableModel modta2;
      Oraclep ora2;
    public AsignacionOrden() {
        initComponents();
        modta2 = new DefaultTableModel();
        ora2= new Oraclep();
        codigoasignacionfield.setEditable(false);
        codespeciafield.setEditable(false);
        codordfield.setEditable(false);
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

        selectorfecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaasigorden = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codigoasignacionfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codespeciafield = new javax.swing.JTextField();
        codordfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fechafield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        observafield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        selectbuscar = new javax.swing.JComboBox();
        buscarfiled = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuordenes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaasigorden.setForeground(new java.awt.Color(0, 0, 255));
        tablaasigorden.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaasigorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaasigordenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaasigorden);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ASIGNACIONES  DE  ORDENES");

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Codigo Asignacion:");

        jLabel3.setText("Codigo Especialista:");

        jLabel4.setText("Codigo Orden :");

        fechafield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechafieldMouseClicked(evt);
            }
        });

        jLabel5.setText("Fecha:");

        jLabel6.setText("Observaciones:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoasignacionfield, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codespeciafield, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observafield, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechafield, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoasignacionfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codespeciafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        selectbuscar.setForeground(new java.awt.Color(204, 0, 51));
        selectbuscar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orden", "Especialista" }));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(buscarfiled, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarfiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnActualizar.setText("Refresh");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevoRegistro.setText("Nuevo");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNuevoRegistro)
                        .addGap(512, 512, 512))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(saveButton)
                        .addGap(60, 60, 60)
                        .addComponent(btnModificar)
                        .addGap(51, 51, 51)
                        .addComponent(btneliminar)
                        .addGap(68, 68, 68)
                        .addComponent(btnActualizar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro)
                    .addComponent(saveButton)
                    .addComponent(btnModificar)
                    .addComponent(btneliminar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Asignar Especialista");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menuordenes.setText("Ordenes Pendientes");
        menuordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuordenesActionPerformed(evt);
            }
        });
        jMenu1.add(menuordenes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // Limpiar los campos para ingresar un registro nuevo

        limpCampos();

    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String ID_ESPECIALISTAS,ID_ORDENES,OBSERVACIONES,FECHA,sql;
      int COD_ASIGNACION;

        try {
            
            ID_ESPECIALISTAS= codespeciafield.getText();
            ID_ORDENES = codordfield.getText();
            OBSERVACIONES=observafield.getText();
            FECHA = fechafield.getText();
           
            sql = "insert into asignaciones_ordenes values(null,'"+ID_ESPECIALISTAS+"','"+ID_ORDENES+"','"+OBSERVACIONES+"','"+FECHA+"')";
            ora2.regisData(sql);
            
            String sql2="update ordenes set estado='Asignada' where cod_ordenes='"+ID_ORDENES+"'";
            ora2.regisData(sql2);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
            String ID_ESPECIALISTAS,ID_ORDENES,OBSERVACIONES,FECHA,sql;
      int COD_ASIGNACION;

        try {
            COD_ASIGNACION=Integer.parseInt(codigoasignacionfield.getText());
            ID_ESPECIALISTAS= codespeciafield.getText();
            ID_ORDENES = codordfield.getText();
            OBSERVACIONES=observafield.getText();
            FECHA = fechafield.getText();
           
            sql = "update  asignaciones_ordenes set ID_ESPECIALISTAS='"+ID_ESPECIALISTAS+"',ID_ORDENES ='"+ID_ORDENES+"',OBSERVACIONES='"+OBSERVACIONES+"',FECHA='"+FECHA+"' WHERE COD_ASIGNACION="+COD_ASIGNACION;
            ora2.regisData(sql);

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int  cod= Integer.parseInt(codigoasignacionfield.getText());
        String sql;
        int respuesta = JOptionPane.showConfirmDialog(null, " ¿Esta seguro que desea elminiar el registro? " +cod, "Eliminar Registro", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (respuesta) {
            case JOptionPane.YES_OPTION:
            System.out.println("" + respuesta);
            break;
            case JOptionPane.NO_OPTION:

            break;
            case JOptionPane.CANCEL_OPTION:

            break;
        }

        if (respuesta == 0) {

            try {
                sql="delete ASIGNACIONES_ORDENES where COD_ASIGNACION="+cod;
                ora2.regisData(sql);

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        refresh();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void fechafieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechafieldMouseClicked
      Date d = selectorfecha.getDate();
      String fe = getFechatxt(d);
      fechafield.setText(fe);
    }//GEN-LAST:event_fechafieldMouseClicked

    private void tablaasigordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaasigordenMouseClicked
     
        int fila = tablaasigorden.getSelectedRow();
        codigoasignacionfield.setText(tablaasigorden.getModel().getValueAt(fila, 0).toString());

        codespeciafield.setText(tablaasigorden.getModel().getValueAt(fila, 1).toString());
        codordfield.setText(tablaasigorden.getModel().getValueAt(fila, 2).toString());
        observafield.setText(tablaasigorden.getModel().getValueAt(fila, 3).toString());
        String f = bdfecha(tablaasigorden.getModel().getValueAt(fila, 4).toString());
        fechafield.setText(f);


    }//GEN-LAST:event_tablaasigordenMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
          modta2 = new DefaultTableModel();
          String sql="";
          String select = selectbuscar.getSelectedItem().toString();
       
      try{ 
        if (select.equalsIgnoreCase("Orden")) {
            
            String codord= buscarfiled.getText();
            sql=" select * from asignaciones_ordenes where ID_ORDENES='"+codord+"'";
        }
        if (select.equalsIgnoreCase("Especialista")) {
            String esp =buscarfiled.getText();
             sql=" select * from asignaciones_ordenes where ID_ESPECIALISTAS='"+esp+"'";
        }
        ora2.consultar(sql);
      }catch(Exception e){
         JOptionPane.showMessageDialog(null," Llenar los campos correctamente ");
      }
               
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
                tablaasigorden.setModel(modta2);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta2.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros ");
            }
        
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        Especialista esp = new Especialista();
        esp.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuordenesActionPerformed
        OrdenesPendientesAsig ordp = new OrdenesPendientesAsig();
        ordp.setVisible(true);      
    }//GEN-LAST:event_menuordenesActionPerformed

    // metodos utilitarios
    
     public void refresh(){
          modta2= new DefaultTableModel();
          String sql="select * from asignaciones_ordenes";
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
                 tablaasigorden.setModel(modta2);
             }

         } catch (Exception e) {
         }
    }
   
    public void limpCampos() {
      codigoasignacionfield.setText("");
      codespeciafield.setText("");
      codordfield.setText("");
      observafield.setText("");
      fechafield.setText("");
      buscarfiled.setText("");
        
    }
    
    public void soloNum(JTextField tx) {
        tx.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }
    public void soloCaract(JTextField tx) {
        tx.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });

    }
    
    public void modJtxt(){
      
        
        
    }
    
    
  
    
  
    /// Metodos para la manipulacion de las fechas
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
            java.util.logging.Logger.getLogger(AsignacionOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignacionOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignacionOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignacionOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignacionOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField buscarfiled;
    public static javax.swing.JTextField codespeciafield;
    private javax.swing.JTextField codigoasignacionfield;
    public static javax.swing.JTextField codordfield;
    private javax.swing.JTextField fechafield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuordenes;
    private javax.swing.JTextField observafield;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox selectbuscar;
    private com.toedter.calendar.JDateChooser selectorfecha;
    private javax.swing.JTable tablaasigorden;
    // End of variables declaration//GEN-END:variables
}
