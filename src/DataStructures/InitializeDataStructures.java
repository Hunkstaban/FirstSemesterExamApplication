package DataStructures;

import Main.Colors;
import Main.Initialize;
import IO.Input;

public class InitializeDataStructures {

    public static void run() {
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "What would you like to do? (1: People playground, 2: Main Menu, 0: Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n-- PEOPLE PLAYGROUND --");
                    DataStructures.peoplePlayground();
                    break;
                case 2:
                    System.out.println("\nReturning to Main Menu ...\n");
                    Initialize.mainMenu();
                case 0:
                    System.out.println("\nExiting program ... ");
                    System.exit(0);
                default:
                    System.out.println(Colors.RED_ANSI + "\nChoice not recognized. Try again ... \n" + Colors.RESET_ANSI);
            }
        }

    }
}
