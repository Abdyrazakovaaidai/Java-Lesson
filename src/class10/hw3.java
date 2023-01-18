package class10;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much you want loan");
        int loan = input.nextInt();
        System.out.println("Please enter your credit score");
        int credit = input.nextInt();
        if (loan < 10000) {
            if (credit < 6000) {
                System.out.println("interest rate is 15%");
            }
        } else {
            if (loan < 10000 && credit >= 600) {
                System.out.println("Interest rate is 10%");
            } else if (loan >= 10000 && credit < 600) {
                System.out.println("interest rate is 12%");
            } else {
                System.out.println("interest rate is 8%");
            }


        }
    }
}
