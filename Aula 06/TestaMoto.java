import java.util.Scanner; // Importar a biblioteca do Scanner

public class TestaMoto {
    public static void main(String[] args) {

        moto honda = new moto();

        // Chamando os métodos

        honda.velocidadeMaxima = 120;
        honda.velocidadeAtual = 25;

        honda.ligar();

        System.out.println(honda.velocidadeAtual);

        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        double valor = sc.nextDouble();
        int teste = honda.acelerar(valor);
        System.out.println("A velocidade atual é " + honda.velocidadeAtual + "km/h.");
        if (teste == 0) {
            System.out.println("CARA, reduza a velocidade");
        }
        sc.close(); // Fechando o Scanner;

        honda.buzinar();

        honda.desligar();

    }

}
