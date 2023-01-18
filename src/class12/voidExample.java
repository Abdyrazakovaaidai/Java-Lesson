package class12;

public class voidExample {
    public static void main(String[] args) {
         sayHello(2023 ,130000);
     BTS("J-Hope");
     like("Korea");

    }
    public static void sayHello( int year ,  double targetSalary ) {
          year = 2023;
          targetSalary = 130000;
        System.out.println("Hello " + year);
        System.out.println("My target salary is " + targetSalary);
    }
    public static void BTS(String member){
        member="J-Hope";
        System.out.println("My favorite member from BTS is: "+member);
    }
    public static void like (String travel){
        travel="Korea";
        System.out.println("I want to travel "+ travel);

    }
}
