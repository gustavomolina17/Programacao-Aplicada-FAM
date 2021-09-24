/* A palavra-chave continue tem um comportamento semelhante ao break, porém não interrompe completamente a execução do laço. Este comando pode ser utilizado com qualquer laço, porém ao invés de interromper a execução completa do laço, ele faz com que o laço salte para sua próxima iteração */

import java.util.Scanner;

/**
 * Exemplo de uso da palavra-chave continue.
 */
public class ExemploContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 9 exceto o 5: ");
        int numero = sc.nextInt();
        System.out.println("Contando de 1 ate o numero que voce digitou…");
        for (int cont = 0; cont <= numero; cont++) {
            if (cont == 5) {
                System.out.println("# PULANDO O 5 #");
                continue;
            }
            System.out.print(cont + " ");
            sc.close();
        }
    }
}
