public class operadores_logicos {

    public static void main(String[] args) {

        if ((1 == (2 - 1)) && (5 == 5)) {
            System.out.println("Ambas as expressões são verdadeiras");

        }

        if ((1 != (2 - 1)) || (2 == (1 + 1))) {
            System.out.println("O resultado da expressão é verdadeiro");

        }
    }
}