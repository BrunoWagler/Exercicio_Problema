package Model;

public class LivroModel
{
        private String titulo;
        private String autor;
        private String ISBN;
        private int quantidade;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString()
    {
        return "Titulo: " + titulo + "Autor: " + autor + "ISBN: " + ISBN + "Exemplares:" + quantidade;

    }
}
