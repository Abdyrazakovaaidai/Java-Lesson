package selfpractise;

import java.util.Scanner;

public class Sezimtask2 {
    public static void main(String[] args) {
        Scanner evenodd=new Scanner(System.in);
        System.out.println("Please enter one number and I will identify if it's odd or even number");
        int number= evenodd.nextInt();
        if(number%2==0){
            System.out.println(number+"+1"+"  it's even number");

        } else{
            System.out.println(number+"it's odd number");
        }
    }
}
