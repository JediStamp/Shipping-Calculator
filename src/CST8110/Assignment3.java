package CST8110;

// Main class to test the shipment and package classes.
public class Assignment3 {
    public static void main(String[] args) {

        String welcome = "Welcome to Rural Post Express!! ";
        System.out.printf("%s %n", welcome);
        
        Shipment ship = new Shipment();
        ship.inputPackages();
        ship.display();
    }
}
