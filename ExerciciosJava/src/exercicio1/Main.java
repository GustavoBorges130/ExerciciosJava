package exercicio1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerLivros controllerLivros = new ControllerLivros();

        int opcao = 0;

        while(opcao != 6) {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner, controllerLivros);
                    break;
                case 2:
                    emprestarLivro(scanner, controllerLivros);
                    break;
                case 3:
                    devolverLivro(scanner, controllerLivros);
                    break;
                case 4:
                    consultarDisponibilidade(scanner, controllerLivros);
                    break;
                case 5:
                    listarAutores(scanner, controllerLivros);
                    break;
                case 6:
                    System.out.println("\nFinalizando o sistema...");
                    break;
                default:
                    System.out.println("\nOpção Inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("=== Sistema de Gerenciamento de Livros ===");
        System.out.println("1 - Cadastrar Livro");
        System.out.println("2 - Emprestar Livro");
        System.out.println("3 - Devolver Livro");
        System.out.println("4 - Consultar Disponibilidade de um Livro");
        System.out.println("5 - Listar Livros por Autor");
        System.out.println("6 - Sair do sistema");
        System.out.println("=========================================");
    }

    public static void cadastrarLivro(Scanner scanner,ControllerLivros livros) {
        System.out.println("--- Cadastrar livro ---");
        System.out.print("Digite o nome do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ISBN: ");
        String isbn = scanner.nextLine();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        Livro newLivro = new Livro(titulo, autor, isbn, ano);
        livros.cadastrarLivro(newLivro);
    }

    public static void emprestarLivro(Scanner scanner, ControllerLivros livros) {
        System.out.println("--- Empréstimo de Livros ---");
        System.out.print("Digite o ISBN do livro que queira emprestar: ");
        String isbn = scanner.nextLine();
        livros.emprestarLivro(isbn);
    }

    public static void devolverLivro(Scanner scanner, ControllerLivros livros) {
        System.out.println("--- Devolver Livro ---");
        System.out.print("Digite o ISBN do livro que queria devolver: ");
        String isbn = scanner.nextLine();
        livros.devolverLivro(isbn);
    }

    public static void consultarDisponibilidade(Scanner scanner, ControllerLivros livros) {
        System.out.println("--- Consultar Disponibilidade ---");
        System.out.print("Digite o ISBN do livro que queria consultar: ");
        String isbn = scanner.nextLine();
        livros.consultarDisponibilidade(isbn);
    }

    public static void listarAutores(Scanner scanner, ControllerLivros livros) {
        System.out.println("--- Listar Autor ---");
        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();
        livros.listarLivrosPorAutor(autor);
    }
}

