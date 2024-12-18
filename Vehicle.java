public abstract class Vehicle {
    // attributes
    private String brand;  
    private int kilometers;  

     // Constructors
     public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
    //getters
    public String getBrand() {
        return this.brand;
    }
    public int kilometers() {
        return this.kilometers;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();
}
