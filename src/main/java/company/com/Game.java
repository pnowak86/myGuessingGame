package company.com;

import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);

    public Game() {


        System.out.println();
        System.out.println("Who starts? ");
        System.out.println("1. Human");
        System.out.println("2. CPU");
        System.out.println("3. exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                HumanPlayer player = new HumanPlayer();
            }
            case 2: {
                CPU cpu = new CPU();
            }
            case 3: {

            }
        }

    }
}
