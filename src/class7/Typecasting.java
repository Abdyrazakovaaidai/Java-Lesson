package class7;

public class Typecasting {
    //type of error in Java
    //1.Compilation error-> is the error that happens before running the program
    //2.Runtime error-> type of error that happens while your program already
    //running
    //incompatible means -> not supported,things that do not fit each other
    //2 problems 1-> trying to put decimal pointed numbers into whole number
    //data types
    //2) when trying to push in bigger data types into smaller
    public static void main(String[] args) {
        double gasPrice=1.99;
        //int wholenumber=gasPrice;//incompatible types compilation error
        //int b=18.5;//incompatible types compilation error
        int a=48;
       // short spall=a;//incompotible types compilation error

      //explicit type casting-> manual
        double price=2.99;
        // (int) is type casting operator,you fully aware of the possible
        //lossy convertion, consciously
        // с double,float конвертируя в int это приводит к потере и печатая
        //(int) ты осознаешь потери но все равно хочешь конвертировать
        // и это будет полностью под твою ответственность
        int convert=(int)price;
        System.out.println(convert);//2


        double num2=9.01;
        int convert2=(int)num2;
        System.out.println(convert2);//9

        float floatnum=2.456789f;
        //convert float into a byte
        //and print out byte number
        byte convert4= (byte) floatnum;//it will your fault, you manually type
        //so that is why you will lose
        System.out.println(convert4);//2

        //implicit-> automatic casting
        //явное приведениие к типу не требуется если вы присваиваете значение
        //int переменной double поскольку это не приводит к потере точности
        // компиляция автоматически выполнит приведение типов
        int num1=24;
        double doublenum=num1;//automatically adds .0 at the end
        System.out.println(doublenum);//24.0

        int num5=55;
        double doublenum2=num5;
        System.out.println(doublenum2);//55.0

        //I want get Average customer Spending of any product
        //I sold $4,544,95.96
        //64-clients
        //find what is the average customer spending
        System.out.println("Average Spending");
        double average1=4544958.96;
        int clients=64;
        //whenever you have a double and int in one math expression
        //you should have a double a result
        //implicit casting
        double average2=average1/clients;
        System.out.println(average2);//71014.98375



        // i drove 100 miles
        //gallons of gas=2.4;
        //how many gallons per mile did I spend
        System.out.println("Miles per gallon");
        int miles=100;
        double gas=2.4;
        double averagegas=miles/gas;
        System.out.println(averagegas);//41.66666666666667





    }

}
