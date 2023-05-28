package JavaJunction;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class employeeInventoryForm extends Connect_Inventory {
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0;
 
    public employeeInventoryForm() {       
        initComponents();
        this.setLocationRelativeTo(null);
        DoConnect();
        Select();
        placeholder.setVisible(false);
        tb_INVENTORY.setDefaultEditor(Object.class, null);
        tb_INVENTORY.setCellSelectionEnabled(false);
        tb_INVENTORY.setRowSelectionAllowed(true);
    }
    
    void Get_Set_Records(){
        try{
            product_id = rs.getInt("PRODUCT_ID");
            product_name = rs.getString("PRODUCT_NAME");
            product_status = rs.getString("PRODUCT_STATUS");
            product_quantity = rs.getInt("PRODUCT_QUANTITY");
            product_category = rs.getString("PRODUCT_CATEGORY");
            product_price = rs.getDouble("PRODUCT_PRICE");
            productidTxtField.setText(String.valueOf(product_id));
            nameTxtField.setText(product_name);
            statusTxtField.setText(product_status);
            quantityTxtField.setText(String.valueOf(product_quantity));
            categoryTxtfield.setText(product_category);
            categoryTxtfield.setText(String.valueOf(product_price));           
        } catch (SQLException err){
            JOptionPane.showMessageDialog(employeeInventoryForm.this, err.getMessage());
        }
    }
    
    void showAll(){
        try{
            rs.first();
            Get_Set_Records();
            
        } catch (SQLException e){
            System.out.println(e);
        }
    }
   
    public void Select(){ 
        String [] columnNames = {"ID", "NAME", "STATUS", "QUANTITY", "CATEGORY", "PRICE"};
        tbModel.setColumnIdentifiers(columnNames);
        try{
            while(rs.next()){
                product_id = rs.getInt("PRODUCT_ID");
                product_name = rs.getString("PRODUCT_NAME");
                product_status = rs.getString("PRODUCT_STATUS");
                product_quantity = rs.getInt("PRODUCT_QUANTITY");
                product_category = rs.getString("PRODUCT_CATEGORY");
                product_price = rs.getDouble("PRODUCT_PRICE");
                tb_INVENTORY.setVisible(true);
                tbModel.addRow(new Object [] {product_id, product_name, product_status, product_quantity, product_category, product_price});
                x++;
            }
            rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(employeeInventoryForm.this, err.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_INVENTORY = new javax.swing.JTable();
        SidePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productidTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        quantityTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        searchTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        categoryTxtfield = new javax.swing.JTextField();
        placeholder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statusTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        priceTxtField = new javax.swing.JTextField();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYEE");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_INVENTORY.setModel(tbModel);
        tb_INVENTORY.getTableHeader().setReorderingAllowed(false);
        tb_INVENTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_INVENTORYMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_INVENTORY);

        MainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        SidePanel.setBackground(new java.awt.Color(31, 9, 11));
        SidePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUANTITY:");
        SidePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORY:");
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        productidTxtField.setEditable(false);
        SidePanel.add(productidTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));
        productidTxtField.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        SidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("");

        nameTxtField.setEditable(false);
        SidePanel.add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, -1));
        nameTxtField.getAccessibleContext().setAccessibleName("");

        quantityTxtField.setEditable(false);
        SidePanel.add(quantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, -1));
        quantityTxtField.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME:");
        SidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("");

        SidePanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEARCH NAME:");
        SidePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtFieldKeyReleased(evt);
            }
        });
        SidePanel.add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRICE:");
        SidePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        categoryTxtfield.setEditable(false);
        SidePanel.add(categoryTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, -1));

        placeholder.setText("Lorem Ipsum");
        SidePanel.add(placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STATUS:");
        SidePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        statusTxtField.setEditable(false);
        SidePanel.add(statusTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
        backBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        SidePanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 60, 20));

        priceTxtField.setEditable(false);
        SidePanel.add(priceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, -1));

        refreshBtn.setBackground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("REFRESH");
        refreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.setFocusPainted(false);
        refreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        SidePanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 20));

        MainPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 450));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void tb_INVENTORYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_INVENTORYMouseClicked
        int i = tb_INVENTORY.getSelectedRow();
        TableModel model = tb_INVENTORY.getModel();
        productidTxtField.setText(model.getValueAt(i, 0).toString());
        nameTxtField.setText(model.getValueAt(i, 1).toString());
        statusTxtField.setText(model.getValueAt(i, 2). toString());
        quantityTxtField.setText(model.getValueAt(i, 3).toString());
        priceTxtField.setText(model.getValueAt(i, 4).toString());
        categoryTxtfield.setText(model.getValueAt(i, 5). toString());       
    }//GEN-LAST:event_tb_INVENTORYMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Refresh_RS_STMT();
        employeeForm back = new employeeForm();
        back.Welcome.setText("Welcome "+placeholder.getText()+"!");
        back.userName.setText(placeholder.getText());
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        Refresh_RS_STMT();
        tbModel.setRowCount(0);
        Select();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void searchTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtFieldKeyReleased
        Refresh_RS_STMT();
        String search = searchTxtField.getText();
        if ("".equals(search)){
            tbModel.setRowCount(0);
            Select();
        }else{
            try{
                String sql = "SELECT * FROM INVENTORY WHERE PRODUCT_NAME LIKE '"+search+"%'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(sql);
                tbModel.setRowCount(0);
                if(rs.next()){
                    int i = 0;
                    product_id = rs.getInt("PRODUCT_ID");
                    product_name = rs.getString("PRODUCT_NAME");
                    product_status = rs.getString("PRODUCT_STATUS");
                    product_quantity = rs.getInt("PRODUCT_QUANTITY");
                    product_category = rs.getString("PRODUCT_CATEGORY");
                    product_price = rs.getDouble("PRODUCT_PRICE");
                    tbModel.addRow(new Object [] {product_id, product_name, product_status, product_quantity, product_category, product_price});
                    i++;
                }
                rs.close();
            } catch (SQLException e){
                JOptionPane.showMessageDialog(employeeInventoryForm.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_searchTxtFieldKeyReleased
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeInventoryForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField categoryTxtfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxtField;
    public javax.swing.JLabel placeholder;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField productidTxtField;
    private javax.swing.JTextField quantityTxtField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JTextField statusTxtField;
    private javax.swing.JTable tb_INVENTORY;
    // End of variables declaration//GEN-END:variables
}
