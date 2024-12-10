

public class Factorial {

    public static void main(String[] args) {
       
        
        // Asking user for input
        System.out.print("Enter a number to calculate its factorial: ");
        int number = nextInt();

        // Calculate factorial using iterative approach
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + number + " is: " + factorial);
        
     
    }
}
