/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.Database.connection;
import project.GUI.manager;

/**
 *
 * @author Yaxir
 */
public class team {
     private Connection conn=null;
    private Statement st =null;
    private ResultSet rs= null;
    private PreparedStatement ps =null;
    
    
    public team()
    {
        connection c=new connection();
        conn=c.conn;
    }
    
    public void insert(int id,String name,int worktime)
    {
         String query=" INSERT INTO APP.VOLUNTEERS VALUES ("+id+",'"+name+"',"+worktime+") ";
        System.out.println(query);
        try {
          
           st = conn.createStatement();
            rs= st.executeQuery(query);
            System.out.println("eq");
     
         
        } 
        catch (SQLException ex) {
          System.out.println(" no eq");
        }
         
    }
    public ResultSet get()
    {
        try {
            st=conn.createStatement();
            rs = st.executeQuery("select * from APP.VOLUNTEERS");
          
            
          
       return rs;
           
           
        } catch (SQLException ex) {
            
        }
        return null;
    }
}
