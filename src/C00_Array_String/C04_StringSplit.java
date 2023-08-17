package C00_Array_String;

import java.util.Arrays;

public class C04_StringSplit {
    public static void main(String[] args) {
        String str="Java ist ein Insel.";
        String[] strsplit=str.split(" ");
        System.out.println(Arrays.toString(strsplit));
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
        String[] strsplitchar=str.split("");
        System.out.println();
        System.out.println(Arrays.toString(strsplitchar));
    }
}
