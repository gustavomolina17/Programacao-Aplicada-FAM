import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Carro fusca; // Cria uma variável do tipo Carro
        fusca = new Carro(); // Objeto criado

        // Chamando os métodos

        fusca.ligar();
        fusca.buzinar();
        fusca.desligar();

        // Atribuindo valores para os atributos do objeto

        fusca.velocidadeMaxima = 100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = sc.nextDouble();
        int teste = fusca.acelerar(valor);
        System.out.println("A velocidade atual é " + fusca.velocidadeAtual + " km/h.");
        if (teste == -1) {
            System.out.println("A velocidade é igual ou superior a velocidade máxima.");
        }

        // Definindo as Marchas

        if (fusca.velocidadeAtual == 0) {
            System.out.println("O carro está parado. ");
        }
        if (fusca.velocidadeAtual > 0 && fusca.velocidadeAtual <= 25) {
            System.out.println("O carro está em 1ª Marcha.");
        }
        if (fusca.velocidadeAtual > 25 && fusca.velocidadeAtual <= 40) {
            System.out.println("O carro está em 2ª Marcha.");
        }
        if (fusca.velocidadeAtual > 40 && fusca.velocidadeAtual <= 60) {
            System.out.println("O carro está em 3ª Marcha.");
        }
        if (fusca.velocidadeAtual > 60 && fusca.velocidadeAtual <= 80) {
            System.out.println("O carro está em 4ª Marcha.");
        }
        if (fusca.velocidadeAtual >= 80) {
            System.out.println("O carro está em 5ª Marcha.");
        }
        sc.close();// Fechando o Scanner

    }

}
