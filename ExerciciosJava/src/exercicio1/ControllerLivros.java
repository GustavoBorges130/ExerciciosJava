package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class ControllerLivros {

    private List<Livro> livros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("O livro " + livro.getTitulo() + " foi cadastrado!");
    }

    public Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        } return null; // se não encontrar nada
    }

    public void emprestarLivro(String isbn) {
        Livro livro = buscarLivro(isbn);

        if (livro != null) {
            if (livro.isDisponivel()) {
                livro.emprestar();
                System.out.println("O livro " + livro.getTitulo() + " foi emprestado com sucesso!");
            } else {
                System.out.println("O livro com ISBN " + isbn + " já foi emprestado!");
            }
        } else {
            System.out.println("O livro não foi encontrado!");
        }
    }


    public void devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);

        if (livro != null) {
            if (livro.isDisponivel()) {
                livro.devolver();
                System.out.println("O livro " + livro.getTitulo() + " foi devolvido com sucesso!");
            } else {
                System.out.println("O livro " + livro.getTitulo() + " se encontra disponível!");
            }
        } else {
            System.out.println("O livro não foi encontrado!");
        }
    }

    public void consultarDisponibilidade(String isbn) {
        Livro livro = buscarLivro(isbn);

        if (livro != null) {
            System.out.println("Consulta: " + livro.toString());
        } else {
            System.out.println("O livro não está disponível");
        }
    }

    public void listarLivrosPorAutor(String autor) {
        System.out.println("--- Livros do Autor: " + autor + " ---");
        boolean encontrou = false;

        String autorBuscado = autor.trim();

        for (Livro livro : livros) {
            if (livro.getAutor().trim().equalsIgnoreCase(autorBuscado)) {
                System.out.println(livro.toString());
                encontrou = true;
            }
        } if (!encontrou) {
            System.out.println("Nenhum livro foi encontrado com esse autor(" + autor + ")");
        }
    }


}
