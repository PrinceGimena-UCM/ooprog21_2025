// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int radius;

        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();

         DebugCircle c = new DebugCircle(radius); // Fixed: pass the radius directly to the constructor instead of a Circle object

        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diameter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());
    }
}