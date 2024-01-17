/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proj.dao;
import com.proj.bean.UserBean;
import com.proj.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


/**
 *
 * @author 91799
 */
public class UserDao {
     static Connection conn;
    public int registerUser(UserBean ub){
    conn=ConnectionPool.connectDB();
    int r=0;
    String sql="insert into users(name,email,address,mobile,username,password)values('"+ub.getName()+"','"+ub.getEmail()+"','"+ub.getAddress()+"','"+ub.getMobile()+"','"+ub.getUsername()+"','"+ub.getPassword()+"')";
         try {
             java.sql.Statement stmt= conn.createStatement();
             r=stmt.executeUpdate(sql);
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    return r;
    }
    public int loginCheck(String username,String password) 
    {
    int id=0;
    conn=ConnectionPool.connectDB();
    String sql="select uid from users where username='"+username+"'and password='"+password+"'";
         
              java.sql.Statement stmt;
         try {
          stmt = conn.createStatement();
            ResultSet rs= stmt.executeQuery(sql);
             if(rs.next()){
             id=rs.getInt("uid");
             }
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
            
             return id; 
         } 
    public String forgotPassword(String email){
       String pwd=null;
             conn=ConnectionPool.connectDB();
             String sql="select password from users where email='"+email+"'";
             try {
             
             java.sql.Statement stmt=conn.createStatement();
             ResultSet rs=stmt.executeQuery(sql);
             if(rs.next()){
             pwd=rs.getString("password");
             }
             conn.close();
                    
         } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
    return pwd;
    }
    public int changePassword(String email,String oldPassword,String newPassword){
    conn=ConnectionPool.connectDB();
    String select1="select uid from users where password='"+oldPassword+"'";
    int id=0;
         try {
             java.sql.Statement stmt=conn.createStatement();
             ResultSet rs1=stmt.executeQuery(select1);
             if(rs1.next()){
                 String sql="update users set password='"+newPassword+"'where email='"+email+"'";
                 java.sql.Statement stmt1= conn.createStatement();
                 id=stmt1.executeUpdate(sql);
             }
             conn.close();
         } catch (SQLException ex) {
             Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
         }
    return id;}
    
    public static void main(String[]args){
    UserBean ub= new UserBean();
    ub.setName("Himanshu");
    ub.setEmail("himanshu321@gmail.com");
    ub.setAddress("indore");
    ub.setMobile("1122334455");
    ub.setPassword("himanshu1");
    ub.setUsername("himanshu123");
    UserDao ud= new UserDao();
    int x=ud.registerUser(ub);
    if(x>0){
    System.out.println("Registration Success");
}else{
System.out.println("Registration Failed");
}}}
//2 call logiCheck method
//UserDao ud=new UserDao();
//int a=ud.loginCheck("Harsh1", "harsh123");
// if(a>0){
// System.out.println("Login Success");
//}else{
//System.out.println("Login Failed Try again");
//}
//UserDao ud= new UserDao();
//String ps=ud.forgotPassword("harsh!23@gmail.com");
//System.out.println("Your Password : "+ps);

//UserDao ud=new UserDao();
//         int x=ud.changePassword("harsh123@gmail.com","harsh123","harsh712");
//    System.out.println(""+x);
//  }

   
    


