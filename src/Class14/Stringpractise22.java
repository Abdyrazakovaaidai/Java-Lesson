package Class14;

public class Stringpractise22 {
    public static void main(String[] args) {
        //two ways of concatenating Strings
        //one via + sign
        //Strings are immutable objects->
        //Strings can not be modified
        //in order to change a String you have to reassign values
        String str="HTML";
        str+="body";//str=str+"body"; appending text
        str+="<h1> Hello Devx";
        str+="<body>";
        str+="<Html>";
        System.out.println(str);

        String str1="public class Hello";
        //concat method
        str1=str1.concat("\n\t{");
        // \n-> creates new line
        // \t-> creates tab
        // \-> add as a String
        System.out.println(str1);

    }
}
