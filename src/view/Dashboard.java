
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public final class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        showTime();
        showDate();
        new Data().setVisible(true);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
      

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        date.setText(s.format(d));
      
    }

    void showTime() {
        new Timer(0, (ActionEvent ae) -> {
            Date d = new Date();
            SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
            timelab.setText(s.format(d));
        }).start();

    }

    public void setColor(JPanel book) {
        book.setBackground(new Color(72, 91, 99));
    }

    public void resetColor(JPanel book2) {
        book2.setBackground(new Color(51, 51, 51));
    }

 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        studPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        issuedPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        history = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bookPanel = new javax.swing.JPanel();
        bookLabel = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(204, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 50, 60));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male_user_50px.png"))); // NOI18N
        jLabel14.setText(" Welcome Admin");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logonav.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 70));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studPanel.setBackground(new java.awt.Color(51, 51, 51));
        studPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studPanelMouseExited(evt);
            }
        });
        studPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel6.setText(" Manage  Students");
        studPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(studPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 60));

        issuedPanel.setBackground(new java.awt.Color(51, 51, 51));
        issuedPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        issuedPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuedPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issuedPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issuedPanelMouseExited(evt);
            }
        });
        issuedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Sell_26px.png"))); // NOI18N
        jLabel11.setText(" Lost Books");
        issuedPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(issuedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 270, 60));

        dashboard.setBackground(new java.awt.Color(51, 51, 51));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_View_Details_26px.png"))); // NOI18N
        jLabel3.setText("  Dashboard");
        dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        jPanel2.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 50));

        historyPanel.setBackground(new java.awt.Color(51, 51, 51));
        historyPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        historyPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        historyPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        historyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyPanelMouseExited(evt);
            }
        });
        historyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Return_Purchase_26px.png"))); // NOI18N
        history.setText(" History");
        historyPanel.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 10, 110, 30));

        jPanel2.add(historyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 270, 60));

        logoutPanel.setBackground(new java.awt.Color(191, 34, 34));
        logoutPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        logoutPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        logoutPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Exit_26px_1.png"))); // NOI18N
        jLabel13.setText(" Log Out");
        logoutPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jPanel2.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 270, 50));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Features");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 50));

        bookPanel.setBackground(new java.awt.Color(51, 51, 51));
        bookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookPanelMouseExited(evt);
            }
        });
        bookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookLabel.setForeground(new java.awt.Color(255, 255, 255));
        bookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Books_26px.png"))); // NOI18N
        bookLabel.setText(" Manage Books");
        bookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookLabelMouseClicked(evt);
            }
        });
        bookPanel.add(bookLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(bookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 60));

        timelab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        timelab.setForeground(new java.awt.Color(255, 255, 255));
        timelab.setText("Time");
        jPanel2.add(timelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 140, 40));

        date.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 130, 40));

        date1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-calendar-48.png"))); // NOI18N
        jPanel2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 40));

        date2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-time-30.png"))); // NOI18N
        jPanel2.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 700));

        jPanel3.setBackground(new java.awt.Color(233, 246, 250));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1095, 710));

        setSize(new java.awt.Dimension(1360, 764));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void bookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookPanelMouseEntered
        setColor(bookPanel);
    }//GEN-LAST:event_bookPanelMouseEntered

    private void bookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookPanelMouseExited
        resetColor(bookPanel);
    }//GEN-LAST:event_bookPanelMouseExited

    private void studPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseEntered
        setColor(studPanel);
    }//GEN-LAST:event_studPanelMouseEntered

    private void studPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseExited
        resetColor(studPanel);
    }//GEN-LAST:event_studPanelMouseExited

    private void issuedPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedPanelMouseEntered
        setColor(issuedPanel);
    }//GEN-LAST:event_issuedPanelMouseEntered

    private void issuedPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedPanelMouseExited
        resetColor(issuedPanel);
    }//GEN-LAST:event_issuedPanelMouseExited

    private void historyPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseEntered
        setColor(historyPanel);
    }//GEN-LAST:event_historyPanelMouseEntered

    private void historyPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseExited
        resetColor(historyPanel);
    }//GEN-LAST:event_historyPanelMouseExited

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        setColor(dashboard);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        resetColor(dashboard);
    }//GEN-LAST:event_dashboardMouseExited

    private void bookLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookLabelMouseClicked
        new Books().setVisible(true);
    }//GEN-LAST:event_bookLabelMouseClicked

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void studPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseClicked
        new Student().setVisible(true);
    }//GEN-LAST:event_studPanelMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        new Data().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void historyPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseClicked
        new History().setVisible(true);
    }//GEN-LAST:event_historyPanelMouseClicked

    private void bookPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookPanelMouseClicked
      new ManageBook().setVisible(true);
      new Books().setVisible(true);
    }//GEN-LAST:event_bookPanelMouseClicked

    private void issuedPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedPanelMouseClicked
        new ReservedBook().setVisible(true);
    }//GEN-LAST:event_issuedPanelMouseClicked

  
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookLabel;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel history;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel issuedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel studPanel;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables
}
