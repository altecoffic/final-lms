package view;

import services.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;

public final class History extends javax.swing.JFrame {

    public History() {
        initComponents();
        displayStudHistory();
        displayBookHistory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studHistoryTable = new rojerusan.RSTableMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookHistoryTable = new rojerusan.RSTableMetro();
        studSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bookSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 70));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 246, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BOOK");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 350, 80, 45);

        studHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Book Title", "Issued Date", "Returned Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(studHistoryTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(200, 180, 720, 150);

        bookHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Times Borrowed"
            }
        ));
        jScrollPane1.setViewportView(bookHistoryTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 400, 720, 130);

        studSearch.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        studSearch.setText("Search");
        studSearch.setBorder(null);
        studSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studSearchFocusLost(evt);
            }
        });
        studSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studSearchMouseClicked(evt);
            }
        });
        studSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studSearchKeyTyped(evt);
            }
        });
        jPanel1.add(studSearch);
        studSearch.setBounds(680, 140, 200, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 0, 40, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(880, 140, 40, 40);

        bookSearch.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookSearch.setText("Search");
        bookSearch.setBorder(null);
        bookSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookSearchFocusLost(evt);
            }
        });
        bookSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookSearchMouseClicked(evt);
            }
        });
        bookSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bookSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bookSearchKeyTyped(evt);
            }
        });
        jPanel1.add(bookSearch);
        bookSearch.setBounds(690, 360, 190, 40);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jPanel3.add(jLabel3);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(880, 360, 40, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("BORROWED HISTORY");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 40, 420, 45);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("STUDENT ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(460, 130, 130, 45);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studSearchFocusGained
        if (studSearch.getText().equals(" Search")) {
            studSearch.setCaretPosition(0);
        }
    }//GEN-LAST:event_studSearchFocusGained

    private void studSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studSearchFocusLost
        if (studSearch.getText().equals("")) {
            studSearch.setText("Search");
        }
    }//GEN-LAST:event_studSearchFocusLost

    private void studSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studSearchMouseClicked
        if (studSearch.getText().equals("Search")) {
            studSearch.setCaretPosition(0);
        }
    }//GEN-LAST:event_studSearchMouseClicked

    private void studSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studSearchKeyReleased
        if (studSearch.getText().equals("")) {
            studSearch.setText("Search");
            studSearch.setCaretPosition(0);
        }
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) studHistoryTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel>(model);
        studHistoryTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(studSearch.getText().trim()));

    }//GEN-LAST:event_studSearchKeyReleased

    private void studSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studSearchKeyTyped
        if (studSearch.getText().equals("Search")) {
            studSearch.setText("");
        }
    }//GEN-LAST:event_studSearchKeyTyped

    private void studSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studSearchKeyPressed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) studHistoryTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr =  new javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel>(model);
        studHistoryTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(studSearch.getText().trim()));
    }//GEN-LAST:event_studSearchKeyPressed

    private void bookSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookSearchFocusGained
        if (bookSearch.getText().equals(" Search")) {
            bookSearch.setCaretPosition(0);
        }
    }//GEN-LAST:event_bookSearchFocusGained

    private void bookSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookSearchFocusLost
        if (bookSearch.getText().equals("")) {
            bookSearch.setText("Search");
        }
    }//GEN-LAST:event_bookSearchFocusLost

    private void bookSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookSearchMouseClicked
        if (bookSearch.getText().equals("Search")) {
            bookSearch.setCaretPosition(0);
        }
    }//GEN-LAST:event_bookSearchMouseClicked

    private void bookSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyPressed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) bookHistoryTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel>(model);
        bookHistoryTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
    }//GEN-LAST:event_bookSearchKeyPressed

    private void bookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyReleased
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) bookHistoryTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel>(model);
        bookHistoryTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
    }//GEN-LAST:event_bookSearchKeyReleased

    private void bookSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyTyped
        if (bookSearch.getText().equals("Search")) {
            bookSearch.setText("");
        }
    }//GEN-LAST:event_bookSearchKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }


    
    public void displayStudHistory() {
        DefaultTableModel dm = (DefaultTableModel) studHistoryTable.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "SELECT student.firstName, student.lastName, books.title, issuebook.issueDate, issuebook.dueDate FROM issuebook INNER JOIN student ON issuebook.studentID = student.studentID INNER JOIN books ON issuebook.bookID = books.bookID";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dm.addRow(new Object[]{rs.getString("firstName") + " " + rs.getString("lastName"), rs.getString("title"), rs.getString("issueDate"), rs.getString("dueDate")});
            }

//            historyList.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException err) {
//            System.out.println(e);
              JOptionPane.showMessageDialog(null, err);
        }
    }

    public void displayBookHistory() {
        DefaultTableModel dm = (DefaultTableModel) bookHistoryTable.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            String sql = "SELECT books.title, books.timesBorrowed FROM books INNER JOIN issuebook ON books.bookID = issuebook.bookID GROUP BY books.title";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                dm.addRow(new Object[]{rs.getString("title"), rs.getString("timesBorrowed")});
            }

        } catch (SQLException err) {
              JOptionPane.showMessageDialog(null,err);
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro bookHistoryTable;
    private javax.swing.JTextField bookSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private rojerusan.RSTableMetro studHistoryTable;
    private javax.swing.JTextField studSearch;
    // End of variables declaration//GEN-END:variables
}
