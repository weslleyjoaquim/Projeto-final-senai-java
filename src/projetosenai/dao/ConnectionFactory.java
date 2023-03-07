
package projetosenai.dao;

import java.sql.*;
import java.sql.Connection;

public class ConnectionFactory {
    
    public static Connection conexao(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/senai";
        String user = "root";
        String password = "P@ss123";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
       
        
    }
    
}
