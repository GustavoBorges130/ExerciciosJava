package exercicio2;

public class Main {

    public static void main(String[] args) {
        System.out.println("======== BEM-VINDO AO RPG ========");

        Personagem heroi = new Guerreiro("Sir Lancelot");

        Personagem monstro1 = new Arqueiro("Goblin Batedor");

        System.out.println("\n--- Primeira Batalha ---");
        heroi.exibirStatus();
        monstro1.exibirStatus();

        batalhar(heroi, monstro1);


        if (heroi.estaVivo()) {
            System.out.println("\n--- Próximo Desafio ---");
            Personagem monstro2 = new Mago("Feiticeiro Orc");

            heroi.exibirStatus();
            monstro2.exibirStatus();
            batalhar(heroi, monstro2);
        }

        System.out.println("\n======== FIM DE JOGO ========");
    }

    public static void batalhar(Personagem p1, Personagem p2) {
        System.out.println("\n>>>> LUTA INICIADA: " + p1.nome + " vs " + p2.nome + " <<<<");

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (p2.estaVivo()) {
                p2.atacar(p1);
            }
        }

        System.out.println(">>>> FIM DA LUTA <<<<");
        if (p1.estaVivo()) {
            System.out.println(p1.nome + " venceu!");
            p1.ganharExperiencia(100); // Vencedor ganha XP
        } else {
            System.out.println(p2.nome + " venceu!");
        }
    }
}
