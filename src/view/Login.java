package view;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import services.ConnectionProvider;

public class Login extends javax.swing.JFrame {

    private ResultSet rs;
    private PreparedStatement pst;

    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(233, 246, 250));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(800, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(233, 246, 250));
        jPanel2.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(0, 51, 51));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-eye-unchecked-28.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 40, 30));

        loginButton.setBackground(new java.awt.Color(0, 51, 51));
        loginButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 80, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        passwordField.setBackground(new java.awt.Color(0, 51, 51));
        passwordField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 4, 0));
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 160, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 100, 20));

        usernameTextField.setBackground(new java.awt.Color(204, 255, 204));
        usernameTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 4, 0));
        usernameTextField.setOpaque(false);
        jPanel2.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 160, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(800, 880));
        jLabel3.setMinimumSize(new java.awt.Dimension(800, 880));
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 880));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1380, 800));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //login button
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String name = usernameTextField.getText();
        String pass = passwordField.getText();
        String sql = "select * from users where username=? and password=?";
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            pst = con.prepareStatement(sql);
            pst.setString(1, usernameTextField.getText());
            pst.setString(2, passwordField.getText());
            if (name.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the Fields");
            } else {
                rs = pst.executeQuery();
                if (rs.next()) {
                    setVisible(false);
                    Lab_Loading ob = new Lab_Loading();
                    ob.setUpLoading();
                    ob.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                }

            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    //password visibility
    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        if (jToggleButton1.isSelected()) {
            passwordField.setEchoChar((char) 0); //By this line of code. We will actually see the actual characters

        } else {
            passwordField.setEchoChar('\u25cf');

        }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
