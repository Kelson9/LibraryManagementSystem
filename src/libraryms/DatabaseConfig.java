/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author KELSON
 */
public class DatabaseConfig {
    
      public static Connection getConnection(){
     
        Connection con = null;
        try {
           Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "postgres");
                        System.out.println("connected  to database successfullly");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
    public static void main(String[] argd){
        
          DatabaseConfig app=new DatabaseConfig();
          app.getConnection();
    }
    
    
}
