
package view;

import java.awt.Color;
import javax.swing.JPanel;

public class ManageBook extends javax.swing.JFrame {

    
    public ManageBook() {
        initComponents();
    }

      public void setColor(JPanel book) {
        book.setBackground(new Color(72, 91, 99));
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookID = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bookTab = new javax.swing.JPanel();
        bookID5 = new javax.swing.JLabel();
        categoryTab = new javax.swing.JPanel();
        bookID2 = new javax.swing.JLabel();
        borrowTab = new javax.swing.JPanel();
        bookID3 = new javax.swing.JLabel();
        reservedBook = new javax.swing.JPanel();
        bookID4 = new javax.swing.JLabel();

        bookID.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID.setText("Book ID     :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 70));
        setMinimumSize(new java.awt.Dimension(1095, 710));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 40));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookTab.setBackground(new java.awt.Color(149, 178, 213));
        bookTab.setMaximumSize(new java.awt.Dimension(1090, 40));
        bookTab.setMinimumSize(new java.awt.Dimension(1090, 40));
        bookTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookTabMouseExited(evt);
            }
        });
        bookTab.setLayout(null);

        bookID5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID5.setForeground(new java.awt.Color(255, 255, 255));
        bookID5.setText("Manage Books");
        bookTab.add(bookID5);
        bookID5.setBounds(70, 10, 130, 25);

        jPanel1.add(bookTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 273, 40));

        categoryTab.setBackground(new java.awt.Color(104, 145, 195));
        categoryTab.setMaximumSize(new java.awt.Dimension(1090, 40));
        categoryTab.setMinimumSize(new java.awt.Dimension(1090, 40));
        categoryTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryTabMouseExited(evt);
            }
        });
        categoryTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookID2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID2.setForeground(new java.awt.Color(255, 255, 255));
        bookID2.setText("Manage Book Category");
        categoryTab.add(bookID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, -1));

        jPanel1.add(categoryTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 273, 40));

        borrowTab.setBackground(new java.awt.Color(42, 58, 78));
        borrowTab.setMaximumSize(new java.awt.Dimension(1090, 40));
        borrowTab.setMinimumSize(new java.awt.Dimension(1090, 40));
        borrowTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowTabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowTabMouseExited(evt);
            }
        });
        borrowTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookID3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID3.setForeground(new java.awt.Color(255, 255, 255));
        bookID3.setText("Manage Borrowed Books");
        borrowTab.add(bookID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, -1));

        jPanel1.add(borrowTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 273, 40));

        reservedBook.setBackground(new java.awt.Color(21, 29, 39));
        reservedBook.setMaximumSize(new java.awt.Dimension(1090, 40));
        reservedBook.setMinimumSize(new java.awt.Dimension(1090, 40));
        reservedBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservedBookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservedBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservedBookMouseExited(evt);
            }
        });
        reservedBook.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookID4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID4.setForeground(new java.awt.Color(255, 255, 255));
        bookID4.setText("Manage Reserved Book");
        reservedBook.add(bookID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 210, -1));

        jPanel1.add(reservedBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 273, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTabMouseClicked
      new Books().setVisible(true);
    }//GEN-LAST:event_bookTabMouseClicked

    private void categoryTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTabMouseClicked
       new Category().setVisible(true);
    }//GEN-LAST:event_categoryTabMouseClicked

    private void borrowTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTabMouseClicked
      new ReturnBook().setVisible(true);
    }//GEN-LAST:event_borrowTabMouseClicked

    private void bookTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTabMouseEntered
     setColor(bookTab);
    }//GEN-LAST:event_bookTabMouseEntered

    private void bookTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTabMouseExited
        bookTab.setBackground(new Color(149,178,213));
    }//GEN-LAST:event_bookTabMouseExited

    private void categoryTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTabMouseEntered
         setColor(categoryTab);
    }//GEN-LAST:event_categoryTabMouseEntered

    private void categoryTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTabMouseExited
         categoryTab.setBackground(new Color(104,145,195));
    }//GEN-LAST:event_categoryTabMouseExited

    private void borrowTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTabMouseEntered
     setColor(borrowTab);
    }//GEN-LAST:event_borrowTabMouseEntered

    private void borrowTabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTabMouseExited
          borrowTab.setBackground(new Color(42,58,78));
    }//GEN-LAST:event_borrowTabMouseExited

    private void reservedBookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservedBookMouseEntered
        setColor(reservedBook);
    }//GEN-LAST:event_reservedBookMouseEntered

    private void reservedBookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservedBookMouseExited
         reservedBook.setBackground(new Color(21,29,39));
    }//GEN-LAST:event_reservedBookMouseExited

    private void reservedBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservedBookMouseClicked
      new ReservedBook().setVisible(true);
    }//GEN-LAST:event_reservedBookMouseClicked

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookID;
    private javax.swing.JLabel bookID2;
    private javax.swing.JLabel bookID3;
    private javax.swing.JLabel bookID4;
    private javax.swing.JLabel bookID5;
    private javax.swing.JPanel bookTab;
    private javax.swing.JPanel borrowTab;
    private javax.swing.JPanel categoryTab;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel reservedBook;
    // End of variables declaration//GEN-END:variables
}
