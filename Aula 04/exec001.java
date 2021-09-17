import java.util.Scanner; // Import do Scanner

public class exec001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoAtual, anoNascimento, qtdeAnos;
        System.out.println("Entre com o ano atual:");
        anoAtual = sc.nextInt();
        System.out.println("Entre com o ano de nascimento:");
        anoNascimento = sc.nextInt();
        qtdeAnos = anoAtual - anoNascimento;
        System.out.println("Em " + anoAtual + " você faz (ou já fez) " + qtdeAnos + " anos!");
        sc.close();
    }

}
