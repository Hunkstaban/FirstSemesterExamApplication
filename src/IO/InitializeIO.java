package IO;
import Main.*;

public class InitializeIO {

    public static void run() {
        System.out.println(Colors.GREEN_ANSI + "// WELCOME TO INPUT/OUTPUT //" + Colors.RESET_ANSI);
        while (true) {
            System.out.println(Colors.CYAN_ANSI + "What would you like to do? (1: Create file, 2: Read file, 3: Delete file, 4: How does it work?, 5: Return to Main Menu, 0. Exit)" + Colors.RESET_ANSI);
            int choice = Input.getInt();

            switch (choice) {
                case 1:
                    System.out.println("\n-- CREATE FILE --");
                    FileIO.writeToFile(Input.getString("Enter a file name"), Input.getString("Enter file content"));
                    continue;
                case 2:
                    System.out.println("\n-- READ FILE --");
                    FileIO.displayAllFiles();
                    String fileContent = FileIO.readFromFile(Input.getString("Enter the name of the file you want to read"));
                    System.out.println(fileContent);
                    continue;
                case 3:
                    System.out.println("\n-- DELETE FILE -- ");
                    FileIO.deleteFile();
                    continue;
                case 4:
                    System.out.println("\n-- INPUT/OUTPUT EXPLAINED -- ");
                    System.out.println(FileIO.readFromFile("IOExplained.txt"));
                    continue;
                case 5:
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
