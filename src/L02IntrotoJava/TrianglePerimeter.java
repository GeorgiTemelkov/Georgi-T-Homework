package L02IntrotoJava;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        double sideA;
        double sideB;
        double sideC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side A: ");
        sideA= scanner.nextDouble();

        System.out.println("Enter Side B: ");
        sideB= scanner.nextDouble();

        System.out.println("Enter Side C: ");
        sideC= scanner.nextDouble();

        System.out.println("The perimeter of the triangle is: " + (sideA+sideB+sideC));

    }
}
