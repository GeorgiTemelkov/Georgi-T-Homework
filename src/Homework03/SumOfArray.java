package Homework03;
import java.util.Scanner;

public class SumOfArray {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr= new int[5];
        int sum=0;
        System.out.println("Please insert 5 numbers for this array");
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        arr[4] = scanner.nextInt();

        for (int i =0; i< arr.length;i++){

            sum=sum+arr[i];

        }
        System.out.println("The sum of this array is "+sum);
    }

}