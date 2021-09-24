import java.util.Scanner;

public class produto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco = 0;
        double total = 0;
        int i = 0;
        int qtde = 0;
        System.out.println("Programa que soma produtos");
        System.out.print("Informe a quantidade de produtos: ");
        qtde = Integer.parseInt(sc.nextLine());
        while (i < qtde) {
            i = i + 1;
            System.out.print("Informe o " + i + " produto: ");
            preco = Double.parseDouble(sc.nextLine());
            total = total + preco;
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}
