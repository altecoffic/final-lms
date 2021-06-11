package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BookModel;
import services.ConnectionProvider;

public class ReservedBook extends javax.swing.JFrame {

    private List<BookModel> books = new ArrayList<>();
    private DefaultTableModel model;
    
    Connection con;
    Statement stmt;
    ResultSet rs;

    public ReservedBook() {
        initComponents();
        fetchData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reserveBtn = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        isbnField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reserveTable = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 110));
        setMinimumSize(new java.awt.Dimension(1095, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 246, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1095, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(1095, 680));
        jPanel1.setLayout(null);

        reserveBtn.setBackground(new java.awt.Color(0, 102, 102));
        reserveBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        reserveBtn.setForeground(new java.awt.Color(0, 51, 51));
        reserveBtn.setText("Reserve Now");
        reserveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        reserveBtn.setContentAreaFilled(false);
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(reserveBtn);
        reserveBtn.setBounds(840, 350, 120, 40);

        name.setBackground(new java.awt.Color(233, 246, 250));
        name.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        name.setText("Student Name");
        name.setBorder(null);
        name.setCaretPosition(0);
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(730, 230, 220, 30);

        isbnField.setBackground(new java.awt.Color(233, 246, 250));
        isbnField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        isbnField.setText("Book ISBN");
        isbnField.setBorder(null);
        isbnField.setCaretPosition(0);
        isbnField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isbnFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                isbnFieldFocusLost(evt);
            }
        });
        isbnField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                isbnFieldMouseClicked(evt);
            }
        });
        isbnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnFieldActionPerformed(evt);
            }
        });
        isbnField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isbnFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                isbnFieldKeyTyped(evt);
            }
        });
        jPanel1.add(isbnField);
        isbnField.setBounds(730, 290, 220, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(730, 260, 230, 2);

        jPanel3.setBackground(new java.awt.Color(0, 204, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(730, 330, 230, 2);

        jPanel4.setBackground(new java.awt.Color(233, 246, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reserved A Book");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(690, 120, 310, 310);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6);
        jPanel6.setBounds(680, 110, 330, 330);

        reserveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "ISBN", "Category", "Title", "Author", "Num Of Copies", "Publisher", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reserveTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 630, 130);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public final void fetchData() {

        model = (DefaultTableModel) reserveTable.getModel();

        try {
            con = ConnectionProvider.getCon();
            stmt = con.createStatement();
            String sql = "select * from books";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                BookModel book = new BookModel();
                book.setBookID(rs.getInt(1));
                book.setIsbn(rs.getString(2));
                book.setBookCategory(rs.getString(3));
                book.setTitle(rs.getString(4));
                book.setAuthor(rs.getString(5));
                book.setNoOfCopies(rs.getInt(6));
                book.setPublisher(rs.getString(7));
                book.setPrice(rs.getFloat(8));
//                book.setTimesBorrowed(rs.getInt(9));
                this.books.add(book);
            }

            this.populateTable(books);
            stmt.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);

        }
    }

    public void populateTable(List<BookModel> books) {
        this.model = new DefaultTableModel();
        this.model.setColumnIdentifiers(new Object[]{"Book ID", "ISBN", "Category", "Title", "Author", "No of Copies", "Publisher", "Price"});

        for (BookModel book : books) {
            Object rowdata[] = new Object[9];
            rowdata[0] = book.getBookID();
            rowdata[1] = book.getIsbn();
            rowdata[2] = book.getBookCategory();
            rowdata[3] = book.getTitle();
            rowdata[4] = book.getAuthor();
            rowdata[5] = book.getNoOfCopies();
            rowdata[6] = book.getPublisher();
            rowdata[7] = book.getPrice();
//            rowdata[8] = book.getTimesBorrowed();

            this.model.addRow(rowdata);
        }
        this.reserveTable.setModel(model);

    }


    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        String bookID = name.getText();
        String isbn = isbnField.getText();

        String status = "reserved";

        try {
            con = ConnectionProvider.getCon();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO reserve VALUES(" + bookID + "," + isbn + "," + status + ")");

            JOptionPane.showMessageDialog(null, "Successfully Reserved!");
            setVisible(false);
            new Books().setVisible(true);

        } catch (Exception err) {
            // JOptionPane.showMessageDialog(null, "Book Already Reserved!");
            JOptionPane.showMessageDialog(null, "Book Already Reserved!", "failed", JOptionPane.ERROR_MESSAGE);
            setVisible(false);
            new Books().setVisible(true);
        } finally {
            try {
                con.close();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, err);
            }
        }
    }//GEN-LAST:event_reserveBtnActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if (name.getText().equals("Student Name")) {
            name.setCaretPosition(0);
        }
    }//GEN-LAST:event_nameFocusGained

    private void isbnFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFieldFocusLost
        if (isbnField.getText().equals("")) {
            isbnField.setText("Book ISBN");
        }
    }//GEN-LAST:event_isbnFieldFocusLost

    private void isbnFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFieldFocusGained
        if (isbnField.getText().equals("Book ISBN")) {
            isbnField.setCaretPosition(0);
        }
    }//GEN-LAST:event_isbnFieldFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (name.getText().equals("")) {
            name.setText("Student Name");
        }
    }//GEN-LAST:event_nameFocusLost

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        if (name.getText().equals("Student Name")) {
            name.setText("");
        }
    }//GEN-LAST:event_nameKeyTyped

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        if (name.getText().equals("")) {

            name.setText("Student Name");
            name.setCaretPosition(0);
        }
    }//GEN-LAST:event_nameKeyReleased

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        if (name.getText().equals("Student Name")) {
            name.setCaretPosition(0);
        }
    }//GEN-LAST:event_nameMouseClicked

    private void isbnFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isbnFieldKeyTyped
        if (isbnField.getText().equals("Book ISBN")) {
            isbnField.setText("");
        }
    }//GEN-LAST:event_isbnFieldKeyTyped

    private void isbnFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isbnFieldKeyReleased
        if (isbnField.getText().equals("")) {

            isbnField.setText("Book ISBN");
            isbnField.setCaretPosition(0);
        }
    }//GEN-LAST:event_isbnFieldKeyReleased

    private void isbnFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_isbnFieldMouseClicked
        if (isbnField.getText().equals("Book ISBN")) {
            isbnField.setCaretPosition(0);
        }
    }//GEN-LAST:event_isbnFieldMouseClicked

    private void isbnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservedBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JButton reserveBtn;
    private rojerusan.RSTableMetro reserveTable;
    // End of variables declaration//GEN-END:variables
}
