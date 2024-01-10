package Main;

import IO.*;
import Polymorphism.*;
import TestDrivenDevelopment.*;
import DataStructures.*;
import RandomNumbers.*;

public class Initialize {
    public static void mainMenu() {
        System.out.println(Colors.GREEN_ANSI + "// MAIN MENU //" + Colors.RESET_ANSI);
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "What would you like to see? (1: Input/Output, 2: Polymorphism, 3: Test Driven Development, 4: Data Structures, 5: Random Numbers, 0: Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\nMoving to Input/Output ... \n");
                    InitializeIO.run();
                    break;
                case 2:
                    System.out.println("\nMoving to Polymorphism ... \n");
                    InitializePoly.run();;
                    break;
                case 3:
                    System.out.println("\nMoving to TTD ... \n");
                    InitializeTTD.run();
                    break;
                case 4:
                    System.out.println("\nMoving to Data Structures ... \n");
                    InitializeDataStructures.run();
                    break;
                case 5:
                    System.out.println("\nMoving to Random Numbers ... \n");
                    InitializeRandomNumbers.run();
                    break;
                case 0:
                    System.out.println("\nExiting program ... \n");
                    System.exit(0);
                default:
                    System.out.println(Colors.RED_ANSI + "\nChoice not recognized. Try again ... \n" + Colors.RESET_ANSI);
            }
        }
    }
} // end of class
