/*A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de recuperação ou foi reprovado.

A média de aprovação é >= 7.0;
A média de recuperação é >= 5.0 e < 7.0;
A média do reprovado é < 5.0
*/

import java.util.Scanner;

public class exec002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        System.out.println("Entre com a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Entre com a segunda nota:");
        nota2 = sc.nextDouble();
        System.out.println("Entre com a terceira nota:");
        nota3 = sc.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else if (media >= 5) {
            System.out.println("Recuperação com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
        sc.close(); // Para indicar que terminamos de usar o scanner

    }

}
