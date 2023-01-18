package class8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ifelsepractise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please jack enter your salary");
        int salary1= input.nextInt();
        System.out.println("Please Sara enter your salary");
        int salary2=input.nextInt();
        if(salary1>salary2){
            System.out.println("Jack salary is more "+salary1);
        }else{
            System.out.println("Sara salary is more "+salary2);
        }


    }
}
