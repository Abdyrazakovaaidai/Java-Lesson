package selfpractise;

import java.util.Scanner;

public class Sumofthreedigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter three digit number:  ");
        int user= input.nextInt();
        ///user 678
        int num1=user/100;//6 java / calculator (678/100=6,78) выводит только целое число 6
        int num2=user%100;//78 java  calculator(678.10= 6,78 % выводит остаток 78)
        int middlenum=num2/10;//7 calculator (78/10=7,8  ответ 7 потому что когда делим выводит только чмсло перез запятой)
        int num3=num2%10;//8 calculator num2(78)/10=7,8  а в java 78%10=7,8 но он выводит остаток 8
        System.out.println(num1+middlenum+num3);




    }
}
