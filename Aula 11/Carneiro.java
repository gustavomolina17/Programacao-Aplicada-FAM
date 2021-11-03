public class Carneiro extends Animal {
    public Carneiro() {
        this.nome = "Carneiro";
        this.numeroPatas = 4;
    }

    @Override // reescrita do método
    public void som() {
        System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz BÉÉÉÉ!!!");
    }
}
