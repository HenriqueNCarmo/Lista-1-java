package _2Livro;

public class Livro {
    private String titulo;
    private String autor;

    Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void detalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
