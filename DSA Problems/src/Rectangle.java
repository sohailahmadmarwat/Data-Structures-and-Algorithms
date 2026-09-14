import java.util.Scanner;
public class Rectangle {
    double length;
    double width;
    boolean valid = true;
    
    Rectangle() {
        length = 1;
        width = 1;
    }
    void get() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double l = s.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = s.nextDouble();
        set(l, w);
    }
    void set(double l, double w) {
        valid = true; // reset flag

        if (l > 0.0 && l < 20.0) {
            length = l;
        } else {
            System.out.println("Invalid length...Must be between 0.0 and 20.0.");
            valid = false;
        }
        if (w > 0.0 && w < 20.0) {
            width = w;
        } else {
            System.out.println("Invalid width...Must be between 0.0 and 20.0.");
            valid = false;
        }
    }
    void finder() {
        if (!valid) {
            System.out.println("Cannot calculate because of invalid values.");
            return;
        }
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}
