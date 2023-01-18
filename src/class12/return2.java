package class12;

public class return2 {
    public static void main(String[] args) {

 double taxamount=CalculateTax(120000);
        System.out.println(taxamount);
    }
    //write a function that calculates
    //employees annual tax amount
    //if the annual salary is less than 100k
    //then tax percent is 10%
    //if more than 15%;
    public static double CalculateTax(double annualsalary ){
        if(annualsalary<=100000){
            return annualsalary*0.10;
        } else{
            return annualsalary*0.15;
        }
    }
}
