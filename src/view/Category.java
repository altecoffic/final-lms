package view;

import static java.lang.Integer.parseInt;
import services.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public final class Category extends javax.swing.JFrame {

    private DefaultTableModel dm;
    private Connection con;
    private Statement stmt;

    public Category() {
        initComponents();
        fetch_dataCategory();
        id.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        addCategory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoryList = new rojerusan.RSTableMetro();
        updateBtn = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 110));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1095, 680));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 246, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1095, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(1095, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1095, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CATEGORY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 300, 48));

        title.setBackground(new java.awt.Color(233, 246, 250));
        title.setText("Category Name");
        title.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                titleFocusGained(evt);
            }
        });
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 240, 30));

        addCategory.setBackground(new java.awt.Color(0, 204, 204));
        addCategory.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        addCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addCategory.setText("ADD");
        addCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        addCategory.setContentAreaFilled(false);
        addCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategoryMouseClicked(evt);
            }
        });
        jPanel1.add(addCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 110, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Genre           :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 160, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Description   :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 150, -1));

        description.setBackground(new java.awt.Color(233, 246, 250));
        description.setColumns(20);
        description.setRows(5);
        jScrollPane2.setViewportView(description);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 240, 110));

        categoryList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Title ", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoryList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(categoryList);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, 80));

        updateBtn.setBackground(new java.awt.Color(153, 255, 153));
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Return_Purchase_26px.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51), 2));
        updateBtn.setContentAreaFilled(false);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 110, 30));

        id.setBackground(new java.awt.Color(233, 246, 250));
        id.setText("Category Name");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 210, 30));

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
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleFocusGained

        if (title.getText().equals("Category Name")) {
            title.setText("");
        }
    }//GEN-LAST:event_titleFocusGained

    private void addCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategoryMouseClicked

        try {
            con = ConnectionProvider.getCon();
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO category (categoryTitle,categoryDescription) VALUES('" + title.getText() + "','" + description.getText() + "')");

            JOptionPane.showMessageDialog(null, "Successfully Added!");
            fetch_dataCategory();
            stmt.close();
            con.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Connection error");
            System.out.println(err);
//            setVisible(false);
//            new Book().setVisible(true);
        }
    }//GEN-LAST:event_addCategoryMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        try {

            con = ConnectionProvider.getCon();
            stmt = con.createStatement();
            String sql = "UPDATE category SET categoryTitle='" + this.title.getText() + "', categoryDescription='" + this.description.getText() + "' WHERE categoryID='" + id.getText() + "'";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Data Successfully Updated!");

            stmt.close();
            con.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Connection error");
            System.out.println(err);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idFocusGained

    private void categoryListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryListMouseClicked

        int categoryID;
        String categoryTitle;
        String categoryDescription;

        int row = categoryList.getSelectedRow();
        categoryID = (int) (categoryList.getModel().getValueAt(row, 0));
        categoryTitle = (categoryList.getModel().getValueAt(row, 1).toString());
        categoryDescription = (categoryList.getModel().getValueAt(row, 2).toString());

        id.setText(Integer.toString(categoryID));
        title.setText(categoryTitle);
        description.setText(categoryDescription);

    }//GEN-LAST:event_categoryListMouseClicked

    private void deleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete this record?", "Message", JOptionPane.YES_NO_OPTION);

        if (a == 0) {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement stmt = con.createStatement();
                String sql = "DELETE FROM category WHERE categoryID ='" + parseInt(this.id.getText()) + "'";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Successfully Deleted!");
                new Category().setVisible(true);
                this.setVisible(false);

            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Connection error");
                System.out.println(err);
            }

        }
    }//GEN-LAST:event_deleteBtnMouseClicked

    public void fetch_dataCategory() {

        dm = (DefaultTableModel) categoryList.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from category";
            ResultSet rs = st.executeQuery(sql);
            categoryList.setModel(DbUtils.resultSetToTableModel(rs));
//            setVisible(false);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Connection error");
            System.out.println(err);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategory;
    private rojerusan.RSTableMetro categoryList;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea description;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField title;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
