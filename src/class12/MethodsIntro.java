package class12;

public class MethodsIntro {
    public static void main(String[] args) {
        //when your method has a return type you should use the result & save the result in a variable.
  double num=calculatetax();
        System.out.println(num);


    }
    //Methods are predefined logic
    //that can be used to execute throught the
    //whole project.
    //first put an access modifier -> public, protected, default, private
    //second put static
    //return data type -> any data type -> int, double, float, byte, char, short, boolean, String
    //what is return data type? => it's the data type of the result info of the function(Method)
    //return data type can also be void -> use void when you want to create a method
    //that doesn't return any  result -> for ex: just print some info.
    //when you have return type that is not void -> you must have a return statement;
    //return statement must be followed by a value that has same data type
    //as your return data type. you can get that value from calculations as well.

    //next we have the name of the method -> name of the method should meaningful and follow camelCase. verbs
    //ex: sendEmail(), sendReceipt(), printTop10Customers()
    //the name of the method always finishes with parenthesis.

    //the body of any method can be as large as you need to be
    //you can have calculatons
    //print out statements,
    //if,switch, for, while - all statements.
    public static double calculatetax(){
        return 10*2;

    }

}
