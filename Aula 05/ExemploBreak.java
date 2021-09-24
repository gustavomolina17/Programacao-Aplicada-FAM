/* A palavra-chave break é uma instrução de interrupção imediata de qualquer laço, seja ele qual for, independente de sua condição de parada ter sido atendida.

*/

import java.util.Scanner;

/**
 * Exemplo de uso da palavra-chave break.
 */
public class ExemploBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 9 exceto o 5: ");
        int numero = sc.nextInt();
        System.out.println("Contando de 1 ate o numero que voce digitou…");
        for (int cont = 0; cont <= numero; cont++) {
            if (numero == 5 || numero < 1 || numero > 9) {
                System.out.println("Um numero proibido foi digitado!");
                break;
            }
            System.out.print(cont + " ");
            sc.close();
        }
    }
}
