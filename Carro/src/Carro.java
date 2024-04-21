public class Carro {
    //Atributos
    public String marca;
    public String modelo;
    public int ano;

    //Método construtor
    public Carro(){
    }
    public Carro(String marca, String model, Integer ano){
        this.ano = ano;
        this.modelo = model;
        this.marca = marca;
    }

    //Métodos
    public void ligar(){
        System.out.println("O carro está ligado.");
    }
    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }
}
