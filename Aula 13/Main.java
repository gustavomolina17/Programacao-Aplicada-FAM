class Main {
  public static void main(String[] args) {

    System.out.println("Bem vindo ao Zoológico da FAM");

    System.out.println("\nPrimeiro vamos conhecer o morcego");
    Morcego animal1 = new Morcego();
    animal1.nasce();
    animal1.movimenta();
    animal1.dorme();
    
    System.out.println("\nAgora é a vez do ornitorrinco");
    Ornitorrico animal2 = new Ornitorrico();
    animal2.nasce();
    animal2.movimenta();
    animal2.dorme();

    System.out.println("\nE por último a zebra");
    Zebra animal3 = new Zebra();
    animal3.nasce();
    animal3.movimenta();
    animal3.dorme();

  }
}