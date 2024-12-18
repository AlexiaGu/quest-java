public class Classroom {
    
    public static void main(String[] args) {
        Wilder paul = new Wilder("Paul", false);
        Wilder jean = new Wilder("Jean", true );
        
        System.out.println(jean.whoAmI());
        System.out.println(paul.whoAmI());
    
    }
}
