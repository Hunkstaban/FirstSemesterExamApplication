package Polymorphism;

import Main.Colors;
import Main.Initialize;
import IO.Input;

public class InitializePoly {

    public static void run() {
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "What would you like to do? (1: Choose motor, 2: Choose appliance, 3: Main Menu, 0: Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n-- CHOOSE MOTOR --");
                    Car.chooseMotor();
                    break;
                case 2:
                    System.out.println("\n-- CHOOSE APPLIANCE --");
                    Appliances.chooseAppliance();
                    break;
                case 3:
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
