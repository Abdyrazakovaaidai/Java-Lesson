package Group_Project_1.src.main.java.com.devxschool;

import java.util.Scanner;

public class ExamplePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваш пароль");
        int password = input.nextInt();
        int rightPassword = 6767;


        if(rightPassword == 6767){
            int secondPassword = 8989;
            if(secondPassword == 8989 ){
                System.out.println("Good");
            }
            System.out.println("You entered in your account");

        }else if (password != 6768 ){
            System.out.println("You write Wrong ");
        }


    }
}
