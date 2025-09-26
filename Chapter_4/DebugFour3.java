// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3{
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int w, l, h;
      
      System.out.print("Enter width of box >> ");
      w = input.nextInt();  // Fixed: changed nextInteger() to nextInt()
      
      System.out.print("Enter length of box >> ");
      l = input.nextInt();  // Fixed: changed nextDouble() to nextInt() to match the int type
      
      System.out.print("Enter height of box >> ");
      h = input.nextInt();
      
      DebugBox box1 = new DebugBox(); // Fixed: corrected class name to DebugBox (was FixDebugBox)
      DebugBox box2 = new DebugBox(w, l, h);  // Fixed: corrected constructor call to DebugBox (was FixDebugBox) 
                                              // Fixed: corrected variable usage from box1 to box2
      
      System.out.println("The dimensions of the first box are");
      box1.showData();
      
      System.out.print(" The volume of the first box is ");
      showVolume(box1);
      
      System.out.println("The dimensions of the second box are");
      box2.showData();
      
      System.out.print(" The volume of the second box is ");
      showVolume(box2);    // Fixed: corrected box2.showVolume() to call the static method properly
   }
   
   public static void showVolume(DebugBox aBox){
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}