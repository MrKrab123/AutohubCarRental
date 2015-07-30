/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnection {
        
    public static Connection jdbcConnect(){
        
        Connection conn = null;
        
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        String dbName = "autohubDB";
        
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection (url+dbName,userName,password);
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
        return conn;
    }
}
