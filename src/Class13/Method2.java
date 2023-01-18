package Class13;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
 //Given two int values, return their sum. Unless the two values are the same,
        // then return double their sum.
        int sum=num(3,3);
        System.out.println(sum);
        System.out.println("please enter first number");
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        System.out.println("please enter second number");
        int num2= input.nextInt();
        System.out.println(Calculate(num1,num2));
    }
 public static int num(int num1,int num2){

     return (num1+num2)*2;
 }
 public static int Calculate(int digit1,int digit2){
        if(digit1==digit2){
            return (digit1+digit2)*2;
        } else{
            return digit1+digit2;
 }
}
}
