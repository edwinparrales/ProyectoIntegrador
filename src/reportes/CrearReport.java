/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import controlador.Oraclep;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Eparrales
 */


public class CrearReport {
    
    
    public CrearReport(){
        
    }
    
    
    
      public void inven(){  
          Oraclep ora = new Oraclep();
          ora.getCon().conectar();
          String ruta = "E:\\AreaTrabajo2\\JavaSoluciones\\src\\reportes\\report3.jasper";

          try {
              JasperReport js = (JasperReport) JRLoader.loadObjectFromFile(ruta);
              JasperPrint jp = JasperFillManager.fillReport(js, null, ora.getCon().getConexion());
              JasperViewer jv = new JasperViewer(jp,false);
              jv.setVisible(true);
              jv.setTitle("prueba");

          } catch (Exception e) {

          }
     
      }
    
    
    public void detalleInsumos(String ordi ){
        Oraclep ora = new Oraclep();
        ora.getCon().conectar();
       
    

        try {
             String ruta = "E:\\AreaTrabajo2\\JavaSoluciones\\src\\reportes\\report1.jasper";
             Map parametros = new HashMap();
             parametros.put("ord", ordi);
            //JasperReport js = (JasperReport) JRLoader.loadObjectFromFile(ruta);
             JasperPrint jp = JasperFillManager.fillReport(ruta,parametros, ora.getCon().getConexion());
             JasperViewer jv = new JasperViewer(jp,false);
            
             jv.setTitle(" Soluciones E&S ");
             jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }
    
}
         
     
        
        
        
  
   
       
    
    

