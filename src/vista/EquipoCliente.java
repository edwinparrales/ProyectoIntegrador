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
import static vista.Inventarios.selectorfecha;
import static vista.Inventarios.txtprovee;

/**
 *
 * @author Eparrales
 */
public class EquipoCliente extends javax.swing.JFrame {
       DefaultTableModel modta2;
    Oraclep ora2;

    /**
     * Creates new form VentanaEquipoCliente
     */
    public EquipoCliente() {
        initComponents();
         modta2 = new DefaultTableModel();
        ora2= new Oraclep();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaequipos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        idOrdenesField = new javax.swing.JTextField();
        idOrdenesLabel = new javax.swing.JLabel();
        idDispositivoLabel = new javax.swing.JLabel();
        cantidadField = new javax.swing.JTextField();
        fecahaIngresoLabel = new javax.swing.JLabel();
        fechaingresofield = new javax.swing.JTextField();
        nombrefield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacionesarea = new javax.swing.JTextArea();
        observacionesLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        marcafield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modelofield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        selectorfecha = new com.toedter.calendar.JDateChooser();
        buscarfield = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbcodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Equipo Cliente Soluciones E&S.");

        tablaequipos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaequiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaequipos);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        idOrdenesField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idOrdenesFieldMouseClicked(evt);
            }
        });

        idOrdenesLabel.setText("Id Orden:");

        idDispositivoLabel.setText("Cantidad:");

        fecahaIngresoLabel.setText("Fecha Ingreso:");

        fechaingresofield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaingresofieldMouseClicked(evt);
            }
        });

        observacionesarea.setColumns(20);
        observacionesarea.setRows(5);
        jScrollPane2.setViewportView(observacionesarea);

        observacionesLabel.setText("Observaciones:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Modelo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idOrdenesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idDispositivoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecahaIngresoLabel)
                    .addComponent(observacionesLabel)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addComponent(idOrdenesField)
                    .addComponent(cantidadField)
                    .addComponent(fechaingresofield)
                    .addComponent(nombrefield)
                    .addComponent(marcafield)
                    .addComponent(modelofield))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idOrdenesLabel)
                    .addComponent(idOrdenesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idDispositivoLabel)
                    .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecahaIngresoLabel)
                    .addComponent(fechaingresofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observacionesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EQUIPOS CLIENTES");

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

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        saveButton.setText("Guardar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        btnNuevoRegistro.setText("Nuevo");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pc.png"))); // NOI18N

        btnbuscar.setText("Buscar Numero Orden:");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Codigo Equipo:");

        lbcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbcodigo.setForeground(new java.awt.Color(0, 51, 255));
        lbcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)
                                        .addGap(49, 49, 49)
                                        .addComponent(lbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addComponent(btnbuscar)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarfield)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnNuevoRegistro)
                        .addGap(43, 43, 43)
                        .addComponent(saveButton)
                        .addGap(41, 41, 41)
                        .addComponent(btnModificar)
                        .addGap(35, 35, 35)
                        .addComponent(btneliminar)
                        .addGap(37, 37, 37)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1)
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buscarfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbuscar))
                    .addComponent(selectorfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro)
                    .addComponent(saveButton)
                    .addComponent(btnModificar)
                    .addComponent(btneliminar)
                    .addComponent(btnActualizar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        refresh();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int  cod= Integer.parseInt(lbcodigo.getText());
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
                sql="delete equipos_clientes where COD_EQUIPO="+cod;
                ora2.regisData(sql);

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      
        String sql,ID_ORDENES,FECAHA_INGRESO,OBSERVACIONES,NOMBRE,MARCA,MODELO;
        int CANTIDAD,COD_EQUIPO;
        
        try {
            COD_EQUIPO=Integer.parseInt(lbcodigo.getText());
            ID_ORDENES=idOrdenesField.getText();
            CANTIDAD=Integer.parseInt(cantidadField.getText());
            FECAHA_INGRESO=fechaingresofield.getText();
            OBSERVACIONES=observacionesarea.getText();
            NOMBRE=nombrefield.getText();
            MARCA= marcafield.getText();
            MODELO= modelofield.getText();

            sql = "update equipos_clientes set ID_ORDENES='"+ID_ORDENES+"',CANTIDAD="+CANTIDAD+",FECAHA_INGRESO='"+FECAHA_INGRESO+"',OBSERVACIONES='"+OBSERVACIONES+"',NOMBRE='"+NOMBRE+"',MARCA='"+MARCA+"',MODELO='"+MODELO+"' WHERE COD_EQUIPO="+COD_EQUIPO;
            ora2.regisData(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String sql, COD_EQUIPO,ID_ORDENES,FECAHA_INGRESO,OBSERVACIONES,NOMBRE,MARCA,MODELO;
        int CANTIDAD;
        
        try {
            ID_ORDENES=idOrdenesField.getText();
            CANTIDAD=Integer.parseInt(cantidadField.getText());
            FECAHA_INGRESO=fechaingresofield.getText();
            OBSERVACIONES=observacionesarea.getText();
            NOMBRE=nombrefield.getText();
            MARCA= marcafield.getText();
            MODELO= modelofield.getText();

            sql = "insert into equipos_clientes values(null,'"+ID_ORDENES+"',"+CANTIDAD+",'"+FECAHA_INGRESO+"','"+OBSERVACIONES+"','"+NOMBRE+"','"+MARCA+"','"+MODELO+"')";
            ora2.regisData(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // Limpiar los campos para ingresar un registro nuevo

        limpCampos();

    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void fechaingresofieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaingresofieldMouseClicked
        Date d = selectorfecha.getDate();
        fechaingresofield.setText(getFechatxt(d));
        
    }//GEN-LAST:event_fechaingresofieldMouseClicked

    private void idOrdenesFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idOrdenesFieldMouseClicked
       Orden ord = new Orden();
       ord.setVisible(true);
        
        
    }//GEN-LAST:event_idOrdenesFieldMouseClicked

    private void tablaequiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaequiposMouseClicked
       
        String f;
        int fila = tablaequipos.getSelectedRow();
        lbcodigo.setText(tablaequipos.getModel().getValueAt(fila, 0).toString());
        idOrdenesField.setText(tablaequipos.getModel().getValueAt(fila, 1).toString());
        cantidadField.setText(tablaequipos.getModel().getValueAt(fila, 2).toString());
         f=bdfecha(tablaequipos.getModel().getValueAt(fila, 3).toString());
        fechaingresofield.setText(f);
        observacionesarea.setText(tablaequipos.getModel().getValueAt(fila, 4).toString());
        nombrefield.setText(tablaequipos.getModel().getValueAt(fila, 5).toString());
        marcafield.setText(tablaequipos.getModel().getValueAt(fila, 6).toString());
        modelofield.setText(tablaequipos.getModel().getValueAt(fila, 7).toString());
        
    }//GEN-LAST:event_tablaequiposMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        modta2 = new DefaultTableModel();
        
      String  codOrd = buscarfield.getText();
            
     
        ora2.consultar("select * from equipos_clientes where ID_ORDENES='"+codOrd+"'" );

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
                tablaequipos.setModel(modta2);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta2.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros "+codOrd);
            }
        
        }

        
        
        
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    

     // metodos utilitarios
    
     public void refresh(){
          modta2= new DefaultTableModel();
          String sql="select * from equipos_clientes";
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
                 tablaequipos.setModel(modta2);
             }

         } catch (Exception e) {
         }
    }
   
    public void limpCampos() {
        lbcodigo.setText("");
        idOrdenesField.setText("");
        cantidadField.setText("");
        fechaingresofield.setText("");
        observacionesarea.setText("");
        nombrefield.setText("");
        marcafield.setText("");
        modelofield.setText("");

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
            java.util.logging.Logger.getLogger(EquipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquipoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquipoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField buscarfield;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JLabel fecahaIngresoLabel;
    private javax.swing.JTextField fechaingresofield;
    private javax.swing.JLabel idDispositivoLabel;
    public static javax.swing.JTextField idOrdenesField;
    private javax.swing.JLabel idOrdenesLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbcodigo;
    private javax.swing.JTextField marcafield;
    private javax.swing.JTextField modelofield;
    private javax.swing.JTextField nombrefield;
    private javax.swing.JLabel observacionesLabel;
    private javax.swing.JTextArea observacionesarea;
    private javax.swing.JButton saveButton;
    private com.toedter.calendar.JDateChooser selectorfecha;
    private javax.swing.JTable tablaequipos;
    // End of variables declaration//GEN-END:variables
}
