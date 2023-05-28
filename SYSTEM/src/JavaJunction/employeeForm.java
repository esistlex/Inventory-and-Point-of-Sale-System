package JavaJunction;

import java.sql.*;
import java.util.Set;
import javax.swing.*;

public class employeeForm extends Connect {  
   
    public employeeForm() {       
        initComponents();       
        this.setLocationRelativeTo(null);        
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogoutBtn.setVisible(false);   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logout = new javax.swing.JLabel();
        SidebarPanelOn = new javax.swing.JPanel();
        Employee = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        Inventory = new javax.swing.JLabel();
        Sales = new javax.swing.JLabel();
        SidebarPanelOn1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        SalesBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        InventoryBtn = new javax.swing.JLabel();

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

        Logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutLogo.png"))); // NOI18N
        Logout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogoutMouseMoved(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 70, 50));

        SidebarPanelOn.setBackground(new java.awt.Color(31, 9, 11));
        SidebarPanelOn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SidebarPanelOnMouseMoved(evt);
            }
        });
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
        Inventory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InventoryMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 80));

        Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalesLogo.png"))); // NOI18N
        Sales.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SalesMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 80));

        getContentPane().add(SidebarPanelOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 420));

        SidebarPanelOn1.setBackground(new java.awt.Color(31, 9, 11));
        SidebarPanelOn1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SidebarPanelOn1MouseMoved(evt);
            }
        });
        SidebarPanelOn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_menu.png"))); // NOI18N
        SidebarPanelOn1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 560, 90));

        getContentPane().add(SidebarPanelOn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SLogo_Menu.png"))); // NOI18N
        MainPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        Welcome.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("lorem ipsum");
        Welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainPanel.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 560, 30));

        SalesBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SalesBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesBtn.setText("SALES");
        SalesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesBtnMouseClicked(evt);
            }
        });
        MainPanel.add(SalesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 80));

        LogoutBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        LogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoutBtn.setText("LOG OUT");
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });
        MainPanel.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 160, 50));

        InventoryBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        InventoryBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InventoryBtn.setText("INVENTORY");
        InventoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryBtnMouseClicked(evt);
            }
        });
        MainPanel.add(InventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 80));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 560, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void SidebarPanelOnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarPanelOnMouseMoved
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogoutBtn.setVisible(false);
    }//GEN-LAST:event_SidebarPanelOnMouseMoved

    private void InventoryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseMoved
       InventoryBtn.setVisible(true);
       SalesBtn.setVisible(false);
       LogoutBtn.setVisible(false);
    }//GEN-LAST:event_InventoryMouseMoved

    private void SalesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseMoved
        SalesBtn.setVisible(true);
        InventoryBtn.setVisible(false);
        LogoutBtn.setVisible(false);
    }//GEN-LAST:event_SalesMouseMoved

    private void LogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseMoved
        LogoutBtn.setVisible(true);
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
    }//GEN-LAST:event_LogoutMouseMoved

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        new loginForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void InventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryBtnMouseClicked
        employeeInventoryForm employeeInventory = new employeeInventoryForm();
        employeeInventory.placeholder.setText(userName.getText());
        employeeInventory.setVisible(true);        
        dispose();
    }//GEN-LAST:event_InventoryBtnMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        employeeAccountForm employee1 = new employeeAccountForm();
        employee1.userName.setText(this.userName.getText());
        employee1.nameTxtfield.setText(this.userName.getText());
        employee1.setVisible(true);
        dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void SalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesBtnMouseClicked
        employeeSales sales = new employeeSales();
        sales.placeholder.setText(userName.getText());
        sales.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalesBtnMouseClicked

    private void SidebarPanelOn1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarPanelOn1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SidebarPanelOn1MouseMoved

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel InventoryBtn;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Sales;
    private javax.swing.JLabel SalesBtn;
    private javax.swing.JPanel SidebarPanelOn;
    private javax.swing.JPanel SidebarPanelOn1;
    public javax.swing.JLabel Welcome;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
