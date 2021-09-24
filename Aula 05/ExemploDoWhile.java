/* 

Estrutura Do / While (Faça....enquanto): Na estrutura do...while o bloco de instruçoes é EXECUTADO PELO MENOS 1 VEZ, então se a condição ao final das intruções for verdadeira, o bloco de instruções é executado novamente.

do {

    <instruções>


} while (condições);


*/

import java.util.Scanner; // Importação do Scanner

public class ExemploDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Entrada de dados pelo teclado

        int opcao = 0; // Variável de Controle
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Iniciar o jogo");
            System.out.println("2 - Ajuda");
            System.out.println("3 - Sair");
            System.out.println("OPÇÃO: ");
            opcao = sc.nextInt();
            /*
             * Enquanto o usuário escolher a opção 1 ou opção 2 o menu ficará aparecendo na
             * tela
             * 
             */

        } while (opcao != 3);
        sc.close(); // Para fechar o Scanner
    }

}
