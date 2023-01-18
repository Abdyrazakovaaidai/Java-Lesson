package Class13;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the year:  ");
        int leap= input.nextInt();
        Leapyear leaps=new Leapyear();
        System.out.println(leaps.Isleapyear(leap)+"  This is leap year");

}
    public boolean Isleapyear(int year){
        if(year%400==0||year%4==0&&year%100!=0){
           return true;
        } else{
            return false;
        }

    }
}


