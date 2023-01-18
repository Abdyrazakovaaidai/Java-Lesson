package class9;

public class nestedif3 {
    public static void main(String[] args) {
        if(true){//outer if
            System.out.println("1");//printout
            if(false){//inner if
                System.out.println("1.1");
            }
            else if(true){//inner if
                System.out.println("1.2");//printout
            }
            else if(true){ //inner if
                System.out.println("1.3");
            }
            else{//inner else
                System.out.println("1.4");
            }
            System.out.println("1.5");//outer//printout
        }
        else{//outer else
            System.out.println("1.6");
            if(true){//inner if
                System.out.println("1.7");
            }
            else if(true){
                System.out.println("1.8");
            }
            else if(true){
                System.out.println("1.9");
            }
            else{
                System.out.println("2.0");
            }

        }
        System.out.println("/////////////////////////////////////////////");

        if(false){//outer if
            System.out.println("2.1");
            if(false){//inner if
                System.out.println("2.2");
            }
            else if(true){//inner if
                System.out.println("2.3");//////////will skip all if
            }
            else if(true){ //inner if
                System.out.println("2.5");
            }
            else{//inner else
                System.out.println("2.6");
            }
            System.out.println("2.7");//outer
        }
        else{//outer else
            ///because if false it will skip and choose else, printout outer else content(2.8)
            //and then will find first true it's 2.9 and printout,others will skip
            System.out.println("2.8");//printout
            if(true){//inner if
                System.out.println("2.9");//printout
            }
            else if(true){
                System.out.println("3");
            }
            else if(true){
                System.out.println("3.1");
            }
            else{
                System.out.println("3.2");
            }

        }
    }
}
