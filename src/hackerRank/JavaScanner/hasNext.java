package hackerRank.JavaScanner;

import java.util.Scanner;

public class hasNext {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter=1;
        while(scanner.hasNext()){
            String string=scanner.nextLine();
            System.out.println(String.format("%d %s",counter, string));
            counter++;
        }
    }
}
