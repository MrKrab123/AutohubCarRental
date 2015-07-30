/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author MrKrab
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
public class Main_Session {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public void session(String userlevel, String fname){
       try{
           conn = DBconnection.jdbcConnect();
           String ses = "Select * from tbl_session";
           pst = conn.prepareStatement(ses);

           
          if(rs.next()) {
           userlevel = rs.getString("ses_userlevel");
           fname= rs.getString("ses_name");

          }
           
       }catch(SQLException | HeadlessException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
   
}
