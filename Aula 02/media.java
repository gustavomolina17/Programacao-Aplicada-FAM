// importação necessária para utilizar o Scanner

import java.util.Scanner; // para que eu possa trabalhar com entrada de dados

public class media {

    public static void main(String[] args) {

        // sc é o nome dado ao meu scanner. Poderia ser dado qualquer nome. O restante é
        // sempre PADRÃO.

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a 1ª nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a 2ª nota:");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2.0;
        System.out.println("O aluno obteve média: " + media);
        sc.close(); // Para indicar que terminamos de usar o scanner

    }

}
