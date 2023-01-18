package class11;

public class Switchcase {
    public static void main(String[] args) {
     int rate=1;
     //if(rate==1){
        // System.out.println("Awful service");
     //} else if(rate==2){
        // System.out.println("Extremely poor service");
     //}
        //once java finds the first matching case
        //it will enter the body that case execute it
        //and it will enter the bodies of all of the following
        //cases until the first break or end of the switch
     switch(rate){
         case 1:
            // System.out.println("Awful service");
             //break statement is an optional statement
             //you end the case with break statement
             //
        case 2:
             //System.out.println("Extremely poor service");
         case 3:
             System.out.println("Bad service");

     }
     String shipmentstate="Alaska";


     switch(shipmentstate){
         case "Alaska":
             System.out.println("shippment cost is 10$");
         case "Korea" :
             System.out.println("10%");
             break;
         case "NY" :
             System.out.println("$5");
             break;

         case "Florida" :
             System.out.println("7$");
             break;

         case "California" :
             System.out.println("12$");
             break;
         case "Hawaii":
             System.out.println("15$");
             break;
     }
     //
    }
}
