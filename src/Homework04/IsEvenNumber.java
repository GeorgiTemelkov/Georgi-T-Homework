package Homework04;

import java.util.Scanner;
public class IsEvenNumber {

    static boolean isEven (int num){
       return (num %2==0);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        if(isEven(num)==true){
            System.out.println("This number is even");
        }
        else{
            System.out.println("This number is odd");
        }



    }
}
