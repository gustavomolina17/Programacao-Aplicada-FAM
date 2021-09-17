/* Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura. */

public class exec004 {

    public static void main(String[] args) {

        double V, R, A;
        R = 3.2;
        A = 4.9;

        V = 3.14159 * R * R * A;
        System.out.println("O volume da lata de óleo é de " + V + " m³");

    }

}
