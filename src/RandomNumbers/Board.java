package RandomNumbers;
import Main.Colors;
import Main.Initialize;
import IO.Input;

import java.util.ArrayList;
import java.util.List;

public class Board {

    static void playDice() {
        // prompts for how many sides the dice should have and how many times it should roll, and puts them in an Array
        Dice dice = new Dice(Input.getInt("How many sides should the dice have?"));
        Integer[] diceRolls = new Integer[Input.getInt("How many times should the dice roll?")];
        for (int i = 0; i < diceRolls.length; i++) {
            diceRolls[i] = dice.rollDice(dice);
        }
        ArrayList<Integer> listOfRolls = new ArrayList<>(List.of(diceRolls));

        // displays to the user their rolls, as well as the sorted types using a TreeSet
        System.out.println("You rolled your "
                + Colors.YELLOW_ANSI + dice.printSides() + Colors.RESET_ANSI + " sided die "
                + Colors.YELLOW_ANSI + diceRolls.length + Colors.RESET_ANSI + " times. These are the results: \n"
                + listOfRolls);

        // give user the option to further manipulate the rolls
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "\nYou can sort the rolls or display them in a different way. What would you like to do?"
            + "(1. Sort all rolls, 2. Show histogram, 3. Roll new dice, 4. Return to Dice Menu, 5. Main Menu, 0. Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n-- SORT ALL ROLLS --");
                    Statistics.sortDice(listOfRolls);
                    continue;
                case 2:
                    System.out.println("\n-- DICE ROLL HISTOGRAM --");
                    Statistics.typeOfRolls(listOfRolls);
                    continue;
                case 3:
                    System.out.println("-- ROLL NEW DICE --");
                    Board.playDice();
                    continue;
                case 4:
                    System.out.println("Returning to Dice Menu ...\n");
                    InitializeRandomNumbers.run();
                case 5:
                    System.out.println("Returning to Main Menu ...\n");
                    Initialize.mainMenu();
                case 0:
                    System.out.println("Exiting program ... ");
                    System.exit(0);
                default:
                    System.out.println("Choice not recognized\n");
            }
        }
    }
}
