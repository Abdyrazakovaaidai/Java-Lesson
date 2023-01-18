package Group_Project_1.src.main.java.com.devxschool;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task
 {
     public static void main(String[] args) {
         Scanner color=new Scanner(System.in);
         System.out.println("Choose color");
         String color1= color.next();
         if(color1.equals("red")){
             System.out.println("Stop");
         }
          else if(color1.equals("green")){
             System.out.println("You can go");

         }
         else if(color1.equals("yellow")){
             System.out.println("wait");
         } else{
             System.out.println("wrong");
         }
     }
}
