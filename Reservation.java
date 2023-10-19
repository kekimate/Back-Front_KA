import java.util.Random;

interface ReservationInterface {
    String generateReservationCode();
    String getDayOfWeek();
}

class Reservation implements ReservationInterface {
    private String code;
    private String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public Reservation() {
        this.code = generateReservationCode();
    }

    @Override
    public String generateReservationCode() {
        StringBuilder codeBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(36);
            char randomChar = (randomIndex < 10) ? (char) ('0' + randomIndex) : (char) ('A' + randomIndex - 10);
            codeBuilder.append(randomChar);
        }

        return codeBuilder.toString();
    }

    @Override
    public String getDayOfWeek() {
        Random random = new Random();
        int randomIndex = random.nextInt(7);
        return daysOfWeek[randomIndex];
    }

    public void printReservation() {
        String dayOfWeek = getDayOfWeek();
        System.out.println("Booking# " + code + " for " + dayOfWeek);
    }

    public static void main(String[] args) {
        Reservation reservation1 = new Reservation();
        Reservation reservation2 = new Reservation();
        Reservation reservation3 = new Reservation();
        Reservation reservation4 = new Reservation();
        Reservation reservation5 = new Reservation();

        reservation1.printReservation();
        reservation2.printReservation();
        reservation3.printReservation();
        reservation4.printReservation();
        reservation5.printReservation();
    }
}
