/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadoseuze.model;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class Usuario {
    private int id;
    private String usuario;
    private String senha;

    public Usuario(int id, String usuario, String senha) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
    }
    public int getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getSenha() { return senha; }
    public void setId(int id) {this.id = id;}
    public void setUsuario(String usuario) {this.usuario = usuario;}
    public void setSenha(String senha) {this.senha = senha;}
}
