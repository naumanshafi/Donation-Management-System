/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP-PC
 */
public class connection {
   public Connection conn=null;
   
   public connection()
   {
        try{
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/DMS", "myk", "123");
       
        }
        catch(SQLException e)
        {
            
        }
   }
   
}
