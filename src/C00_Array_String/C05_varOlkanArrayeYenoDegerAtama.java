package C00_Array_String;

import java.util.Arrays;

public class C05_varOlkanArrayeYenoDegerAtama {
    public static void main(String[] args) {

        int [] arr={3,4,5,6,8,1};
        System.out.println(arr.length);

        try {
            arr[6]=13;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("");
        }
        System.out.println(Arrays.toString(arr));

        arr=new int[8];                                 //verlangert die arrays length aber alles ist null
        System.out.println(Arrays.toString(arr));

        String [] buchstaben={"a","n","y"};
        String [] neubuchstaben={"k","l","m","n"};
        buchstaben=neubuchstaben;                       //array ist verlängert und neu inhalt bekommen
        System.out.println(Arrays.toString(buchstaben));

        buchstaben= new String[]{"x"};
        System.out.println(Arrays.toString(buchstaben));
        System.out.println(buchstaben.length);

        String[] copyBuchstaben= (Arrays.copyOf(buchstaben,12));
//        for (var c:copyBuchstaben ) {
//            System.out.println(c);
//        }
        System.out.println(Arrays.toString(copyBuchstaben));


    }
}
