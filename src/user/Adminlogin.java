/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DIVYA
 */
public class Adminlogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Adminlogin.class.getName());

    /**
     * Creates new form Adminlogin
     */
    public Adminlogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminlog = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminlog.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        adminlog.setForeground(new java.awt.Color(242, 242, 242));
        adminlog.setText("ADMIN LOGIN");
        getContentPane().add(adminlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 287, -1));

        name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        name.setForeground(new java.awt.Color(242, 242, 242));
        name.setText("Username");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 92, -1));

        password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        password.setForeground(new java.awt.Color(242, 242, 242));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 92, -1));
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 263, -1));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 263, -1));

        login.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 149, 30));

        backbutton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/title img (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         String username = jname.getText();
                String password = new String(jpassword.getPassword());
                
                 if (username.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill out Username");
        return;
    }
    if (password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill out Password");
        return;
    }
        try{
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","kokate@80100");
              
             
             

                    String sql = "SELECT * FROM admin_logininfo WHERE username = ? AND password = ?";
                     PreparedStatement pstmt = con.prepareStatement(sql);
                      pstmt.setString(1, username);
                      pstmt.setString(2, password);
                      ResultSet rs = pstmt.executeQuery();

               if (rs.next()) {
            // User found
            JOptionPane.showMessageDialog(this, "Login successful!");
            new Admin().setVisible(true);
            // Redirect to new screen here if needed
        } else {
            // No match found
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
               
               
              
              
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }//GEN-LAST:event_loginActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        new Titlepage().setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Adminlogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminlog;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JButton login;
    private javax.swing.JLabel name;
    private javax.swing.JLabel password;
    // End of variables declaration//GEN-END:variables
}
