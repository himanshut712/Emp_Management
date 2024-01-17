/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author window11
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 

    


/**
 *
 * @author 91799
 */
public class ConnectionPool {
    static Connection conn;
     public static Connection connectDB(){
       
        
           try{    
               Class.forName("com.mysql.cj.jdbc.Driver");
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","Harsh@8617");
           System.out.println("Database connection success");
           }
           catch(ClassNotFoundException | SQLException ex){
               Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE,null,ex);
           }
           
         return conn;       
    }
    public static void main(String[]args){
        connectDB();
    }

}

