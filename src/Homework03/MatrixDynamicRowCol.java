package Homework03;
import java.util.Scanner;
public class MatrixDynamicRowCol {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the array rows: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the array columns: ");
        int b = scanner.nextInt();

        int arr[][] = new int[a][b];
        System.out.println("Please enter the values of the array:");
        for (int i=0;i<a;i++) {
                   for (int j = 0; j < b; j++) {

             arr[i][j]=scanner.nextInt();
            }
        }
        for (int k=0;k<a;k++){
            for (int l=0; l<b;l++ ){
                System.out.format("%d   ",arr[k][l]);
            }
            System.out.println();

        }


    }

}
