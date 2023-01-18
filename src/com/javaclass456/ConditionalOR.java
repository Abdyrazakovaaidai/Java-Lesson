package com.javaclass456;

public class ConditionalOR {
    public static void main(String[] args) {
        //Conditional OR||
        // is used for setting multiple conditions
        //and overall result is true   if at least one of them is true
        //difference between && all conditions must true
        //|| at least one of them must true

        int age=61;
        boolean giveDiscount=age>60 || age <8;
        System.out.println(giveDiscount);
        //|| at least one of them must be true

        int currentTime=13;
        boolean drinkCofee= currentTime >6 || currentTime<11;
        System.out.println(drinkCofee);//true because 13>6

        int Whenrelax=5;
        int VideoSoftSkills=1;
        boolean Canrelax=Whenrelax>4 || VideoSoftSkills>3;
        System.out.println(Canrelax);//true
        System.out.println("================================");
        int Loginattemps=3;
        int Transaction=3000;
        String Locationtransaction="USA";
        boolean block=Loginattemps>3 || Transaction==3000||Locationtransaction!="USA";
        System.out.println(block);//true

        //you store text in a String data type
        //you can only compare strings with ==,!=
        //you can not do >,<,>=,<=

    }
}
