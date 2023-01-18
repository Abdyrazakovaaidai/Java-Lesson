package Class13;

public class Stringpractise {
    public static void main(String[] args) {
        //how to concatenate a String
        String str="Hello";
        String str2="Devx";
        //I can use + sign with String
        //it basically means I want to append
        //one String to another
        String str3=str+str2;
        System.out.println(str3);
        String str4=str + " "+str2;
        System.out.println(str4);
        int a=20;
        String b="23";
        String c=a+b;
        System.out.println(c);
        //when concatenating a String with
        String str5="Hello"+42+10+"Devx";
        System.out.println(str5);
        String str6=42+10+"Hello";
        System.out.println(str6);
    }
}
