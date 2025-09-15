package exercicio3;

import java.util.ArrayList;

public class Venda {
    public ArrayList<Produto> listaDeProdutos;
    public double total;

    public Venda() {
        this.listaDeProdutos = new ArrayList<>();
        // ... e o total é zero.
        this.total = 0.0;
    }

    public void adicionarItem(Produto produto) {
        if (produto.estoque > 0) {
            this.listaDeProdutos.add(produto);
            this.total += produto.preco;
            produto.estoque--;
            System.out.println("+ " + produto.nome + " foi adicionado.");
        } else {
            System.out.println("!! " + produto.nome + " está sem estoque.");
        }
    }

    public void gerarRelatorio() {
        System.out.println("\n--- Relatório da Venda ---");
        System.out.println("Itens comprados:");

        for (Produto p : this.listaDeProdutos) {
            System.out.println("- " + p.nome + " (Cod: " + p.codigo + ") .... R$ " + p.preco);
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL DA VENDA: R$ " + this.total);
        System.out.println("--------------------------");
    }
}
