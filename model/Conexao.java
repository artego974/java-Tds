/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadoseuze.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/mercadoze";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";
    private static Connection connection;

    public static Connection conectar() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USUARIO, SENHA);
                criarTabela();
            }
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }

    private static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "usuario VARCHAR(255) NOT NULL, " +
                     "senha VARCHAR(255) NOT NULL);";
        
        String sql1 = "CREATE TABLE IF NOT EXISTS Produto (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(255) NOT NULL, " +
                     "descricao TEXT NOT NULL, " +
                     "preco DECIMAL(10,2) NOT NULL, " +
                     "quantidade INT NOT NULL)";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            stmt.execute(sql1);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela", e);
        }
    }
}
