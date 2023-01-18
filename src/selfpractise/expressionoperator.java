package selfpractise;

import java.util.Scanner;

public class expressionoperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("//////Exercise1/////////////");
        System.out.print("Enter first number: ");
        short num1=input.nextShort();
        System.out.print("Enter operator:  ");
        char operator=input.next().charAt(0);
        System.out.print("enter second number: ");
        short num2=input.nextShort();
        System.out.println(num1 +"x"+num2+"="+num1*num2);


        System.out.println("///////Exercise2/////////////////");
        System.out.print("Enter first number:  ");
        int number1=input.nextInt();
        System.out.print("Enter second number:   ");
        int number2= input.nextInt();
        System.out.println(number1+"+"+number2+"="+(number1+number2));
        System.out.println(number1+"-"+number2+"="+(number1-number2));
        System.out.println(number1+"X"+number2+"="+(number1*number2));
        System.out.println(number1+"/"+number2+"="+(number1/number2));
        System.out.println(number1+"%"+number2+"="+(number1%number2));



    }
}
