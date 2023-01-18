package class9;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();
        System.out.println("Please enter third number");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greatest number");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + " is greatest number");
            }
            if (num3 > num2 && num1 < num3) {
                System.out.println(num3 + " is greatest number");
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Please enter your age ");
        int age = input.nextInt();
        System.out.println("Age:  "+age);
        System.out.println("Please enter your salary ");
        int salary = input.nextInt();
        System.out.println("Salary:  "+salary);
        System.out.println("Please enter your loan amount ");
        int loan = input.nextInt();
        System.out.println("Loan:  "+loan);
        if (age < 18&&salary<1000) {
            System.out.println("You are not eligible");
        }
        else{
            if(salary>1001&&salary<5000){
                System.out.println("limit 10000");
            }
            else if(salary>5001&&salary<10000){
                System.out.println("limit 20000");
            }
            else if(salary>10001){
                System.out.println("limit 50000");
            }
        }
        if(loan<5000){
            System.out.println("No Deduction in Limit");
        }
        else{
            if(loan>20000){
                System.out.println("Not Eligible");
            }
            if(loan>5001&&loan<20000){
                System.out.println("Deduct Half of the loan amount from credit card limit");
            }
            if(loan<0){
                System.out.println("You are not Eligible");
            }
        }
    }
}
