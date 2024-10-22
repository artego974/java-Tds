/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class produto {
    private String nome;
    private Number preco;
    private Number qntd;
    
    public produto (String nome, Number preco, Number qntd){
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }
    public void prod(){
        System.out.println("o produto é " + nome + "preco: "+ preco + " qntd: " + qntd);
    }
    
}
