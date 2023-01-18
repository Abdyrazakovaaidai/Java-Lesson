package selfpractise;

import java.util.Locale;
import java.util.Scanner;

public class Sezimtask3 {
    public static void main(String[] args) {
        Scanner answer=new Scanner(System.in);
        System.out.println("Do you practise every day? Please answer correct or give up ");
        String input= answer.nextLine();
        switch(input.toLowerCase(Locale.ROOT)){
            case "correct":
                System.out.println("Well Done");
                break;
            case "give up":
                System.out.println("Never give up,keep doing your best");
            break;
            default:
                System.out.println("Wrong answer try again");
        }
    }
}
