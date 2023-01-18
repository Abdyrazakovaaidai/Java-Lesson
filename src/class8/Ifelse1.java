package class8;

public class Ifelse1 {
    public static void main(String[] args) {
        boolean doeshavelicence=false;
        // first goal is to make sure the program works fine for customer
        //the second goal is


        //the programs checks this if statement
        if(doeshavelicence){
            System.out.println("Have a safe trip");
        }
        //regardless of the result of the first if statement
        //the program will come and check this statement as well
        //so the program actually spends time for this if statement
        //I have to write the logic twice->there is a high possibility you
        //can get one of the logic wrong
        if(!doeshavelicence){
            System.out.println("Here is your ticket");
        }
        if(doeshavelicence){
            System.out.println("Have a safe trip!");
        } else{
            System.out.println("here is your ticket");

        }
        //if the user has a license and their speed is less than 80m/hr
        boolean laslicense=true;
        int speed=70;
        if(laslicense&& speed <80){
            System.out.println("Have a safe journey!");
            System.out.println("Be careful it's snowing");
        } else{
            System.out.println("Get a license and then go to journey");
        }

    }
}
