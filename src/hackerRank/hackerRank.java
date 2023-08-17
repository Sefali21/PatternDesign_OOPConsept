package hackerRank;

import java.util.Scanner;

public class hackerRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            int whitespaces=15-s1.length();
            if(x>=100){
                System.out.print(s1);
                for(int j=1; j<=whitespaces; j++)
                {System.out.print(" ");}
                System.out.print(x);
            }else if(x>=10) {
                System.out.print(s1);
                for(int j=1; j<=whitespaces; j++)
                {System.out.print(" ");}
                System.out.print("0"+x);
            }else {
                System.out.print(s1);
                for(int j=1; j<=whitespaces; j++)
                {System.out.print(" ");}
                System.out.print("00"+x);
            }
        }
        System.out.println();
        System.out.println("================================");
    }
}
