package selfpractise;

import java.util.Scanner;

public class sum3number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int user= input.nextInt();
        ///936
        int num1=user/10;//93 calculate (936/10=93,6 ответ целое число 93)
        int num2=num1/10;//9  calculate num1(93) 93/10=9,3 ответ целое число 9
        int num3=num1%10;//3  calculate num1(93) 93/10(%)=9,3 ответ остаток 3
        int num4=user%10;//6  calculate user(936) 936/10(%)=93,6 ответ остаток 6
        System.out.println(num2+num3+num4);


    }
}
