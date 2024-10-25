/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class oculos extends produto {
    String descr = "para melhorar a visao de quem tem problemas de visao";
    double valor = 750.0;
    public void mostrarDescricao(){
       System.out.println(descr + "\n e seu valor:" + valor + "$");
    }
}
