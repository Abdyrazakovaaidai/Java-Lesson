package class9;

public class nestedifpractise2 {
    public static void main(String[] args) {
        if(false){ //outer if
            System.out.println("12.1");
            if(false){ //inner if
                System.out.println("12.2");
            }                               //will skip from 7 to 15
            else{//inner else
                System.out.println("12.3");

            }
            System.out.println("outer if 12.4");
        }
        //I have to execute everything inside the outer else, but
        //because else if and else in one pair so we execute only one
        else{ //outer else
            System.out.println("12.5"); //printout
            if(false){
                System.out.println("12.6");//skip it
            }
            else if(true){
                System.out.println("12.7");//printout
            }
            else{
                System.out.println("12.8");//else if and else in one pair so we execute only one
            }
        }
        /////////////////////////////////////////////////////////////
        if(false){//outer if
            System.out.println("13.1");
            if(false){ //inner if
                System.out.println("13.2");
            }                                // because outer if false will skip from 31 to 40
                                             // jump to outer else
            else{ //inner
                System.out.println("13.3");
            }
            System.out.println("outer if 13.4");
        }
        else{ //outer else
            System.out.println("13.5");//printout
            if(true){
                System.out.println("13.6");//printout because it's true and comes first
            }
            else if(true){
                System.out.println("13.7");//skip this because you in pair with if(true)and console print only first one
            }
            else{
                System.out.println("13.8");
            }
        }
    }

}
