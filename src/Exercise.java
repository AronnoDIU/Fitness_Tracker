/**
 * @param duration in minutes
 */
record Exercise(String name, int duration) {
}

/*
class Exercise { // This way is not recommended
    private final String name;
    private final int duration; // in minutes

    public Exercise(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}*/
