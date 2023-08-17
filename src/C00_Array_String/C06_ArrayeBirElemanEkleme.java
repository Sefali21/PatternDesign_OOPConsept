package C00_Array_String;

import java.util.Arrays;

public class C06_ArrayeBirElemanEkleme {
    public static void main(String[] args) {
        //how to add an element in an array which is declared and initialized
        int [] arr={3,7,8};
       // int addToArray=10;

//        int [] neuarr=new int[arr.length+1];
//
//        for (int i = 0; i <arr.length ; i++) {
//            neuarr[i]=arr[i];
    //    }
//        neuarr[neuarr.length-1]=addToArray;
//        System.out.println(Arrays.toString(neuarr));
//
//        arr=neuarr;
//        System.out.println(Arrays.toString(arr));

        addNewElemtsAnArray(arr, 10,11);
        System.out.println(Arrays.toString(addNewElemtsAnArray(arr, 10, 11,12,13)));
        int [] addElements=addNewElemtsAnArray(arr,10,11,12,13,15,21);
        arr=addElements;
        System.out.println(Arrays.toString(arr));


    }

    public static int [] addNewElemtsAnArray(int [] arr, int... values){
        int [] newarr=new int[arr.length+ values.length];
        for (int i = 0; i < arr.length+ values.length ; i++) {
            if (i< arr.length){
                newarr[i]=arr[i];
            }
            else {
                newarr[i]=values[i-(arr.length)];
            }
        }
        arr=newarr;
        return arr;
    }
}
