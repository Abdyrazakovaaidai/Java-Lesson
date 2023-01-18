package com.javaclass456;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
int numberofclients=0;
numberofclients++;//0+1
        System.out.println(numberofclients);//1
        numberofclients++;//1+1
        System.out.println(numberofclients);//2
        numberofclients++;//2+1
        System.out.println(numberofclients);//3
        numberofclients+=1;// it's do the same thing. up to you which one to use
        System.out.println(numberofclients);//3+1=4
        numberofclients+=3;// we can use also this way , ++ add only 1
        System.out.println(numberofclients);//4+3=7
            System.out.println("===============================================");
        double gasprice=3.99;
        gasprice++;//gasPrice=gasPrice + 1.0 ,Pre increment we have ++ before the variable
            System.out.println(gasprice);//4.99
            double gaspriceAfterTax=gasprice++;//gaspriceAfterTax=4.99, gasprice=5.99
        // Post increment we have ++ after the variable
        System.out.println(gaspriceAfterTax);//4.99
        System.out.println(gasprice);//5.99

        //When you have a post increment/decrement
        //it changes it  own value , but return the old value
        int num=1;
        int y =num++;// incremented itself,but returns the not incremented value(old value)
        System.out.println(num);//2 it changed own value 1+1
        System.out.println(y);//1 but return old value inherited from num old value which was 1
        int x =1;
        int w=++x;// increments itself plus return the incremented value (new value)
        System.out.println(x);//2
        System.out.println(w);//2
        int z =10;
        int r=z++;
        System.out.println(r);//10 return old value
        System.out.println(z);//11 return new value 10+1=11

        System.out.println(z++);//11 line where you are post incrementing
        //the returned value is still going to be old (r=++ still 10+1=11)
        System.out.println(z);//12 next line where you use the incremented
        //variable it will return the new value

// post increment/decrement like a friend that gives old clothes
        //and renews his/her own clothes
        int u=11;
        int q = u++;// q=11, u=12
        int t = q++;//t=11,  q=12
        System.out.println(u);//12
        System.out.println(q);//12
        System.out.println(t);//11

        int ab=50;
        int ac = ab++;//ac=50, ab=51
        int ad = ++ab;// ad=52, ab=52
        System.out.println(ad++);//52
        System.out.println(++ab);//53 (52+1)

            System.out.println(ab++);//53,ab=54
            System.out.println(ab++);//54, ab=55
            System.out.println(ab);// 55


            int il =10;
            int temp =il++;//temp=10 got old value , il=11 new value,
            System.out.println(temp);//10
            System.out.println(il);//11

        int var1=20;
        System.out.println(var1++);// print 20,but changed var1=21
        System.out.println(++var1);// print 22, var1=22
        int var2= var1++;//22, var1=23
        int var3=++var1;//24, var1=24
        System.out.println(var1);//24
        System.out.println(var2);//22
        System.out.println(var3);//24







    }
}
