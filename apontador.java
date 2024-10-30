/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class apontador extends produto{
    String descr = "ultilizado para apontar os lapis";
    String nome = "apontador";
    double valor = 2.0;
    public void mostrarDescricao(){
       System.out.println(descr + "\n e seu valor:" + valor + "$");
    }
}
