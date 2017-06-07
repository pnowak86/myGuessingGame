package company.com;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HumanPlayer {

    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    int numberOfTryies = 0;

    public int getNumberOfTryies() {
        return numberOfTryies;
    }

    public void setNumberOfTryies(int numberOfTryies) {
        this.numberOfTryies = numberOfTryies;
    }

    public HumanPlayer() {

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

        guessing();

        Game game = new Game();

    }
    public void guessing(){
        numberOfTryies++;
        int guess = random.nextInt(100) + 1;
        System.out.println("I guess, that you have chose number " + guess);
        String answer = sc.next();

        if (answer.equals("no")){
            guessing();
        }else if (answer.equals("yes")){
            System.out.println("Oh yeah! Suck my balls!:D After " + getNumberOfTryies() + " shots!");
        }

    }
    public int computersChoice(){

        return random.nextInt();
    }
}
