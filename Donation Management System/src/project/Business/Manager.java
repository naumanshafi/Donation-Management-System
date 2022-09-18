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
public class Manager {
     private Connection conn=null;
    private Statement st =null;
    private ResultSet rs= null;
    private PreparedStatement ps =null;
    public int m1=0;
    
    
    public Manager()
    {
        connection c=new connection();
        conn=c.conn;
    }
    
    public int check_login(String username,String Password )
    { 
        int rows=-5;
        String usernamee = null,pass=null;
        
        String query="SELECT USERNAMES,PASSWORDS FROM APP.LOGINDETAILS WHERE USERNAMES='"+username+"' and PASSWORDS ='"+Password+"'";
        System.out.println(query);
        try {
          
           st = conn.createStatement();
            rs= st.executeQuery(query);
            System.out.println("c");
         while(rs.next())
         {
             usernamee=rs.getString("USERNAMES");
              pass=rs.getString("PASSWORDS");
             
             
         }
         
  
         if(username.equals(usernamee) && Password.equals(pass))
         {
             
             return 1;
         }
         
        } catch (SQLException ex) {
          
        }
       return rows;
    }
    public int add_login(String username,String Pass,String job)
    {
         String query="Insert into APP.LOGINDETAILS values ('"+username+"','"+Pass+"','"+job+"');";
        System.out.println(query);
        try {
          
           st = conn.createStatement();
            rs= st.executeQuery(query);
            System.out.println("c");
     
         
        } 
        catch (SQLException ex) {
          
        }
         return 0;
    }
    
    
    public void Add_project(int ID,String Name)
    {
        String query="Insert into APP.PROJECTDETAILS values ("+ID+",'"+Name+"');";
        System.out.println(query);
        try {
          
           st = conn.createStatement();
            rs= st.executeQuery(query);
            System.out.println("c");
     
         
        } 
        catch (SQLException ex) {
          
        }
    }
    public ResultSet get_projectDetails()
    {
        try {
            st=conn.createStatement();
            rs = st.executeQuery("SELECT * FROM APP.PROJECTDETAILS");
           
            
        } catch (SQLException ex) {
            
        }
        return rs;
    }
}
