/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;


import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author DIVYA
 */
public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        Cancel = new javax.swing.JButton();
        jlogin = new javax.swing.JButton();
        cpassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        login.setForeground(new java.awt.Color(242, 242, 242));
        login.setText("LOGIN");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 163, -1));

        username.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        username.setForeground(new java.awt.Color(242, 242, 242));
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 84, -1));

        password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        password.setForeground(new java.awt.Color(242, 242, 242));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 84, -1));
        getContentPane().add(jtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 232, -1));
        getContentPane().add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 232, -1));

        Cancel.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jlogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });
        getContentPane().add(jlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        cpassword.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        cpassword.setForeground(new java.awt.Color(242, 242, 242));
        cpassword.setText("Show password");
        cpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registration.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed

       String username = jtuser.getText();
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
              Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","sunny123");
              
             
             

                    String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
                     PreparedStatement pstmt = con.prepareStatement(sql);
                      pstmt.setString(1, username);
                      pstmt.setString(2, password);
                      ResultSet rs = pstmt.executeQuery();

               if (rs.next()) {
            // User found
            JOptionPane.showMessageDialog(this, "Login successful!");
            new Productpage().setVisible(true);
            // Redirect to new screen here if needed
        } else {
            // No match found
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
               
               
              
              
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        
       
    }//GEN-LAST:event_jloginActionPerformed

    private void cpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpasswordActionPerformed

        if(cpassword.isSelected())
        {
           jpassword.setEchoChar((char)0);
        }
        else{
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cpasswordActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        new Register().setVisible(true);

    }//GEN-LAST:event_CancelActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JCheckBox cpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jlogin;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    private javax.swing.JLabel login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
