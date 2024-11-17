import java.util.Random;
import java.util.Scanner;

public class game {

//    int min;
//    int max;
//
//    public game (int min, int max) {
//
//        this.min = min;
//        this.max = max;
//
//    }

    public static int getRandom(int min, int max) {
        Random randomNumber = new Random();
        return randomNumber.nextInt((max - min) + 1) + min;
    }

    public static void guessGame(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the guess game !");
        System.out.println("Please enter your minimum number : ");

        int min = scanner.nextInt();
        System.out.println("Please enter the maximum number : ");
        int max = scanner.nextInt();

        int valueToFind = getRandom(min, max);
        int input = 0; // Initialisation à changer + tard

        while(input != valueToFind){
            System.out.println("Please enter a number : ");
            input = scanner.nextInt();

            if (input < valueToFind){
                System.out.println("Too small ! Try again");
            }
            else if (input > valueToFind){
                System.out.println("Too large ! Try again");
            }
        }

        System.out.println("Congratulations! You guessed the correct number !");


    }
}
