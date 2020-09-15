import java.util.Scanner; 

/**
 * Takes two integers from user and finds the ascending order 
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner for user input 
     Scanner input = new Scanner(System.in);  

     // Prompt the user to write down a integer 
     System.out.println("Please enter an integer:");
     int Integer_1 = input.nextInt(); 

     // prompt the user to enter another integer 
     System.out.println("Please enter another integer:"); 
     int Integer_2 = input.nextInt(); 

     // check to see where integers are placed for ascending order 
     if (Integer_1 > Integer_2) {
       System.out.println("Your numbers in ascending order are " + Integer_1 + ", " + Integer_2);
     } else {
       System.out.println("Your numbers in ascending order are " + Integer_2 + ", " + Integer_1);
     }

     
  }
}
