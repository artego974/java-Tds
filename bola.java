/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class bola extends produto{
    String descr = "Usa pra jogar jogos com ele";
    double valor = 250.0;
    public void mostrarDescricao(){
       System.out.println(descr + "\n e seu valor:" + valor + "$");
    }
}
