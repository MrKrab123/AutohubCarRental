/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Form.frm_Main;
import Form.*;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author MrKrab
 */
public class Login {
    
   Connection conn = null;
   ResultSet rs = null;
   PreparedStatement pst = null;

   //LoginFunction
    public void LoginFunction(String u,String p){
       conn = DBconnection.jdbcConnect();
        

        frm_Login log = new frm_Login();

        try{
            String Log = "Select * from tbl_employee where username = ? and password = ?"; 
            pst=conn.prepareStatement(Log);
            pst.setString(1,u);
            pst.setString(2,p);
            

            rs=pst.executeQuery();

            if(rs.next()){
                
                //Input the data of the user to the current session table
                String id = rs.getString("emp_id");
                String fname = rs.getString("emp_fname");
                String ul = rs.getString("user_level");
                
                String session = "Insert into tbl_session (ses_id, ses_name, ses_userlevel) values (?, ?, ?)";
                pst = conn.prepareStatement(session);
                pst.setString(1, id);
                pst.setString(2,fname);
                pst.setString(3, ul);
                
                
                pst.execute();
                
                
                new frm_Main().setVisible(true);
               
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Account not found try again");

            }
            
      
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
 
}