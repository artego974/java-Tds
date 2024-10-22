/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author ARTHURCIDADEMATTJIE
 */
public class livro {
    private String titulo;
    private String autor;
    private Number paginas;
    
    public livro(String titulo, String autor, Number paginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
    
    
}
    public void livros(){
        System.out.println("titulo:" + titulo + "autor: " + autor + "pag: " + paginas);
    }
    
}
