package class9;

import java.util.Scanner;

public class Scannerpractise2 {
    public static void main(String[] args) {
        //ask user for their gender in char
        //and if the user gender M then print out-> go work hard
        //and if the user gender is F then print out-> enjoy your life
        //if the user gender input is not M or F then printout-> wrong input
        Scanner input=new Scanner(System.in);
        System.out.println("What is your gender");
        //String gender= input.next();
        //char genderInchar=gender.charAt(0);
        char gender=input.next().charAt(0);
        //primitive data types do not have any methods that's why they are primitive
        //primitive-> it's simple basic
        if(gender=='f'|| gender=='F'){
            System.out.println("Enjoy your life");
        } else if(gender=='m'|| gender=='M'){
            System.out.println("Go to work");
        }else{
            System.out.println("wrong input");
        }

    }
}
