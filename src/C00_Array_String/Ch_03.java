package C00_Array_String;

import package_01.Addition;
import package_01.StringLength;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class Ch_03 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4};
//
//        Addition addition=new Addition();
//        System.out.println(Arrays.toString(addition.arr(arr, 4)));
//
//        C00_Array_String.CreateArray_01 createArray01=new C00_Array_String.CreateArray_01(4);
//        System.out.println(Arrays.toString(createArray01.createArray()));
//
//        C00_Array_String.CreateArray_01 createArray02=new C00_Array_String.CreateArray_01();
//        System.out.println(Arrays.toString(createArray02.createArray()));
//
//        StringLength stringLength=new StringLength();
//        String [] strings={"Ömer", "Ömeren", "Zehran", "Sefali", "Betty", "Betül"};
//        //System.out.println(Arrays.toString(stringLength.shortAndLongWord(strings).toCharArray()));
//        System.out.println(stringLength.shortAndLongWord(strings));

        String name1="Ömeren";
        String name2="Zehran";

        System.out.println(name1.toString());
        System.out.println(name1.charAt(4));
        System.out.println(name1.length());
        System.out.println(Arrays.toString(name1.getBytes(StandardCharsets.UTF_8)));
        System.out.println(name1.toLowerCase(Locale.ROOT));
        System.out.println(name1.codePointAt(1));
        System.out.println("Compare");
        System.out.println(name1.compareToIgnoreCase(name2));
        System.out.println(name1.repeat(4));

        int[] numbers1={1,2,5,6,8};
        int[] numbers2={2,1,6,8,5};
        System.out.println(Arrays.equals(numbers1,numbers2));


    }
}
