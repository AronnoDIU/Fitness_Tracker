import java.util.ArrayList;

class FitnessTracker {
    private final ArrayList<Exercise> exerciseLog;
    private int totalMinutesLogged;
    private final int dailyGoal;

    public FitnessTracker(int dailyGoal) {
        this.exerciseLog = new ArrayList<>();
        this.totalMinutesLogged = 0;
        this.dailyGoal = dailyGoal;
    }

    public void logExercise(Exercise exercise) {
        exerciseLog.add(exercise);
        totalMinutesLogged += exercise.getDuration();
        System.out.println("Exercise logged: " + exercise.getName() + " - Duration: " + exercise.getDuration() + " minutes");
    }

    public void displaySummary() {
        System.out.println("\nExercise Log Summary:");
        for (Exercise exercise : exerciseLog) {
            System.out.println(exercise.getName() + " - Duration: " + exercise.getDuration() + " minutes");
        }
        System.out.println("Total minutes logged: " + totalMinutesLogged + " minutes");

        if (totalMinutesLogged >= dailyGoal) {
            System.out.println("Congratulations! You've reached your daily goal.");
        } else {
            System.out.println("You're " + (dailyGoal - totalMinutesLogged) + " minutes away from your daily goal.");
        }
    }
}