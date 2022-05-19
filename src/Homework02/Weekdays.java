package Homework02;

import java.util.Scanner;

public class Weekdays {
    public static void main (String[] args) {



        int days;
        String daySuffix = "th";
        String dayOfWeek = null;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit of the day: ");
        days = scanner.nextInt();

        switch (days){
            case 1:
                daySuffix = "st";
                dayOfWeek = "Monday";
                break;

            case 2:
                daySuffix = "nd";
                dayOfWeek = "Tuesday";
                break;
            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;

            case 4:
                dayOfWeek = "Thursday";
                break;

            case 5:
                dayOfWeek = "Friday";
                break;

            case 6:
                dayOfWeek = "Saturday";
                break;

            case 7:
                dayOfWeek = "Sunday";
                break;

            default:
                daySuffix = "This is not a valid day of the week";
                break;
        }
        if (days <1 && days >7){
            System.out.println("This is not a valid day of the week");
        }
        System.out.format("The %d-%s day of the week is %s", days, daySuffix, dayOfWeek);
    }
}

