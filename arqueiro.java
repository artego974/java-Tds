/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class arqueiro extends personagem{
    
    public arqueiro(String nome){
         super(nome,100,15);
         
    }
    public void flechaMagica(personagem oponente){
        if(vida < 50){
            oponente.vida = 0;
            System.out.println("Você desbloqueou um novo ataque e que mata instantaneamente a pessoa");
            
        }
    }
}