package class8;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner result=new Scanner(System.in);
        //even numbers are the numbers that are divisible by 2 -> 2,4,6,8,10
       // odd numbers are not divisible by 2 -  1,3,5,7,9,11
        System.out.println("Enter number");
        int answer=result.nextInt();
        //When  i divided the number by 2 and there is no remainder
        //then that number is an even(четное)
        if(answer % 2 ==0){
            System.out.println("This is an even number "+answer);
        } else{
            System.out.println("this is odd number "+answer);//odd(нечетное)
        }
    }
}
