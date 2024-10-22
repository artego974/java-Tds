/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pagementos;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public interface Pagamento {
    void processarPagamento(double valor);
    String obterDetalhes();
    
}
