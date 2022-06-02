package L02IntrotoJava;

import java.util.Scanner;
public class StringName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstname= scanner.nextLine();


        System.out.println("Enter your middle name: ");
        String middlename= scanner.nextLine();


        System.out.println("Enter your last name: ");
        String lastname= scanner.nextLine();

     System.out.println("Your full name is: "+firstname+" "+middlename+" "+lastname);
    }
}
