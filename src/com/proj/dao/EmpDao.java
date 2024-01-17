/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proj.dao;


/**
 *
 * @author window11
 */

    import com.proj.bean.EmpBean;
import com.proj.utility.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;





 
public class EmpDao {
    static Connection conn;
    // 1 Add new Employee
    public int saveEmployee(EmpBean eb){
        conn=ConnectionPool.connectDB();
        int r=0;
        String sql="insert into emp(name,sal,deptno,gender,comm)values('"+eb.getName()+"','"+eb.getSal()+"','"+eb.getDeptno()+"','"+eb.getGender()+"','"+eb.getComm()+"')";
    
        try {
            java.sql.Statement stmt=conn.createStatement();
            r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmpDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                                 
    
    return r;
                
}
    
    // 2 for update employee
    
    public int updateEmployee(EmpBean eb){
    conn=ConnectionPool.connectDB();
    int r=0;
    String sql="update emp set name='"+eb.getName()+"',sal='"+eb.getSal()+"',deptno='"+eb.getDeptno()+"',gender='"+eb.getGender()+"',comm='"+eb.getComm()+"'where empno='"+eb.getEmpno()+"'";
        try {
            java.sql.Statement stmt= conn.createStatement();
            r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmpDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            return r;       
    }
    //3 for delete the Employee
    public int deleteEmployee(int empno){
    int r=0;
    conn=ConnectionPool.connectDB();
    String sql="delete from emp where empno='"+empno+"'";
        try {
            java.sql.Statement stmt= conn.createStatement();
            r=stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EmpDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
   return r; }
    //4 find all employee
    public ArrayList<EmpBean>findAll(){
    conn=ConnectionPool.connectDB();
    ArrayList<EmpBean> al=new ArrayList<EmpBean>();
    String sql="select * from emp";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
                 
                    while(rs.next()){
                EmpBean e= new EmpBean();
                e.setEmpno(rs.getInt("empno"));
                e.setComm(rs.getFloat("comm"));
                e.setDeptno(rs.getInt("deptno"));
                e.setGender(rs.getString("gender"));
                e.setSal(rs.getFloat("sal"));
                e.setName(rs.getString("name"));
                al.add(e);
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
     public ArrayList<EmpBean>findByGender(String gender){
    conn=ConnectionPool.connectDB();
    ArrayList<EmpBean> al=new ArrayList<EmpBean>();
    String sql="select * from emp where gender='"+gender+"'";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
                 
                    while(rs.next()){
                EmpBean e= new EmpBean();
                e.setEmpno(rs.getInt("empno"));
                e.setComm(rs.getFloat("comm"));
                e.setDeptno(rs.getInt("deptno"));
                e.setGender(rs.getString("gender"));
                e.setSal(rs.getFloat("sal"));
                e.setName(rs.getString("name"));
                al.add(e);
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    public float getTotalSalary(){
    conn=ConnectionPool.connectDB();
    float s=0;
    String sql="select sum(sal) as tsal from emp";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
            s=rs.getFloat("tsal");
            }
                   
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
    }
    public float getAvgSalary(){
    conn=ConnectionPool.connectDB();
    float s=0;
    String sql="select avg(sal) as tsal from emp";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.next()){
            s=rs.getFloat("tsal");
            }
                   
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    
    }
    public ArrayList<EmpBean>findAllByDeptno(int deptno){
    conn=ConnectionPool.connectDB();
    ArrayList<EmpBean> al=new ArrayList<EmpBean>();
    String sql="select * from emp where deptno='"+deptno+"'";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
                 
                    while(rs.next()){
                EmpBean e= new EmpBean();
                e.setEmpno(rs.getInt("empno"));
                e.setComm(rs.getFloat("comm"));
                e.setDeptno(rs.getInt("deptno"));
                e.setGender(rs.getString("gender"));
                e.setSal(rs.getFloat("sal"));
                e.setName(rs.getString("name"));
                al.add(e);
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
     public ArrayList<EmpBean>getHighestSalariedEmployee(){      
            conn=ConnectionPool.connectDB();
    ArrayList<EmpBean> al=new ArrayList<EmpBean>();
    String sql="select * from emp where sal=(select max(sal)from emp)";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
                 
                    while(rs.next()){
                EmpBean e= new EmpBean();
                e.setEmpno(rs.getInt("empno"));
                e.setComm(rs.getFloat("comm"));
                e.setDeptno(rs.getInt("deptno"));
                e.setGender(rs.getString("gender"));
                e.setSal(rs.getFloat("sal"));
                e.setName(rs.getString("name"));
                al.add(e);
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
      public ArrayList<EmpBean>getLowestSalariedEmployee(){      
            conn=ConnectionPool.connectDB();
    ArrayList<EmpBean> al=new ArrayList<EmpBean>();
    String sql="select * from emp where sal=(select min(sal)from emp)";
        try {
            java.sql.Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
                 
                    while(rs.next()){
                EmpBean e= new EmpBean();
                e.setEmpno(rs.getInt("empno"));
                e.setComm(rs.getFloat("comm"));
                e.setDeptno(rs.getInt("deptno"));
                e.setGender(rs.getString("gender"));
                e.setSal(rs.getFloat("sal"));
                e.setName(rs.getString("name"));
                al.add(e);
            }
            conn.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
   
public static void main(String[]args){
/*EmpBean eb= new EmpBean();
ebsetSal();
eb.setName("");
eb.setComm();
eb.setDeptno();
eb.setGender("");
EmpDao ed= new EmpDao();
int x=ed.saveEmployee(eb);
if(x>0){
System.out.println("Employee Added");
}
else{
System.out.println("Employee not Added");
}*/
//2updateEmployee
/*
EmpBean eb= new EmpBean();
eb.setEmpno(3);
eb.setName("Gaurav");
eb.setSal(22000);
eb.setDeptno(10);
eb.setGender("male");
eb.setComm(91);

EmpDao ed= new EmpDao();
int x=ed.updateEmployee(eb);
if(x>0){
    System.out.println("Data update success");
}
else{
    System.out.println("Data update Fail");
}*/
//3
/*EmpDao da0= new EmpDao();
int x=da0.deleteEmployee(4);
if(x>0){
    System.out.println("Data delete success");
}
else{
    System.out.println("Data delete fail");
}*/
//4
/*EmpDao dao= new EmpDao();
ArrayList<EmpBean> al=dao.findAll();
for(EmpBean x:al){
    System.out.println("\t"+x.getName()+"\t"+x.getSal()+"\t"+x.getGender()+"\t"+x.getDeptno()+"\t"+x.getEmpno()+"\t"+x.getComm());
            
}*/
//5
/*EmpDao dao= new EmpDao();
ArrayList<EmpBean> al=dao.findByGender("male");
System.out.println(" Data of All Male Employee");
for(EmpBean x:al){
    System.out.println("\t"+x.getName()+"\t"+x.getSal()+"\t"+x.getGender()+"\t"+x.getDeptno()+"\t"+x.getEmpno()+"\t"+x.getComm());
       
}*/
//6
/*EmpDao ed= new EmpDao();
float sal=ed.getTotalSalary();
System.out.println("Total Salary of All Employee: "+sal);*/
// 7
/*EmpDao ed= new EmpDao();
float sal=ed.getAvgSalary();
System.out.println("Average Salary of All Employee: "+sal);*/
//8
EmpDao dao= new EmpDao();
ArrayList<EmpBean> al=dao.findAllByDeptno(10);
for(EmpBean y:al){
    System.out.println("\t"+y.getName()+"\t"+y.getSal()+"\t"+y.getGender()+"\t"+y.getDeptno()+"\t"+y.getEmpno()+"\t"+y.getComm());            
}
//9
/*EmpDao dao= new EmpDao();
ArrayList<EmpBean>al=dao.getHighestSalariedEmployee();
for(EmpBean x:al){
   System.out.println("\t"+x.getName()+"\t"+x.getSal()+"\t"+x.getGender()+"\t"+x.getDeptno()+"\t"+x.getEmpno()+"\t"+x.getComm());            
}*/
//10
//EmpDao dao= new EmpDao();
//ArrayList<EmpBean>al=dao.getLowestSalariedEmployee();
//for(EmpBean x:al){
//   System.out.println("\t"+x.getName()+"\t"+x.getSal()+"\t"+x.getGender()+"\t"+x.getDeptno()+"\t"+x.getEmpno()+"\t"+x.getComm());            
//}
}}

    

