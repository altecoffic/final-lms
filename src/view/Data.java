package view;


import services.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public final class Data extends javax.swing.JFrame {

    Connection con = ConnectionProvider.getCon();
    Statement stmt;

    public Data() {
        initComponents();

        bookCount();
        studentCount();
        categoryCount();
        issueBookCount();
        returnedBookCount();
        fetch_data();


    }

    //to get the data from the database and display on the table
    public void fetch_data() {
        try {
            stmt = con.createStatement();
            ResultSet resSet2 = stmt.executeQuery("select issuebook.studentID,student.firstName,student.lastName,issuebook.bookID,books.title,issuebook.issueDate,issuebook.dueDate from student inner join books inner join issuebook where books.bookID = issuebook.bookID and student.studentID = issuebook.studentID and issuebook.returnBook = 'YES'");
            returnForm.setModel(DbUtils.resultSetToTableModel(resSet2));
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection error");
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        studentCount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        issueBookCount = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bookCount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        returnedBookCount = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        categoryCount = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnForm = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 70));
        setMinimumSize(new java.awt.Dimension(1095, 710));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(233, 246, 250));
        jPanel3.setMaximumSize(new java.awt.Dimension(1090, 710));
        jPanel3.setMinimumSize(new java.awt.Dimension(1090, 710));
        jPanel3.setPreferredSize(new java.awt.Dimension(1095, 710));
        jPanel3.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(144, 208, 230));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 91, 32);

        studentCount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 40)); // NOI18N
        studentCount.setForeground(new java.awt.Color(204, 255, 255));
        studentCount.setText("jLabel2");
        jPanel2.add(studentCount);
        studentCount.setBounds(70, 50, 80, 40);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(270, 90, 160, 100);

        jPanel4.setBackground(new java.awt.Color(130, 187, 207));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Issue Book");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(30, 10, 106, 30);

        issueBookCount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 40)); // NOI18N
        issueBookCount.setForeground(new java.awt.Color(204, 255, 255));
        issueBookCount.setText("jLabel2");
        jPanel4.add(issueBookCount);
        issueBookCount.setBounds(70, 50, 90, 40);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(460, 90, 170, 100);

        jPanel5.setBackground(new java.awt.Color(182, 223, 221));
        jPanel5.setLayout(null);

        bookCount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 40)); // NOI18N
        bookCount.setForeground(new java.awt.Color(204, 255, 255));
        bookCount.setText("jLabel2");
        jPanel5.add(bookCount);
        bookCount.setBounds(60, 50, 80, 40);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Books");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(40, 10, 60, 30);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(90, 90, 160, 100);

        jPanel6.setBackground(new java.awt.Color(86, 125, 138));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Returned Book");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 10, 145, 32);

        returnedBookCount.setBackground(new java.awt.Color(204, 255, 255));
        returnedBookCount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 40)); // NOI18N
        returnedBookCount.setForeground(new java.awt.Color(204, 255, 255));
        returnedBookCount.setText("jLabel2");
        jPanel6.add(returnedBookCount);
        returnedBookCount.setBounds(70, 50, 90, 40);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(830, 90, 170, 100);

        jPanel7.setBackground(new java.awt.Color(138, 176, 189));
        jPanel7.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category");
        jPanel7.add(jLabel6);
        jLabel6.setBounds(21, 11, 90, 30);

        categoryCount.setBackground(new java.awt.Color(204, 255, 255));
        categoryCount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 40)); // NOI18N
        categoryCount.setForeground(new java.awt.Color(204, 255, 255));
        categoryCount.setText("jLabel2");
        jPanel7.add(categoryCount);
        categoryCount.setBounds(60, 50, 90, 40);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(650, 90, 160, 100);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel8);
        jPanel8.setBounds(90, 70, 160, 20);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel9);
        jPanel9.setBounds(270, 70, 160, 20);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel10);
        jPanel10.setBounds(460, 70, 170, 20);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel11);
        jPanel11.setBounds(650, 70, 160, 20);

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel12);
        jPanel12.setBounds(830, 70, 170, 20);

        returnForm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Book ID", "Title", "Issue Date", "Return Date"
            }
        ));
        returnForm.setColorBackgoundHead(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(returnForm);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(70, 450, 930, 130);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("RETURNED BOOKS");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(460, 290, 240, 20);

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.add(jPanel14);
        jPanel14.setBounds(420, 290, 20, 20);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bookCount() {
        int count = 0;
        try {
            stmt = con.createStatement();
            String sql = "select * from books";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count++;
            }
            bookCount.setText(String.valueOf(count));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void studentCount() {
        int count = 0;
        try {
            stmt = con.createStatement();
            String sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count++;
            }
            studentCount.setText(String.valueOf(count));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void issueBookCount() {
        int count = 0;
        try {
            stmt = con.createStatement();
            String sql = "select * from issueBook";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count++;
            }
            issueBookCount.setText(String.valueOf(count));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void categoryCount() {
        int count = 0;
        try {
            stmt = con.createStatement();
            String sql = "select * from category";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count++;
            }
            categoryCount.setText(String.valueOf(count));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void returnedBookCount() {
        int count = 0;
        try {
            stmt = con.createStatement();
            String sql = "select * from issueBook where returnBook='YES'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                count++;
            }
            returnedBookCount.setText(String.valueOf(count));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Data().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookCount;
    private javax.swing.JLabel categoryCount;
    private javax.swing.JLabel issueBookCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSTableMetro returnForm;
    private javax.swing.JLabel returnedBookCount;
    private javax.swing.JLabel studentCount;
    // End of variables declaration//GEN-END:variables
}
