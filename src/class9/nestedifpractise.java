package class9;

import java.util.Scanner;

public class nestedifpractise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= input.nextInt();
        System.out.println("Please enter your salary");
        int salary=input.nextInt();
        if(age<18){
            System.out.println("You are not eligible");
        }
            else if(age>=18&&salary<5000){
                System.out.println("Sorry you need work hard to get credit card");

            }else if(age>=18&& salary>=5000&& salary<20000){
                System.out.println("you are eligible");
            } else if(age>=18&&salary>=20000){
                System.out.println("You'll get free credit card");
            }
            System.out.println("//////////////////////////////////////////////////////////");
            System.out.println("Nested if version");
            //code maintainability--> the code that's easy to maintain and make changes
            if(age<18){
                System.out.println("You are not eligible");
            }
            else{
                if(salary<5000){
                    System.out.println("Sorry you need work hard to get credit card");
                }
                else if (salary>=5000&& salary<20000){
                    System.out.println("you are eligible");
                }
                else{
                    System.out.println("You'll get free credit card");
                }
            }

    }
}
