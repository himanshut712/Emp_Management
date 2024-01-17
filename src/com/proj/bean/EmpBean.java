/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proj.bean;

/**
 *
 * @author window11
 */
public class EmpBean {
    private int empno;
    private String name;
    private float sal;
    private int deptno;
    private float comm;
    private String gender;

    public EmpBean() {
    }

    public EmpBean(int empno, String name, float sal, int deptno, float comm, String gender) {
        this.empno = empno;
        this.name = name;
        this.sal = sal;
        this.deptno = deptno;
        this.comm = comm;
        this.gender = gender;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public float getComm() {
        return comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
       

}
 
    

