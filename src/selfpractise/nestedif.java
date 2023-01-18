package selfpractise;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        /* Requirement:
        write a program that provides 3 option to user:America,Korea,Britain
        if America print out to 3 option Justin Bieber,Shown Mendes,Sam Smith(content I love this singer)
        if Korea:BTS,TXT,Enhypen(i love this group)
        if Britain Spider,Avatar,Lion (I love this movie)
        if user choose wrong return please choose correctly(in main)
        in each branch if it's wrong return please choose correct singer
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose one of them. Enter 1-3 or just name");
        System.out.println("1.America");
        System.out.println("2.Korea");
        System.out.println("3.Britain");
        String input= sc.nextLine();
        if(input.equalsIgnoreCase("America")||input.equals("1")){
            System.out.println("Please choose one of this singers");
            System.out.println("1.Justin Bieber   \n 2.Shown Mendes  \n 3.Sam Smith");
            String singer= sc.nextLine();
            if(singer.equalsIgnoreCase("Justin Bieber")||singer.equals("1")){
                System.out.println("I love Justin Bieber");
            }else if(singer.equalsIgnoreCase("Shown Mendes")||singer.equals("2")){
                System.out.println("I love Shown Mendes");
            } else if(singer.equalsIgnoreCase("Sam Smith")||singer.equals("3")){
                System.out.println("I love Sam Smith");
            }else{
                System.out.println("invalid input, please enter 1-3 or name of singer");
            }
        }
          else if(input.equalsIgnoreCase("Korea")||input.equals("2")) {
            System.out.println("Please choose one k-pop group");
            System.out.println("1.BTS \n 2.TXT \n 3.Enhypen");
            String group= sc.nextLine();
            if(group.equalsIgnoreCase("BTS")|| group.equals("1")){
                System.out.println("My bias from BTS is J-Hope");
            } else if(group.equalsIgnoreCase("TXT")||group.equals("2")){
                System.out.println("I like TXT");
            } else if(group.equalsIgnoreCase("Enhypen")||group.equals("3")){
                System.out.println("I like Enhypen");
            } else{
                System.out.println("invalid group name please choose corectly");
            }
        }
          else if (input.equalsIgnoreCase("Britain")||input.equals("3")){
                  System.out.println("Please choose one of Britain movie");
                  System.out.println("1.Avatar \n 2.Spider Man \n 3.Lion");
                  String movie= sc.nextLine();
                  if(movie.equalsIgnoreCase("Avatar")||movie.equals("1")){
                      System.out.println("Avatar is the best");
                  } else if(movie.equalsIgnoreCase("Spider Man")||movie.equals("2")){
                      System.out.println("I like spider man");
                  } else if(movie.equalsIgnoreCase("Lion")||movie.equals("3")){
                      System.out.println("I like Lion");
                  }else{
                      System.out.println("Invalid chooise");
                  }

        }
       else{
            System.out.println("error");
        }

    }

}
