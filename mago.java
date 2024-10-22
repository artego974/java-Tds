/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class mago extends personagem {
    public mago(String nome){
         super(nome,100,15);
         
    }
    public void poderArcano(personagem oponente){
        if(vida<30){
            vida = vida + 10;
            System.out.println("você libertou o seu poder oculto e pode se curar cada vez que ataca!");
        }
    }
}