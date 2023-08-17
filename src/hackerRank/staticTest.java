package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class staticTest {
    static boolean flag=true;
    static int B;
    static int H;
    static {
        Scanner scanner=new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();
        int[] arr={B,H};

        if (arr[0] > 0 && arr[1] > 0) flag=true;
        else {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        };


    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}













