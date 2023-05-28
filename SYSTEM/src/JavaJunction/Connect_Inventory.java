package JavaJunction;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Connect_Inventory extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();
    double product_price;
    int newID, product_id, product_quantity, temp_user, curRow, result;
    String newPASS, newUSERTYPE, user, product_name, product_status, product_quantity_type, product_category, temp_pass, temp_usertype;
    
public void DoConnect(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con = DriverManager.getConnection(host, uName, uPass);
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM JAVAGENIUS.INVENTORY";
        rs = stmt.executeQuery(sql);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect_Inventory.this, err.getMessage());
    }
}

public void Refresh_RS_STMT(){
    try {
        stmt.close();
        rs.close();
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM JAVAGENIUS.INVENTORY";
        rs = stmt.executeQuery(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Connect_Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con2;
Statement stmt2;
ResultSet rs2;
String datetime, name, sql2;
int quantity;

public void DoConnectSales(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con2 = DriverManager.getConnection(host, uName, uPass);
        stmt2 = con2.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql2 = "SELECT * FROM JAVAGENIUS.SALES";
        rs2 = stmt2.executeQuery(sql2);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect_Inventory.this, err.getMessage());
    }
}

public void Refresh_LOGS(){
    try {
        stmt2.close();
        rs2.close();
        stmt2 = con2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql2 = "SELECT * FROM JAVAGENIUS.SALES";
        rs2 = stmt2.executeQuery(sql2);
    } catch (SQLException ex) {
        Logger.getLogger(Connect_Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con3;
Statement stmt3;
ResultSet rs3;
String sql3;

public void DoConnectINVENTORYLOG(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con3 = DriverManager.getConnection(host, uName, uPass);
        stmt3 = con3.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql3 = "SELECT * FROM JAVAGENIUS.INVENTORYLOG";
        rs3 = stmt3.executeQuery(sql3);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect_Inventory.this, err.getMessage());
    }
}
}
