package Homework04;

public class MiddleOfString {

    public static void middleChar (String str){

        int a =  str.length();
        int b = a/2;

        if(a%2!=0){
            System.out.println(str.charAt(b));
        }
        else{
            int c =(a/2)-1;
            System.out.println(str.charAt(c)+" "+str.charAt(b));
        }




    }

    public static void main(String[] args) {

    String str = "abrakadabra";

        middleChar(str);

    }
}
