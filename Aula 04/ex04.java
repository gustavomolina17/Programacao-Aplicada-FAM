/* Declaração if - else - if 

A declaração if - else - if encadeada executa uma condição com múltiplas declarações

Sintaxe:

if (condição 1){
 
    código para ser executado se a condição 1 for verdadeira

} else if (condição 2){

    código para ser executado se a condição 1 for verdadeira

} else if (condição 3){

código para ser executado se a condição 3 for verdadeira

}

else {

    se todas as condições anteriores forem falsas, será executado o conteúdo do else.
}

*/

// Programa para checar se o número é POSITIVO, NEGATIVO ou 0.

public class ex04 {

    public static void main(String[] args) {

        int numero = -15;

        if (numero > 0) {
            System.out.println("POSITIVO");
        } else if (numero < 0) {

            System.out.println("NEGATIVO");

        } else {
            System.out.println("ZERO");
        }

    }

}
