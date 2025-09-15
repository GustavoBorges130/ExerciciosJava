package exercicio2;

public class Personagem {

    protected String nome;
    protected int vida;
    protected int vidaMaxima;
    protected int ataque;
    protected int defesa;
    protected int nivel;
    protected int experiencia;


    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;
        this.vidaMaxima = vida;
        this.vida = this.vidaMaxima; // Começa com a vida cheia
        this.ataque = ataque;
        this.defesa = defesa;
    }


    public void atacar(Personagem alvo) {
        int dano = this.ataque - alvo.defesa;
        if (dano < 1) {
            dano = 1;
        }
        System.out.println(this.nome + " ataca " + alvo.nome + " e causa " + dano + " de dano!");
        alvo.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println(this.nome + " foi derrotado.");
        }
    }

    public void ganharExperiencia(int xpGanha) {
        this.experiencia += xpGanha;
        System.out.println(this.nome + " ganhou " + xpGanha + " de XP!");
        if (this.experiencia >= 100) {
            subirNivel();
        }
    }

    private void subirNivel() {
        this.nivel++;
        this.experiencia = 0;
        this.vidaMaxima += 10;
        this.vida = this.vidaMaxima;
        this.ataque += 2;
        this.defesa += 2;
        System.out.println("LEVEL UP! " + this.nome + " subiu para o nível " + this.nivel + "!");
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void exibirStatus() {
        System.out.println(
                "Nome: " + this.nome +
                        " | Nv: " + this.nivel +
                        " | Vida: " + this.vida + "/" + this.vidaMaxima +
                        " | XP: " + this.experiencia + "/100"
        );
    }
}