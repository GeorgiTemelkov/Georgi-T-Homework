package L07Constructors;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivideNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a=0;
        int b=0;


        try {
            System.out.println("Please enter number a:");
            a = scanner.nextInt();

            System.out.println("Please enter number b:");
            b = scanner.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("The input value is not integer");
            throw new RuntimeException(ime);
        }

        try {
            System.out.println("a/b= " + a / b);
        }catch(ArithmeticException ae){
            System.out.println("Division by 0 is forbidden!");
        }

    }
}
