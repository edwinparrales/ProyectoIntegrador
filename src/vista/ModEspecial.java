/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Oraclep;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eparrales
 */
public class ModEspecial extends javax.swing.JFrame {

     DefaultTableModel modta;
    Oraclep ora;
    public ModEspecial() {
        initComponents();
        modta = new DefaultTableModel();
        ora = new Oraclep();
        txtcodorden.setEditable(false);
        soloNum(txtesps);
        
        
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
        tablamge = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtesps = new javax.swing.JTextField();
        BTNFILTRO = new javax.swing.JButton();
        txtcodorden = new javax.swing.JTextField();
        btnvininsum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtobsorden = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaequipos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        btnvindetalleservicios = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modulo de ordenes asignadas");

        tablamge.setModel(new javax.swing.table.DefaultTableModel(
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
        tablamge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablamgeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablamge);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("MODULO DE ORDENES ASIGNADAS ");

        jLabel2.setText("Numero Cedula Especialista:");

        txtesps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespsActionPerformed(evt);
            }
        });

        BTNFILTRO.setText("Filtrar");
        BTNFILTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNFILTROActionPerformed(evt);
            }
        });

        btnvininsum.setText("Vincular a detalle Insumos");
        btnvininsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvininsumActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo orden:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Observaciones de la orden"));

        txtobsorden.setColumns(20);
        txtobsorden.setRows(5);
        jScrollPane4.setViewportView(txtobsorden);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de equipos ingresados"));

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
        jScrollPane2.setViewportView(tablaequipos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaclientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnvindetalleservicios.setText("Vincular a detalles servicios");
        btnvindetalleservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvindetalleserviciosActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconguardar.jpg"))); // NOI18N
        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconimpre.png"))); // NOI18N
        jMenu3.setText("Imprimir");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodorden, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnvindetalleservicios)
                        .addGap(27, 27, 27)
                        .addComponent(btnvininsum, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtesps, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTNFILTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtesps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNFILTRO))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnvindetalleservicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnvininsum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodorden, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtespsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespsActionPerformed
       
        DetalleServicio.txtcodorden.setText(txtcodorden.getText());
        
        
    }//GEN-LAST:event_txtespsActionPerformed

    private void BTNFILTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNFILTROActionPerformed
         modta = new DefaultTableModel();
         String esp= txtesps.getText();
           
     
        ora.consultar("select  ASIGNACIONES_ORDENES.cod_asignacion,ASIGNACIONES_ORDENES.ID_ESPECIALISTAS,ASIGNACIONES_ORDENES.ID_ORDENES,ASIGNACIONES_ORDENES.OBSERVACIONES,ASIGNACIONES_ORDENES.FECHA,ordenes.estado from ASIGNACIONES_ORDENES,ORDENES where asignaciones_ordenes.id_ordenes=ordenes.COD_ORDENES AND ORDENES.ESTADO='Asignada' and ASIGNACIONES_ORDENES.ID_ESPECIALISTAS='"+esp+"'");

        try {
            int numCol = ora.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta.addColumn(ora.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora.getRst().next()) {
                Object[] fila = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    fila[i] = ora.getRst().getObject(i + 1);
                }

                modta.addRow(fila);
                tablamge.setModel(modta);
            }
           
        } catch (Exception e) {
        }finally {

            if (modta.getRowCount()==0) {
                JOptionPane.showMessageDialog(null," No se encontraron registros "+esp);
            }
        
        }

    }//GEN-LAST:event_BTNFILTROActionPerformed

    private void btnvininsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvininsumActionPerformed

        try {

            DetalleInsumo.txtidorden.setText(txtcodorden.getText());
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnvininsumActionPerformed

    private void tablamgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablamgeMouseClicked
        modta = new DefaultTableModel();
        int fila = tablamge.getSelectedRow();
        txtcodorden.setText(tablamge.getModel().getValueAt(fila, 2).toString());
       
        String codord=tablamge.getModel().getValueAt(fila, 2).toString();
        String sql = "select clientes.* from clientes,ordenes where dni = ordenes.ID_CLIENTES and ordenes.COD_ORDENES='"+codord+"'";
           ora.consultar(sql);
        try {
            int numCol = ora.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta.addColumn(ora.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora.getRst().next()) {
                Object[] filap = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    filap[i] = ora.getRst().getObject(i + 1);
                }

                modta.addRow(filap);
                tablaclientes.setModel(modta);
            }
           
        } catch (Exception e) {
        }
        obserOrden();
        equipoCliente();
         
        
    }//GEN-LAST:event_tablamgeMouseClicked

    private void btnvindetalleserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvindetalleserviciosActionPerformed
     
        try {

            DetalleServicio.txtcodorden.setText(txtcodorden.getText());
        } catch (Exception e) {

        }
        
        
        
        
    }//GEN-LAST:event_btnvindetalleserviciosActionPerformed

    
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
    
    public void obserOrden() {
         int fila = tablamge.getSelectedRow();
        String codo = tablamge.getModel().getValueAt(fila, 2).toString();

        String sql = "select ordenes.observaciones from ordenes where ordenes.COD_ORDENES='" + codo + "'";
        ora.consultar(sql);

        try {

            while (ora.getRst().next()) {

                String ob = ora.getRst().getString("OBSERVACIONES");
                txtobsorden.setText(ob);
            }

        } catch (Exception e) {

        }

    }
       
    public void equipoCliente(){
        modta = new DefaultTableModel();
        int fila = tablamge.getSelectedRow();
        String codo = tablamge.getModel().getValueAt(fila, 2).toString();
        String sql = "select * from EQUIPOS_CLIENTES where ID_ORDENES='"+codo+"'";
        ora.consultar(sql);
        
        
        try {
            int numCol = ora.getRstmdata().getColumnCount();
            for (int i = 0; i < numCol; i++) {
                modta.addColumn(ora.getRstmdata().getColumnLabel(i + 1));

            }

            while (ora.getRst().next()) {
                Object[] filap = new Object[numCol];
                for (int i = 0; i < numCol; i++) {
                    filap[i] = ora.getRst().getObject(i + 1);
                }

                modta.addRow(filap);
                tablaequipos.setModel(modta);
            }
           
        } catch (Exception e) {
        }
        
        
        
        
        
    }
       

    
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ModEspecial().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNFILTRO;
    private javax.swing.JButton btnvindetalleservicios;
    private javax.swing.JButton btnvininsum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tablaequipos;
    private javax.swing.JTable tablamge;
    private javax.swing.JTextField txtcodorden;
    private javax.swing.JTextField txtesps;
    private javax.swing.JTextArea txtobsorden;
    // End of variables declaration//GEN-END:variables
}
