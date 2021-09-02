/* Operadores aritméticos: realizam as operações fundamentais da matemática entre duas variáveis e retornam o resultado. 

Os operadores aritméticos são:
Soma +
Subtração –
Multiplicação *
Divisão /
Módulo %

*/

public class operadores2 {

    public static void main(String[] args) {

        int area = 2 * 2;

        System.out.println("area: " + area);

        int soma = 1 + 1;
        int mult = 3 * 2;
        int div = 4 / 2;
        int mod = 6 % 5;

        System.out.println("A soma é: " + soma);
        System.out.println("A multiplicação resulta em: " + mult);
        System.out.println("Resultado da divisão: " + div);
        System.out.println("Módulo = " + mod);

        int x = 7;
        System.out.println("O valor inicial é: " + x); // x = 7
        x = x + (1 * 2); // x = 9
        System.out.println("Agora 'x' vale: " + x);
        x = x - 3; // x = 6
        System.out.println("Neste instante 'x' é: " + x);
        x = (x / (6 - 2 + (3 * 5) / (16 - 1)));
        System.out.println("O valor final de 'x' é: " + x); // x = 1

    }

}
