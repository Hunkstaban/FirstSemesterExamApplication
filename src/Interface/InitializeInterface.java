package Interface;

import IO.Input;

public class InitializeInterface {

    public static void run() {
        while (true) {
            System.out.println("What would you like to do?)");
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                default:
                    System.out.println("Choice not recognized\n");
            }
        }

    }
}
