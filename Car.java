public class Car extends Vehicle {
    
    public Car(String brand, int kilometers) {
        super(brand,kilometers); // Appel du constructeur de la classe Vehicle
    }

    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}
