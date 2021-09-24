import java.util.Scanner; //Importação do Scanner

public class SomaIdades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // declaração do Scanner
        int idade = 0;
        int total = 0;
        int i = 0; // Variável de controle
        System.out.println("Programa que soma as idades digitadas ;) ");
        while (i < 5) { // Para executar o programa 5 vezes
            i = i + 1; // Para controlar em qual repetição o meu programa está
            System.out.println("Informe a idade da " + i + " pessoa");
            idade = sc.nextInt();
            total = total + idade;
        }

        System.out.println("A soma das idades é: " + total + " anos.");
        sc.close(); // Para finalizar o uso do scanner

    }

}
