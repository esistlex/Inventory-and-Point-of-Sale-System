package JavaJunction;

import java.awt.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.*;

public class managerInventoryForm extends Connect_Inventory {
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0;
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatnow = DateTimeFormatter.ofPattern("E, MMM.dd.yyyy 'at' hh:mm:ss a");
    String today = now.format(formatnow);
 
    public managerInventoryForm() {       
        initComponents();
        this.setLocationRelativeTo(null);
        DoConnect();
        DoConnectINVENTORYLOG();
        Select();
        placeholder.setVisible(false);
        tb_INVENTORY.setDefaultEditor(Object.class, null);
        tb_INVENTORY.setCellSelectionEnabled(false);
        tb_INVENTORY.setRowSelectionAllowed(true);    
    }
    
    public void resizeColumnWidth(JTable tb_INVENTORY) {
    final TableColumnModel columnModel = tb_INVENTORY.getColumnModel();
    for (int column = 0; column < tb_INVENTORY.getColumnCount(); column++) {
        int width = 15;
        for (int row = 0; row < tb_INVENTORY.getRowCount(); row++) {
            TableCellRenderer renderer = tb_INVENTORY.getCellRenderer(row, column);
            Component comp = tb_INVENTORY.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        width = Math.max(width, tb_INVENTORY.getColumnModel().getColumn(column).getPreferredWidth());
        if(width > 300){
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
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
                resizeColumnWidth(tb_INVENTORY);
            }
            rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(managerInventoryForm.this, err.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_INVENTORY = new javax.swing.JTable();
        SidePanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productidTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        quantityTxtField = new javax.swing.JTextField();
        categoryField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxtField = new javax.swing.JTextField();
        placeholder = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statusTxtfield = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        categoryOrder = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        searchTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sortBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGER");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(31, 9, 11));
        MainPanel.setForeground(new java.awt.Color(31, 9, 11));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_INVENTORY.setModel(tbModel);
        tb_INVENTORY.getTableHeader().setReorderingAllowed(false);
        tb_INVENTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_INVENTORYMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_INVENTORY);

        MainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 490));

        SidePanel.setBackground(new java.awt.Color(31, 9, 11));
        SidePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setFocusPainted(false);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        SidePanel.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 20));

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setText("EDIT");
        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.setFocusPainted(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        SidePanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 140, 20));

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setFocusPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        SidePanel.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 140, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUANTITY:");
        SidePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORY:");
        SidePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        SidePanel.add(productidTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, -1));
        productidTxtField.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        SidePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("");

        SidePanel.add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, -1));
        nameTxtField.getAccessibleContext().setAccessibleName("");

        SidePanel.add(quantityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, -1));
        quantityTxtField.getAccessibleContext().setAccessibleName("");

        categoryField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HATS", "TOP WEAR", "BOTTOM WEAR", "FOOT WEAR", "OTHERS" }));
        categoryField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SidePanel.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, -1));
        categoryField.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME:");
        SidePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("");

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        SidePanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 140, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRICE:");
        SidePanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        SidePanel.add(priceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, -1));

        placeholder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        placeholder.setForeground(new java.awt.Color(255, 255, 255));
        placeholder.setText("Lorem Ipsum");
        SidePanel.add(placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STATUS:");
        SidePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        statusTxtfield.setEditable(false);
        SidePanel.add(statusTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));
        SidePanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 160, 20));

        MainPanel.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 160, 560));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ORDER BY:");
        MainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 25));

        categoryOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "NAME", "STATUS", "QUANTITY", "CATEGORY", "PRICE" }));
        categoryOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MainPanel.add(categoryOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 100, -1));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAME", "TYPE" }));
        category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryItemStateChanged(evt);
            }
        });
        MainPanel.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, -1));

        searchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtFieldKeyReleased(evt);
            }
        });
        MainPanel.add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SEARCH BY:");
        MainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 25));

        sortBtn.setBackground(new java.awt.Color(255, 255, 255));
        sortBtn.setText("SORT");
        sortBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sortBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortBtn.setFocusPainted(false);
        sortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortBtnActionPerformed(evt);
            }
        });
        MainPanel.add(sortBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 70, 20));

        refreshBtn.setBackground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("REFRESH");
        refreshBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.setFocusPainted(false);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        MainPanel.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 70, 20));
        MainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 520, 15));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Refresh_RS_STMT();
        managerForm back = new managerForm();
        back.Welcome.setText(placeholder.getText());
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Refresh_RS_STMT();
        String n = placeholder.getText();
        n = n.replace("Welcome", "");
        n = n.replace("!", "");
        product_id = Integer.parseInt(productidTxtField.getText());
        product_name = nameTxtField.getText();
        product_quantity = Integer.parseInt(quantityTxtField.getText());
        
        if (product_quantity <= -1){
            JOptionPane.showMessageDialog(null, "Invalid product quantity!");
            statusTxtfield.setText(null);
            productidTxtField.setText(null);
            nameTxtField.setText(null);
            quantityTxtField.setText(null);
            priceTxtField.setText(null);
            categoryField.setSelectedIndex(0);
            return;
        }
        
        if (product_quantity == 0){
            product_status = "OUT OF STOCK";
        } else if (product_quantity >= 50){
            product_status = "IN STOCK";
        } else if (product_quantity < 50){
            product_status = "LOW STOCK";
        }
        product_category = String.valueOf(categoryField.getSelectedItem());
        if ("".equals(priceTxtField.getText())){
            product_price = 0;
        } else{
        product_price = Double.parseDouble(priceTxtField.getText());
        }
        
        try {            
            rs.moveToInsertRow();
            rs.updateInt("PRODUCT_ID", product_id);
            rs.updateString("PRODUCT_NAME", product_name);
            rs.updateString("PRODUCT_STATUS", product_status);
            rs.updateInt("PRODUCT_QUANTITY", product_quantity);
            rs.updateString("PRODUCT_CATEGORY", product_category);
            rs.updateDouble("PRODUCT_PRICE", product_price);
            rs.insertRow();
            
            sql3 = "INSERT INTO INVENTORYLOG (DATE_AND_TIME, EMP_NAME, EMP_TYPE, ACTION_TYPE, PROD_NAME, PROD_QUANTITY, PROD_PRICE, PROD_CATEGORY) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = con3.prepareStatement(sql3);
            statement.setString(1, today);
            statement.setString(2, n);
            statement.setString(3, "MANAGER");
            statement.setString(4, "ADD");
            statement.setString(5, product_name);
            statement.setInt(6, product_quantity);
            statement.setDouble(7, product_price);
            statement.setString(8, product_category);
            statement.execute();
            
            Refresh_RS_STMT();
            tb_INVENTORY.revalidate();
            DefaultTableModel model = (DefaultTableModel)tb_INVENTORY.getModel();
            model.setRowCount(0);
            Select();
            JOptionPane.showMessageDialog(managerInventoryForm.this, "Product sucessfully added!");
            rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(managerInventoryForm.this, "Error in adding product!");
            System.out.println(err.getMessage());
        }
        statusTxtfield.setText(null);
        productidTxtField.setText(null);
        nameTxtField.setText(null);
        quantityTxtField.setText(null);
        priceTxtField.setText(null);
        categoryField.setSelectedIndex(0);       
    }//GEN-LAST:event_addBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        category.setSelectedIndex(0);
        categoryOrder.setSelectedIndex(0);        
        searchTxtField.setText(null);
        Refresh_RS_STMT();
        tbModel.setRowCount(0);
        Select();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void tb_INVENTORYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_INVENTORYMouseClicked
        int i = tb_INVENTORY.getSelectedRow();
        TableModel model = tb_INVENTORY.getModel();
        productidTxtField.setText(model.getValueAt(i, 0).toString());
        nameTxtField.setText(model.getValueAt(i, 1).toString());
        statusTxtfield.setText(model.getValueAt(i, 2).toString());
        quantityTxtField.setText(model.getValueAt(i, 3).toString());
        priceTxtField.setText(model.getValueAt(i, 5). toString());
        String type = model.getValueAt(i, 4).toString();        
            switch(type){
                case "HATS":
                    categoryField.setSelectedIndex(0);
                    break;
                case "TOP WEAR":
                    categoryField.setSelectedIndex(1);
                    break;
                case "BOTTOM WEAR":
                    categoryField.setSelectedIndex(2);
                    break;
                case "FOOT WEAR":
                    categoryField.setSelectedIndex(3);
                    break;
                case "OTHERS":
                    categoryField.setSelectedIndex(4);
                    break;
            }        
    }//GEN-LAST:event_tb_INVENTORYMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Refresh_RS_STMT();
        String n = placeholder.getText();
        n = n.replace("Welcome", "");
        n = n.replace("!", "");
        product_id = Integer.parseInt(productidTxtField.getText());
        try{
            String sql = "DELETE FROM INVENTORY WHERE PRODUCT_ID = " +product_id+ "";
            stmt = con.createStatement();
            result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){                           
                Refresh_RS_STMT();
                stmt.executeUpdate(sql);
                sql3 = "INSERT INTO INVENTORYLOG (DATE_AND_TIME, EMP_NAME, EMP_TYPE, ACTION_TYPE, PROD_NAME, PROD_QUANTITY, PROD_PRICE, PROD_CATEGORY) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = con3.prepareStatement(sql3);
                statement.setString(1, today);
                statement.setString(2, n);
                statement.setString(3, "MANAGER");
                statement.setString(4, "DELETE");
                statement.setString(5, product_name);
                statement.setInt(6, product_quantity);
                statement.setDouble(7, product_price);
                statement.setString(8, product_category);
                statement.execute();
                JOptionPane.showMessageDialog(managerInventoryForm.this, "Product record has been successfully deleted!");
                Refresh_RS_STMT();
                tb_INVENTORY.revalidate();
                DefaultTableModel model = (DefaultTableModel)tb_INVENTORY.getModel();
                model.setRowCount(0);
                Select();
                rs.close();
            } else {
                    JOptionPane.showMessageDialog(this, "Product record not deleted.");
                    rs.close();
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(managerInventoryForm.this, e.getMessage());
        }
        statusTxtfield.setText(null);
        productidTxtField.setText(null);
        nameTxtField.setText(null);
        quantityTxtField.setText(null);
        priceTxtField.setText(null);
        categoryField.setSelectedIndex(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        Refresh_RS_STMT();
        String n = placeholder.getText();
        n = n.replace("Welcome", "");
        n = n.replace("!", "");
        product_id = Integer.parseInt(productidTxtField.getText());
        product_name = nameTxtField.getText();
        product_quantity = Integer.parseInt(quantityTxtField.getText());
        product_category = String.valueOf(categoryField.getSelectedItem());
        product_price = Double.parseDouble(priceTxtField.getText());
        
        if (product_quantity <= -1){
            JOptionPane.showMessageDialog(null, "Invalid product quantity!");
            statusTxtfield.setText(null);
            productidTxtField.setText(null);
            nameTxtField.setText(null);
            quantityTxtField.setText(null);
            priceTxtField.setText(null);
            categoryField.setSelectedIndex(0);
            return;
        }
        
        if (product_quantity == 0){
            product_status = "OUT OF STOCK";
        } else if (product_quantity >= 50){
            product_status = "IN STOCK";
        } else if (product_quantity < 50){
            product_status = "LOW STOCK";
        }
        try{
            String sql = "UPDATE INVENTORY SET PRODUCT_NAME = '"+product_name+"', PRODUCT_STATUS = '"+product_status+"', PRODUCT_QUANTITY = "+product_quantity+" , PRODUCT_CATEGORY = '"+product_category+"', PRODUCT_PRICE = "+product_price+" WHERE PRODUCT_ID = "+product_id+"";
            stmt = con.createStatement();
            result = JOptionPane.showConfirmDialog(null, "Are you sure you want to edit this product record?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
                Refresh_RS_STMT();
                stmt.executeUpdate(sql);
                sql3 = "INSERT INTO INVENTORYLOG (DATE_AND_TIME, EMP_NAME, EMP_TYPE, ACTION_TYPE, PROD_NAME, PROD_QUANTITY, PROD_PRICE, PROD_CATEGORY) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = con3.prepareStatement(sql3);
                statement.setString(1, today);
                statement.setString(2, n);
                statement.setString(3, "MANAGER");
                statement.setString(4, "EDIT");
                statement.setString(5, product_name);
                statement.setInt(6, product_quantity);
                statement.setDouble(7, product_price);
                statement.setString(8, product_category);
                statement.execute();
                JOptionPane.showMessageDialog(managerInventoryForm.this, "Product record has been successfully updated!");
                Refresh_RS_STMT();
                tb_INVENTORY.revalidate();
                DefaultTableModel model = (DefaultTableModel)tb_INVENTORY.getModel();
                model.setRowCount(0);
                Select();
                rs.close();
            } else {
                    JOptionPane.showMessageDialog(this, "Product record not updated.");
                    rs.close();
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(managerInventoryForm.this, e.getMessage());
        }     
        statusTxtfield.setText(null);
        productidTxtField.setText(null);
        nameTxtField.setText(null);
        quantityTxtField.setText(null);
        priceTxtField.setText(null);
        categoryField.setSelectedIndex(0);
    }//GEN-LAST:event_editBtnActionPerformed

    private void searchTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtFieldKeyReleased
        Refresh_RS_STMT();
        String search = searchTxtField.getText();
        String cat = String.valueOf(category.getSelectedItem());
        switch(cat) {
            case "NAME":
            cat = "PRODUCT_NAME";
            break;
            case "TYPE":
            cat = "PRODUCT_CATEGORY";
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid category, please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
            break;
        }

        if ("".equals(search)) {
            tbModel.setRowCount(0);
            Select();
        }
        else {
            try {
                String sql = "SELECT * FROM INVENTORY WHERE "+cat+" = '"+search+"'";
                stmt = con.createStatement();
                rs = stmt.executeQuery(sql);
                tbModel.setRowCount(0);
                while(rs.next()) {
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
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(managerInventoryForm.this, e.getMessage());
            }
        }
    }//GEN-LAST:event_searchTxtFieldKeyReleased

    private void categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryItemStateChanged
        Refresh_RS_STMT();
        searchTxtField.setText(null);
        tbModel.setRowCount(0);
        Select();
    }//GEN-LAST:event_categoryItemStateChanged

    private void sortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortBtnActionPerformed
        Refresh_RS_STMT();
        String sort = String.valueOf(categoryOrder.getSelectedItem());
        String search = searchTxtField.getText();
        String cat = String.valueOf(category.getSelectedItem());

        switch(cat) {
            case "NAME":
            cat = "PRODUCT_NAME";
            break;
            case "TYPE":
            cat = "PRODUCT_CATEGORY";
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid category, please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
            break;
        }

        switch(sort) {
            case "ID":
            sort = "PRODUCT_ID";
            break;
            case "NAME":
            sort = "PRODUCT_NAME";
            break;
            case "STATUS":
            sort = "PRODUCT_STATUS";
            break;
            case "QUANTITY":
            sort = "PRODUCT_QUANTITY";
            break;
            case "CATEGORY":
            sort = "PRODUCT_CATEGORY";
            break;
            case "PRICE":
            sort = "PRODUCT_PRICE";
            break;
            default:
            JOptionPane.showMessageDialog(null, "Invalid category, please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
            break;
        }

        try {
            String sql = "SELECT * FROM INVENTORY WHERE "+cat+" = '"+search+"' ORDER BY "+sort+" DESC";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            tbModel.setRowCount(0);
            while(rs.next()){
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
        } catch (SQLException e){
            JOptionPane.showMessageDialog(managerInventoryForm.this, e.getMessage());
        }
    }//GEN-LAST:event_sortBtnActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerInventoryForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JComboBox<String> categoryField;
    private javax.swing.JComboBox<String> categoryOrder;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTxtField;
    public javax.swing.JLabel placeholder;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JTextField productidTxtField;
    private javax.swing.JTextField quantityTxtField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton sortBtn;
    private javax.swing.JTextField statusTxtfield;
    private javax.swing.JTable tb_INVENTORY;
    // End of variables declaration//GEN-END:variables
}