package exercicio1;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ano;
    private boolean disponivel;

    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano = ano;
        this.disponivel = true;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
        }
    }

    @Override
    public String toString() {
        return "Livro '" + titulo + "' por " + autor +
                " (Ano: " + ano + ", ISBN: " + isbn + ") | Status: " +
                (disponivel ? "Disponível" : "Emprestado");
    }

}
