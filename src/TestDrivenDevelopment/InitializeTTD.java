package TestDrivenDevelopment;

import IO.Input;
import Main.Colors;
import Main.Initialize;

public class InitializeTTD {

    public static void run() {
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "What would you like to do? (1: Create Use-Case, 2. Create User Story, " +
                    "3: Use-Case to-do list, 4: Read User Stories, 5: Delete User Stories, 6: Main Menu, 0: Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n-- CREATE USE-CASE --");
                    OOD.createUseCase();
                    break;
                case 2:
                    System.out.println("\n-- CREATE USER STORY --");
                    OOD.createUserStory();
                    break;
                case 3:
                    System.out.println("\n-- USE-CASE TODO LIST --");
                    OOD.listToDos();
                    break;
                case 4:
                    System.out.println("\n-- USER STORIES --");
                    OOD.readUserStories();
                    break;
                case 5:
                    System.out.println("\n-- DELETE USER STORIES --");
                    OOD.deleteUserStories();
                    break;
                case 6:
                    System.out.println("\nReturning to Main Menu ...\n");
                    Initialize.mainMenu();
                case 0:
                    System.out.println("\nExiting program ... \n");
                    System.exit(0);
                default:
                    System.out.println(Colors.RED_ANSI + "\nChoice not recognized. Try again ... \n" + Colors.RESET_ANSI);
            }
        }

    }
}
