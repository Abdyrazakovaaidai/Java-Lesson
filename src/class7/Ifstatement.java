package class7;

public class Ifstatement {
    //if statement is a logical flow control
    //you can write a program that executes certain
    //portion of the code
    //only in certain conditions

    public static void main(String[] args) {
        // if false it does not print anything
       if(true) {
           System.out.println("Hello World");
           System.out.println("Hello jupiter");
       }
       //proceed with a normal execution
        System.out.println("in outside of If statement");

       if(false)//if only one statement you can skip curly brackets
           System.out.println("Hello mars");
           System.out.println("Hello saturn");//this line is in fact outside of the If
          //statement scope
        // it will print out in any condition


         //I want to print out Hello Venus only if is more than 1000

        int galoonfoil=5000;


         if(galoonfoil>1000){
             System.out.println("hello venus");//it's true so it prints out

         }
    }
}
