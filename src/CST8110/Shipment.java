package CST8110;

// A shipment has two different packages with costs associated for each package.
// Asks the user to input the dimensions for two separate packages and then calculates the cost to
// ship each package.
public class Shipment {
    Package package1;
    Package package2;

    // Constructor cost for the shipment object. This declares two packages using two of the 
    // package constructors (for testing purposes).
    public Shipment() {
        package1 = new Package();
        package2 = new Package(1,1,1);
    }

    // Inputs the two packages by displaying instructions to the user and calling the inputPackage
    // method.
    public void inputPackages() {
        System.out.printf("%nEnter first package dimensions %n");
        this.inputPackage(package1);
      
        System.out.printf("%nEnter second package dimensions %n");
        this.inputPackage(package2);            
        }
    
    // Called to capture the user-provided parameters for a package. They are then stored in the 
    // package and associated with the shipment.
    public void inputPackage(Package pkg) {
        pkg.inputLength();
        pkg.inputWidth();
        pkg.inputHeight();
    }

    // Calculates the cost of a package based on its volume. The minimum cost is $3.00.
    // Shipping cost is $2.00 more than the volume of the package.
    public double calculateCost(Package pkg) {
        if (pkg.calcVolume() < 1.0) {
            return 3.00;
        }
        else {
            return pkg.calcVolume() + 2.00;
        }
    }

    // Displays dimensions, volume, and cost for each package. Calculates the comparison of costs
    // between the two packages and calls it as well.
    public void display() {
        // Print dimensions and volume of package 1
        System.out.printf("%nFirst package dimensions: ");
        package1.displayDimensions();
        System.out.printf(", Volume = %.1f %n", package1.calcVolume());
      
        // Print dimensions and volume of package 2
        System.out.printf("Second package dimensions: ");
        package2.displayDimensions();
        System.out.printf(", Volume = %.1f %n", package2.calcVolume());
      
        // Determine and display costs
        // Print out costs for shipping packages
        System.out.printf("Package 1 will cost $%.2f to ship.%n", calculateCost(package1));
        System.out.printf("Package 2 will cost $%.2f to ship.%n", calculateCost(package2));
        
        //Compare the costs of the two packages
        String message = "The %s package is %s the %s package.";
    
        // Figure out which package is bigger and then assign the position of the two packages
        // in the output statement.
        int costRatio;
        String str1;
        String str2;
        String ratio;
        if ((calculateCost(package1) == calculateCost(package2))) {
            str1 = "first";
            str2 = "second";
            costRatio = 0;
        }
        else if (calculateCost(package1) > calculateCost(package2)) {
            costRatio =  (int)(calculateCost(package1)/ calculateCost(package2));
            str1 = "first";
            str2 = "second";
        }
        else {
            costRatio = (int)(calculateCost(package2)/calculateCost(package1));
            str1 = "second";
            str2 = "first";
        }
  
        // Determine the ratio between the two package costs based on the criteria given in the 
        // problem.
        switch (costRatio) {
        case 0:
            ratio = "the same cost as";
            break;
        case 1:
            ratio = "slightly more than";
            break;
        case 2:
            ratio = "twice";
            break;
        case 3:
            ratio = "triple";
            break;  
        case 4:
            ratio = "quadruple";
            break;  
        default:
            ratio = Integer.toString(costRatio) + " X";
            break;     
        }

        System.out.printf(message, str1, ratio, str2);
    }
}
