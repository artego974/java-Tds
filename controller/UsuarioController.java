/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojadoseuze.controller;

import com.mycompany.lojadoseuze.model.UsuarioDAO;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class UsuarioController {
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean registrarUsuario(String usuario, String senha) {
        return usuarioDAO.registrarUsuario(usuario, senha);
    }

    public boolean validarLogin(String usuario, String senha) {
        return usuarioDAO.validarLogin(usuario, senha);
    }
}
