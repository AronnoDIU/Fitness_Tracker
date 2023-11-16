import java.util.ArrayList;

class FitnessTracker {
    private final ArrayList<Exercise> exerciseLog; // List of exercises logged for the day
    private int totalMinutesLogged; // Total minutes logged for the day
    private final int dailyGoal; // Daily exercise goal in minutes

    public FitnessTracker(int dailyGoal) {
        this.exerciseLog = new ArrayList<>(); // Initialize the exercise log with an empty list
        this.totalMinutesLogged = 0; // Initialize the total minutes logged to 0
        this.dailyGoal = dailyGoal;
    }

    // Add an exercise to the exercise log and update the total minutes logged
    public void logExercise(Exercise exercise) {
        exerciseLog.add(exercise); // Add the exercise to the exercise log
        totalMinutesLogged += exercise.duration(); // Update the total minutes logged
        System.out.println("Exercise logged: " + exercise.name() + " - Duration: " + exercise.duration() + " minutes");
    }

    // Display the summary of the exercise log and the total minutes logged
    public void displaySummary() {
        System.out.println("\nExercise Log Summary:");

        for (Exercise exercise : exerciseLog) {
            System.out.println(exercise.name() + " - Duration: " + exercise.duration() + " minutes");
        }
        System.out.println("Total minutes logged: " + totalMinutesLogged + " minutes");

        // Check if the total minutes logged are equal to or greater than the daily goal
        if (totalMinutesLogged >= dailyGoal) {
            System.out.println("Congratulations! You've reached your daily goal.");
        } else { // If the total minutes logged are less than the daily goal
            System.out.println("You're " + (dailyGoal - totalMinutesLogged)
                    + " minutes away from your daily goal.");
        }
    }
}