package hackerRank;
import java.util.*;
import java.io.*;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");


                if(x>=-Math.pow(2,64) && x<=Math.pow(2,64)-1) {

                    if (x >= -Math.pow(2, 32) && x <= Math.pow(2, 32) - 1) {

                        if (x >= -Math.pow(2, 16) && x <= Math.pow(2, 16) - 1) {
                            if (x >= -Math.pow(2, 8) && x <= Math.pow(2, 8) - 1) {
                                if(x>=-128 && x<=127)System.out.println("* byte");

                            }else System.out.println("* short\n* int\n* long");
                        }else System.out.println("* int\n* long");


                    } else System.out.println("* long");
                }

                }


            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}

//   if (){
//    }else {

/*else if (x<=-Math.pow(2,64) && x<=Math.pow(2,64)-1){
                    if (x>=-Math.pow(2,32) && x<=Math.pow(2,32)-1){

                        if (x>=-Math.pow(2,16) && x<=Math.pow(2,16)-1){

                            if (){
                            System.out.println("* short\n* int\n* long");
                }}}
                    else
*/

