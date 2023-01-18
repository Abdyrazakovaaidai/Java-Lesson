package com.javaclass456;

public class CompoundOperators {
    public static void main(String[] args) {
//Assignment operator =,+=,-=,*=,/=,%=
        /**
         * Compound operators sre easy way to use the current value  of a variable
         * and add, substruct,multiple or divide by a new value and reassign
         * the resulting value into the original variable
         * the only use case for compound operators is clean code
         *you avoid typing the variable name twice for the calculation
         * less code is always a better code
         */
        int num1=10;
        num1+=5; //num1=num1+5;
        System.out.println(num1);//15
        System.out.println("========================================");
        int num2=11;
        num2+=22;// num2=num2+22;
        System.out.println(num2);//num2=33
        num2+=5; // num2=num2(33) +5
        System.out.println(num2);//num2=38
        num2+=11;//num2=num2(38)+11; num2=49
        System.out.println(num2);//num2=
        num2+=15;// num2=num2 (49) +15
        System.out.println(num2);//num2=64
        num2+=14;// num2=num2(64)+ 14
        System.out.println(num2);//num2=78
        num2-=11;// num2=num2(78) - 11
        System.out.println(num2);//num2=67
        num2-=5;// num2=num2 (67) - 5
        System.out.println(num2);//num2=62
        System.out.println(num2);//62
        System.out.println(num2-5);// 62-5=57; we don't use the = sign, it's just will print out but not store,change
        // not accept the value

        num2-=2; // num2=num2(62)-2
        System.out.println(num2); //62-2=60
        System.out.println("===================================================");
        int numberofChicken=100;
        numberofChicken+=50;//100+50
        System.out.println(numberofChicken);//150
        numberofChicken*=2;//150*2
        System.out.println(numberofChicken);//300
        numberofChicken/= 10;// 300 / 10
        System.out.println(numberofChicken);//30
        numberofChicken%=2;// 30 divide by 2 result 15 , there no reminder so result 0
        System.out.println(numberofChicken);//0
//       ("===========================================================");

        int num =10;
        System.out.println(num+5);//it will print 15 , but still 10, did not change the value
        num*=2;//10*2=20
        num+=5;//20+5=25
        System.out.println(num+1);// print 25+1=26, but it still 25,because value change only with assignment =

        num-=5;//25-5
        System.out.println(num);//result 20


        
    }
}
