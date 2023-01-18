package class12;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //Create a method that takes a char representing a grade (A, B, C, D, or F) and returns a boolean
        // indicating whether the grade is passing or failing. A and B are passing, C,D,F are failing.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade  A,B,C,D or F");
        char grade=input.next().charAt(0);
        boolean result=pass(grade);
        System.out.println(result);

    }
    public static boolean pass(char abcdf){

        switch(abcdf){
            case 'A':
            case'B':
            return true;
            case 'C':
            case 'D':
            case 'F':
                return false;
            default:
                System.out.println("please choose another letter");
                return false;
        }
    }
}
