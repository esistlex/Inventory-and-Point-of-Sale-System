package JavaJunction;

import java.sql.*;
import javax.swing.*;

public class adminForm extends Connect {  
    
    public adminForm() {       
        initComponents();       
        this.setLocationRelativeTo(null);        
        EmployeeBtn.setVisible(false);
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogoutBtn.setVisible(false);
        LogsBtn.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashBoard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SidebarPanelOn = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();
        Logs = new javax.swing.JLabel();
        Sales = new javax.swing.JLabel();
        Inventory = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        LogsBtn = new javax.swing.JLabel();
        SalesBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        InventoryBtn = new javax.swing.JLabel();
        EmployeeBtn = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashBoard.setBackground(new java.awt.Color(31, 9, 11));
        dashBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dashBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo_menu.png"))); // NOI18N
        dashBoard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 560, 100));

        getContentPane().add(dashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 90));

        SidebarPanelOn.setBackground(new java.awt.Color(31, 9, 11));
        SidebarPanelOn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SidebarPanelOnMouseMoved(evt);
            }
        });
        SidebarPanelOn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoutLogo.png"))); // NOI18N
        Logout.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogoutMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 70, 50));

        Logs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Logs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogLogo.png"))); // NOI18N
        Logs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logs.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                LogsMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Logs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 80));

        Sales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalesLogo.png"))); // NOI18N
        Sales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sales.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SalesMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, 80));

        Inventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InventoryLogo.png"))); // NOI18N
        Inventory.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InventoryMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 80));

        Employee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EmployeeLogo.png"))); // NOI18N
        Employee.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EmployeeMouseMoved(evt);
            }
        });
        SidebarPanelOn.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 80));

        getContentPane().add(SidebarPanelOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 540));

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setForeground(new java.awt.Color(255, 255, 255));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogsBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        LogsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogsBtn.setText("LOGS");
        LogsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogsBtnMouseClicked(evt);
            }
        });
        MainPanel.add(LogsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 80));

        SalesBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        SalesBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalesBtn.setText("SALES");
        SalesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesBtnMouseClicked(evt);
            }
        });
        MainPanel.add(SalesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 80));

        LogoutBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        LogoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LogoutBtn.setText("LOG OUT");
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });
        MainPanel.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 160, 50));

        InventoryBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        InventoryBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InventoryBtn.setText("INVENTORY");
        InventoryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventoryBtnMouseClicked(evt);
            }
        });
        MainPanel.add(InventoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 80));

        EmployeeBtn.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        EmployeeBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmployeeBtn.setText("EMPLOYEE");
        EmployeeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EmployeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeBtnMouseClicked(evt);
            }
        });
        MainPanel.add(EmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 80));

        Welcome.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        Welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Welcome.setText("lorem ipsum");
        Welcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MainPanel.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 280, 40));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SLogo_Menu.png"))); // NOI18N
        MainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 560, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void SidebarPanelOnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarPanelOnMouseMoved
        EmployeeBtn.setVisible(false);
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogoutBtn.setVisible(false);
        LogsBtn.setVisible(false);
    }//GEN-LAST:event_SidebarPanelOnMouseMoved

    private void EmployeeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseMoved
        EmployeeBtn.setVisible(true);
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogoutBtn.setVisible(false);
        LogsBtn.setVisible(false);
    }//GEN-LAST:event_EmployeeMouseMoved

    private void InventoryMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryMouseMoved
       InventoryBtn.setVisible(true);
       EmployeeBtn.setVisible(false);
       SalesBtn.setVisible(false);
       LogoutBtn.setVisible(false);
       LogsBtn.setVisible(false);
    }//GEN-LAST:event_InventoryMouseMoved

    private void SalesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMouseMoved
        SalesBtn.setVisible(true);
        EmployeeBtn.setVisible(false);
        InventoryBtn.setVisible(false);
        LogoutBtn.setVisible(false);
        LogsBtn.setVisible(false);
    }//GEN-LAST:event_SalesMouseMoved

    private void LogoutMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseMoved
        LogoutBtn.setVisible(true);
        EmployeeBtn.setVisible(false);
        InventoryBtn.setVisible(false);
        SalesBtn.setVisible(false);
        LogsBtn.setVisible(false);
    }//GEN-LAST:event_LogoutMouseMoved

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        dispose();
        new loginForm().setVisible(true);
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void EmployeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeBtnMouseClicked
        adminEmployeeForm adminEmployee = new adminEmployeeForm();
        adminEmployee.placeholder.setText(Welcome.getText());
        adminEmployee.setVisible(true);
        dispose();        
    }//GEN-LAST:event_EmployeeBtnMouseClicked

    private void InventoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventoryBtnMouseClicked
        adminInventoryForm adminInventory = new adminInventoryForm();
        adminInventory.placeholder.setText(Welcome.getText());
        adminInventory.setVisible(true);        
        dispose();
    }//GEN-LAST:event_InventoryBtnMouseClicked

    private void SalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesBtnMouseClicked
        adminSales sales = new adminSales();
        sales.placeholder.setText(Welcome.getText());
        sales.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalesBtnMouseClicked

    private void LogsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogsMouseMoved
        SalesBtn.setVisible(false);
        EmployeeBtn.setVisible(false);
        InventoryBtn.setVisible(false);
        LogoutBtn.setVisible(false);
        LogsBtn.setVisible(true);
    }//GEN-LAST:event_LogsMouseMoved

    private void LogsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogsBtnMouseClicked
        adminLogsForm logs = new adminLogsForm();
        logs.placeholder.setText(Welcome.getText());
        logs.setVisible(true);
        dispose();
    }//GEN-LAST:event_LogsBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel EmployeeBtn;
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel InventoryBtn;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel Logs;
    private javax.swing.JLabel LogsBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Sales;
    private javax.swing.JLabel SalesBtn;
    private javax.swing.JPanel SidebarPanelOn;
    public javax.swing.JLabel Welcome;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
