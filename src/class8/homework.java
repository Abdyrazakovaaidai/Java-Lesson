package class8;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner result=new Scanner(System.in);
        System.out.println("Please write a number from 0 to 6 to see the days of the week");
        int num=result.nextInt();
        if(num==0){
            System.out.println("Sunday");

        } else if(num==1){
            System.out.println("Monday");
        } else if(num==2){
            System.out.println("Tuesday");
        } else if(num==3){
            System.out.println("Wednesday");
        } else if(num==4){
            System.out.println("Thursday");
        } else if(num==5){
            System.out.println("Friday");
        } else if(num==6){
            System.out.println("Saturday");
        } else{
            System.out.println("Invalid number");
        }
        System.out.println("\t\t\t\t\t\tWelcome to Kyrgyz Republic");
        System.out.println("\t\t\t\t\t\tAre you travelling first time here?");
        boolean answer= result.nextBoolean();
        if(answer){
            System.out.println("\t\t\t\t\t\tEnjoy your stay!");
        }else{
            System.out.println("\t\t\t\t\t\tYou have got a 10% discount on your stay");
        }
    }
}
