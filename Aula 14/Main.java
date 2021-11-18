import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o dia: ");
    int dia = teclado.nextInt();
    System.out.println("Digite o mes: ");
    int mes = teclado.nextInt();
    Datas nascimento = new Datas(dia,mes);
    try{
      String extenso = nascimento.transforma();
      System.out.println("Data por extenso: "+extenso);
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }
    teclado.close();
  }
}