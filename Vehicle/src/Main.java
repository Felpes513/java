//Em Java é possível herdar atributos e métodos de uma classe para outra. Agrupamos o “conceito de herança” em duas categorias:
//
//subclasse (filho) - a classe que herda de outra classe
//superclasse (pai) - a classe que está sendo herdada
//Para herdar de uma classe, use a extends palavra-chave.

class Vehicle{
    protected String brand = "Ford"; // Vehicle attribute
    public void honk(){ // Vehicle attribute
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle{
    private String modelName = "Mustang"; // Car attribute
    public static void main(String[] args){

        // Create a myCar object
        Car myCar = new Car();
        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Call the honk() method (from the Vehicle class) on the myCar object
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}