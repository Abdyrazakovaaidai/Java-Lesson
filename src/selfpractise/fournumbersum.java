package selfpractise;

import java.util.Scanner;

public class fournumbersum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter four digit number in order to get sum of them:   ");
        int user= input.nextInt();
        //7654 - 7,654
        int num1=user/1000;// java 7 || calculator 7,654
        int num2=user%1000;//java 654 || calculator 7654/1000=7,654(7654%10=654 остаток)
        int num3=num2/100;//6
        int num4=num2%100;//54
        int num5=num4/10;//5
        int num6=num4%10;//4
        System.out.println(num1+num3+num5+num6);
    }
}
