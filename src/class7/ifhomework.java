package class7;

import java.util.Scanner;

public class ifhomework {
    public static void main(String[] args) {
        Scanner feedback=new Scanner(System.in);
        System.out.println("How many Java exercises are you solving per day?");
        int result= feedback.nextInt();
        if(result<3){
            System.out.println("You are too lazy");
        } else if (result>=3 && result<5){
            System.out.println("Good job, but you should do better");

        }else if(result>=5){
            System.out.println("Great job! You are on the right track!");
        }




        }
    }

