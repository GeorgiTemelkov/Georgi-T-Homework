package L04OperatorsExpression;

import java.util.Scanner;
public class LargestNumberInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        int j;
        //int arr[] = {10, 3, 35, 22};
        System.out.println("Please enter 4 numbers:");
       for (j=0;j<arr.length;j++){
          arr[j]=scanner.nextInt();
       }
       int maxnum= arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>maxnum)
                maxnum = arr[i];
      }
        System.out.println("The highest number is "+maxnum);
    }
}
