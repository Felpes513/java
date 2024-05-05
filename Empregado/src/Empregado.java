public class Empregado {
    public int codigo;
    public String nome;
    public String cargo;
    public double salario;
    public static int quantidadeEmpregado =0;

    public Empregado (int codigo, String nome, String cargo, double salario){
        quantidadeEmpregado++;
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Empregado(){
        quantidadeEmpregado++;
    }
    public void imprimeEmpregado(){
        System.out.println("Nome" + nome);
        System.out.println("Codigo" + codigo);
        System.out.println("Cargo"+ cargo);
        System.out.println("Salario" + salario);
    }
    public static void totalEmpregado(){
        System.out.println("Total de empregados" + quantidadeEmpregado);
    }
}