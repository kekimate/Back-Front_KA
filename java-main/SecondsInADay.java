public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsPassed = (currentHours * 3600) + (currentMinutes * 60) + currentSeconds;

        int secondsInADay = 24 * 60 * 60;
        int remainingSeconds = secondsInADay - secondsPassed;

        System.out.println("Remaining seconds in the day: " + remainingSeconds);
    }
}
