/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EimPackage.DAOPackage;


import java.sql.*;
import java.util.*;

/**
 *
 * @author user
 */
public class RolesDAO implements Database {
    
    Connection con;
   
    
    
    
    
    
    @Override
    public Connection createConnection() {
        String url="jdbc:mysql://localhost:3306/razels_schema";
        String dbUsername="root";
        String dbPassword="root";
        
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, dbUsername, dbPassword);
            return con;
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return null;
    }
    
    
    
    //A function that calls a mysql stored procedure which then returns all the rolenames and the function returns that in a String Collection
     public Collection<String> getRoleNames(){
        Collection<String> roles = new ArrayList<String>();
       
        try {
            con = createConnection();
            CallableStatement cst = con.prepareCall("{Call get_Roles()}");
            Boolean hasResult = cst.execute();
            if (hasResult){
                ResultSet rs = cst.executeQuery();
                while (rs.next()){
                    roles.add(rs.getString("role_Name"));
                }
            }
            else
                return null;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return roles;
    }
}
