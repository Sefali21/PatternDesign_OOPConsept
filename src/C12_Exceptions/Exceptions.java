package C12_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        int a=10, b=0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            e.getCause();
            //e.wait(10);
            b=5;
        }finally {
            System.out.println(a/b);
        }

        System.out.println("Ende des Programms");
        String s=" ";
        System.out.println(s);

        String fileAdress="src/day41/file11";
        try {
            FileInputStream fileInputStream=new FileInputStream(fileAdress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
