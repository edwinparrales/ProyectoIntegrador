/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Eparrales
 */
public class DetalleInsumo extends javax.swing.JFrame {

    /**
     * Creates new form DetalleInsumo
     */
    public DetalleInsumo() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtcodOrden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprecioIsumo = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodinvent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtivainsumo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcoddetalleinsumo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtporcentiva = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnfinalizarord = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("DETALLE DE INSUMOS ASIGNADOS A ORDENES ");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("CODIGO DE ORDEN:");

        jLabel7.setText("IVA INSUMO:");

        jLabel6.setText("PRECIO INSUMO:");

        jLabel4.setText("CODIGO INVENTARIOS:");

        jLabel2.setText("CODIGO DETALLE INSUMOS:");

        jLabel5.setText("CANTIDAD:");

        jLabel8.setText("FECHA:");

        jLabel10.setText("PORCENTAJE IVA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcoddetalleinsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodinvent, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioIsumo)
                    .addComponent(txtporcentiva)
                    .addComponent(txtivainsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcoddetalleinsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcodinvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtprecioIsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtporcentiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtivainsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)), "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        btnActualizar.setText("Refresh");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnModificar)
                .addGap(27, 27, 27)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro)
                    .addComponent(saveButton)
                    .addComponent(btnModificar)
                    .addComponent(btnActualizar)
                    .addComponent(btneliminar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnfinalizarord.setText("Finalizar la orden");
        btnfinalizarord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarordActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "OBSERVACIONES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        txtobservaciones.setColumns(20);
        txtobservaciones.setRows(5);
        jScrollPane2.setViewportView(txtobservaciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnfinalizarord, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnfinalizarord, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        refresh();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String ID_ORDENES, OBSERVACIONES, sql, FECHA;
        int COD_DETALLE, CANTIDAD_INSUMO, ID_INVENTARIOS;
        double IVA_INSUMO, PRECIO_INSUMO_SINIVA;
        try {

            ID_ORDENES = txtcodOrden.getText();
            ID_INVENTARIOS = Integer.parseInt(txtcodinvent.getText());
            CANTIDAD_INSUMO = Integer.parseInt(txtcantidad.getText());
            PRECIO_INSUMO_SINIVA = Double.parseDouble(txtprecioIsumo.getText());
            IVA_INSUMO = Double.parseDouble(txtivainsumo.getText());
            FECHA = txtfecha.getText();
            OBSERVACIONES = txtobservaciones.getText();
            
            sql="insert into detalles_insumos values(null,'"+ID_ORDENES+"',"+ID_INVENTARIOS+","+CANTIDAD_INSUMO+","+PRECIO_INSUMO_SINIVA+"'"+IVA_INSUMO +",'"+FECHA+"','"+OBSERVACIONES+"')";

        } catch (Exception e) {
               JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // Limpiar los campos para ingresar un registro nuevo

        limpCampos();
    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String ID_ORDENES, FECHA, OBSERVACIONES, sql;
        int COD_DETALLE, ID_INVENTARIOS, ID_SERVICIOS, CANTIDAD_INSUMO, CANTIDAD_SERVICIOS;
        double PRECIO_INSUMO_SINIVA, IVA_INSUMO, PRECIO_SERVICO, IVA_SERVICIOS;

        try {
            COD_DETALLE= Integer.parseInt(lbcoddetalleord.getText());
            ID_ORDENES = txtidorden.getText();
            ID_INVENTARIOS = Integer.parseInt(txtidinventa.getText());
            ID_SERVICIOS = Integer.parseInt(txtidservi.getText());
            CANTIDAD_INSUMO = Integer.parseInt(txtcantinsumos.getText());
            PRECIO_INSUMO_SINIVA = Double.parseDouble(txtprecioinsumo.getText());

            IVA_INSUMO = getIva(PRECIO_INSUMO_SINIVA, Integer.parseInt(txtporcentivaIns.getText()));
            PRECIO_SERVICO = Double.parseDouble(txtprecioservi.getText());
            IVA_SERVICIOS = getIva(PRECIO_SERVICO, Integer.parseInt(txtporcentivaser.getText()));
            CANTIDAD_SERVICIOS = Integer.parseInt(txtcantservicios.getText());
            FECHA = txtfecha.getText();
            OBSERVACIONES = txtobserva.getText();

            sql = "update  detalles_ordenes set  ID_ORDENES='" + ID_ORDENES + "',ID_INVENTARIOS =" + ID_INVENTARIOS + ",ID_SERVICIOS=" + ID_SERVICIOS + ",CANTIDAD_INSUMO=" + CANTIDAD_INSUMO + ",PRECIO_INSUMO_SINIVA=" + PRECIO_INSUMO_SINIVA + ",IVA_INSUMO=" + IVA_INSUMO + ",PRECIO_SERVICO="+PRECIO_SERVICO+",IVA_SERVICIOS="+IVA_SERVICIOS+",CANTIDAD_SERVICIOS="+CANTIDAD_SERVICIOS+",FECHA='"+FECHA+"',OBSERVACIONES='"+OBSERVACIONES+"' where COD_DETALLE="+COD_DETALLE;
            ora2.regisData(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int cod = Integer.parseInt(lbcoddetalleord.getText());
        String idord=txtidorden.getText();
        String sql;
        int respuesta = JOptionPane.showConfirmDialog(null, " ¿Esta seguro que desea elminiar el registro? " + cod, "Eliminar Registro", JOptionPane.YES_NO_CANCEL_OPTION);
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
                sql = "delete detalles_ordenes where  COD_DETALLE="+cod;
                ora2.regisData(sql);
                sql=" Update ordenes set estado='Anulada' where COD_ORDENES='"+idord+"'";
                ora2.regisData(sql);
            } catch (Exception e) {
            }

        }
        refresh();

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnfinalizarordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarordActionPerformed
        String sql;
        String idord=txtidorden.getText();

        int respuesta = JOptionPane.showConfirmDialog(null, " ¿ Esta seguro que desea finalizar la orden ? " +idord, "Finalizar orden", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (respuesta) {
            case JOptionPane.YES_OPTION:
            sql=" Update ordenes set estado='Finalizada' where COD_ORDENES='"+idord+"'";
            ora2.regisData(sql);

            break;
            case JOptionPane.NO_OPTION:

            break;
            case JOptionPane.CANCEL_OPTION:

            break;
        }

    }//GEN-LAST:event_btnfinalizarordActionPerformed

    //Metodos utilitarios
    
     public void refresh(){
          modta2= new DefaultTableModel();
          String sql="select * from inventarios";
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
                 tablaInve.setModel(modta2);
             }

         } catch (Exception e) {
         }
    }
   
    public void limpCampos() {
        txtcodinvent.setText("");
        txtcodOrden.setText("");
        txtcodinvent.setText("");
        txtcantidad.setText("");
        txtprecioIsumo.setText("");
        txtivainsumo.setText("");
        txtfecha.setText("");
        txtobservaciones.setText("");
       
        
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
    
    
  
    
    public double getIva(double val){
       
        try {
              double pi= Double.parseDouble(txtporceniva.getText());
              return val *(Double.parseDouble(txtporceniva.getText())/100);

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, " Debe ingresar un valor de iva correcto ", "Error!", JOptionPane.INFORMATION_MESSAGE);
            return 0;

        }

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
            java.util.logging.Logger.getLogger(DetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetalleInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnfinalizarord;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodOrden;
    private javax.swing.JTextField txtcoddetalleinsumo;
    private javax.swing.JTextField txtcodinvent;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtivainsumo;
    private javax.swing.JTextArea txtobservaciones;
    private javax.swing.JTextField txtporcentiva;
    private javax.swing.JTextField txtprecioIsumo;
    // End of variables declaration//GEN-END:variables
}