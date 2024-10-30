/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class creatina extends produto{
    String descr = "suplemento para academia";
    String nome = "creatina";
    double valor = 120.0;
    
    public void mostrarDescricao(){
       System.out.println(descr + "\n e seu valor:" + valor + "$");
    }
}
