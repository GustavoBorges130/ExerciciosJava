package exercicio3;

public class SistemaLoja {

    public static void main(String[] args) {

        Produto p1 = new Produto(101, "Leite Integral", 5.00, 10);
        Produto p2 = new Produto(202, "Pão Francês", 1.00, 50);
        Produto p3 = new Produto(303, "Manteiga 200g", 8.00, 5);

        System.out.println("--- Loja Aberta ---");
        System.out.println("Estoque inicial: " + p1.nome + "(" + p1.estoque + "), " + p2.nome + "(" + p2.estoque + ")");
        System.out.println("--------------------\n");


        Venda venda1 = new Venda();

        System.out.println("=> Iniciando nova venda...");
        venda1.adicionarItem(p1);
        venda1.adicionarItem(p2);
        venda1.adicionarItem(p2);


        venda1.gerarRelatorio();

        System.out.println("\n--- Relatório Final de Estoque ---");
        System.out.println("Estoque restante de " + p1.nome + ": " + p1.estoque);
        System.out.println("Estoque restante de " + p2.nome + ": " + p2.estoque);
        System.out.println("---------------------------------");
    }
}
