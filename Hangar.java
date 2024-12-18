public class Hangar {
    
    public static void main(String[] args) {
        Car myCar = new Car("Clio", 10000);
        Boat myBoat = new Boat("Titanic", 60);

        // Appel de la méthode doStuff() et affichage des résultats
        System.out.println(myCar.doStuff());
        System.out.println(myBoat.doStuff());
    }
}
