/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proj.projectui;

import com.proj.bean.EmpBean;
import com.proj.bean.UserBean;
import com.proj.dao.EmpDao;
import com.proj.dao.UserDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author window11
 */
public class AddEmployee extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public AddEmployee() {
        initComponents();
     }
 public static void main(String []args){
    JFrame jf=new JFrame("addemployee");
    jf.setContentPane(new AddEmployee());
     jf.pack();
jf.setLocationRelativeTo(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sign = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        Sign1 = new javax.swing.JButton();
        Sign2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setRequestFocusEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Employee Management System");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel6)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Update");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Salary");

        Sign.setBackground(new java.awt.Color(0, 102, 102));
        Sign.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sign.setForeground(new java.awt.Color(255, 255, 255));
        Sign.setText("Save");
        Sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignActionPerformed(evt);
                abc(evt);
            }
        });

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Department");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Employee Number");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Commission");

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Sign1.setBackground(new java.awt.Color(0, 102, 102));
        Sign1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sign1.setForeground(new java.awt.Color(255, 255, 255));
        Sign1.setText("Update");
        Sign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign1ActionPerformed(evt);
                abc(evt);
            }
        });

        Sign2.setBackground(new java.awt.Color(0, 102, 102));
        Sign2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sign2.setForeground(new java.awt.Color(255, 255, 255));
        Sign2.setText("Delete");
        Sign2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sign2ActionPerformed(evt);
                abc(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addComponent(Sign, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Sign1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Sign2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                .addComponent(jTextField5)
                                .addComponent(jTextField6)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(1, 1, 1)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sign)
                    .addComponent(Sign1)
                    .addComponent(Sign2))
                .addGap(46, 46, 46))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 504);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("Login");
    }// </editor-fold>//GEN-END:initComponents
  

    private void SignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignActionPerformed
        // TODO add your handling code here:
     

    }//GEN-LAST:event_SignActionPerformed

    private void Sign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sign1ActionPerformed

    private void Sign2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sign2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sign2ActionPerformed

    private void abc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abc
        // TODO add your handling code here:
        String opn=evt.getActionCommand();
      EmpDao ed= new EmpDao();
      EmpBean eb= new EmpBean();
      if(opn.equals("Delete")){
      int empno=Integer.parseInt(jTextField5.getText());
      int a=ed.deleteEmployee(empno);
      if(a>0){
      JOptionPane.showMessageDialog(this,"Employee Deleted Success");
      }
      else{
      JOptionPane.showMessageDialog(this,"Employee Not Deleted");
      }
    }                    
else{
    String name=jTextField2.getText();
    float sal=Float.parseFloat(jTextField5.getText());
    int  deptno=Integer.parseInt(jTextField1.getText());
    float comm=Float.parseFloat(jTextField4.getText());
    String g=jComboBox1.getSelectedItem().toString();
    eb.setComm(comm);
    eb.setDeptno(deptno);
    eb.setGender(g);
    eb.setName(name);
    eb.setSal(sal);
    if(opn.equals("Save")){
    int a=ed.saveEmployee(eb);
    if(a>0){
         JOptionPane.showMessageDialog(this,"Employee Added Success");
    }
    else{
     JOptionPane.showMessageDialog(this,"Employee Not Added");
    }
    }
    else if(opn.equals("Update")){
    int empno=Integer.parseInt(jTextField6.getText());
    eb.setEmpno(empno);
    int y=ed.updateEmployee(eb);
    if(y>0){
         JOptionPane.showMessageDialog(this,"Employee Updated Success");
    }
    else{ JOptionPane.showMessageDialog(this,"Employee Added Success");
    }
    }
}
    }//GEN-LAST:event_abc

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton Sign;
    private javax.swing.JButton Sign1;
    private javax.swing.JButton Sign2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}