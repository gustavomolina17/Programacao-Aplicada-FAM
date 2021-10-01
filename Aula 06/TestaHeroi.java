public class TestaHeroi {
    public static void main(String[] args) {

        // Criação dos nossos heróis

        heroi HomemDeFerro = new heroi();
        HomemDeFerro.nome = "Homem de Ferro";
        HomemDeFerro.altura = 1.8;
        HomemDeFerro.idade = 30;
        HomemDeFerro.armadura = "Resistente a fogo";

        heroi Hulk = new heroi();
        Hulk.nome = "Hulk";
        Hulk.altura = 1.7;
        Hulk.idade = 30;
        Hulk.armadura = "Shorts Roxo";

        // Chamando o método (ação)

        HomemDeFerro.salvar();
        HomemDeFerro.lutar();
        System.out.println(HomemDeFerro.armadura);
        System.out.println(Hulk.idade);
        Hulk.correr();

    }

}
