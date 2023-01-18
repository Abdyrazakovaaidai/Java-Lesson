package class12;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        //Requirement:
        //Create a method that takes a person's height as a double (in meters) and
        // returns their height in feet and inches. Google the formula.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in metres , Example:1,5");
        double metres= input.nextDouble();
        System.out.println("Your height in feet "+heightinfeet(metres));
        System.out.println("Your height in inch "+heightinInch(metres));


    }
       public static double heightinfeet( double metres){
       int feet=(int)(metres*3.281);
       return feet;
    }
    public static double heightinInch(double metres){
        double inch=metres*39.37;
        return inch;
    }


      }
