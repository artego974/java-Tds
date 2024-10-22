/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */

class guerreiro extends personagem{
    
    public guerreiro(String nome){
         super(nome,100,15);
         
    }
    public void ataqueFuria(){
        if(vida<40){
            ataque = 25;
            System.out.println("você desbloqueou furia e agora da "+ ataque + " pontos de dano!");
        }
    }
   
    

}