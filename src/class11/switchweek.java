package class11;

import java.util.Scanner;

public class switchweek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter day of week Monday-Sunday");
        String day= input.nextLine();
        switch(day){
            case "Monday":
                System.out.println("6 days left until Sunday");
                break;
            case "Tuesday":
                System.out.println("5 days left until Sunday");
                break;
            case"Wednesday":
                System.out.println("4 days left until Sunday");
                break;
            case "Thursday":
                System.out.println("3 days left until Sunday");
                break;
            case"Friday":
                System.out.println("2 days left until Sunday");
                break;
            case "Saturday":
                System.out.println("1 days left until Sunday");
                break;
            default:
                System.out.println("Today is Sunday");


        }
    }
}
