package Homework01;

import java.util.Scanner;

public class Pinetree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        int a;

        System.out.println("Enter Pine tree Size:");
        a=scanner.nextInt();

        if (a <=0) {System.out.println("There is no tree");}
        else {

        int spaces = a-1;
        int ast;
        for(int b = 0; b < a; b++) {
            ast = 2 * b + 1;
            for (int c = 1; c <= spaces + ast; c++) {
                if (c <= spaces)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
            spaces--;

                                    }
        }
    }
}