/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerra;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
import java.util.Scanner;
        
public class batalha {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mago mago = new mago("a");
        guerreiro guerreiro = new guerreiro("b");
        arqueiro arqueiro = new arqueiro("c");
    
    
        
    
    while(mago.vida > 0 && arqueiro.vida > 0 && guerreiro.vida> 0){
        System.out.println("você quer o \n 1)mago \n 2)arqueiro \n 3)guerreiro");
    int menu = scanner.nextInt();
    
    switch(menu){
        case 1:
            System.out.println("você escolheu o mago!\n Ele está com "+ mago.vida +"\n Agora escolha quem vai atacar ");
            System.out.println("\n 1) arqueiro\n 2)guerreiro");
            int atacarM = scanner.nextInt();
            if(atacarM == 1){
                mago.atacar(arqueiro);
                mago.poderArcano(arqueiro);
            }else if(atacarM == 2){
                mago.atacar(guerreiro);
                mago.poderArcano(guerreiro);
            }
            
            break;
        case 2:
            System.out.println("você escolheu o mago!\n Ele está com "+ arqueiro.vida +"\n Agora escolha quem vai atacar ");
            System.out.println("\n 1) mago \n 2)guerreiro");
            int atacarA = scanner.nextInt();
            if(atacarA == 1){
                arqueiro.atacar(mago);
                arqueiro.flechaMagica(mago);
            }else if(atacarA == 2){
                arqueiro.atacar(guerreiro);
                arqueiro.flechaMagica(guerreiro);
            }
            break;
            
        case 3:
            System.out.println("você escolheu o mago!\n Ele está com "+ guerreiro.vida +"\n Agora escolha quem vai atacar ");
            System.out.println("\n 1) mago \n 2)arqueiro");
            int atacarG = scanner.nextInt();
            if(atacarG == 1){
                guerreiro.atacar(mago);
                guerreiro.ataqueFuria();
            }else if(atacarG == 2){
                guerreiro.atacar(arqueiro);
                guerreiro.ataqueFuria();
            }
            break;
            
        
            
    }

}
    
        
    
  } 
     
}