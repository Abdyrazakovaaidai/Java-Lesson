package Class13;


import java.util.Scanner;

public class InstanceMethod {
    public static void main(String[] args) {
        //Given two non-negative int values, return true if they have the same last digit, such as with 27
        // and 57. Note that the % “mod” operator computes remainders, so 17 % 10 is 7.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1= input.nextInt();
        System.out.println("Please enter second number");
        int num2= input.nextInt();
        InstanceMethod equal=new InstanceMethod();
        equal.samedigit(num1,num2);
        //create a method that takes a non-negative int.
        //Return true if the given non-negative number is a
        // multiple of 3 or a multiple of 5. Use the % “mod” operator
        System.out.println("Enter number that multiple of 3 and 5");
        int sum= input.nextInt();
        InstanceMethod multiple=new InstanceMethod();
        System.out.println(multiple.number(sum));


    }
    public void samedigit(int num1,int num2){
        if(num1%10==num2%10){
            System.out.println("TRUE");
        } else{
            System.out.println("False");
        }
    }
    public boolean number(int num1){
        if(num1<0){
            System.out.println("Invalid");
        }
        return num1%3==num1%5;
    }
}
