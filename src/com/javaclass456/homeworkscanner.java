package com.javaclass456;

import java.util.Scanner;

public class homeworkscanner {
    public static void main(String[] args) {
        Scanner logic=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= logic.nextInt();
        System.out.println("Your age is: "+age);
        System.out.println("Please enter your creditscore");
        int credit= logic.nextInt();
        System.out.println("Your Creditscore:" +credit);
        System.out.println("Please enter your marital status");
        String status= logic.next();
        System.out.println("Your status: "+status);
        Boolean landing=age>25&&credit>700&&status.equals("married");
        System.out.println("Approved: "+landing);


    }
}
