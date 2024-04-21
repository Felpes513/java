public class Main {
    public static void main(String[] args){
        //Criando os objetos da classe carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //atribuição de valores aos atributos dos objetos
        carro1.marca = "Fiat";
        carro1.modelo ="Siena";
        carro1.ano = 2003;

        carro2.marca = "Ford";
        carro2.modelo = "Fiesta";
        carro2.ano = 2001;

        // Chamando os métodos dos objetos
        carro1.ligar();
        carro2.acelerar();
    }
}