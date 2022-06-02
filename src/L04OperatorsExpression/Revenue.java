package L04OperatorsExpression;


import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double unitPrice;
        double qtty;
        double discount;
        double discountPrice;
        double revenue;
        System.out.println("Please enter the item price");
        unitPrice=scanner.nextDouble();

        System.out.println("Please enter the item quantity");
        qtty= scanner.nextDouble();

        if (qtty==0 || unitPrice==0){
            System.out.println("Please enter correct values");
        }
            else{
            if ((qtty>=100)&&(qtty<=120)){
                discount=15;
            }
            else if (qtty>120) {
                discount = 20;
            }
            else {
                discount=0;
            }

            discountPrice= ((unitPrice*qtty)*discount)/100;
            revenue = (unitPrice*qtty)-discountPrice;
            System.out.println("The revenue from this sale is: "+revenue+" $");
            System.out.println("Your discount is "+discountPrice+" $ ("+discount+"%)");

        }
        }

    }

