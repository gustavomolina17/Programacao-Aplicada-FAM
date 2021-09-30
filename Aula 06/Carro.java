public class Carro {
    // Declaração dos Atributos
    boolean ligado;
    double velocidadeAtualizado;
    double velocidadeMaxima;
    double velocidadeAtual;

    // Declaração dos Métodos
    void ligar() {
        ligado = true;
        System.out.println("O carro está ligado");
    }

    void buzinar() {
        System.out.println("BIBI!!!");
    }

    void desligar() {
        ligado = false;
        System.out.println("O carro está desligado");
    }

    // Vamos agora permitir que o usuário acelere o carro e modifique sua velocidade
    // Precisa ser um método inteiro pois irá retornar um número

    int acelerar(double quantidade) {
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
        if (novaVelocidade >= velocidadeMaxima) {
            return -1;
        } else {
            return 0;
        }
    }

}
