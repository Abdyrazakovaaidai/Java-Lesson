package class8;

import java.util.Scanner;

public class NumberOfEachdaysInEachMonth {
    public static void main(String[] args) {
        //what a program to take a month number from the user
        //and print the number of days in a given month
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name of month");
        String name= input.next();
        if(name.equals("January")){
            System.out.println("In january 31 days");
        } else if(name.equals("February")){
            System.out.println("In february 28 days");
        } else if(name.equals("March")){
            System.out.println("In March 30 days");
        }
        else if(name.equals("April")){
            System.out.println("In April 28 days");
        }
        else if(name.equals("May")){
            System.out.println("In May 26 days");
        }
        else if(name.equals("june")){
            System.out.println("In june 26 days");
        }
        System.out.println("Please enter number of month");
        int numbermonth= input.nextInt();
        if(numbermonth==1 || numbermonth==2 || numbermonth==3 || numbermonth==4){
            System.out.println("In this month 30 days");
        } else if(numbermonth==5|| numbermonth==6 || numbermonth==7||numbermonth==8){
            System.out.println("In this month 31 days");
        } else if(numbermonth==9|| numbermonth==10 || numbermonth==11||numbermonth==12){
            System.out.println("In this month 28 days");
        }
       else{
            System.out.println("It's not month number");
        }

    }
}
