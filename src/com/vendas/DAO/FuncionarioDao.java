/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.DAO;

import com.vendas.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class FuncionarioDao {
    
    Connection conn = new Conexao().getConnection();
    
    public boolean loginFuncionario(String emailFuncionario) throws SQLException {
    
        boolean login = false;
        String query = "select emailFuncionario from funcionario when emailFuncionario like ? ";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
        stmt = conn.prepareStatement(query);
        stmt.setString(1, emailFuncionario);
        rs = stmt.executeQuery();
        while(rs.next()) {
            login=true;
        }
        rs.close();
        stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            conn.close();
        } return login;
    }
}
        



