/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoquecomteste;
import java.util.ArrayList;
/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class Estoque {
    ArrayList<Produto> mercado = new ArrayList<>();
    
    
    public Produto addProd(String nome, int qntd){
        for(Produto prod : mercado){
            if(nome.equals(prod.nome)){
                prod.qntd += qntd;
            }
        }
        mercado.add(new Produto(nome,qntd));
        return null;
    }
    public Produto rmProd(String nome, int qntd){
        for(Produto prod : mercado){
            if(nome == prod.nome){
                prod.qntd -= qntd;
                if(prod.qntd == 0){
                    mercado.remove(prod);
                }
            }
        }
        return null;
    }
    public int consQntd(String nome){
        for(Produto prod : mercado){
            if(nome == prod.nome){
                return prod.qntd;
            }
        }
        return 0; 
    }
    public String prodMoreEst(){
        int maior = 0;
        String nomeDoMaior = "";
        for(Produto prod : mercado){
            if (prod.qntd > maior){
                maior = prod.qntd;
                nomeDoMaior = prod.nome;
            }
        }
        System.out.println("O produto com mais quantidade é " + nomeDoMaior + " com a quantidade de " + maior);
       return nomeDoMaior;
    }

    public ArrayList<Produto> limparEst(){
            mercado.clear();
            return mercado;
    
    } 
    
    public int rebastEst(int qntd){
        int qntdRebast = qntd;
        for(Produto prod : mercado){
           prod.qntd += qntdRebast;
        }
        return qntdRebast;
    }
    public String listProd(){
        String vaiz = "";
        for(Produto prod : mercado){
            vaiz += prod.nome;
        }  
        return vaiz;
    }
}