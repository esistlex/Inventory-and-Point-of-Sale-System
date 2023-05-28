package JavaJunction;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class adminEmployeeForm extends Connect {
    
    DefaultTableModel tbModel = new DefaultTableModel();
    int x = 0;
 
    public adminEmployeeForm() {       
        initComponents();
        this.setLocationRelativeTo(null);
        DoConnect();
        Select();
        placeholder.setVisible(false);
        tb_EMPLOYEES.setDefaultEditor(Object.class, null);
        tb_EMPLOYEES.setCellSelectionEnabled(false);
        tb_EMPLOYEES.setRowSelectionAllowed(true);
    }
    
     public void resizeColumnWidth(JTable tb_EMPLOYEES) {
    final TableColumnModel columnModel = tb_EMPLOYEES.getColumnModel();
    for (int column = 0; column < tb_EMPLOYEES.getColumnCount(); column++) {
        int width = 15;
        for (int row = 0; row < tb_EMPLOYEES.getRowCount(); row++) {
            TableCellRenderer renderer = tb_EMPLOYEES.getCellRenderer(row, column);
            Component comp = tb_EMPLOYEES.prepareRenderer(renderer, row, column);
            width = Math.max(comp.getPreferredSize().width +1 , width);
        }
        width = Math.max(width, tb_EMPLOYEES.getColumnModel().getColumn(column).getPreferredWidth());
        if(width > 300){
            width = 300;
        }
        columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
        
    void Get_Set_Records(){
        try{
            i = rs.getInt("EMP_ID");
            n = rs.getString("NAME");
            s = rs.getString("PASSWORD");
            u = rs.getString("TYPE");
            employeeidTxtField.setText(String.valueOf(i));
            nameTxtField.setText(n);
            passwordTxtField.setText(s);
            typeField.setSelectedItem(u);
        } catch (SQLException err){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, err.getMessage());
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
        String [] columnNames = {"ID", "NAME", "PASSWORD", "TYPE"};
        tbModel.setColumnIdentifiers(columnNames);
        try{
            while(rs.next()){
                i = rs.getInt("EMP_ID");
                n = rs.getString("NAME");
                s = rs.getString("PASSWORD");
                u = rs.getString("TYPE");
                tb_EMPLOYEES.setVisible(true);
                tbModel.addRow(new Object [] {i,n,s,u});
                x++;
                resizeColumnWidth(tb_EMPLOYEES);
            }
            rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, err.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_EMPLOYEES = new javax.swing.JTable();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        refreshBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        employeeidTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JTextField();
        typeField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        searchTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        placeholder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
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

        tb_EMPLOYEES.setModel(tbModel);
        tb_EMPLOYEES.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tb_EMPLOYEES.getTableHeader().setReorderingAllowed(false);
        tb_EMPLOYEES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_EMPLOYEESMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_EMPLOYEES);

        tablePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

        getContentPane().add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, 20));

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
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, 20));

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
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TYPE:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel1.add(employeeidTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, -1));
        employeeidTxtField.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMPLOYEE ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("");

        jPanel1.add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, -1));
        nameTxtField.getAccessibleContext().setAccessibleName("");

        jPanel1.add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));
        passwordTxtField.getAccessibleContext().setAccessibleName("");

        typeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "MANAGER", "EMPLOYEE" }));
        jPanel1.add(typeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, -1));
        typeField.getAccessibleContext().setAccessibleName("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EMPLOYEE NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
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
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SEARCH NAME:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtFieldKeyReleased(evt);
            }
        });
        jPanel1.add(searchTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setFocusPainted(false);
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 150, 10));

        placeholder.setText("Lorem Ipsum");
        jPanel1.add(placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        MainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 150, 440));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Refresh_RS_STMT();
        adminForm adminBack1 = new adminForm();
        adminBack1.Welcome.setText(placeholder.getText());
        adminBack1.setVisible(true);
        dispose();        
    }//GEN-LAST:event_backBtnMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        Refresh_RS_STMT();
        tbModel.setRowCount(0);
        Select();
        employeeidTxtField.setText(null);
        nameTxtField.setText(null);
        passwordTxtField.setText(null);
        typeField.setSelectedItem(0);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void tb_EMPLOYEESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_EMPLOYEESMouseClicked
        int i = tb_EMPLOYEES.getSelectedRow();
        TableModel model = tb_EMPLOYEES.getModel();
        employeeidTxtField.setText(model.getValueAt(i, 0).toString());
        nameTxtField.setText(model.getValueAt(i, 1).toString());
        passwordTxtField.setText(model.getValueAt(i, 2).toString());
        String type = model.getValueAt(i, 3).toString();
            switch(type){
                case "ADMIN":
                    typeField.setSelectedIndex(0);
                    break;
                case "MANAGER":
                    typeField.setSelectedIndex(1);
                    break;
                case "EMPLOYEE":
                    typeField.setSelectedIndex(2);
                    break;
            }        
    }//GEN-LAST:event_tb_EMPLOYEESMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        Refresh_RS_STMT();
        i = Integer.parseInt(employeeidTxtField.getText());
        try{
            System.out.println(i);
            String sql = "DELETE FROM EMPLOYEES WHERE EMP_ID = " +i+ "";
            stmt = con.createStatement();
            result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this Employee?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){                           
                Refresh_RS_STMT();
                showAll();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(adminEmployeeForm.this, "Employee has been successfully deleted!");
                Refresh_RS_STMT();
                tb_EMPLOYEES.revalidate();
                DefaultTableModel model = (DefaultTableModel)tb_EMPLOYEES.getModel();
                model.setRowCount(0);
                Select();
                rs.close();
            } else {
                    JOptionPane.showMessageDialog(this, "Employee not deleted.");
                    rs.close();
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, e.getMessage());
        }
        employeeidTxtField.setText(null);
        nameTxtField.setText(null);
        passwordTxtField.setText(null);
        typeField.setSelectedIndex(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        Refresh_RS_STMT();
        i = Integer.parseInt(employeeidTxtField.getText());
        n = nameTxtField.getText();
        s = passwordTxtField.getText();
        u = String.valueOf(typeField.getSelectedItem());
        try{
            String sql = "UPDATE EMPLOYEES SET NAME='"+n+"', PASSWORD='"+s+"', TYPE='"+u+"' WHERE EMP_ID="+i+"";
            stmt = con.createStatement();
            result = JOptionPane.showConfirmDialog(null, "Are you sure you want to edit this Employee?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
                Refresh_RS_STMT();
                showAll();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(adminEmployeeForm.this, "Employee has been successfully updated!");
                Refresh_RS_STMT();
                tb_EMPLOYEES.revalidate();
                DefaultTableModel model = (DefaultTableModel)tb_EMPLOYEES.getModel();
                model.setRowCount(0);
                Select();
                rs.close();
            } else {
                    JOptionPane.showMessageDialog(this, "Employee not updated.");
                    rs.close();
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, e.getMessage());
        }        
        employeeidTxtField.setText(null);
        nameTxtField.setText(null);
        passwordTxtField.setText(null);
        typeField.setSelectedIndex(0);
    }//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Refresh_RS_STMT();
        i = Integer.parseInt(employeeidTxtField.getText());
        n = nameTxtField.getText();
        s = passwordTxtField.getText();
        u = String.valueOf(typeField.getSelectedItem());
        try {            
            rs.moveToInsertRow();
            rs.updateInt("EMP_ID", i);
            rs.updateString("NAME", n);
            rs.updateString("PASSWORD", s);
            rs.updateString("TYPE", u);
            rs.insertRow();
            Refresh_RS_STMT();
            tb_EMPLOYEES.revalidate();
            DefaultTableModel model = (DefaultTableModel)tb_EMPLOYEES.getModel();
            model.setRowCount(0);
            Select();
            JOptionPane.showMessageDialog(adminEmployeeForm.this, "Employee sucessfully added!");
            rs.close();
        } catch (SQLException err){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, "Employee unsucessfully added!");
            System.out.println(err.getMessage());
        }
        employeeidTxtField.setText(null);
        nameTxtField.setText(null);
        passwordTxtField.setText(null);
        typeField.setSelectedIndex(0);
    }//GEN-LAST:event_addBtnActionPerformed

    private void searchTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtFieldKeyReleased
        Refresh_RS_STMT();
        String search = searchTxtField.getText();
        if ("".equals(search)){
            tbModel.setRowCount(0);
            Select();
        }else{
        try{
            String sql = "SELECT * FROM EMPLOYEES WHERE NAME LIKE '"+search+"%'";
            stmt = con.createStatement();           
            rs = stmt.executeQuery(sql);
            tbModel.setRowCount(0);
            if(rs.next()){
                int i = 0;
                i = rs.getInt("EMP_ID");
                n = rs.getString("NAME");
                s = rs.getString("PASSWORD");
                u = rs.getString("TYPE");
                tbModel.addRow(new Object [] {i, n, s, u});
                i++;
            }
            rs.close();            
        } catch (SQLException e){
            JOptionPane.showMessageDialog(adminEmployeeForm.this, e.getMessage());
        }
        }
    }//GEN-LAST:event_searchTxtFieldKeyReleased
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {               
                new adminEmployeeForm().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField employeeidTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField passwordTxtField;
    public javax.swing.JLabel placeholder;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTable tb_EMPLOYEES;
    private javax.swing.JComboBox<String> typeField;
    // End of variables declaration//GEN-END:variables
}
