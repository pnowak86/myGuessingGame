package company.com;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HumanPlayer {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int numberOfTryies = 0;
    int guessMin = 1;
    int guessMax = 100;

    public int getGuessMin() {
        return guessMin;
    }

    public int getGuessMax() {
        return guessMax;
    }


    public void setGuessMin(int guessMin) {
        this.guessMin = guessMin;
    }

    public void setGuessMax(int guessMax) {
        this.guessMax = guessMax;
    }

    public int getNumberOfTryies() {
        return numberOfTryies;
    }

    public void setNumberOfTryies(int numberOfTryies) {
        this.numberOfTryies = numberOfTryies;
    }

    public HumanPlayer() throws IOException {

        System.out.println("Pick your number from 0 to 100: ");

        try {
            int number = sc.nextInt();
            if (number > 100 || number < 0) {
                System.out.println("You have picked a wrong number!");
                HumanPlayer player = new HumanPlayer();
            }
        } catch (InputMismatchException e) {
            HumanPlayer player = new HumanPlayer();
        }

        setGuessMax(100);
        setGuessMin(1);

        guessing();

        Game game = new Game();

    }

    public void guessing() {
        numberOfTryies++;
        int guess = random.nextInt(getGuessMax() - getGuessMin() + 1) + getGuessMin();
        System.out.println("I guess, that you picked " + guess);


        System.out.println("more / less / yes: ");
        String answer = sc.next();
        if (answer.equals("more")) {
            setGuessMin(guess + 1);
            guessing();
        } else if (answer.equals("less")) {
            setGuessMax(guess - 1);
            guessing();
        } else if (answer.equals("yes")) {
            System.out.println("Oh yeah! I did it! After " + getNumberOfTryies() + " shots!");
        } else {
            System.out.println("Thats not a proper answer, you black asshole! ");
            guessing();
        }

    }
}
