package org.GLAB_303_2_1;

public class StringExample {
    public static void main(String[] args) {
        String str = "Whatever you want to write in this string is okay";
        System.out.println("The length of the string = " + str.length());
        String str2 = str.toUpperCase();
        System.out.println(str);
        System.out.println(str2);

        //Substring ex
        String filename = "Hello.Java";
        System.out.println("The filename is " + filename);
        System.out.println("The period is at index " + filename.indexOf('.'));
        System.out.println("The file extension is " + filename.substring(filename.lastIndexOf(".") + 1));
        System.out.println("The file extension is " + filename.substring(2, filename.lastIndexOf(".")));
        System.out.println("The file extension is " + filename.substring(filename.indexOf("o")));
    }
}
