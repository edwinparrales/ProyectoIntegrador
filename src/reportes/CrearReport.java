/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import controlador.Oraclep;
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
    
    
    public static void main(String[] args) {
        
     Oraclep ora = new Oraclep();
     ora.getCon().conectar();
     String ruta = "E:\\AreaTrabajo2\\JavaSoluciones\\src\\reportes\\report3.jasper";
       
    
        try {
           JasperReport js  = (JasperReport)JRLoader.loadObjectFromFile(ruta);
            JasperPrint jp = JasperFillManager.fillReport(js,null,ora.getCon().getConexion());
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle("prueba");

        } catch (Exception e) {

        }
     
    }
}
         
     
        
        
        
  
   
       
    
    

