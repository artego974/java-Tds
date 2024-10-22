/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class aluno {
    private String nome;
    private Number matricula;
    private String curso;
    
    public aluno (String nome, Number matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void apresentar(){
        System.out.println("meu nome é " + nome + " matricula: " + matricula + "curso: " + curso);
    }
    
}
