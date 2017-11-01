/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    
    public static Connection getConnection(){
        try {
    
            return DriverManager.getConnection("jdbc:mysq://localhost:3306/vendas_db","root","sa");
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
}
    
    
    }
}
