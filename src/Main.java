import java.util.Scanner;

public class Main {

    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        int max = 11;
        int ranNum = (int) (Math.random() * max);


        final int INITIAL_CHANCES = 5;

        boolean correct = false;
        int numOfGuess = 0;

        System.out.println("Welcome, you are to guess between 0 to " + (max - 1) + " and you have " + INITIAL_CHANCES + " normal chances, after that your chances keep counting.");
        int guessNum;

        while (!correct) {
            System.out.print("Enter your guess: ");
            guessNum = scanner.nextInt();


            numOfGuess++;

            if (guessNum == ranNum) {
                System.out.println("You are Correct! The number is " + ranNum);
                System.out.println("You made " + numOfGuess + " attempts.");
                correct = true;
                scanner.close();
                return;
            }




            if (guessNum > ranNum) {
                System.out.print("Guess lower. ");
            } else {
                System.out.print("Guess higher. ");
            }


            if (numOfGuess < INITIAL_CHANCES) {

                System.out.println("You have " + (INITIAL_CHANCES - numOfGuess) + " normal chances left.");
            } else if (numOfGuess == INITIAL_CHANCES) {

                System.out.println("This was your last normal chance. Guessing continues indefinitely.");
            } else {

                System.out.println("Total attempts made so far: " + numOfGuess);
            }
        }
    }

    public static void main(String[] args) {
        guessNumberGame();
    }
}