package Homework02;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {

        int days;
        String daySuffix;
        String dayOfWeek;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit of the day: ");
        days = scanner.nextInt();

        switch (days){
            case 1:
                daySuffix = "st";
                break;

            case 2:
                daySuffix = "nd";
                break;
            case 3:
                daySuffix = "rd";
                break;

            default:
                daySuffix = "th";
                break;
        }

    }
}
