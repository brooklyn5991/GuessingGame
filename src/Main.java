
import java.util.Scanner;

public class Main {
    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        int max = 11;
        int ranNum = (int) (Math.random() * max);
        int s = 0;
        int k = 5;

        System.out.println("Welcome, you are to guess between 0 to " + 11 + " and you have " + k + " chances");

        for(int i=s; i<k; i++) {
            System.out.print("Enter your guess: ");
            int guessNum = scanner.nextInt();

            if (guessNum == ranNum) {
                System.out.println("you are Correct, the number is " + ranNum);
                scanner.close();
                return;
            }
            else if (guessNum > ranNum) {
                System.out.println("guess lower");
            } else  {
                System.out.println("guess higher");
            }
        }
        System.out.println("you have run out of chances");
        scanner.close();
        System.out.println("The number is " + ranNum);
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}

