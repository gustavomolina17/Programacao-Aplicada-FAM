public class Vaca extends Animal { // Herança
    public Vaca() {
        this.nome = "Vaca";
        this.numeroPatas = 4;

    }

    @Override // reescrita do método
    public void som() {
        System.out.println("A" + this.nome + " que tem " + this.numeroPatas + " patas, faz MUUUUU!!!");
    }

}
