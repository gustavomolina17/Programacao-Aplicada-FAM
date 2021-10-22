public class Herois extends Vingadores { // Herança

    public Herois(String nome, int idade, boolean armadura, double altura) {// método construtor

        super(nome, idade, armadura, altura); // Para reaproveitar da classe mãe
    }

    public int identificador; // Atributo exclusivo de herói
}
