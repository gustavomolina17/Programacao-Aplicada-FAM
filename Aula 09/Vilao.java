public class Vilao extends Vingadores { // Herança

    public Vilao(String nome, int idade, boolean armadura, double altura) {// método construtor

        super(nome, idade, armadura, altura); // Para reaproveitar da classe mãe
    }

    // Atributos exclusivos do vilão

    public String poder;
    public int matricula;
}
