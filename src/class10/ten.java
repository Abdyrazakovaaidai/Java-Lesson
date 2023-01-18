package class10;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1= input.nextInt();
        System.out.print("Please enter second number: ");
        int num2= input.nextInt();
        System.out.print("Please enter third number: ");
        int num3=input.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println(num1+" This number is the greatest");

          } else if(num2>num3&num2>num1){
            System.out.println(num2+" This number is the greatest");
        }
        else if(num3>num1&&num3>num2){
            System.out.println(num3+"  This number is the greatest");
        } else if(num1==num2&&num1>num3){
            System.out.println(num1+" this numbers are greatest");
        } else if(num3==num1&&num3>num2){
            System.out.println("this numbers are largest");
        }


    }
}
