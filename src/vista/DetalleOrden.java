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
public class DetalleOrden extends javax.swing.JFrame {

        DefaultTableModel modta2;
    Oraclep ora2;
    public DetalleOrden() {
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
        jTable1 = new javax.swing.JTable();
        txtfecha = new javax.swing.JTextField();
        idOrdenesLabel = new javax.swing.JLabel();
        idInventariosLabel = new javax.swing.JLabel();
        idServiciosLabel = new javax.swing.JLabel();
        cantidadInsumoLabel = new javax.swing.JLabel();
        precioInsumoLabel = new javax.swing.JLabel();
        ivaInsumoLabel = new javax.swing.JLabel();
        precioServicoLabel = new javax.swing.JLabel();
        ivaServiciosLabel = new javax.swing.JLabel();
        cantidadServiciosLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        observacionesLabel = new javax.swing.JLabel();
        txtidinventa = new javax.swing.JTextField();
        txtidservi = new javax.swing.JTextField();
        txtcantinsumos = new javax.swing.JTextField();
        txtprecioinsumo = new javax.swing.JTextField();
        txtivainsumo = new javax.swing.JTextField();
        txtprecioservi = new javax.swing.JTextField();
        txtivaservicios = new javax.swing.JTextField();
        txtcantservicios = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablagestion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoRegistro = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        precioInsumoLabel1 = new javax.swing.JLabel();
        txtporcentiva = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidorden = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Inventarios = new javax.swing.JMenuItem();
        menuModesp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Ordenes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idOrdenesLabel.setText("Id  Orden:");

        idInventariosLabel.setText("Id Inventarios:");

        idServiciosLabel.setText("Id Servicios:");

        cantidadInsumoLabel.setText("Cantidad Insumo:");

        precioInsumoLabel.setText("Precio Insumo:");

        ivaInsumoLabel.setText("Iva Insumo:");

        precioServicoLabel.setText("Precio Servico:");

        ivaServiciosLabel.setText("Iva Servicios:");

        cantidadServiciosLabel.setText("Cantidad Servicios:");

        fechaLabel.setText("Fecha:");

        observacionesLabel.setText("Observaciones:");

        txtcantservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantserviciosActionPerformed(evt);
            }
        });

        tablagestion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablagestion);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("GESTION DE ORDENES DE SERVICIO");

        btnNuevoRegistro.setText("Nuevo");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
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

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Refresh");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        precioInsumoLabel1.setText("Porcentaje iva:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel2.setText("CODIGO:");

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("Menu");

        jMenuItem1.setText("Servicios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        Inventarios.setText("Asignacion Insumos");
        Inventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventariosActionPerformed(evt);
            }
        });
        jMenu1.add(Inventarios);

        menuModesp.setText("Modulo Especialistas");
        menuModesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModespActionPerformed(evt);
            }
        });
        jMenu1.add(menuModesp);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Abrir");

        Ordenes.setText("Ordenes");
        Ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenesActionPerformed(evt);
            }
        });
        jMenu2.add(Ordenes);

        jMenuItem4.setText("Especialistas");
        jMenu2.add(jMenuItem4);

        jMenuItem2.setText("Inventarios");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Imprimir");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Guardar");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 642, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(saveButton)
                                .addGap(39, 39, 39)
                                .addComponent(btnModificar)
                                .addGap(49, 49, 49)
                                .addComponent(btneliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cantidadServiciosLabel)
                                            .addComponent(fechaLabel)
                                            .addComponent(cantidadInsumoLabel)
                                            .addComponent(precioInsumoLabel)
                                            .addComponent(ivaInsumoLabel)
                                            .addComponent(precioServicoLabel)
                                            .addComponent(ivaServiciosLabel)
                                            .addComponent(idInventariosLabel)
                                            .addComponent(idOrdenesLabel)
                                            .addComponent(idServiciosLabel)
                                            .addComponent(precioInsumoLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtfecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                            .addComponent(txtcantservicios, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtivaservicios, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtprecioservi, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtivainsumo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtprecioinsumo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcantinsumos, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidservi, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidinventa, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtporcentiva, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtidorden)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnNuevoRegistro)))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(observacionesLabel)
                            .addComponent(btnActualizar)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idOrdenesLabel)
                            .addComponent(txtidorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idInventariosLabel)
                            .addComponent(txtidinventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idServiciosLabel)
                            .addComponent(txtidservi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadInsumoLabel)
                            .addComponent(txtcantinsumos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioInsumoLabel)
                            .addComponent(txtprecioinsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioInsumoLabel1)
                            .addComponent(txtporcentiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ivaInsumoLabel)
                            .addComponent(txtivainsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioServicoLabel)
                            .addComponent(txtprecioservi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ivaServiciosLabel)
                            .addComponent(txtivaservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(observacionesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadServiciosLabel)
                    .addComponent(txtcantservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoRegistro)
                    .addComponent(saveButton)
                    .addComponent(btnModificar)
                    .addComponent(btneliminar)
                    .addComponent(btnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcantserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantserviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantserviciosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Servicios se = new Servicios();
        se.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void OrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenesActionPerformed
      
       
        
        
    }//GEN-LAST:event_OrdenesActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed
        // Limpiar los campos para ingresar un registro nuevo

        limpCampos();

    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String ID_ORDENES, FECHA, OBSERVACIONES,sql;
        int COD_DETALLE, ID_INVENTARIOS, ID_SERVICIOS, CANTIDAD_INSUMO, CANTIDAD_SERVICIOS;
        double PRECIO_INSUMO_SINIVA, IVA_INSUMO, PRECIO_SERVICO, IVA_SERVICIOS;
      
        try {
            
            sql = "insert into detalles_ordenes values(null,'"+NOMBRE+"','"+MARCA+"','"+MODELO+"',"+CANT_COMPRA+","+VALOR_SINIVA_UNIDAD+","+VALOR_IVA+",'"+FECHA+"','"+NUM_FACTURA+"','"+ID_PROVEE+"',"+CANT_EXISTENCIA+")";
            ora2.regisData(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String sql, NOMBRE, MODELO, FECHA, NUM_FACTURA, ID_PROVEE, MARCA;
        int COD_INV, CANT_EXISTENCIA, CANT_COMPRA;
        double VALOR_SINIVA_UNIDAD, VALOR_IVA;
        try {
            COD_INV= Integer.parseInt(txtcod.getText());
            NOMBRE = txtnomb.getText();
            MARCA = txtmarca.getText();
            MODELO = txtmod.getText();
            CANT_COMPRA = Integer.parseInt(txtcantcompra.getText());
            VALOR_SINIVA_UNIDAD = Double.parseDouble(txtvalorsiniva.getText());
            VALOR_IVA = getIva(VALOR_SINIVA_UNIDAD);
            FECHA = txtfecha.getText();
            NUM_FACTURA = txtnumfact.getText();
            ID_PROVEE = txtprovee.getText();
            CANT_EXISTENCIA = Integer.parseInt(txtcanstock.getText());

            sql = "update inventarios set NOMBRE='"+NOMBRE+"',MARCA='"+MARCA+"',MODELO='"+MODELO+"',CANT_COMPRA="+CANT_COMPRA+",VALOR_SINIVA_UNIDAD="+VALOR_SINIVA_UNIDAD+",VALOR_IVA="+VALOR_IVA+",FECHA='"+FECHA+"',NUM_FACTURA='"+NUM_FACTURA+"',ID_PROVEE='"+ID_PROVEE+"',CANT_EXISTENCIA="+CANT_EXISTENCIA+" WHERE COD_INV="+COD_INV;
            ora2.regisData(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ¡Debe llenar todos los campos correctamente !", " Error! ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int  cod= Integer.parseInt(txtcod.getText());
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
                sql="delete inventarios where COD_INV="+cod;
                ora2.regisData(sql);

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        refresh();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void menuModespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModespActionPerformed
        
        ModEspecial aord = new ModEspecial();
        aord.setVisible(true);
        
        
    }//GEN-LAST:event_menuModespActionPerformed

    private void InventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventariosActionPerformed
       AsignacionInsumos asi = new AsignacionInsumos();
       asi.setVisible(true);
         
        
        
    }//GEN-LAST:event_InventariosActionPerformed

       // metodos utilitarios
    
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
                 tablagestion.setModel(modta2);
             }

         } catch (Exception e) {
         }
    }
   
    public void limpCampos() {
   
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
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalleOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new DetalleOrden().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Inventarios;
    private javax.swing.JMenuItem Ordenes;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel cantidadInsumoLabel;
    private javax.swing.JLabel cantidadServiciosLabel;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel idInventariosLabel;
    private javax.swing.JLabel idOrdenesLabel;
    private javax.swing.JLabel idServiciosLabel;
    private javax.swing.JLabel ivaInsumoLabel;
    private javax.swing.JLabel ivaServiciosLabel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem menuModesp;
    private javax.swing.JLabel observacionesLabel;
    private javax.swing.JLabel precioInsumoLabel;
    private javax.swing.JLabel precioInsumoLabel1;
    private javax.swing.JLabel precioServicoLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable tablagestion;
    public static javax.swing.JTextField txtcantinsumos;
    private javax.swing.JTextField txtcantservicios;
    private javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtidinventa;
    public static javax.swing.JTextField txtidorden;
    public static javax.swing.JTextField txtidservi;
    private javax.swing.JTextField txtivainsumo;
    private javax.swing.JTextField txtivaservicios;
    private javax.swing.JTextField txtporcentiva;
    private javax.swing.JTextField txtprecioinsumo;
    private javax.swing.JTextField txtprecioservi;
    // End of variables declaration//GEN-END:variables
}
