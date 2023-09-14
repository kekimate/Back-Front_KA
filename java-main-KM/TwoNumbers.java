public class TwoNumbers {
    public static void main(String[] args) {
        int num1 = 22;
        int num2 = 13;

        int addition = num1 + num2;
        System.out.println("Result of 13 added to 22: " + addition);

        int subtraction = num1 - num2;
        System.out.println("Result of 13 subtracted from 22: " + subtraction);

        int multiplication = num1 * num2;
        System.out.println("Result of 22 multiplied by 13: " + multiplication);

        double division = (double) num1 / num2;
        System.out.println("Result of 22 divided by 13 (as a decimal fraction): " + division);

        int integerDivision = num1 / num2;
        System.out.println("Integer part of 22 divided by 13: " + integerDivision);

        int remainder = num1 % num2;
        System.out.println("Remainder of 22 divided by 13: " + remainder);
    }
}
