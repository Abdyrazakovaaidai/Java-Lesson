package class10;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner result=new Scanner(System.in);
        System.out.println("Please enter shipping country:");
        String country=result.nextLine();
        System.out.println("Please enter weight of your item in lbs:");
        double num=result.nextDouble();
        double value=0;
        if(country.equalsIgnoreCase("United States")){

            if(num>=2){
                value=num*0.5;
                System.out.println("Your shipping cost is: "+value );
            }else if(num<2){
                value=5;

            }
        }
        else{
            value=num*1.5;
            System.out.println("Your shipping cost: "+value );

        }

    }
    }
