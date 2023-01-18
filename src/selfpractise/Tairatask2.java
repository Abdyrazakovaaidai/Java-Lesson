package selfpractise;

import java.util.Scanner;

public class Tairatask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Girls what I supposed to do in discord platform?:");
        String TasksForAidai = input.nextLine();
        if (TasksForAidai.equalsIgnoreCase("Give new word to girls") || TasksForAidai.equalsIgnoreCase("Business English")) {
            System.out.println("How I need to motivate others? Choose one of them");
            System.out.println("push girls to learn by heart all new words");
            System.out.println("ask from girl new words");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("push girls to learn by heart all new words")) {
                System.out.println("Stay motivated and organized to do it daily");
            } else if(answer.equalsIgnoreCase("ask from girl new words")) {
                System.out.println("You are doing great");
            }else{
                System.out.println("Error");
            }

        }

    }
    }
