package company.com;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);

    public Game() throws IOException {


        System.out.println();
        System.out.println("Who starts? ");
        System.out.println("1. You");
        System.out.println("2. CPU");
        System.out.println("3. exit");
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("What? Are you blind? ");
            Game game = new Game();
        }

        if (choice > 3 || choice < 0) {
            System.out.println("What are you stupid? ");
            Game game = new Game();
        }

        switch (choice) {
            case 1: {
                HumanPlayer player = new HumanPlayer();
            }
            case 2: {
                CPU cpu = new CPU();
            }
            case 3: {

                Desktop.getDesktop().browse(URI.create("http://www.pown.it/1471"));
                break;
            }

        }

        System.exit(0);

    }
}
