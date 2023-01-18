package Class14;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        //2) Char charAt(int i); returns the character at ith index
        //Ex; "DevxSchool".charAt(3); returns 'X'
        /*
        Indexing for a String - string is a sequence of characters
        and Java counts from 0 when indexed.positions
        space,. also character
         */
        String str="Wedevx.co";
        System.out.println(str.charAt(1));//printout e
        System.out.println(str.charAt(0));//printout W
        System.out.println(str.charAt(5));//x
        System.out.println(str.charAt(6));// .

        String str3="Superstar";
        System.out.println(str3.charAt(5));//String Index Out Of Bounds Exception
        //StringIndexOutOfBoundsException--> Exceptions are runtime errors


        //create a method takes a String and returns the last character of that string
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country name");
        String name= input.nextLine();
        System.out.println(lastcharacter(name));

    }
    public static char lastcharacter(String name){
        //United States of America
        int length=name.length();
        return name.charAt(length-1);
    }
}
