package class8;

public class elseif {
    public static void main(String[] args) {
        //has license
        //speedlimit
        //if hasLicense and speedlimit is more than 80
        //then give speeding ticket
        //if does not have license and speedlimit is more than 80
        //then print out low the car
        boolean haslicense= true;
        int speed=80;
        if(haslicense&& speed<80){
            System.out.println("Have a safe journey!");

        }
        else if(haslicense&& speed>=80){
            System.out.println("Here is your speeding ticket");


        }
        //!no license
        else if(!haslicense&& speed<80){
            System.out.println("We have to tow your car");

        }
        else if(haslicense&& speed>80){
            System.out.println("You must appear in the court");


          //else means none of above if statement were true
        }else{
            System.out.println("Buy a car");
        }
    }
}
