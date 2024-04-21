public class Main {
    public static void main(String[] args) {
        System.out.println("Quantidade de objetos "+Aluno.conta);
        Aluno a1 = new Aluno("Ana Souza", 31, 1234);
        Aluno a2 = new Aluno("Bia Nunes", 25, 5678);
        Aluno a3 = new Aluno("Paulo Santos", 45, 9876);
        System.out.println("Usando o método imprime");
        a1.imprime();
        a2.imprime();
        a3.imprime();
        System.out.println("Usando os getters");
        System.out.println("Matricula "+a1.getMatricula());
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Quantidade de objetos "+Aluno.conta);
    }
}