public class Main{
    public static void main(String[] args){
        Empregado e1 = new Empregado(1232, "Felipe Souza Moreira", "Programador Java", 15000.00);
        Empregado e2 =  new Empregado();
        e2.codigo = 465;
        e2.nome = "Thalia Cerqueira Da Silva";
        e2.cargo = "Enfermeira chefe";
        e1.imprimeEmpregado();
        e2.imprimeEmpregado();
        Empregado.totalEmpregado();
    }
}