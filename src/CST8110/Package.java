package CST8110;

import java.util.Scanner;

// Create a package with length, width and height parameters. There are multiple constructors,
// a copy constructor as well as methods for adding / updating the height, length and width. 
// There are also methods for outputting the dimensions and calculating the volume,
public class Package {
    private double length;
    private double width;
    private double height;
    Scanner input = new Scanner(System.in);
    
    // Explicit default constructor (No-args)
    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
    }
    
    // Initial constructor (parameterized)
    public Package(double length, double width, double height ) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    // Copy constructor
    public Package(Package copy) {
        // copy new instance
        Package newPackage = new Package();
        
        // copy instance values
        newPackage.length = copy.length;
        newPackage.width = copy.width;
        newPackage.height = copy.height;
        
    }
    
    // Get the length from the user and assign it to the package.
    public void inputLength() {
        System.out.print("Enter length: ");
        length = input.nextDouble();
    }
    
    // Get the width from the user and assign it to the package.
    public void inputWidth() {
        System.out.print("Enter width: ");
        width = input.nextDouble();
    }
    
    // Get the height from the user and assign it to the package.
    public void inputHeight() {
        System.out.print("Enter height: ");
        height = input.nextDouble();
    }
    
    // Display the length x width x height
    public void displayDimensions() {
        System.out.printf("%.1f X %.1f X %.1f", length, width, height);
    }
    
    // Calculate the volume of the package
    public double calcVolume() {
        return length*width*height;
    }

}
