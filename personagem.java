/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */

class personagem {
    private String nome;
    public int vida;
    public int ataque;
    
    public personagem(String nome, int vida, int ataque){
    this.nome = nome;
    this.ataque = ataque;
    this.vida = vida;
    
    }
    
    public void atacar(personagem oponente){
        oponente.vida = oponente.vida - ataque;
        System.out.println("voce atacou o personagem e deu "+ ataque+ " pontos de dano e agora ele esta com " + oponente.vida + "pontos de vida");
    }
    public void status(){
        if(vida > 0){
            System.out.println("O personagem está vivo");
        }else{
            System.out.println("O personagem está morto");
        }
        
    }
    public void personagem (int ataque, String nome, int vida){
        this.ataque = ataque;
        this.nome = nome;
        this.vida = vida;
    }
}