package class9;

public class nestedif {
    public static void main(String[] args) {
        //first if statement scope{} is outer if statement
        //if line 8 if statement is false then the program is going to go line 12
        // this program wont print out
        //if() {
        //
        // if() {
        //}
        //
        //}
        /////////////////////////////////////////////////////
        boolean outerBoolean=true;
        boolean innerBoolean=false;

        //this program wont printout anything because
        //first if is true
        //and inner if is false
        if(true){ //outer if
            if(false){ //inner if
                System.out.println("Hi from inner If statement");

            }
        }
        //////////////////////////////////////////////////////

        //print hi from inner
        if(true){
            if(true){
                System.out.println("hi from inner statement2");
            }
        }
        ///////////////////////////////////////////////////////////////
        ///nothing printout because outer if is false
        if(false){
            if(true){
                System.out.println("hi3");
            }
        }
        //////////////////////////////////////////////////////////

          //printout all
        if(true){
            System.out.println("hi world");
            if(true){
                System.out.println("Hi 4");
            }
            System.out.println("hi5");
        }
        //////////////////////////////////////////////////
        //nothing printout
        if(false){
            System.out.println("Bye");
            if(true){
                System.out.println("hi");
            }
            System.out.println("wooorld");
        }
        //////////////////////////////////////////////
        //printout outer 9.1,else 9,outer 9.2
        if(true){
            System.out.println("outer if hi 9.1");//printout
            if(false){
                System.out.println("inner if 9");
            }
            else{
                System.out.println("inner else 9");//printout
            }
            System.out.println("Outer if hi 9.2");//printout
        }
        ///////////////////////////////////////////////////////
        if(true){
            System.out.println("outer if 8.1");//print
            if(true){
                System.out.println("inner if 8");//print
            } else{
                System.out.println("inner else 8");
            }
            System.out.println("outer 8.2");//print
        }
        /////////////////////////////////////////////
        if(true){
            System.out.println("outer if 10.1");//printout
            if(false){
                System.out.println("inner if 10");//skip
            } else{
                System.out.println("inner else 10");//printout
            }
            System.out.println("outer if 10.2");//printout
        }
        else{
            System.out.println("outer else 10.1");
        }
        ///////////////////////////////////////////////
       if(false){
           System.out.println("outer if 11.1");
           if(false){
               System.out.println("inner if 11");
           }
           else{
               System.out.println("inner else 11");
           }
           System.out.println("outer if 11.2");
       }
       else{
           System.out.println("outer else 11.1");//printout only this
       }
       /////////////////////////////////////////////////////////

    }
}
