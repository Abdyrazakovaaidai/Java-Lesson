package class11;

import java.util.Scanner;

public class switchoperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter operator *,/,+,-:  ");
        char operator = input.next().charAt(0);
        System.out.print("Enter first number:  ");
        int num1 = input.nextInt();
        System.out.print("Enter second number:  ");
        int num2 = input.nextInt();
        int result = 0;



            switch (operator) {
                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + "*" + num2 + "=" + result);
                    break;
                case '/':
                    if(num2==0 || num1==0) {
                        System.out.println("You can not divide by 0");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + "/" + num2 + "=" + result);
                    }
                    break;
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + "+" + num2 + "=" + result);
                    break;
                default:
                    System.out.println("wrong operator");


            }
        }

    }



