
// Importação necessária para utilizar o scanner.

import java.util.Scanner;

public class media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Declaração de um novo scanner.

        double x, y, media; // Declaração das variáveis

        System.out.println("Digite a primeira nota: ");
        x = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        y = sc.nextDouble();
        media = (x + y) / 2.0;
        System.out.println("A média é: " + media);
        sc.close(); // Para indicar que terminamos de usar o scanner.

    }

}
