/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pagementos;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        CartaoCredito CartaoCredito = new CartaoCredito();
        Paypal Paypal = new Paypal();
        
        Paypal.processarPagamento(10.0);
        CartaoCredito.processarPagamento(50.0);
        
    }
}
