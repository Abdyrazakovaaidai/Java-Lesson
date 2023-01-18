package com.javaclass456;

import java.util.Scanner;

public class Scannerpractise3 {
    public static void main(String[] args) {
        Scanner result=new Scanner(System.in);
        //System.out.println("Please enter your username");
        //String name=result.next();
       // System.out.println("This is your username: "+name);
        //System.out.println("Please enter your password");
        //String password=result.next();
        //System.out.println("Your Password:"+password);
        //boolean isloggedIn=name.equals("Aidai")&& password.equals("Aidai26");
        //System.out.println(isloggedIn);//every step have to be correct

        System.out.println("Username:");
        String username = result.next();

        System.out.println("Password");
        String password = result.next();

        //anotherString has no functionality, except giving us a hint that we need to put another String inside ();
        boolean isLoggedIn = username.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");

        System.out.println(isLoggedIn);

        //==
        //!=
        //needs to be used with caution when using for Strings
        //you can use ==, != when only working with constant values
        //when you are taking the values from user ==, != do not work
        //like want it to.

        //for Strings the best way to compare is to use .equals()
        //every String variable has .equals(), .equalsIgnoreCase()

        //if you want to compare not equals with Strings
        // !var.equals("expectedResult");

        //equalsIgnoreCase() --> a method that compares two strings
        //it will return true regardless of the cases.
        //ex: "Askar".equalsIgnoreCase("askaR") -> return true

        //equals() -> will return true only if all characters and their cases
        //match
        //ex: "Askar".equals("askaR") -> return false
        //equals() -> good for passwords
        //equalsIgnoreCase() -> good for username





















    }

}
