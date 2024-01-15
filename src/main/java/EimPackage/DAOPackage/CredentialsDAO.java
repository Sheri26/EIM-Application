/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EimPackage.DAOPackage;


import java.sql.*;

/**
 *
 * @author user
 */
public class CredentialsDAO implements Database {
    
    Connection con;
    
    
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
    
    
    
    public String[] getCredentials (int empNo){
        
        String creds[] = new String[2];
        try {
            con = createConnection();
            String query = "SELECT username, password FROM credentials WHERE fk_Emp_No = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,empNo);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                creds[0] = rs.getString("username");
                creds[1] = rs.getString("password");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return creds;
    }
}
