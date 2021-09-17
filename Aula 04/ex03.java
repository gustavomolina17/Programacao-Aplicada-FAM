/* Exemplo de Ano Bissexto

Um ano é bissexto, se for divisivel por 4 ou 400. Mas não por 100.

*/

public class ex03 {

    public static void main(String[] args) {

        int ano = 2020;

        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0) && (ano % 100 != 0)) {

            System.out.println("Ano bissexto");
        } else {

            System.out.println("Ano comum");

        }

    }

}
