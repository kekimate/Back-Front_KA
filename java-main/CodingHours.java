public class CodingHours {
    public static void main(String[] args){
        int dailyCodingHours = 6;
        int semesterWeeks = 17;
        int workdaysPerWeek = 5;
        int averageWorkHoursWeekly = 52;

        int totalCodingHours = dailyCodingHours * workdaysPerWeek * semesterWeeks;

        double percentageCodingHours = ((double) totalCodingHours / (averageWorkHoursWeekly * semesterWeeks)) * 100;

        System.out.println("Total coding hours in the semester: " + totalCodingHours + " hours");
        System.out.println("Percentage of coding hours in the semester: " + percentageCodingHours + "%");
    }
}
