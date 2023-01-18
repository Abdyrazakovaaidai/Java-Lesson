package class11;

public class switchpractise {
    public static void main(String[] args) {
        //Example
        //Input - 1,  Output - 31 days
        //Input - 2,  Output - 28/29 days
        //Input - 3,  Output - 31 days
        //Input - 4,  Output - 30 days
        //Input - 5,  Output - 31 days
        //Input - 6,  Output - 30 days
        //Input - 7,  Output - 30 days
        //Input - 8,  Output - 30 days
        //Input - 9,  Output - 30 days
        //Input - 10,  Output - 31 days
        //Input - 11,  Output - 30 days
        //Input - 12, Output - 31 days
        int day=2;
        switch(day){

            case 1:
            case 3:
            case 5:
            case 10:
            case 12:
                System.out.println(" 31 days");
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                System.out.println(" 30 days");
                break;
            default:
                System.out.println("28/29 days");





        }
        ////Online store.
        //// we want to write a program which calculates shipping cost based on
        ////destination and based on total spending
        ////if the customer is spending less than $5 than charge $5 for shipping
        ////if spending more than 5 and less or equal to $10 then charge $10
        //
        //
        ////if spending more than 10 then.
        ////we also look at the shipping destination.
        ////if it's usa -> we should charge 10% of the total spending for shipping
        ////if it's canada -> charge 15% of total spending
        ////if it's Europe -> charge 20% of total spending
        ////if it's any other place -> charge 25% of total spending
        double totalspending=-1444;
        String country="USA";
        if(totalspending>0){
        switch((int)totalspending) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Shipping cost is $5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Shipping cost is 10$");

                break;
            default:
                switch (country) {
                    case "USA"://10%
                        System.out.println("shipping cost is $" + totalspending * 0.1);
                        break;
                    case "Canada"://15%
                        System.out.println("Shipping cost is $" + totalspending * 0.15);
                        break;
                    case "Europe"://20%
                        System.out.println("Shipping cost is" + totalspending * 0.2);

                        break;
                    default://25%
                        System.out.println("shipping cost is $" + totalspending * 0.25);

                        break;

                }
        }

        } else{
            System.out.println("error");
        }
    }
}
