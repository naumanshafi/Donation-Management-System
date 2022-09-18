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
import project.Database.connection;

/**
 *
 * @author Yaxir
 */
public class pledges {
    private Connection conn=null;
    private Statement st =null;
    private ResultSet rs= null;
    private PreparedStatement ps =null;
    
    
    public pledges()
    {
        connection c=new connection();
        conn=c.conn;
    }
    
    public void login(String username,String Password)
    {
        try {
            ps = conn.prepareStatement("Select * from APP.LOGINDETAILS values (?,?)");
            ps.setString(1, username);
            ps.setString(2, username);
            
         int rows=   ps.executeUpdate();
         
        } catch (SQLException ex) {
           
        }
    }
    public ResultSet get()
    {
        try {
            st=conn.createStatement();
            rs = st.executeQuery("select * from APP.DATA");
           
            
        } catch (SQLException ex) {
            
        }
        return rs;
    }
}
