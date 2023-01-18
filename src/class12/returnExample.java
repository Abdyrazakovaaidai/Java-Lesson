package class12;

public class returnExample {
    public static void main(String[] args) {
       int sum=Count();
        System.out.println(sum);
        boolean answer=Trouble(true,22);
        System.out.println(answer);
        boolean result = canWeSleepIn(6, true);
        System.out.println("You can sleep  "+result);
    }
    public static int Count(){
        return 30*2;

    }
    //We have a loud talking parrot. Create a function that will tell us if we are in trouble or
    // not based on the hour and based on if the parrot is talking.
    //The "hour" is the current hour time in the range 1..24.
    //We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean Trouble(boolean isparrottalk ,int hour){
        if(isparrottalk){
            if(hour<=7||(hour>20&&hour<=24)){
                return true;
            }
            else{
                return false;
            }
        } else{
            return false;
        }


    }
    //Create a function that return true or false and will let us know if we can sleepIn.
    //it should take 2 params - one to know if's a weekday
    //another param to know if it's a vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public static boolean canWeSleepIn(int dayOfWeek, boolean isOnVacation) {

        if (isOnVacation) {
            return true;
        }
        else {
            if (dayOfWeek <= 5) {
                return false;
            } else if (dayOfWeek == 6 || dayOfWeek == 7) {
                return true;
            } else {
                return false;
            }
        }
    }
}
