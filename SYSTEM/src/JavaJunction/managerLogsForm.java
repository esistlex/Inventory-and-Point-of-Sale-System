package JavaJunction;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class managerLogsForm extends Connect {
    
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0;
 
    public managerLogsForm() {       
        initComponents();
        this.setLocationRelativeTo(null);
        DoConnectLog();
        DoConnectSales();
        DoConnectInventoryLog();
        DoConnectInventory();
        placeholder.setVisible(false);
        tb_LOGS.setDefaultEditor(Object.class, null);
        tb_LOGS.setCellSelectionEnabled(false);
        tb_LOGS.setRowSelectionAllowed(true);
    }
    
    public void resizeColumnWidth(JTable tb_LOGS) {
    final TableColumnModel columnModel = tb_LOGS.getColumnModel();
    for (int column = 0; column < tb_LOGS.getColumnCount(); column++) {
        int width = 15;
        for (int row = 0; row < tb_LOGS.getRowCount(); row++) {
            TableCellRenderer renderer = tb_LOGS.getCellRenderer(row, column);
            Component comp = tb_LOGS.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        width = Math.max(width, tb_LOGS.getColumnModel().getColumn(column).getPreferredWidth());
        if(width > 300){
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
   
    public void Select(){ 
        String [] columnNames = {"ENTRY NO.", "DATE & TIME", "EMPLOYEE NAME", "TYPE"};
        tbModel.setColumnIdentifiers(columnNames);
        try{
            while(rs2.next()){
                i = rs2.getInt("ENTRY_NO");
                a = rs2.getString("DATE_AND_TIME");
                c = rs2.getString("EMP_NAME");
                d = rs2.getString("EMP_TYPE");
                tb_LOGS.setVisible(true);
                tbModel.addRow(new Object [] {i,a,c,d});
                x++;
                resizeColumnWidth(tb_LOGS);
            }
            rs2.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(managerLogsForm.this, err.getMessage());
        }
    }
        
    public void Select2(){ 
        String [] columnNames = {"ENTRY NO.", "DATE & TIME", "PRODUCT NAME", "QUANTITY", "TOTAL"};
        tbModel.setColumnIdentifiers(columnNames);
        try{
            while(rs3.next()){
                i = rs3.getInt("ENTRY_NO");
                date = rs3.getString("DATE_AND_TIME");
                productname = rs3.getString("PRODUCT_NAME");
                productquantity = rs3.getInt("QUANTITY");
                amountdue = rs3.getDouble("AMOUNTDUE");
                tb_LOGS.setVisible(true);
                tbModel.addRow(new Object [] {i,date,productname,productquantity,amountdue});
                x++;
                resizeColumnWidth(tb_LOGS);
            }
            rs3.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(managerLogsForm.this, err.getMessage());
        }
    }
    
    public void Select3(){     
        String [] columnNames = {"ID NO.", "PRODUCT NAME", "STATUS", "QUANTITY", "PRICE", "CATEGORY"};
        tbModel.setColumnIdentifiers(columnNames);
        try{
            while(rs5.next()){
                inventory_id = rs5.getInt("PRODUCT_ID");
                inventory_productname = rs5.getString("PRODUCT_NAME");
                inventory_stat = rs5.getString("PRODUCT_STATUS");
                inventory_qty = rs5.getInt("PRODUCT_QUANTITY");
                inventory_price = rs5.getDouble("PRODUCT_PRICE");
                inventory_cat = rs5.getString("PRODUCT_CATEGORY");
                tb_LOGS.setVisible(true);
                tbModel.addRow(new Object [] {inventory_id, inventory_productname, inventory_stat, inventory_qty, inventory_price, inventory_cat});
                x++;
                resizeColumnWidth(tb_LOGS);
            }
            rs5.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(managerLogsForm.this, err.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_LOGS = new javax.swing.JTable();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        placeholder = new javax.swing.JLabel();
        sales = new javax.swing.JButton();
        logs = new javax.swing.JButton();
        lowinventory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGER");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(670, 420));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tb_LOGS.setModel(tbModel);
        tb_LOGS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tb_LOGS.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb_LOGS);

        tablePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 440));

        getContentPane().add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 440));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 440));

        jPanel1.setBackground(new java.awt.Color(31, 9, 11));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 70, 20));

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
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 10));

        placeholder.setText("Lorem Ipsum");
        jPanel1.add(placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        sales.setBackground(new java.awt.Color(255, 255, 255));
        sales.setText("SALES HISTORY");
        sales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sales.setFocusPainted(false);
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        jPanel1.add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 50));

        logs.setBackground(new java.awt.Color(255, 255, 255));
        logs.setText("LOG IN HISTORY");
        logs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logs.setFocusPainted(false);
        logs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsMouseClicked(evt);
            }
        });
        logs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsActionPerformed(evt);
            }
        });
        jPanel1.add(logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, 50));

        lowinventory.setBackground(new java.awt.Color(255, 255, 255));
        lowinventory.setText("LOW INVENTORIES");
        lowinventory.setToolTipText("");
        lowinventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lowinventory.setFocusPainted(false);
        lowinventory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lowinventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowinventoryMouseClicked(evt);
            }
        });
        lowinventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowinventoryActionPerformed(evt);
            }
        });
        jPanel1.add(lowinventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 150, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Refresh_LOGS();
        Refresh_SALES();
        Refresh_InventoryLog();
        Refresh_Inventory();
        managerForm back = new managerForm();
        back.Welcome.setText(placeholder.getText());
        back.setVisible(true);
        dispose();        
    }//GEN-LAST:event_backBtnMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        tbModel.setRowCount(0);  
        if (logs.isEnabled() == false){
            Refresh_LOGS();
            Select();
        } else if (sales.isEnabled() == false){
            Refresh_SALES();
            Select2();
        } else if (lowinventory.isEnabled() == false){
            Refresh_Inventory();
            Select3();
        } else {
        tbModel.setRowCount(0);  
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        tbModel.setRowCount(0);
        Refresh_SALES();
        Select2();
    }//GEN-LAST:event_salesActionPerformed

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        sales.setEnabled(false);
        logs.setEnabled(true);
        lowinventory.setEnabled(true);
    }//GEN-LAST:event_salesMouseClicked

    private void logsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsActionPerformed
        tbModel.setRowCount(0);
        Refresh_LOGS();
        Select();
    }//GEN-LAST:event_logsActionPerformed

    private void logsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsMouseClicked
        logs.setEnabled(false);
        sales.setEnabled(true);
        lowinventory.setEnabled(true);
    }//GEN-LAST:event_logsMouseClicked

    private void lowinventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowinventoryMouseClicked
       lowinventory.setEnabled(false);
       sales.setEnabled(true);
       logs.setEnabled(true);
    }//GEN-LAST:event_lowinventoryMouseClicked

    private void lowinventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowinventoryActionPerformed
        tbModel.setRowCount(0);
        Refresh_Inventory();
        Select3();
    }//GEN-LAST:event_lowinventoryActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new managerLogsForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logs;
    private javax.swing.JButton lowinventory;
    public javax.swing.JLabel placeholder;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton sales;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTable tb_LOGS;
    // End of variables declaration//GEN-END:variables
}
