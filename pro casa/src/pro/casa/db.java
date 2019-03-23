/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.casa;
import java.sql.*;
import javax.swing.*;
public class db {

    static Connection ConnecrDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
static  String cmbdata=null;    
    Connection conn=null;
    
    public static String getcmd()
    {
        return cmbdata;
        
    }
    public static void setcdata(String a)
    {
        cmbdata=a;
    }
    public static Connection java_db(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/procasa","root","");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}

/**
 *
 * @author principal
 */
/*public class db {
    
}*/
