/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */

import java.util.ArrayList;
import java.util.Scanner;

public class compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<produto> prod = new ArrayList<>();
        abacaxi abacaxi = new abacaxi();
        apontador apontador = new apontador();
        bola bola = new bola();
        creatina creatina = new creatina();
        oculos oculos = new oculos();
        
        boolean is = true;
        
        
        
        while(is == true){
        System.out.println("você deseja comprar ou remover? \n 1) remover \n 2) comprar \n 3) finalizar conta \n 4) visualizar sacola");
        int escolher = scanner.nextInt();
        switch(escolher){
            case 1:
                System.out.println("me diga quais itens deseja remover!\n 1)abacaxi \n 2) apontador \n 3) bola \n 4) creatina \n 5) oculos");
        int men = scanner.nextInt();
        switch(men){
            case 1:
                prod.remove(abacaxi);
                break;
                
            case 2:
                prod.remove(apontador);
                break;
            case 3:
                prod.remove(bola);
                break;
            case 4:
                prod.remove(creatina);
                break;
            case 5:
                prod.remove(oculos);
                break;
            default:
                System.out.println("o produto é invalido");
                
                
        }
        break;
        
            case 2:
                System.out.println("me diga quais itens deseja comprar!\n 1)abacaxi \n 2) apontador \n 3) bola \n 4) creatina \n 5) oculos");
        int menu = scanner.nextInt();
        switch(menu){
            case 1:
                prod.add(abacaxi);
                break;
                
            case 2:
                prod.add(apontador);
                break;
            case 3:
                prod.add(bola);
                break;
            case 4:
                prod.add(creatina);
                break;
            case 5:
                prod.add(oculos);
                break;
            default:
                System.out.println("o produto é invalido");
                
                
        }
        break;
        
            case 3:
                double total = 0;
                
                for(produto pro : prod){
                    
                    total = total + pro.valor;
                    
                }
                System.out.println("os produtos que estao na compra são ");
                for(int i=0; i <4; i++){
                    
                    System.out.println((i + 1) + ") " + prod.get(i).nome + " - R$ " + prod.get(i).valor);
                    
                }
                System.out.println("e seu preco total é:  "+ total);
                
                is = false;
                break;
            
            case 4:
                System.out.println("os produtos que estao na compra são ");
                for(int i = 0; i<4; i++){
                    
                    System.out.println((i + 1) + ") " + prod.get(i).nome + " - R$ " + prod.get(i).valor);
                    
                }
                
                break;
                
            default:
                System.out.println("sua escolha foi invalida");
        }
        
            
        
            
    }


        }
        
}
    



        
        
        