import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {


        // creating our object
        Random random = new Random();

        //Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> guessCounts = new HashSet<>();

        //random number generator
        int randomNumber = random.nextInt(10) + 1;
        // storing user guess to compare with random number.
        int guesses = 0;

        System.out.println("Please guess a number :)");

        while (guesses != randomNumber) {
            guesses = scanner.nextInt();//scans user input and stores it in guesses
            if (guesses > randomNumber) {
                System.out.println("Guess lower bro/sis");
                guessCounts.add(guesses);//will add guess to hashset so we know how many guesses the user has
            } else if (guesses < randomNumber) {
                System.out.println("Guess higher bro/sis");
                guessCounts.add(guesses);//will add guess to hashset
            } else {
                System.out.println("You're correct! " + guesses + " is the correct number. You guessed " + guessCounts.size() + " times before correct guess.");
            }


        }
    }
}