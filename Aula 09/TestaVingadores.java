public class TestaVingadores {
    public static void main(String[] args) {

        // Criação de um herói

        Herois vingador = new Herois("Homem de Ferro", 30, true, 1.80);
        System.out.println("Nome: " + vingador.nome);
        vingador.identificador = 123;
        System.out.println("Idade: " + vingador.idade);
        System.out.println("Possui Armadura: " + vingador.armadura);
        System.out.println("Altura: " + vingador.altura);

        // Criação de um vilão

        Vilao thanos = new Vilao("Thanos", 55, false, 2.20);
        thanos.matricula = 666;
        thanos.poder = "Destruir o planeta";
        System.out.println("Nome: " + thanos.nome);
        System.out.println("Idade: " + thanos.idade);
        System.out.println("Possui armadura: " + thanos.armadura);
        System.out.println("Altura: " + thanos.altura);
        System.out.println("Número da matrícula: " + thanos.matricula);
        System.out.println("Poder: " + thanos.poder);

    }

}
