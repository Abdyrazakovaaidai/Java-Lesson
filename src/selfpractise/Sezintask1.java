package selfpractise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sezintask1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter three-digit number:  ");
        int num1= input.nextInt();
        int result=0;
        while (num1>0){
            result=result+num1%10;
            num1=num1/10;
        } System.out.println(result);



    }
}
