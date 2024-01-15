/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EimPackage.ReportPackage;

import EimPackage.DAOPackage.Database;
import java.sql.*;
import EimPackage.DAOPackage.ProductDAO;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Reports implements Database {
    
    private Connection con;
    
    
      @Override
    public Connection createConnection() {
        String url = "jdbc:mysql://localhost:3306/razels_schema";
        String dbUsername = "root";
        String dbPassword = "root";
        
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, dbUsername, dbPassword);
            return con;
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return null;
    }
    
    public ArrayList<ProductDAO> lowQuantityReport() {
        con = createConnection();
        String sql = " SELECT * FROM products WHERE prod_Quantity < (SELECT AVG(prod_Quantity)* 0.25 FROM products)";
        ArrayList<ProductDAO> lowProdQuan = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                ProductDAO pro = new ProductDAO(rs.getString("prod_Name"),rs.getInt("prod_Quantity"));
                lowProdQuan.add(pro);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return lowProdQuan;
    }
}
