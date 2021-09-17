/* Declaração if aninhado em JAVA

A declaração if aninhado representa o bloco if dentro de outro bloco if. Aqui a condição do bloco if anterior será executada somente quando a condição do bloco if exterior é verdadeira.

Sintaxe:

if (condição){

    // código a ser executado

    if(condição){

             // código a ser executado

    }

}

*/

// Programa que diz se o usuário pode ser doador de sangue
// Condições para ser doador de sangue: tem que ser maior que 18 anos e pesar mais que 50 kg
// Programa verifica logo de cara a idade do usuário. Se o usuário for menor de idade, o programa automaticamente rodará o else.

public class ex05 {

    public static void main(String[] args) {

        int idade = 12;
        int peso = 80;

        // Aplicando condição na idade e peso

        if (idade >= 18) {

            if (peso >= 50) {

                System.out.println("Você pode doar sangue");
            }

            System.out.println("Você é maior de 18 anos!.");

        } else {

            System.out.println("MENOR DE IDADE");
        }

    }

}
