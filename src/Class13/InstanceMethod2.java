package Class13;

public class InstanceMethod2 {
    public static void main(String[] args) {
        //what is a static method?
        //static methods are predefined function
        //that can be used without creating an Object
        //What is an Object?->Object is an Instance of a class
        //is created by using New key word
        print();
        //what is a non-static method?
        //Non-static method is an instance method
        //in order to use instance methods inside a static
        //method you must first create an object of
        //class where the instance method is defined
        InstanceMethod2 somevarname=new InstanceMethod2();
        somevarname.print1();//object
    }
    public static void print(){
        System.out.println("Hello");
    }
    public void print1(){
        System.out.println("Hello1");
    }
}
