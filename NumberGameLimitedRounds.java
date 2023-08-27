import java.util.Random;
import java.util.Scanner;

public class NumberGameLimitedRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int rounds = 0;
        int totalRounds = 4; 
        
        while (rounds < totalRounds) {
            int targetNumber = random.nextInt(100) + 1;
            int guess;
            int attempts = 5,i;
            
            System.out.println("Welcome to Round " + (rounds + 1) + " of the Number Guessing Game!");
            System.out.println("you have selected a number between 1 and 100. Try to guess it.");
            
         for(i=1;i<=attempts;i++){
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                if ((guess < targetNumber)&&(attempts!=i)) {
                    System.out.println("Try a higher number.");
                } else if ((guess > targetNumber)&&(attempts!=i)) {
                    System.out.println("Try a lower number.");
                }
             else   {
                    System.out.println("Try a next round");   }
            } 
            
            System.out.println("Congratulations You have  guessed the number " + targetNumber + " in " + attempts + " attempts.");
            
            rounds++;
        }
        
        System.out.println("Game over. You have completed " + totalRounds + " rounds.");
        
        scanner.close();
    }
}