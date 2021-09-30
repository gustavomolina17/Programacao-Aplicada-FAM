public class TestaCachorro {

    public static void main(String[] args) {

        // Criação de 3 objetos Cachorros

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Heineken";
        cachorro1.tamanho = 65;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Pluto";
        cachorro2.tamanho = 15;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Johhny";
        cachorro3.tamanho = 8;

        // Chamando o método latir()

        cachorro1.latir();
        cachorro2.latir();
        cachorro3.latir();

    }

}
