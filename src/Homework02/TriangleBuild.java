package Homework02;

import java.util.Scanner;

public class TriangleBuild {
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

                if(angleA==90 || angleB ==90 || angleC==90) {
                    System.out.println("The triangle is right-angled");
                }else if()

            } else {
                System.out.println("The triangle is not possible");
                System.out.println("The sum of the triangles should be 180");
            }
        } else {
                System.out.println("The triangle is not possible");
            }

        }



    }
}
