/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetosenai.dao;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author weslleyjoaquim
 */
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
