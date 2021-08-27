import java.util.Scanner; // Biblioteca utilizada para adicionar ao meu programa a capacidade de interagir com o usuário

public class ExemploSoma {

    /*
     * Tipos de variavéis: String -> Texto Int -> Inteiros Float / Double -> Números
     * Decimais (Double apresenta uma maior precisão) 
     * Boolean -> Verdadeiro / Falso
     */

    // declaração das variavéis

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int soma;

        // declaração do objeto Scanner

        Scanner sc = new Scanner(System.in); // padrão para poder trabalhar com entrada de dados

        // recebe pelo teclado dois números Inteiros

        System.out.println("Digite o 1º número inteiro: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o 2º número inteiro: ");
        numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.println("O valor da soma é: " + soma);

    }

}
