/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EimPackage.DAOPackage;


import java.sql.*;
import java.util.*;
import java.awt.Component;



/**
 *
 * @author user
 */
public class SupplierDAO implements Database {
    
    private int suppId;
    private String suppName;
    Connection con;
    
    public SupplierDAO(){
        
    }

    public SupplierDAO(int suppId, String suppName) {
        this.suppId = suppId;
        this.suppName = suppName;
    }

    public int getSuppId() {
        return suppId;
    }

    public void setSuppId(int suppId) {
        this.suppId = suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }

    
    
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
    
    //## create inputs for suppContactN and suppContactP
    public void registerSupplier(String suppName, String suppContactN, String suppContactP){
        con = createConnection();
        try { 
           PreparedStatement st = con.prepareStatement("INSERT INTO suppliers(supp_Name,supp_Contact_Person_Name,supp_Contact_Person_Number) VALUES (?,?,?)");
           st.setString(1,suppName);
           st.setString(2,suppContactP);
           st.setString(3,suppContactN);
           st.executeUpdate();
           st.close();
           con.close();
        } catch (Exception ex) {
            System.out.println(ex);
       } 
    }
     
     
  // A function that removes a supplier entity from the database using sql queries and JDBC
    public int removeSupplier(int suppId,Component pComp){
        
        int results = 0 ;
        con = createConnection();
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM suppliers WHERE supp_Id = ?");
            st.setInt(1,suppId);
            results = st.executeUpdate(); 
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return results;
        
    }
    
    
    
    // A function that updates the name attribute of the supplier entity in the database using sql queries and JDBC
    public void updateSupplier(int suppId,String newSuppName){
        con = createConnection();
        try {
            PreparedStatement st = con.prepareStatement("UPDATE suppliers SET supp_Name = ? WHERE supp_Id = ? ");
            st.setString(1,newSuppName);
            st.setInt(2,suppId);
            int results = st.executeUpdate();
            st.close();
            con.close();
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
     
     
     

    //A function that is used to search for a supplier by sql LIKE function and supplier Name
    public HashMap<String,Integer> searchSupplier(String suppName){
        con = createConnection();
        HashMap<String,Integer> suppDetails = new HashMap<>(); 
        
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM suppliers WHERE supp_Name LIKE CONCAT(?,'%')");
            st.setString(1,suppName);
            ResultSet rs = st.executeQuery();
            
            
            while(rs.next()){
                this.setSuppId(rs.getInt("supp_Id"));
                this.setSuppName(rs.getString("supp_Name"));
                suppDetails.put(this.getSuppName(),this.getSuppId());
            }
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return suppDetails;
    }
    
    
    //A function that communicates with a mysql stored procedure to return all supplier names
    public ArrayList<String> getSupplierNames(){
        ArrayList<String> suppliers = new ArrayList<String>();
       
        try {
            con = createConnection();
            CallableStatement cst = con.prepareCall("{Call get_Suppliers()}");
            Boolean hasResult = cst.execute();
            if (hasResult == true){
                ResultSet rs = cst.executeQuery();
                while (rs.next()){
                    suppliers.add((rs.getString("supp_Name")));
                }
               
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return suppliers;
    }
    
}
