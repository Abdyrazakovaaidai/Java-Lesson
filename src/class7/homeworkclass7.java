package class7;

import java.util.Scanner;

public class homeworkclass7 {
    public static void main(String[] args) {
        Scanner result=new Scanner(System.in);
        ///Homework1
        //System.out.println("Please write positive digit");
        //int num1= result.nextInt();

        //System.out.println("Please write positive digit");
        //int num2= result.nextInt();

        //System.out.println("Please write positive digit");
        //int num3= result.nextInt();
        //int num4=(num1+num2+num3)/3;
        //System.out.println("Average number: "+num4);


        System.out.println("Welcome to the Delta Air Lines");
        System.out.println("Are you travelling from connecting flight?");
        boolean answer= result.nextBoolean();
        if(answer){
            System.out.println("Enjoy your flight");
        }
        else{
            System.out.println("Please proceed to the security check ");
        }

    }
}
