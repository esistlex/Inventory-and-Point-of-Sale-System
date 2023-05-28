package JavaJunction;

import java.sql.*;
import java.time.LocalDateTime;
import javax.swing.*;
import java.time.format.DateTimeFormatter;    

public class loginForm extends Connect {  
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatnow = DateTimeFormatter.ofPattern("E, MMM.dd.yyyy 'at' hh:mm:ss a");
    String today = now.format(formatnow);
  
    public loginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        DoConnect();
        DoConnectLog();
        Placeholder.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        MiddlePanel = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        Login_Panel = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        PasswordLabel = new javax.swing.JLabel();
        EmployeeIDLabel = new javax.swing.JLabel();
        employeeid_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        EmployeeIDLabel1 = new javax.swing.JLabel();
        employeename_field = new javax.swing.JTextField();
        Placeholder = new javax.swing.JLabel();
        designLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Panel.setBackground(new java.awt.Color(31, 9, 11));
        Main_Panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Main_Panel.setForeground(new java.awt.Color(255, 255, 255));
        Main_Panel.setPreferredSize(new java.awt.Dimension(815, 500));
        Main_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MiddlePanel.setBackground(new java.awt.Color(31, 9, 11));
        MiddlePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        MiddlePanel.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 560, 250));

        Login_Panel.setBackground(new java.awt.Color(31, 9, 11));
        Login_Panel.setForeground(new java.awt.Color(255, 255, 255));
        Login_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeLabel.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Welcome Back!");
        Login_Panel.add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 530, -1));

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setFocusPainted(false);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginBtn.setName(""); // NOI18N
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        Login_Panel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 60, 20));

        PasswordLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password:");
        Login_Panel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 20));

        EmployeeIDLabel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        EmployeeIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeIDLabel.setText("Employee ID:");
        Login_Panel.add(EmployeeIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 20));
        Login_Panel.add(employeeid_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, 20));
        Login_Panel.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 150, 20));

        EmployeeIDLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        EmployeeIDLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeIDLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmployeeIDLabel1.setText("Employee Name:");
        Login_Panel.add(EmployeeIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 20));
        Login_Panel.add(employeename_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 150, 20));

        MiddlePanel.add(Login_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 530, 260));

        Placeholder.setText("Lorem ipsum");
        MiddlePanel.add(Placeholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        Main_Panel.add(MiddlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 500));

        designLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design.png"))); // NOI18N
        designLabel.setText("jLabel1");
        Main_Panel.add(designLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        getContentPane().add(Main_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon icon = new ImageIcon("src/SLogo_Menu.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowOpened

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        adminForm admin1 = new adminForm();
        managerForm manager1 = new managerForm(); 
        employeeForm employee1 = new employeeForm();
        user = employeeid_field.getText();
        newID = Integer.parseInt(user);
        newNAME = employeename_field.getText();
        newPASS = String.valueOf(password_field.getPassword());    
        
        try {
            rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");
            while (rs.next()){
                i = rs.getInt("EMP_ID");
                n = rs.getString("NAME");
                s = rs.getString("PASSWORD");
                u = rs.getString("TYPE");
                
                if (newID == i){
                    if (newNAME.equals(n)){
                        if (newPASS.equals(s)){
                            sql2 = "INSERT INTO LOGS (DATE_AND_TIME, EMP_NAME, EMP_TYPE) VALUES (?, ?, ?)";
                            PreparedStatement statement = con2.prepareStatement(sql2);
                            switch (u) {
                                case "ADMIN":
                                    temp_user = newID;
                                    temp_pass = newPASS;                                  
                                    statement.setString(1, today);
                                    statement.setString(2, n);
                                    statement.setString(3, u);
                                    statement.execute();                                 
                                    admin1.Welcome.setText("Welcome "+n+"!");
                                    admin1.setVisible(true);
                                    dispose();
                                    break;
                                case "MANAGER":
                                    temp_user = newID;
                                    temp_pass = newPASS;        
                                    statement = con2.prepareStatement(sql2);
                                    statement.setString(1, today);
                                    statement.setString(2, n);
                                    statement.setString(3, u);
                                    statement.execute();
                                    manager1.Welcome.setText("Welcome "+n+"!");
                                    manager1.setVisible(true);
                                    dispose();
                                    break;
                                case "EMPLOYEE":
                                    temp_user = newID;
                                    temp_pass = newPASS;
                                    statement = con2.prepareStatement(sql2);
                                    statement.setString(1, today);
                                    statement.setString(2, n);
                                    statement.setString(3, u);
                                    statement.execute();
                                    employee1.Welcome.setText("Welcome "+n+"!");
                                    employee1.userName.setText(n);
                                    employee1.setVisible(true);
                                    dispose();
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Invalid credentials, please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                            }
                        }
                    }
                }                
            }
            
            if (newID != temp_user){
                if (newPASS != temp_pass){
                    JOptionPane.showMessageDialog(null, "Invalid credentials, please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    employeeid_field.setText(null);
                    employeename_field.setText(null);
                    password_field.setText(null);
                }
            }
            
            rs.close();
        }catch (SQLException e) {
            System.out.println(e);
            }       
    }//GEN-LAST:event_loginBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmployeeIDLabel;
    private javax.swing.JLabel EmployeeIDLabel1;
    private javax.swing.JPanel Login_Panel;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JLabel PasswordLabel;
    public javax.swing.JLabel Placeholder;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel designLabel;
    private javax.swing.JTextField employeeid_field;
    private javax.swing.JTextField employeename_field;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo2;
    private javax.swing.JPasswordField password_field;
    // End of variables declaration//GEN-END:variables
}