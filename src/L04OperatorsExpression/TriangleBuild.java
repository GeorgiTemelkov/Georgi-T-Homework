package L04OperatorsExpression;

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

        if (angleA<=0 || angleB<=0 || angleC<=0){
            System.out.println("You have imputed incorrect values for a triangle");
        }
        else if(sumAngles!=180)
        {
            System.out.println("This triangle cannot be build.");
        }
        else{
            if (angleA==60 && angleB==60 && angleC==60){
                System.out.println("This triangle is equilateral");
            }
            else if((angleA==angleB) || (angleA==angleC) || (angleB==angleC)){
                System.out.println("This triangle is isosceles");
            }

            else if (angleA<90 && angleB<90 && angleC<90){
                System.out.println("This triangle is acute");
            }
            else if (angleA==90 || angleB==90 || angleC==90){
                System.out.println("Tris triangle is right-angled");
            }

            else if (angleA>90 || angleB>90 || angleC>90){
                System.out.println("this triangle is obtuse");
            }

            else {
                System.out.println("This triangle is multifaceted");
            }
            }
        }
        }
