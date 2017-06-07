package company.com;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class CPU {

    public int getNumberOfTryies() {
        return numberOfTryies;
    }

    public void setNumberOfTryies(int numberOfTryies) {
        this.numberOfTryies = numberOfTryies;
    }


    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int numberOfTryies = 1;
    int cpuNumber = random.nextInt(100) + 1;

    public CPU() {


        System.out.println("Guess which number from 0 to 100 i am thinking of? ");
        guessing();
        Game game = new Game();
    }

    public void guessing() {
        int answer = 0;
        try {
           answer  = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println();
        }

        if (answer == cpuNumber) {
            System.out.println("You've guessed! You've cheated " +
                    "you piece of shit! It's impossible after " + getNumberOfTryies() + " tryies!");
        } else if (answer > cpuNumber) {
            System.out.println("Haha! TOO MUCH! Guess again you asshole! ");
            numberOfTryies++;
            guessing();
        } else if (answer < cpuNumber) {
            System.out.println("Haha! TOO LITTLE! Guess again you asshole! ");
            numberOfTryies++;
            guessing();
        }


    }
}
