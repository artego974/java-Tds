/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadoseuze.model;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mycompany.lojadoseuze.model.Produto;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class ProdutoDAO {
    public boolean criarProduto(String nome, String descricao, double preco, int quantidade) {
        String sql = "INSERT INTO Produto(nome, descricao, preco, quantidade) VALUES(?, ?, ?, ?)";
        

        try (Connection conn = Conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setDouble(3, preco);
            stmt.setInt(4, quantidade);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean atualizarProduto(int Id, String nome, String descricao, double preco, int quantidade) {
        String sql = "UPDATE produto SET nome = ?, descricao = ? , quantidade = ?, preco = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, descricao);
            stmt.setDouble(3, preco);
            stmt.setInt(4, quantidade);
            stmt.setInt(5, Id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deletarProduto(Connection conectar, int id){
        
        String sql = "DELETE FROM Produto WHERE id = ?";
        
        try(PreparedStatement pstmt = conectar.prepareStatement(sql)){
            
            pstmt.setInt(1, id);
            
            int rowsDeleted = pstmt.executeUpdate();
             if (rowsDeleted > 0) { 
                // Se pelo menos um usuário foi deletado, exibe uma mensagem de sucesso
                System.out.println("Produto deletado com sucesso!");
                return true;
            } else {
                // Caso contrário, informa que nenhum usuário foi encontrado com o ID fornecido
                System.out.println("Nenhum produto encontrado com o ID fornecido.");
                return false;
            }
        } catch (Exception e) {
            // Captura qualquer exceção que ocorra durante a execução do código e exibe a mensagem de erro
            System.out.println("Erro ao deletar produto: " + e.getMessage());
        }  
        return false;
    }
    
    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produto";
        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                produtos.add(new Produto(rs.getInt("id"), 
                    rs.getString("nome"), 
                rs.getString("descricao"), 
                   rs.getDouble("preco"),
               rs.getInt("quantidade")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }
}
