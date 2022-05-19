package Homework01;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        double side;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle side: ");
        side= scanner.nextDouble();

        System.out.println("Enter triangle height: ");
        height= scanner.nextDouble();

        double area = side*height/2;

        System.out.println("The triangle area is: "+area);
    }
}
