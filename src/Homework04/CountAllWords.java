package Homework04;
import java.util.Scanner;
public class CountAllWords {

    public static int counter(String str){
if (str == null|| str.isEmpty())
    return 0;
int count = 0;
for (int i=0;i<str.length();i++){

    if(str.charAt(i)!=' '){
        count++;
        while(str.charAt(i)!= ' '&& i<str.length()-1){
            i++;
        }
    }
}
return count;
    }


    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

 String word = scanner.next();
        System.out.println(counter(word));




    }
}
