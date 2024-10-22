/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedrapapeltesoura;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
import java.util.Scanner;

public class Player {
    public Scanner scanner;
    public int guess;
    
    public Player (){
        this.scanner = new Scanner(System.in);
    }
    
    public void opcaoUsuario() {
        
        System.out.println("qual é a opção que voce deseja? \n 1)pedra \n2)papel \n3)tesoura ");
        
        guess = scanner.nextInt();
    }
    
}
