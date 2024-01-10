package IO;

import Main.Colors;

import java.io.*;
import java.util.Scanner;

public class FileIO {

    // private method that checks if the user writes the .txt file extension, and overwrites it
    private static String overwriteTxt (String fileName) {
        if (fileName.toLowerCase().endsWith(".txt")) {
            fileName = fileName.replace(".txt", "");
            return fileName;
        }
        return fileName;
    }

    // Method to write text to a .txt file
    public static void writeToFile(String fileName, String content) {
        // try/catch to handle the IOException in the method
        try {
            // handles if user writes .txt file extension since the extension gets concatenated in the method
            fileName = overwriteTxt(fileName);

            // creates file with the given fileName
            File file = new File(fileName + ".txt");

            // checks if the file already exists, and prompts the user to choose another name if it does
            while (file.exists()) {
                System.out.println(fileName + ".txt already exists.");
                fileName = overwriteTxt(Input.getString("Please choose a new name"));

                file = new File(fileName + ".txt");
            }

            // writes the provided content to the file
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();

            System.out.println(file + " saved.\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } // end of method

    // Method to read text from a .txt file
    public static String readFromFile(String fileName) {
        try {
            // handles if user writes .txt file extension since the extension gets concatenated in the method
            fileName = overwriteTxt(fileName);

            // creates file with the given file name
            File file = new File(fileName + ".txt");

            // checks if the file exists - if not, it displays all files and prompts user to choose another one
            while (!file.exists()) {
                System.out.println(Colors.RED_ANSI + fileName + ".txt doesn't exist.\n" + Colors.RESET_ANSI);
                displayAllFiles();
                fileName = overwriteTxt(Input.getString("Choose another file"));

                file = new File(fileName + ".txt");
            }

            // scans file and adds its content to the content StringBuilder to be returned
            System.out.println(Colors.BLUE_ANSI + "\nHere's the content of " + fileName + ".txt:" + Colors.RESET_ANSI);
            Scanner scanner = new Scanner(file);
            StringBuilder content = new StringBuilder();
            while (scanner.hasNext()) {
                content.append(scanner.nextLine() + "\n");
            }
            return content + "\n";

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    } // end of method

    // Overloaded readFromFrile to handle reading files from other directories
    public static String readFromFile(String directory, String fileName) {
        try {
            // handles if user writes .txt file extension since the extension gets concatenated in the method
            fileName = overwriteTxt(fileName);

            // creates file with the given file name
            File file = new File(directory + File.separator + fileName + ".txt");

            // checks if the file exists - if not, it displays all files and prompts user to choose another one
            while (!file.exists()) {
                System.out.println(Colors.RED_ANSI + fileName + ".txt doesn't exist.\n" + Colors.RESET_ANSI);
                displayAllFiles();
                fileName = overwriteTxt(Input.getString("Choose another file"));

                file = new File(fileName + ".txt");
            }

            // scans file and adds its content to the content StringBuilder to be returned
            System.out.println(Colors.BLUE_ANSI + "\nHere's the content of " + fileName + ".txt:" + Colors.RESET_ANSI);
            Scanner scanner = new Scanner(file);
            StringBuilder content = new StringBuilder();
            while (scanner.hasNext()) {
                content.append(scanner.nextLine() + "\n");
            }
            return content + "\n";

            // TODO: Make a prviate method that handles whether the file exists or not

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Method that will display all .txt files available in the current directory
    public static void displayAllFiles() {
        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles();

        int count = 0;

        // makes sure that files exist in the directory, and prints a list
        if (files != null) {

            System.out.println("List of .txt files: ");
            for (File file : files) {
                if (file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println("File " + (count+1) + ": " + file.getName());
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(Colors.RED_ANSI + "No .txt files found in the current directory\n" + Colors.RESET_ANSI);
            }

        } else {
            System.out.println("No files found\n");
        }
    } // end of method

    public static void displayFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        int count = 0;

        if (files != null) {
            System.out.println("List of .txt files: ");
            for (File file : files) {
                if (file.getName().toLowerCase().endsWith(".txt")) {
                    System.out.println("File " + (count + 1) + ": " + file.getName());
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(Colors.RED_ANSI + "No .txt files found in the current directory\n" + Colors.RESET_ANSI);
            }
        } else {
            System.out.println("No files found\n");
        }
    }

    // Method that can delete a .txt file
    public static void deleteFile() {
        displayAllFiles();
        String fileName = Input.getString("Enter file you wish deleted");

        fileName = overwriteTxt(fileName);

        File file = new File(fileName + ".txt");

        // Checking if the file exists in the directory
        while (!file.exists()) {
            System.out.println(Colors.RED_ANSI + fileName + ".txt doesn't exist.\n" + Colors.RESET_ANSI);
            displayAllFiles();
            fileName = Input.getString("Choose another file to delete");

            if (fileName.toLowerCase().endsWith(".txt")) {
                fileName = fileName.replace(".txt", "");
            }

            file = new File(fileName + ".txt");
        }
        // TODO: potentially make it so you can choose number corresponding the file to delete, rather than writing the file name in full

        file.delete();
        System.out.println(fileName + ".txt has been deleted \n");
    }

    // Overloaded deleteFile to have a file as a parameter
    public static void deleteFile(String fileName) {
        File file = new File(fileName + ".txt");
        file.delete();
        //System.out.println(fileName + ".txt has been deleted");
    }

} // end of class
