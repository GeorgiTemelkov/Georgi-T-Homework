package L06Methods;

public class SmallestNumber {
    public static void main(String[] args) {

        SmallestNumber smallestNumber = new SmallestNumber();
        smallestNumber.findSmallestNumber(15,25,30);
        smallestNumber.findSmallestNumber(25,12,22);
        smallestNumber.findSmallestNumber(5,50,15);


        }
    public void findSmallestNumber(int a, int b, int c){

        if(a<=b && a<=c){
            System.out.println("The smallest number is:"+a);
        }
        else if (b<a && b<=c){
            System.out.println("The smallest number is:"+b);

        }
        else {
            System.out.println("The smallest number is:"+c);
        }
    }
}
