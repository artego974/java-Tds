/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedrapapeltesoura;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class Game {
    public int opcaoComputador;
    public Player player;
    
    public Game (){
        this.opcaoComputador = (int) (Math.random() * 3) + 1;
        this.player = new Player();
        player.opcaoUsuario();
    }
    
    public void start(){
        if((opcaoComputador == 1) && (player.guess == 2)){
        System.out.println("jogador ganhou");
    }else if((opcaoComputador == 1) && (player.guess == 3)){
        System.out.println("computador ganhou");
    }else if((opcaoComputador == 1) && (player.guess == 1)){
        System.out.println("empate");
    }
    else if((opcaoComputador == 2) && (player.guess == 1)){
        System.out.println("computador ganhou");
    }
        else if((opcaoComputador == 2) && (player.guess == 3)){
        System.out.println("jogador ganhou");
    }
        else if((opcaoComputador == 2) && (player.guess == 2)){
        System.out.println("empate");
    }
        else if((opcaoComputador == 3) && (player.guess == 1)){
        System.out.println("jogador ganhou");
    }
        else if((opcaoComputador == 3) && (player.guess == 2)){
        System.out.println("computador ganhou");
    }
        else if((opcaoComputador == 3) && (player.guess == 3)){
        System.out.println("empate");
    }
        
    }
}
