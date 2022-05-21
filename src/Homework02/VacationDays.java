package Homework02;
import java.util.Scanner;
public class VacationDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Where would you like to go on vacation - The Beach or The Mountain?");
        System.out.println("Please enter 1 for Beach and 2 for Mountain.");
        int destination;
        double budget;

        destination=scanner.nextInt();
        switch (destination) {


        case 1:
            destination=1;
            System.out.println("Please enter your vacation budged for your Beach vacation:");
            budget= scanner.nextDouble();

            if(budget<=0){
                System.out.println("You have no money, so no Beach for you!");
            }
            else if (budget<50){
                System.out.println("You should consider you vacation destination to be Bulgaria");
            }
                else{
                System.out.println("You can choose a destination outside Bulgaria for you Beach Vacation ");
            }
        break;

            case 2:
                destination=2;
                System.out.println("Please enter your vacation budged for you Mountain vacation:");
                budget= scanner.nextDouble();

                if(budget<=0){
                    System.out.println("You have no money, so no Mountain hiking for you!");
                }
                else if (budget<30){
                    System.out.println("You should consider you vacation destination to be Bulgaria");
                }
                else{
                    System.out.println("You can choose a destination outside Bulgaria for you Mountain Vacation ");
                }
                break;

            default:
                System.out.println("This is not a correct vacation option");
                break;
        }
    }
}
