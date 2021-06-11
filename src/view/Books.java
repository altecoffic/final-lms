package view;

import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import models.BookModel;
import services.ConnectionProvider;

public final class Books extends javax.swing.JFrame {

    private List<BookModel> books = new ArrayList<>();
    private DefaultTableModel model;

    //constructor
    public Books() {
        initComponents();
        fetch_data();
        categoryList();
        idField.setVisible(false);
        idText.setVisible(false);
    }

    //to get the data from the database and display on the table
    public void fetch_data() {

        model = (DefaultTableModel) bookListTable.getModel();
        ResultSet rs;
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "select * from books";
            rs = stmt.executeQuery(sql);
//           bookListTable.setModel(DbUtils.resultSetToTableModel(rs));
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
                book.setTimesBorrowed(rs.getInt(9));
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
        this.model.setColumnIdentifiers(new Object[]{"Book ID", "ISBN", "Category", "Title", "Author", "No of Copies", "Publisher", "Price", "TimesBorrowed"});

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
            rowdata[8] = book.getTimesBorrowed();

            this.model.addRow(rowdata);
        }
        this.bookListTable.setModel(model);

    }

    private void categoryList() {

        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "select * from category";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                categoryBox.addItem(rs.getString(2));
                categoryCombo.addItem(rs.getString(2));
            }
            stmt.close();
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookListTable = new rojerusan.RSTableMetro();
        categoryCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bookIDNewBook = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        isbnField = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox<>();
        titleField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        copiesField = new javax.swing.JTextField();
        publisherField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        idText = new javax.swing.JLabel();
        isbnText1 = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();
        publisherText = new javax.swing.JLabel();
        copyText = new javax.swing.JLabel();
        authorText = new javax.swing.JLabel();
        bookTitle = new javax.swing.JLabel();
        categoryText = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        bookSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 110));
        setMinimumSize(new java.awt.Dimension(1095, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 246, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "ISBN", "Category", "Title ", "Author", "No. of Copies", "Publisher", "Price", "Times Borrowed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookListTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 990, 90));

        categoryCombo.setBackground(new java.awt.Color(153, 153, 255));
        categoryCombo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all" }));
        categoryCombo.setBorder(null);
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });
        jPanel1.add(categoryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 100, 30));

        jPanel3.setBackground(new java.awt.Color(195, 211, 231));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(83, 116, 156));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookIDNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        bookIDNewBook.setForeground(new java.awt.Color(255, 255, 255));
        bookIDNewBook.setText("MANAGE BOOKS");
        jPanel4.add(bookIDNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 190, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 60));

        idField.setBackground(new java.awt.Color(244, 243, 234));
        idField.setBorder(null);
        jPanel3.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 200, 30));

        isbnField.setBackground(new java.awt.Color(244, 243, 234));
        isbnField.setBorder(null);
        jPanel3.add(isbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 200, 30));

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select category" }));
        categoryBox.setBorder(null);
        jPanel3.add(categoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, 30));

        titleField.setBackground(new java.awt.Color(244, 243, 234));
        titleField.setBorder(null);
        jPanel3.add(titleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 30));

        authorField.setBackground(new java.awt.Color(244, 243, 234));
        authorField.setBorder(null);
        jPanel3.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 200, 30));

        copiesField.setBackground(new java.awt.Color(244, 243, 234));
        copiesField.setBorder(null);
        jPanel3.add(copiesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 30));

        publisherField.setBackground(new java.awt.Color(244, 243, 234));
        publisherField.setBorder(null);
        jPanel3.add(publisherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 200, 30));

        priceField.setBackground(new java.awt.Color(244, 243, 234));
        priceField.setBorder(null);
        jPanel3.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 200, 30));

        idText.setBackground(new java.awt.Color(255, 255, 255));
        idText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        idText.setForeground(new java.awt.Color(0, 51, 51));
        idText.setText("ID                :");
        jPanel3.add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        isbnText1.setBackground(new java.awt.Color(255, 255, 255));
        isbnText1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        isbnText1.setForeground(new java.awt.Color(0, 51, 51));
        isbnText1.setText("ISBN            :");
        jPanel3.add(isbnText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        priceText.setBackground(new java.awt.Color(255, 255, 255));
        priceText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        priceText.setForeground(new java.awt.Color(0, 51, 51));
        priceText.setText("Price            :");
        jPanel3.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, -1));

        publisherText.setBackground(new java.awt.Color(255, 255, 255));
        publisherText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        publisherText.setForeground(new java.awt.Color(0, 51, 51));
        publisherText.setText("Publisher      :");
        jPanel3.add(publisherText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, 40));

        copyText.setBackground(new java.awt.Color(255, 255, 255));
        copyText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        copyText.setForeground(new java.awt.Color(0, 51, 51));
        copyText.setText("No. of Copies:");
        jPanel3.add(copyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, -1));

        authorText.setBackground(new java.awt.Color(255, 255, 255));
        authorText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        authorText.setForeground(new java.awt.Color(0, 51, 51));
        authorText.setText("Author         :");
        jPanel3.add(authorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 30));

        bookTitle.setBackground(new java.awt.Color(255, 255, 255));
        bookTitle.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookTitle.setForeground(new java.awt.Color(0, 51, 51));
        bookTitle.setText("Book Title     :");
        jPanel3.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 30));

        categoryText.setBackground(new java.awt.Color(255, 255, 255));
        categoryText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        categoryText.setForeground(new java.awt.Color(0, 51, 51));
        categoryText.setText("Category      :");
        jPanel3.add(categoryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 30));

        deleteBtn.setBackground(new java.awt.Color(215, 23, 41));
        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(0, 51, 51));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 23, 41), 2));
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtnMouseClicked(evt);
            }
        });
        jPanel3.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 110, -1));

        updateBtn.setBackground(new java.awt.Color(117, 199, 234));
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(0, 51, 51));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Exit_26px.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 199, 234), 2));
        updateBtn.setContentAreaFilled(false);
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        jPanel3.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 120, 30));

        addBtn.setBackground(new java.awt.Color(104, 209, 197));
        addBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 51, 51));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 209, 197), 2));
        addBtn.setContentAreaFilled(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel3.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 120, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 480, 460));

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
        jPanel1.add(bookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 160, 30));

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed

        // Filter books by category.
        String selectedCategory = this.categoryCombo.getSelectedItem().toString();

        List<BookModel> filterCategory;
        if (!selectedCategory.equals("all")) {
            filterCategory = this.books.stream()
                    .filter(product -> this.categoryCombo
                    .getSelectedItem()
                    .equals(product.getBookCategory()))
                    .collect(Collectors.toList());
        } else {
            filterCategory = this.books;
        }

        this.populateTable(filterCategory);
    }//GEN-LAST:event_categoryComboActionPerformed

    //fr adding of books
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            int numBorrow = 0;
            stmt.executeUpdate("insert into books (isbn, bookCategory,title,author,noOfCopies,publisher,price,timesBorrowed) values('" + isbnField.getText() + "','" + categoryBox.getSelectedItem() + "','" + titleField.getText() + "','" + authorField.getText() + "','" + copiesField.getText() + "','" + publisherField.getText() + "','" + priceField.getText() + "','" + numBorrow + "')");
            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, err);
        }


    }//GEN-LAST:event_addBtnActionPerformed

    //book list Table when clicked execute the ff.
    private void bookListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListTableMouseClicked

        addBtn.setVisible(false);
        int bookID;
        String isbn;
        String bookCategory;
        String title;
        String author;
        int noOfCopies;
        String publisher;
        double price;

        int row = bookListTable.getSelectedRow();
        bookID = (int) (bookListTable.getModel().getValueAt(row, 0));
        isbn = (bookListTable.getModel().getValueAt(row, 1).toString());
        bookCategory = (bookListTable.getModel().getValueAt(row, 2).toString());
        title = (bookListTable.getModel().getValueAt(row, 3).toString());
        author = (bookListTable.getModel().getValueAt(row, 4).toString());
        noOfCopies = Integer.parseInt((bookListTable.getModel().getValueAt(row, 5).toString()));
        publisher = (bookListTable.getModel().getValueAt(row, 6).toString());
        price = Double.parseDouble((bookListTable.getModel().getValueAt(row, 7).toString()));

        idField.setText(Integer.toString(bookID));
        isbnField.setText(isbn);
        categoryBox.setSelectedItem(bookCategory);
        titleField.setText(title);
        authorField.setText(author);
        copiesField.setText(Integer.toString(noOfCopies));
        publisherField.setText(publisher);
        priceField.setText(Double.toString(price));

    }//GEN-LAST:event_bookListTableMouseClicked

    //for updating book data
    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Update this record?", "Message", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            try {

                try (Connection con = ConnectionProvider.getCon()) {
                    Statement stmt = con.createStatement();
                    String sql = "UPDATE books SET isbn='" + this.isbnField.getText() + "', bookCategory='" + this.categoryBox.getSelectedItem() + "', title='" + this.titleField.getText() + "', author='" + this.authorField.getText() + "', noOfCopies='" + this.copiesField.getText() + "', publisher='" + this.publisherField.getText() + "' WHERE bookID='" + idField.getText() + "'";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Succesfully Updated!");
                    idField.setText("");
                    isbnField.setText("");
                    categoryBox.setSelectedItem("");
                    titleField.setText("");
                    authorField.setText("");
                    copiesField.setText("");
                    publisherField.setText("");
                    priceField.setText("");
                }

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err);
            }
        }

    }//GEN-LAST:event_updateBtnMouseClicked

    //for deletion of book data
    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Message", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement stmt = con.createStatement();
                String sql = "DELETE FROM books WHERE bookID ='" + parseInt(this.idField.getText()) + "'";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Successfully Deleted!");
                new Books().setVisible(true);
                this.setVisible(false);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, err);
            }

        }

    }//GEN-LAST:event_deleteBtnMouseClicked

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
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) bookListTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
        bookListTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
    }//GEN-LAST:event_bookSearchKeyPressed

    private void bookSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyReleased
        if (bookSearch.getText().equals("")) {
            bookSearch.setText("Search");
            bookSearch.setCaretPosition(0);

        }
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) bookListTable.getModel();
        javax.swing.table.TableRowSorter<javax.swing.table.DefaultTableModel> tr = new javax.swing.table.TableRowSorter<>(model);
        bookListTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(bookSearch.getText().trim()));
    }//GEN-LAST:event_bookSearchKeyReleased

    private void bookSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookSearchKeyTyped
        if (bookSearch.getText().equals("Search")) {
            bookSearch.setText("");

        }
    }//GEN-LAST:event_bookSearchKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Books().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField authorField;
    private javax.swing.JLabel authorText;
    private javax.swing.JLabel bookIDNewBook;
    private rojerusan.RSTableMetro bookListTable;
    private javax.swing.JTextField bookSearch;
    private javax.swing.JLabel bookTitle;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JLabel categoryText;
    private javax.swing.JTextField copiesField;
    private javax.swing.JLabel copyText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idText;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnText1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceText;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel publisherText;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
