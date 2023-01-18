package class5;

public class Expressionoperator {
    public static void main(String[] args) {
        System.out.println(15 / 3 * 5);//15/3=5*5=25
        System.out.println(3 * 5 / 15);//1
        System.out.println(3 * 5 / 15 * 10 / 2 / 2);//3*5=15/15=1*10=10/2=5/2=2
        System.out.println(10 - 5 * 2 / 10 + 6 * 3 - 16 * 2);//-5
        //5*2=10/10=1
        //6*3=18
        //16*2=32
        //10-1+18-32=-5


        System.out.println((10 - 5) * (2 / 10) + 6 * 3 - 16 * (2 + 2));//46
        //10-5=5
        //2/10=0,2
        //6*3=18
        //16*4=64
        //5*0,2=1+18-64=-46
    }
}
