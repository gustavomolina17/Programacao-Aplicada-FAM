public class TestaAluno {
    public static void main(String[] args) {
        Aluno i = new Aluno("Jose Francisco", "123.456.789-00");
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
    }
}