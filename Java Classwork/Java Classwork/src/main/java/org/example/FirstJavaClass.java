package org.example;

public class FirstJavaClass {
    public static void main(String[] args) {
        byte num;   // This can hold whole number between -128 and 127.
        num = 113;
        System.out.println(num);


        short snum;
        snum = 150;
        System.out.println(snum);


        long lnum = -12332252626L;
        System.out.println(lnum);

        int integer = 1234567;
        System.out.println(integer);

        Integer classInt = new Integer(134);
        Integer integer2 = 123356;


        double dnum = -42937737.9d;
        System.out.println(dnum);


        float fnum = 19.98f;
        System.out.println(fnum);


        boolean b = false;
        System.out.println(b);

        String str = "Hello World!";
        String str1 = new String("Hello World!");
        String empty = "";

        String withEscapes = "This is a string \n with \"quotes\" and \\slashes\\";
        System.out.println(withEscapes);


        char ch = 'Z';
        System.out.println(ch);
    }
}
