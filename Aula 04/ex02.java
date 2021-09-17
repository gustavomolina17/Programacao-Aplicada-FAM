/* Declaração IF - ELSE em Java 

A declaração if-else em Java também testa uma condição. Executa se a condição do bloco if é verdadeira, caso contrário o bloco else é executado.

Sintaxe:

if(condição){

    // condição do if é verdadeira

} else{

    // condição do if for falsa
}
*/

// Programa que verifica se o número digitado é par ou ímpar

public class ex02 {

    public static void main(String[] args) {

        // Definindo uma variável
        int numero = 16;

        // Verificando se o número é divisel por dois

        if (numero % 2 == 0) { // condição verdadeira
            System.out.println("Número par");
        } else { // falso
            System.out.println("Número impar");
        }
    }

}
