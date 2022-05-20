package Homework02;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.println("Enter your age:");
        age = scanner.nextInt();

        if (age <= 0){
            System.out.println("This is not a correct age");
        }
        else if (age<16) {
            System.out.println("You are not eligible to work!");
        }
        else {
                System.out.println("Congratulations! You are eligible to work!");
            }
        }



    }

