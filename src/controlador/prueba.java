/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author Eparrales
 */
public class prueba {
    
    Oraclep ora2;
    ResultSet rs;
   
    
    public static void main(String[] args) {
        prueba p= new prueba();
        
        p.funcionPl();
         
        
        
        
        
    }
    
    public void funcionPl() {
        ora2 = new Oraclep();
        String nord = "34";
     double r=0;

        try {

            CallableStatement cs = ora2.getCon().getConexion().prepareCall("{? = call f_dtasertotal(?)}");

            cs.setString(2,"36");
            cs.registerOutParameter(1, java.sql.Types.NUMERIC);
            cs.execute();

            System.out.println("" + cs.getInt(1));

        } catch (Exception e) {
            System.out.println("jj" + e);
        }

    }

}
