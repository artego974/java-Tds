/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class abacaxi extends produto{
    String descr = "uma fruta para comer";
    double valor = 6.99;
    public void mostrarDescricao(){
       System.out.println(descr + "\n e seu valor:" + valor + "$");
    }
}
