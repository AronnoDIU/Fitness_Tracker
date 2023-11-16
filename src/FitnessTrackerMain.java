import java.util.Scanner;

public class FitnessTrackerMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the Fitness Tracker App!");

        System.out.print("Enter your daily exercise goal in minutes: ");
        int dailyGoal = userInput.nextInt();

        FitnessTracker tracker = new FitnessTracker(dailyGoal);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Log Exercise");
            System.out.println("2. Display Summary");
            System.out.println("3. Exit");

            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter exercise name: ");
                    String exerciseName = userInput.next();

                    System.out.print("Enter exercise duration in minutes: ");
                    int exerciseDuration = userInput.nextInt();

                    Exercise exercise = new Exercise(exerciseName, exerciseDuration);
                    tracker.logExercise(exercise);
                    break;

                case 2:
                    tracker.displaySummary();
                    break;

                case 3:
                    System.out.println("Exiting the Fitness Tracker App. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
