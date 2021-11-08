import java.util.Scanner;

public class App {

 public static void main(String[] args) {
       //declare a built in java scanner project
       Scanner scanner = new Scanner(System.in);
             
       // Get an interger from the user
       System.out.println("Enter an interger");
       int userInput = scanner.nextInt();

        // Output the users input
        System.out.println("User input: " + userInput);

        //closes the scanner to prevent memory leaks
    }
}
     
        


