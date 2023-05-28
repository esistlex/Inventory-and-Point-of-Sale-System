package JavaJunction;

import java.sql.*;
import javax.swing.*;

public class employeeAccountForm extends Connect {  
   
    public employeeAccountForm() {       
        DoConnect();
        initComponents();       
        this.setLocationRelativeTo(null);        
        saveBtn.setEnabled(false);
        idTxtfield.setEditable(false);
        nameTxtfield.setEditable(false);
        passwordTxtfield.setEditable(false);       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidebarPanelOn = new javax.swing.JPanel();
        Employee = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        Inventory = new javax.swing.JLabel();
        Sales = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        thislabel = new javax.swing.JLabel();
        editBtn = new javax.swing.JLabel();
        passwordTxtfield = new javax.swing.JTextField();
        idTxtfield = new javax.swing.JTextField();
        nameTxtfield = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        ID_DISPLAY = new javax.swing.JLabel();
        NAME_DISPLAY = new javax.swing.JLabel();
        PASSWORD_DISPLAY = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

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

        SidebarPanelOn.setBackground(new java.awt.Color(31, 9, 11));
        SidebarPanelOn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Employee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeLogo.png"))); // NOI18N
        Employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });
        SidebarPanelOn.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, 90));

        userName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("lorem ipsum");
        SidebarPanelOn.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 110, -1));

        Inventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InventoryLogo.png"))); // NOI18N
        SidebarPanelOn.add(Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 80));

        Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalesLogo.png"))); // NOI18N
        SidebarPanelOn.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 80));

        Logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutLogo.png"))); // NOI18N
        SidebarPanelOn.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 50));

        getContentPane().add(SidebarPanelOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 420));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thislabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        thislabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thislabel.setText("lorem ipsum");
        MainPanel.add(thislabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 560, 100));

        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        editBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        MainPanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        passwordTxtfield.setText("Password");
        MainPanel.add(passwordTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 200, 40));

        idTxtfield.setText("ID");
        MainPanel.add(idTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 200, 40));

        nameTxtfield.setText("Name");
        MainPanel.add(nameTxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 40));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.setFocusPainted(false);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        MainPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, 20));

        ID_DISPLAY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID_DISPLAY.setText("ID:");
        MainPanel.add(ID_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 20, 40));

        NAME_DISPLAY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NAME_DISPLAY.setText("NAME:");
        MainPanel.add(NAME_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 40, 40));

        PASSWORD_DISPLAY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PASSWORD_DISPLAY.setText("PASSWORD:");
        MainPanel.add(PASSWORD_DISPLAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 80, 40));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        MainPanel.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 60, 20));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 560, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        thislabel.setText("Hello there " +userName.getText()+ "!");
        nameTxtfield.setText(userName.getText());
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
        try {
            String sql = "SELECT * FROM EMPLOYEES WHERE NAME = '"+nameTxtfield.getText()+"'";
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                i = rs.getInt("EMP_ID");
                n = rs.getString("NAME");
                s = rs.getString("PASSWORD");
                idTxtfield.setText(String.valueOf(i));
                nameTxtfield.setText(n);
                passwordTxtfield.setText(s);
            };
            rs.close();
        } 
        
        catch (SQLException e){
            JOptionPane.showMessageDialog(employeeAccountForm.this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        saveBtn.setEnabled(true);
        nameTxtfield.setEditable(true);
        passwordTxtfield.setEditable(true);
        backBtn.setEnabled(false);
        thislabel.setText("EDITING");     
    }//GEN-LAST:event_editBtnMouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        saveBtn.setEnabled(false);
        SidebarPanelOn.setVisible(true);
        nameTxtfield.setEditable(false);
        passwordTxtfield.setEditable(false);
        backBtn.setEnabled(true);
        
        Refresh_RS_STMT();
        int id = Integer.parseInt(idTxtfield.getText());
        String name = nameTxtfield.getText(); 
        String password = passwordTxtfield.getText();
        try {
            String sql = "UPDATE EMPLOYEES SET NAME = '"+name+"', PASSWORD = '"+password+"' WHERE EMP_ID = "+id+"";
            stmt = con.createStatement();
            result = JOptionPane.showConfirmDialog(null, "Are you sure you want to update your profile?", "Confirm?", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
                Refresh_RS_STMT();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Profile has been successfully updated!");
            } else {
                JOptionPane.showMessageDialog(this, "Profile unsuccessfully updated.");
            }
            rs.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        userName.setText(name);
        thislabel.setText("Hello there! " +name);
    }//GEN-LAST:event_saveBtnMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        employeeForm employee1 = new employeeForm();
        employee1.userName.setText(userName.getText());
        employee1.Welcome.setText("Welcome " +this.userName.getText()+"!");
        employee1.setVisible(true);
        dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        employeeForm employee1 = new employeeForm();
        employee1.userName.setText(userName.getText());
        employee1.Welcome.setText("Welcome " +this.userName.getText()+"!");
        employee1.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel ID_DISPLAY;
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel NAME_DISPLAY;
    private javax.swing.JLabel PASSWORD_DISPLAY;
    private javax.swing.JLabel Sales;
    private javax.swing.JPanel SidebarPanelOn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel editBtn;
    private javax.swing.JTextField idTxtfield;
    public javax.swing.JTextField nameTxtfield;
    private javax.swing.JTextField passwordTxtfield;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel thislabel;
    public javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
