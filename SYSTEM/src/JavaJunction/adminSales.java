package JavaJunction;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class adminSales extends Connect_Inventory {
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0, quantity, productbuy;
    Double total, cash, change; 
    Double amountdue = 0.0;
    String productname;
    
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatnow = DateTimeFormatter.ofPattern("E, MMM.dd.yyyy 'at' hh:mm:ss a");
    String today = now.format(formatnow);
    
    public adminSales() {
        initComponents();
        this.setLocationRelativeTo(null);
        table();
        DoConnect();
        DoConnectSales();
        tb_SALES.setDefaultEditor(Object.class, null);
        tb_SALES.setCellSelectionEnabled(false);
        tb_SALES.setRowSelectionAllowed(true);
        ImageIcon icon = new ImageIcon ("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
        placeholder.setVisible(false);
    }   
    
    public void table() {
        String [] columnNames = {"ID", "NAME", "STATUS", "QUANTITY", "CATEGORY", "PRICE", "TOTAL"};
        tbModel.setColumnIdentifiers(columnNames);
        tb_SALES.setVisible(true);
        x++;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_SALES = new javax.swing.JTable();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        productIdTxtfield = new javax.swing.JTextField();
        nameTxtfield = new javax.swing.JTextField();
        statusTxtfield = new javax.swing.JTextField();
        priceTxtfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchTxtfield = new javax.swing.JTextField();
        quantityTxtfield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        amountDueTxtfield = new javax.swing.JTextField();
        totalTxtfield = new javax.swing.JTextField();
        addCart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        itemQuantityTxtfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        removeCart = new javax.swing.JButton();
        checkoutBtn = new javax.swing.JButton();
        placeholder = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALES");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_SALES.setModel(tbModel);
        tb_SALES.setColumnSelectionAllowed(true);
        tb_SALES.getTableHeader().setReorderingAllowed(false);
        tb_SALES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SALESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_SALES);
        tb_SALES.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 280));

        rightPanel.setBackground(new java.awt.Color(31, 9, 11));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STATUS:");
        rightPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        productIdTxtfield.setEditable(false);
        rightPanel.add(productIdTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 130, -1));

        nameTxtfield.setEditable(false);
        rightPanel.add(nameTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, -1));

        statusTxtfield.setEditable(false);
        rightPanel.add(statusTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, -1));

        priceTxtfield.setEditable(false);
        rightPanel.add(priceTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ITEM ID:");
        rightPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITEM PRICE:");
        rightPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ITEM NAME:");
        rightPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        rightPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 20, 190));

        searchTxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchTxtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtfieldKeyReleased(evt);
            }
        });
        rightPanel.add(searchTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 230, 30));

        quantityTxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityTxtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTxtfieldKeyReleased(evt);
            }
        });
        rightPanel.add(quantityTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ITEM NAME");
        rightPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 230, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TOTAL");
        rightPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 140, 20));

        amountDueTxtfield.setEditable(false);
        amountDueTxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rightPanel.add(amountDueTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 240, 40));

        totalTxtfield.setEditable(false);
        totalTxtfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rightPanel.add(totalTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, 40));

        addCart.setBackground(new java.awt.Color(255, 255, 255));
        addCart.setText("ADD TO CART");
        addCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCart.setFocusPainted(false);
        addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartActionPerformed(evt);
            }
        });
        rightPanel.add(addCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ITEM QUANTITY:");
        rightPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        itemQuantityTxtfield.setEditable(false);
        rightPanel.add(itemQuantityTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUANTITY");
        rightPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 140, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        rightPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 20, 190));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("AMOUNT DUE");
        rightPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        removeCart.setBackground(new java.awt.Color(255, 255, 255));
        removeCart.setText("REMOVE FROM CART");
        removeCart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeCart.setFocusPainted(false);
        removeCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCartActionPerformed(evt);
            }
        });
        rightPanel.add(removeCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 230, 40));

        checkoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setText("CHECK OUT");
        checkoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        checkoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkoutBtn.setFocusPainted(false);
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });
        rightPanel.add(checkoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 240, 70));

        placeholder.setText("lorem ipsum");
        rightPanel.add(placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        rightPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INVENTORY");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        rightPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 80, 20));

        mainPanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 280, 1020, 190));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_SALESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SALESMouseClicked
        int i = tb_SALES.getSelectedRow();
        TableModel model = tb_SALES.getModel();
        productIdTxtfield.setText(model.getValueAt(i,0).toString());
        nameTxtfield.setText(model.getValueAt(i, 1).toString());
        statusTxtfield.setText(model.getValueAt(i, 2).toString());
        itemQuantityTxtfield.setText(model.getValueAt(i,3).toString());
        priceTxtfield.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tb_SALESMouseClicked

    private void searchTxtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtfieldKeyReleased
        Refresh_RS_STMT();
        String search = searchTxtfield.getText();
        try{
            String sql = "SELECT * FROM INVENTORY WHERE PRODUCT_NAME LIKE '"+search+"%'";
            stmt = con.createStatement();           
            rs = stmt.executeQuery(sql); 
           if(rs.next()){
                product_id = rs.getInt("PRODUCT_ID");
                product_name = rs.getString("PRODUCT_NAME");
                product_status = rs.getString("PRODUCT_STATUS");
                product_quantity = rs.getInt("PRODUCT_QUANTITY");
                product_category = rs.getString("PRODUCT_CATEGORY");
                product_price = rs.getDouble("PRODUCT_PRICE");                
                statusTxtfield.setText(product_status);
                productIdTxtfield.setText(String.valueOf(product_id));
                nameTxtfield.setText(product_name);
                itemQuantityTxtfield.setText(String.valueOf(product_quantity));
                priceTxtfield.setText(String.valueOf(product_price));
            }
            rs.close();            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(adminSales.this, e.getMessage());
        }
    }//GEN-LAST:event_searchTxtfieldKeyReleased

    private void addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartActionPerformed
        quantity = Integer.parseInt(quantityTxtfield.getText());
        product_quantity = Integer.parseInt(itemQuantityTxtfield.getText());
        productname = nameTxtfield.getText();
        amountdue = amountdue + total;
        if ("".equals(searchTxtfield.getText())){
            JOptionPane.showMessageDialog(this, "Please enter item");
        }
        else if ("".equals(quantityTxtfield.getText())){
            JOptionPane.showMessageDialog(this, "Please enter quantity");
        } 
        else {
        Refresh_RS_STMT();        
        try {
          rs = stmt.executeQuery("SELECT * FROM INVENTORY");
          while (rs.next()){
              table();
              if (quantity >= product_quantity){
                JOptionPane.showMessageDialog(adminSales.this, "Not enough stock in the inventory!");
                searchTxtfield.setText(null);
                quantityTxtfield.setText(null);
                totalTxtfield.setText(null);
                statusTxtfield.setText(null);
                productIdTxtfield.setText(null);
                nameTxtfield.setText(null);
                itemQuantityTxtfield.setText(null);
                priceTxtfield.setText(null);
                break;
                } else {
                tbModel.addRow(new Object [] {product_id, product_name, product_status, productbuy, product_category, product_price, total});
                JOptionPane.showMessageDialog(this, "Item added.");
                searchTxtfield.setText(null);
                quantityTxtfield.setText(null);
                totalTxtfield.setText(null);
                statusTxtfield.setText(null);
                productIdTxtfield.setText(null);
                nameTxtfield.setText(null);
                itemQuantityTxtfield.setText(null);
                priceTxtfield.setText(null);
                amountDueTxtfield.setText(String.valueOf(amountdue));
                break;
              }
          }   
          rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(adminSales.this, err.getMessage());
        }      
        }
    }//GEN-LAST:event_addCartActionPerformed

    private void quantityTxtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTxtfieldKeyReleased
            productbuy = Integer.parseInt(quantityTxtfield.getText());
            total = productbuy * product_price;
            totalTxtfield.setText(String.valueOf(total));           
    }//GEN-LAST:event_quantityTxtfieldKeyReleased

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        Refresh_RS_STMT();
        String input = JOptionPane.showInputDialog(adminSales.this, "Enter cash amount:");
        cash = Double.parseDouble(input);
        change = cash - amountdue;
        if("".equals(input)){
            JOptionPane.showMessageDialog(adminSales.this, "Enter cash!");
        } else {
        if (cash < amountdue){
            JOptionPane.showMessageDialog(adminSales.this, "Insufficient cash!");
        }
            else if (cash >= amountdue){   
        try {       
            stmt = con.createStatement();
            stmt2.executeUpdate("INSERT INTO SALES (DATE_AND_TIME) VALUES ('"+today+"')");
            for (int i=0 ; i<tb_SALES.getRowCount() ; i++){
                String getID = tb_SALES.getValueAt(i, 0).toString();
                String getNAME = tb_SALES.getValueAt(i, 1).toString();
                String getQUANTITY = tb_SALES.getValueAt(i, 3).toString();
                int id = Integer.parseInt(getID);
                int itemquantity = Integer.parseInt(getQUANTITY);
                stmt.executeUpdate("UPDATE INVENTORY SET PRODUCT_QUANTITY = PRODUCT_QUANTITY - "+itemquantity+" WHERE PRODUCT_ID = "+id+"");
                stmt2.executeUpdate ("INSERT INTO SALES (PRODUCT_NAME, QUANTITY, AMOUNTDUE) VALUES ('"+getNAME+"', "+getQUANTITY+", "+amountdue+")");
            }
            JOptionPane.showMessageDialog(adminSales.this, "Success!\nYour change is: "+change);
            amountDueTxtfield.setText(null);
            stmt.close();
            tbModel.setRowCount(0);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(adminSales.this, err.getMessage());
        }
        }
        }
    }//GEN-LAST:event_checkoutBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        adminForm back = new adminForm();
        back.Welcome.setText(placeholder.getText());
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void removeCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCartActionPerformed
        amountdue = amountdue - total;
        tbModel.removeRow(tb_SALES.getSelectedRow());
        amountDueTxtfield.setText(String.valueOf(amountdue));  
        searchTxtfield.setText(null);
        quantityTxtfield.setText(null);
        totalTxtfield.setText(null);
        statusTxtfield.setText(null);
        productIdTxtfield.setText(null);
        nameTxtfield.setText(null);
        itemQuantityTxtfield.setText(null);
        priceTxtfield.setText(null);
        JOptionPane.showMessageDialog(adminSales.this, "Item removed.");
    }//GEN-LAST:event_removeCartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        employeeInventorySalesForm inventory = new employeeInventorySalesForm();
        inventory.placeholder.setText(this.placeholder.getText());
        inventory.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCart;
    private javax.swing.JTextField amountDueTxtfield;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JTextField itemQuantityTxtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField nameTxtfield;
    public javax.swing.JLabel placeholder;
    private javax.swing.JTextField priceTxtfield;
    private javax.swing.JTextField productIdTxtfield;
    private javax.swing.JTextField quantityTxtfield;
    private javax.swing.JButton removeCart;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JTextField searchTxtfield;
    private javax.swing.JTextField statusTxtfield;
    private javax.swing.JTable tb_SALES;
    private javax.swing.JTextField totalTxtfield;
    // End of variables declaration//GEN-END:variables
}
