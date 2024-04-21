public class Aluno extends Pessoa{
    private int matricula;
    public static int conta=0;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
        conta++;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    public void imprime(){
        System.out.println("Matricula "+matricula);
        super.imprime();
        //System.out.println("Nome: " + nome);
        //System.out.println("Idade: " + idade);
    }
}