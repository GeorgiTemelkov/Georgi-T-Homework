package Homework02;

import java.util.Scanner;

public class Trianglebuild {
    public static void main(String[] args) {


        double angleA, angleB, angleC, sumAngles;

        Scanner scannner  = new Scanner(System.in);
        System.out.println("Add angleA: ");
        angleA = scannner.nextDouble();

        System.out.println("Add angleB: ");
        angleB = scannner.nextDouble();

        System.out.println("Add angleC: ");
        angleC = scannner.nextDouble();

        sumAngles = angleA+angleC+angleB;

        if (angleA >0 && angleB >0 && angleC>0) {
            if (sumAngles == 180) {
                System.out.println("The triangle is possible");
            } else {
                System.out.println("The triangle is not possible");
            }
        } else {
                System.out.println("This triangle build is not possible. Enter different values.");
            }

        }



    }
}
