import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int counter = 0;
        boolean stillIn = true;

        System.out.println("Hello and welcome!");

        System.out.println("Let's test your luck! Input any number between 1 and 10");

        while (stillIn == true) {
            int i = scan.nextInt();
            if (i == rand.nextInt(11)) {
                counter++;
                System.out.println("Again!");
            }
            else {
                stillIn = false;
                scan.close();
                System.out.println("You lost!");
            }
        }
        System.out.println("You got a score of " + counter + "!");
    }
}