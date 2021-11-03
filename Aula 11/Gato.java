public class Gato extends Animal {
    public Gato() {
        this.nome = "Gato";
        this.numeroPatas = 4;
    }

    @Override // reescrita do método
    public void som() {
        System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz MIAU!!!");
    }
}
