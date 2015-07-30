/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author MrKrab
 */
public class Vehicle {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    
    public void SaveToVehicle(String i, String p, String m, String t, int c){
         try{
            conn = DBconnection.jdbcConnect();
            String sql = "Insert Into tbl_Vehicle(v_id, plateno, model, type, capacity)values(?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, i);
            pst.setString(2, p);
            pst.setString(3, m);
            pst.setString(4, t);
            pst.setInt(5, c);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Saved");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void UpdateToVehicle(String i, String p, String m, String t, int c){
         try{
            conn = DBconnection.jdbcConnect();
 String vhc = "Update tbl_Vehicle set plateno= '"+p+"', model = '"+m+"', type = '"+t+"', capacity = '"+c+"'  where v_id = '"+i+"'";
            pst = conn.prepareStatement(vhc);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }    
}
