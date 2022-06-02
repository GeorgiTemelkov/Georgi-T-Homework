package L05DataStructures;
//НЕДОВЪРШЕНА
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = scanner.next();

        char[] front = word.toCharArray();

        char[] reverse = new char[front.length];

        for (int i = front.length-1; i>=0; i--){
            for (int j =0; j<= front.length;j++) {

      //         reverse[j] = front.[i];

            }
        }
        System.out.println(reverse);

    }
}
