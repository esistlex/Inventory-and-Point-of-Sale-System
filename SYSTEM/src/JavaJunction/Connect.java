package JavaJunction;

import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Connect extends javax.swing.JFrame {

    static TableModel resultSetToTableModel(Statement stmt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();   
    int newID, i, temp_user, curRow, result;
    String newPASS, newNAME, user, date, time, s, n, u, temp_pass, temp_usertype;
    
public void DoConnect(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con = DriverManager.getConnection(host, uName, uPass);
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM EMPLOYEES";
        rs = stmt.executeQuery(sql);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect.this, err.getMessage());
    }
}

public void Refresh_RS_STMT(){
    try {
        stmt.close();
        rs.close();
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "SELECT * FROM EMPLOYEES";
        rs = stmt.executeQuery(sql);
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con2;
Statement stmt2;
ResultSet rs2;
String sql2;
String a, b, c, d, e;
double amountdue;

public void DoConnectLog(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con2 = DriverManager.getConnection(host, uName, uPass);
        stmt2 = con2.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql2 = "SELECT * FROM LOGS";
        rs2 = stmt2.executeQuery(sql2);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect.this, err.getMessage());
    }
}

public void Refresh_LOGS(){
    try {
        stmt2.close();
        rs2.close();
        stmt2 = con2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        sql2 = "SELECT * FROM LOGS";
        rs2 = stmt2.executeQuery(sql2);
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con3;
Statement stmt3;
ResultSet rs3;
int productquantity;
String sql3, productname;

public void DoConnectSales(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con3 = DriverManager.getConnection(host, uName, uPass);
        stmt3 = con3.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql3 = "SELECT * FROM SALES";
        rs3 = stmt3.executeQuery(sql3);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect.this, err.getMessage());
    }
}

public void Refresh_SALES(){
    try {
        stmt3.close();
        rs3.close();
        stmt3 = con3.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        sql3 = "SELECT * FROM SALES";
        rs3 = stmt3.executeQuery(sql3);
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con4;
Statement stmt4;
ResultSet rs4;
String sql4;

String product1, product4, name, type, action;
int product2;
double product3;

public void DoConnectInventoryLog(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con4 = DriverManager.getConnection(host, uName, uPass);
        stmt4 = con4.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        sql4 = "SELECT * FROM INVENTORYLOG";
        rs4 = stmt4.executeQuery(sql4);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect.this, err.getMessage());
    }
}

public void Refresh_InventoryLog(){
    try {
        stmt4.close();
        rs4.close();
        stmt4 = con4.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        sql4 = "SELECT * FROM INVENTORYLOG";
        rs4 = stmt4.executeQuery(sql4);
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
}

Connection con5;
Statement stmt5;
ResultSet rs5;
String sql5;

int inventory_id, inventory_qty;
double inventory_price;
String inventory_productname, inventory_stat, inventory_cat;

public void DoConnectInventory(){
    try{
        String host = "jdbc:derby://localhost:1527/Java Junction";
        String uName = "JavaGenius";
        String uPass = "Mocha789";
        con5 = DriverManager.getConnection(host, uName, uPass);
        stmt5 = con5.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        String sql5 = "SELECT * FROM JAVAGENIUS.INVENTORY WHERE PRODUCT_STATUS IN ('LOW STOCK', 'OUT OF STOCK')";
        rs5 = stmt5.executeQuery(sql5);
    }catch(SQLException err){
        JOptionPane.showMessageDialog(Connect.this, err.getMessage());
    }
}

public void Refresh_Inventory(){
    try {
        stmt5.close();
        rs5.close();
        stmt5 = con5.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql5 = "SELECT * FROM JAVAGENIUS.INVENTORY WHERE PRODUCT_STATUS IN ('LOW STOCK', 'OUT OF STOCK')";
        rs5 = stmt5.executeQuery(sql5);
    } catch (SQLException ex) {
        Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
