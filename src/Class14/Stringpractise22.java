package Class14;

public class Stringpractise22 {
    public static void main(String[] args) {
        //two ways of concatenating Strings
        //one via + sign
        //Strings are immutable objects->
        //Strings can not be modified
        //in order to change a String you have to reassign values
        //whenever you use String manipulation methods
        //the original String does not change
        String str="HTML";
        str+="body";//str=str+"body"; appending text
        str+="<h1> Hello Devx";
        str+="<body>";
        str+="<Html>";
        System.out.println(str);

        String str1="public class Hello";
        //concat method
        //str.concat("{");//нужен variable
        System.out.println(str1);
       // String str2=str1.concat("\n\t{");// need to save in a new String if you wanna update
        str1=str1.concat("\n\t{");
        // \n-> creates new line
        // \t-> creates tab
        // \-> add as a String
        System.out.println(str1);


        String str4="Hello";
        str4.concat("Devx");//will print out only HEllo
        System.out.println(str4);

        String str5="I";
        str5.concat("Love");
        str5=str5.concat("Java");
        System.out.println(str5);//printout I java,without= can not update


    }
}
