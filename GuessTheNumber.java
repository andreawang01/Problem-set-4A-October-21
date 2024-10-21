
/**
 * Andrea Wang
 * October 10th, 2024
 * Problem set 4A
 */
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        
        int randomNumber= (int)Math.random()*100+1;
        System.out.println ("I'm thinking of a number between 1 and 100. Can you guess it?");
        Scanner input = new Scanner(System.in);
        int guess= input.nextInt();
        int numberOfGuesses=0;
    
        
          
        while (guess != randomNumber) {
            guess = input.nextInt();
            numberOfGuesses++;
            
             if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " tries.");
            }
        }
        
        input.close();
    }
}


    
