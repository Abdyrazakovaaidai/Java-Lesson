package class7;

import java.util.Scanner;

public class Ifstatement2 {
    public static void main(String[] args) {
        //write a program that tells me if I am eligible to drive
        Scanner input=new Scanner(System.in);

        System.out.println("please enter your age");
        int age= input.nextInt();
        if(age>16) {
            System.out.println("You are eligible to drive");
        }
        if(age<=16) {
            System.out.println("You are not eligible to drive");
        }


        //write a program that ask the user for weather in
        //fahrenheit,if the weather is less than 32f than
        //print out it's freezing.Stay home
        //if weather more than or equal 32 and less than 41 print out
        System.out.println("Please enter a weather in fahrenheit");
        int bad= input.nextInt();
        if(bad<32){
            System.out.println("It's freezing, Stay Home "+bad);

        }
        System.out.println("please enter weather");
        int weather= input.nextInt();
        if(weather>=32&&weather<42){
            System.out.println("it's chilly outside");
        }
        System.out.println("enter your");
        int weather1= input.nextInt();
        if(weather1>=42&&weather1<68) {
            System.out.println("really cold");
        }

        int weather3=68;
        if (weather3>=68){
            System.out.println("Wow outside it's  really cold");
        }


    }
}
