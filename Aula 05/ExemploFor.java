/* 

For - > Para

Eu SEI quantas vezes o meu bloco de instruções será repetido.

Apresenta a seguinte estrutura:

for(<inicialização>;<condição de execução>;<pós-instruções>){

instruções

}

*/

public class ExemploFor {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) { // i++ => i=i+1

            if (i % 2 == 0) {
                System.out.println(i + " é um número par.");
            } else {
                System.out.println(i + " é um número impar.");
            }

        }

    }
}