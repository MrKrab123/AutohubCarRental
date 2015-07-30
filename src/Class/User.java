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


import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;


public class User {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
   //Save to Employee Table
    public void SaveToEmployee(String fname, String lname, String mi, String username, String userlevel , String id)
    { 
        try{
               conn = DBconnection.jdbcConnect();
         
               String emp = "Insert into tbl_employee(emp_id, emp_fname, emp_lname, emp_mi, username, user_level, password) values (?, ?, ?, ?, ?, ?, ?)";
          
               pst = conn.prepareStatement(emp);
               pst.setString(1, id);
               pst.setString(2, fname);
               pst.setString(3, lname);
               pst.setString(4, mi);
               pst.setString(5, username);
               pst.setString(6, userlevel);
               pst.setString(7, "");
     
               pst.execute();
                 
                JOptionPane.showMessageDialog(null, "Saved");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      //AutoIncrement emp_id , tbl_employee  
 
    
 
 //Update table from tbl_Employee
 public void   UpdateToEmployee(String fname, String lname, String mi, String username, String userlevel, String id){
        try{
               conn = DBconnection.jdbcConnect();

               
               String emp = "Update tbl_employee set emp_fname = '"+fname+"', emp_lname = '"+lname+"', emp_mi = '"+mi+"', username = '"+username+"', user_level = '"+userlevel+"' where emp_id = '"+id+"'";
              
               
               pst = conn.prepareStatement(emp);

               pst.execute();

                           
                JOptionPane.showMessageDialog(null, "Updated");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
