package view;

import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;

import models.BookModel.Constants;
import net.proteanit.sql.DbUtils;
import services.ConnectionProvider;


public class ReturnBook extends javax.swing.JFrame {

    private Connection con = ConnectionProvider.getCon();
    private Statement stmt = null;
    private ResultSet rs = null;
    boolean isReturnClick = false;
    public int issueID;

    public ReturnBook() {
        initComponents();
        fetchIssue();
        dateToday();
        dueDate();
        finesField.setVisible(false);
        finesText.setVisible(false);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        bookSearch = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        issueForm = new rojerusan.RSTableMetro();
        jPanel15 = new javax.swing.JPanel();
        studentID = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        bookIDField = new javax.swing.JTextField();
        issueDateField = new com.toedter.calendar.JDateChooser();
        issueDate = new javax.swing.JLabel();
        dueDate1 = new javax.swing.JLabel();
        dueDateField = new com.toedter.calendar.JDateChooser();
        finesField = new javax.swing.JTextField();
        finesText = new javax.swing.JLabel();
        returnBtn = new javax.swing.JButton();
        issueBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        bookID = new javax.swing.JLabel();
        bookID1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 110));
        setMinimumSize(new java.awt.Dimension(1090, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(233, 246, 250));
        jPanel13.setMaximumSize(new java.awt.Dimension(1090, 680));
        jPanel13.setMinimumSize(new java.awt.Dimension(1090, 680));
        jPanel13.setPreferredSize(new java.awt.Dimension(1090, 680));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel13.add(bookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 160, 30));

        jPanel14.setBackground(new java.awt.Color(0, 204, 204));
        jPanel14.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jPanel14.add(jLabel7);
        jLabel7.setBounds(0, 0, 30, 30);

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 30, 30));

        issueForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Student ID", "First Name", "Last Name", "Book ID", "Title", "Issue Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issueForm.setColorBackgoundHead(new java.awt.Color(0, 153, 153));
        issueForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issueFormMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(issueForm);

        jPanel13.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 840, 100));

        jPanel15.setBackground(new java.awt.Color(161, 202, 217));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentID.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        studentID.setText("Student ID:");
        jPanel15.add(studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        studentIDField.setBackground(new java.awt.Color(204, 255, 255));
        studentIDField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentIDField.setBorder(null);
        jPanel15.add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 280, 30));

        bookIDField.setBackground(new java.awt.Color(204, 255, 255));
        bookIDField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bookIDField.setBorder(null);
        jPanel15.add(bookIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, 30));

        issueDateField.setBackground(new java.awt.Color(204, 255, 255));
        jPanel15.add(issueDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 280, 30));

        issueDate.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        issueDate.setText("Issue Date:");
        jPanel15.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));

        dueDate1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        dueDate1.setText("Due Date  :");
        jPanel15.add(dueDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        dueDateField.setBackground(new java.awt.Color(204, 255, 255));
        jPanel15.add(dueDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 280, 30));

        finesField.setBackground(new java.awt.Color(204, 255, 255));
        finesField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        finesField.setBorder(null);
        jPanel15.add(finesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 280, 30));

        finesText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        finesText.setText("Fines        :");
        jPanel15.add(finesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, -1));

        returnBtn.setBackground(new java.awt.Color(0, 204, 204));
        returnBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return book png.png"))); // NOI18N
        returnBtn.setText("Return");
        returnBtn.setBorder(null);
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel15.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        issueBtn.setBackground(new java.awt.Color(0, 153, 153));
        issueBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        issueBtn.setForeground(new java.awt.Color(255, 255, 255));
        issueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue book.png"))); // NOI18N
        issueBtn.setText("Issue");
        issueBtn.setBorder(null);
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        jPanel15.add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 30));

        cancel.setBackground(new java.awt.Color(0, 204, 204));
        cancel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 17)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel15.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 30));

        jPanel16.setBackground(new java.awt.Color(59, 100, 115));
        jPanel16.setLayout(null);

        bookID.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        bookID.setForeground(new java.awt.Color(255, 255, 255));
        bookID.setText("RETURN BOOK / ISSUE A BOOK");
        jPanel16.add(bookID);
        bookID.setBounds(80, 20, 380, 25);

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 60));

        bookID1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID1.setText("Book ID     :");
        jPanel15.add(bookID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 470, 410));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookSearchFocusGained
        if (bookSearch.getText().equals("Search")) {
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
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) issueForm.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
        issueForm.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
        getData(bookSearch);
    }//GEN-LAST:event_bookSearchKeyPressed

    private void bookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyReleased
        if (bookSearch.getText().equals("")) {
            bookSearch.setText("Search");
            bookSearch.setCaretPosition(0);
        }

        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) issueForm.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
        issueForm.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
        getData(bookSearch);
    }//GEN-LAST:event_bookSearchKeyReleased

    private void bookSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyTyped
        if (bookSearch.getText().equals("Search")) {
            bookSearch.setText("");
        }
        getData(bookSearch);
    }//GEN-LAST:event_bookSearchKeyTyped

    private void issueFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issueFormMouseClicked
        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        issueID = parseInt(issueForm.getModel().getValueAt(row, 0).toString());
        String duedate = issueForm.getModel().getValueAt(row, 7).toString();
        isReturnClick = true;
        issueBtn.setVisible(false);
        cancel.setVisible(true);
        fetchIssueBook(issueID);

    }//GEN-LAST:event_issueFormMouseClicked

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed

        if (isReturnClick) {
            returnBook();
        } else {
            JOptionPane.showMessageDialog(null, "Please select borrowed books");
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        try {
             con = ConnectionProvider.getCon();
                stmt = con.createStatement();
                String sql = String.format("SELECT COUNT(*) FROM issuebook WHERE bookID =%d AND studentID =%d ",Integer.parseInt(bookIDField.getText()),Integer.parseInt(studentIDField.getText()));
                ResultSet rs = stmt.executeQuery(sql);
                rs.next();
                int timesBorrowed = rs.getInt("COUNT(*)");
                if(timesBorrowed == Constants.MAX_BOOKS_ISSUED_TO_A_USER){
                    JOptionPane.showMessageDialog(null, "You have already exceeded the maximum number of borrowed books");
                }else{
                     issueBook();
                }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Connection error");
        }
       
    }//GEN-LAST:event_issueBtnActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        isReturnClick = false;
        issueBtn.setVisible(true);
        cancel.setVisible(false);
        fetchIssue();
        resetField();
    }//GEN-LAST:event_cancelMouseClicked

    private void getData(JTextField text) {
        if (text.getText().equals("Search")) {
            this.fetchIssue();
            System.out.println("Search");
        }
    }

    private void fetchIssue() {

        try {
            stmt = con.createStatement();
            ResultSet resSet = stmt.executeQuery("select issuebook.issueBookID,issuebook.studentID,student.firstName,student.lastName,issuebook.bookID,books.title,issuebook.issueDate,issuebook.dueDate from student inner join books inner join issuebook where books.bookID = issuebook.bookID and student.studentID = issuebook.studentID and issuebook.returnBook = 'NO'");

            issueForm.setModel(DbUtils.resultSetToTableModel(resSet));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
//    //to get the data from the database and display on the table
//    public void fetch_data() {
//        try {
//            stmt = con.createStatement();
//            ResultSet resSet2 = stmt.executeQuery("select issuebook.studentID,student.firstName,student.lastName,issuebook.bookID,books.title,issuebook.issueDate,issuebook.dueDate from student inner join books inner join issuebook where books.bookID = issuebook.bookID and student.studentID = issuebook.studentID and issuebook.returnBook = 'YES'");
//            returnForm.setModel(DbUtils.resultSetToTableModel(resSet2));
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Connection error");
//        }
//    }

    private void fetchIssueBook(int id) {
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from issuebook where issueBookID='" + id + "'");
            while (rs.next()) {
                bookIDField.setText(String.valueOf(rs.getInt(2)));
                studentIDField.setText(String.valueOf(rs.getInt(3)));
                issueDateField.setDate(rs.getDate(4));
                dueDateField.setDate(rs.getDate(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        LocalDateTime issueDate = LocalDateTime.now();
        LocalDateTime dueDate = LocalDateTime.ofInstant(dueDateField.getDate().toInstant(), ZoneId.systemDefault());

        Duration d = Duration.between(dueDate, issueDate);
        long difference = d.toDays();
        if (difference > 0) {
            finesField.setText(String.format("%d", difference * 50));
            String sql = "INSERT INTO fees (student_id, book_id, no_of_days, total) VALUES ('" + bookIDField.getText() + "', '" + studentIDField.getText() + "', '" + difference + "', '" + finesField.getText() + "')";
        } else {
            finesField.setText("0");
        }
    }

    private void issueBook() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dob = "" + dueDateField.getDate();
        String due = dateFormat.format(dueDateField.getDate());
         String returnBook = "NO";
//        BookStatus returnBook = BookStatus.LOANED;

        int a = JOptionPane.showConfirmDialog(null, "Do you want to issue this book?", "Message", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                con = ConnectionProvider.getCon();
                stmt = con.createStatement();
                ResultSet resSet = stmt.executeQuery("select * from books where bookID='" + bookIDField.getText() + "'");
                if (resSet.next()) {
                    int newNumCopies = resSet.getInt(6) - 1;
                    String updateCopy = "update books set noOfCopies='" + newNumCopies + "' where bookID='" + bookIDField.getText() + "'";
                    stmt.executeUpdate(updateCopy);
                    ResultSet resSet1 = stmt.executeQuery("select * from student where studentID='" + studentIDField.getText() + "'");
                    if (resSet1.next()) {
                        stmt.executeUpdate("INSERT INTO issuebook (bookID ,studentID,dueDate,returnBook) VALUES ('" + bookIDField.getText() + "','" + studentIDField.getText() + "', '" + due + "', '" + returnBook + "')");
                        JOptionPane.showMessageDialog(null, "Book Succesfully Issued!");

                        resetField();
                        fetchIssue();
                        dateToday();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Student ID!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Book ID!");
                }
            } catch (HeadlessException | SQLException e) {

                JOptionPane.showMessageDialog(null, "Connection Error!" + e);
            }
        }
    }

    private void returnBook() {
        int timesBorrowed = 0;
        int numOfCopy = 0;
        int a = JOptionPane.showConfirmDialog(null, "Do you want to issue this book?", "Message", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {
                con = ConnectionProvider.getCon();
                stmt = con.createStatement();
                String sql = String.format("SELECT noOfCopies, timesBorrowed FROM books WHERE bookID=%d", Integer.parseInt(bookIDField.getText()));

                ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    timesBorrowed = rs.getInt("timesBorrowed");
                    numOfCopy = rs.getInt("noOfCopies");
                }
                sql = String.format("UPDATE books SET noOfCopies=%d, timesBorrowed=%d WHERE bookID=%d", ++numOfCopy, ++timesBorrowed, Integer.parseInt(bookIDField.getText()));
                stmt.executeUpdate(sql);
                // stmt.executeUpdate("UPDATE issuebook SET returnBook='YES' WHERE issueBookID='" + issueID + "'");
                stmt.executeUpdate("UPDATE issuebook SET returnBook='AVAILABLE' WHERE issueBookID='" + issueID + "'");
                System.out.println(issueID);
                JOptionPane.showMessageDialog(null, "Book successfully returned!");
                resetField();
                fetchIssue();
                dateToday();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }

    private void dateToday() {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        issueDateField.setDate(date);
        issueDateField.setEnabled(false);
    }

    private void dueDate() {
        try {
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date.toString()));
            c.add(Calendar.DATE, Constants.MAX_LENDING_DAYS);
            String dueDate = sdf.format(c.getTime());
            dueDateField.setDate(Date.valueOf(dueDate));
            dueDateField.setEnabled(false);
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }

    }

    private void resetField() {
        bookIDField.setText("");
        studentIDField.setText("");
        finesField.setText("");
        dateToday();
        dueDate();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookID;
    private javax.swing.JLabel bookID1;
    private javax.swing.JTextField bookIDField;
    private javax.swing.JTextField bookSearch;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dueDate1;
    private com.toedter.calendar.JDateChooser dueDateField;
    private javax.swing.JTextField finesField;
    private javax.swing.JLabel finesText;
    private javax.swing.JButton issueBtn;
    private javax.swing.JLabel issueDate;
    private com.toedter.calendar.JDateChooser issueDateField;
    private rojerusan.RSTableMetro issueForm;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel studentID;
    private javax.swing.JTextField studentIDField;
    // End of variables declaration//GEN-END:variables
}
