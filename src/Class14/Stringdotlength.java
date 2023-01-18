package Class14;

public class Stringdotlength {
    public static void main(String[] args) {
        //1) int length(); --> returns the number of characters in the String
        //return int number
        //ex:"DevxSchool".length();//returns 10
        String str="Wedevx.co";//9
        System.out.println(str.length());
        String str2="Hello World!";
        System.out.println(str2.length());//12


        String str3="United States";
        System.out.println(str3.length());//13
        String str4="Canada";
        String str5="Mexico";
        String str6="Cuba";
        int num=str3.length();
        int num1=str4.length();
        int num2=str5.length();
        int num3=str6.length();
        int average=(num+num1+num2+num3)/4;
        System.out.println(average);
    }
}