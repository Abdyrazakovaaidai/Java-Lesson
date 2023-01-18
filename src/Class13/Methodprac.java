package Class13;

import java.util.Scanner;

public class Methodprac {
    public static void main(String[] args) {
        //Given 2 int values, return true if either
        // of them is in the range 10..20 inclusive.
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your range");
        int range1= input.nextInt();
        System.out.println("please enter your range");
        int range2= input.nextInt();
        System.out.println("Your range is: "+range(range1,range2));
    }
    public static boolean range(int num1,int num2 ){
        if(num1>=10&&num1<=20||num2>=10&&num2<=20){

            return true;
        } else{
            return false;
        }
    }
}
