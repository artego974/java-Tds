/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadoseuze.controller;

import com.mycompany.lojadoseuze.model.Produto;
import com.mycompany.lojadoseuze.model.ProdutoDAO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class ProdutoController {
    private ProdutoDAO produtoDAO = new ProdutoDAO();
    public boolean criarProduto(String nome, String descricao, double preco, int quantidade) {
        return produtoDAO.criarProduto(nome, descricao, preco, quantidade);
    }
    public List<Produto> listarProdutos() {
        return produtoDAO.listarProdutos();
    }
    public boolean atualizarProduto(int id, String nome, String descricao, double preco, int quantidade) {
        return produtoDAO.atualizarProduto(id,nome, descricao, preco, quantidade);
    }
    public void deletarProduto(Connection conectar, int id) {
        produtoDAO.deletarProduto(conectar, id);
    } 
}
