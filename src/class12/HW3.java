package class12;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        // Create a method that takes a boolean indicating whether someone is a member of a loyalty
        // program and a double representing the cost of a purchase, and returns a double representing the final cost
        // of the purchase after applying a discount. If the customer is a loyalty customer apply 10% discount.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your count of purchase");
        double usercount= input.nextDouble();
        System.out.println("Are you member of loyalty program? Enter true or false");
        boolean loyalty= input.nextBoolean();
        System.out.println( "Your amount of purchase after discount is "+purchase(usercount,loyalty));

}
  public static double purchase ( double count,boolean participent ){
      if(participent){
         count=count-(count*0.1);
         return count;
      } else{
          return count;
      }
  }
}

