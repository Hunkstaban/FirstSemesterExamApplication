package TestDrivenDevelopment;

import IO.*;
import Main.Colors;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OOD {
    private static final String useCaseDirectory = "OOD/use_cases";
    private static final String userStoryDirectory = "OOD/user_stories";
    static void createUseCase() {
        try {
            String title = Input.getString("Enter the title for the use case");
            String actor = Input.getString("Enter the actor");

            int maxScenarios = 5;

            int numSuccessScenarios;
            do {
                numSuccessScenarios = Input.getInt("How many success scenarios do you want to write? (Maximum of " + maxScenarios + ")");
                if (numSuccessScenarios > maxScenarios) {
                    System.out.println("Maximum allowed scenarios is " + maxScenarios + ". Please try again.");
                }
            } while (numSuccessScenarios > maxScenarios);

            List<String> successScenarios = new ArrayList<>();
            for (int i = 0; i < numSuccessScenarios; i++) {
                successScenarios.add("Success scenario " + (i + 1) + ": " + Input.getString("Enter success scenario " + (i + 1)));
            }

            int numFailureScenarios;
            do {
                numFailureScenarios = Input.getInt("How many failure scenarios do you want to write? (Maximum of " + maxScenarios + ")");
                if (numFailureScenarios > maxScenarios) {
                    System.out.println("Maximum allowed scenarios is " + maxScenarios + ". Please try again.");
                }
            } while (numFailureScenarios > maxScenarios);

            List<String> failureScenarios = new ArrayList<>();
            for (int i = 0; i < numFailureScenarios; i++) {
                failureScenarios.add("Failure scenario " + (i + 1) + ": " + Input.getString("Enter failure scenario " + (i + 1)));
            }

            // Formatted string for the use case
            String formattedUseCase = "Title: " + title + "\nActor: " + actor
                    + "\n" + String.join("\n", successScenarios)
                    + "\n" + String.join("\n", failureScenarios);

            // Create directory for the use-cases if none exist yet
            File directory = new File(useCaseDirectory);
            if (!directory.exists()) {
                directory.mkdirs();
                System.out.println("Directory created: " + directory.getPath());
            }

            FileIO.writeToFile(useCaseDirectory + File.separator + title, formattedUseCase);
            // TODO: Overload writeToFile to be able to handle/prompt for other directories

        } catch (Exception e) {
            System.out.println("Error creating use case: " + e.getMessage());
        }

    }

    static void createUserStory() {
        // Prompt user for title
        String title = Input.getString("Enter the title for the User Story");

        // Prompt user for story
        String story = Input.getString("Enter the User Story");

        // Create directory for the user stories if none exist yet
        File directory = new File(userStoryDirectory);
        if (!directory.exists()) {
            directory.mkdirs();
            System.out.println("Directory created: " + directory.getPath());
        }

        // Save to a text file with the title as its name
        FileIO.writeToFile(userStoryDirectory + File.separator + title, "Title: " + title + "\nUser Story:\n" + story);
        // TODO: Overload writeToFile to be able to handle/prompt for other directories
    }

    static void listToDos() {
        FileIO.displayFilesInDirectory(useCaseDirectory);

        int choice = Input.getInt("What would you like to do? (1. Read a use case, 2. Mark as completed, 3. Back to OOD Menu)");

        switch (choice) {
            case 1:
                // Read a use case
                String useCaseTitle = Input.getString("Enter the title of the use case you want to read");
                String useCaseContent = FileIO.readFromFile(useCaseDirectory, useCaseTitle);
                System.out.println(useCaseContent);
                break;
            case 2:
                // Mark as completed and delete
                String completedTitle = Input.getString("Enter the title of the completed use case");
                FileIO.deleteFile(useCaseDirectory + File.separator + completedTitle);
                System.out.println(completedTitle + ".txt marked as completed and deleted.\n");
                break;
            case 3:
                System.out.println("\nReturning to OOD Menu ...\n");
                InitializeTTD.run();
                break;
            default:
                System.out.println(Colors.RED_ANSI + "\nChoice not recognized. Try again ... \n" + Colors.RESET_ANSI);
        }
    }

    static void readUserStories() {
        FileIO.displayFilesInDirectory(userStoryDirectory);
        String userStoryTitle = Input.getString("Enter the title of the use case you want to read");
        String userStoryContent = FileIO.readFromFile(userStoryDirectory, userStoryTitle);
        System.out.println(userStoryContent);
    }

    static void deleteUserStories() {
        FileIO.displayFilesInDirectory(userStoryDirectory);
        String userStoryToDelete = Input.getString("Enter the title of the user story you want to delete");
        FileIO.deleteFile(useCaseDirectory + File.separator + userStoryToDelete);
        System.out.println(userStoryToDelete + ".txt deleted.\n");
    }
}
