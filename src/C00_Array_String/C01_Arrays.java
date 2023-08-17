package C00_Array_String;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String [] names={"Tim", "Lii", "Tom", "Kevin", "Zeta", "Robin", "Carmen", "Lizzy", "Tweety", "Kevini"};
        int counter=0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()%2!=0){
                counter++;
                System.out.print(names[i]+", ");
            }
        }
        System.out.println("\n"+counter);


        String [] words={"L","a","P", "d", "T", "t"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println((Arrays.toString(words)));

        Arrays.sort(names,2,names.length);
        System.out.println(Arrays.toString(names));

        //binary search
        int [] arr={-1,2,13,8,14};
        System.out.println(Arrays.binarySearch(arr, 2));        //1
        System.out.println(Arrays.binarySearch(arr, 13));       //2
        System.out.println(Arrays.binarySearch(arr, 14));       //4
        System.out.println(Arrays.binarySearch(arr, -1));       //0
        System.out.println(Arrays.binarySearch(arr, 8));        //-3

        //binary cok büyük datalari kolayca depolayabilmek icin java kullandigi bir yöntemdir.

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 2));        //1
        System.out.println(Arrays.binarySearch(arr, 13));       //3
        System.out.println(Arrays.binarySearch(arr, 14));       //4
        System.out.println(Arrays.binarySearch(arr, -1));       //0
        System.out.println(Arrays.binarySearch(arr, 8));        //2


        System.out.println(Arrays.binarySearch(arr, 99));        //
        System.out.println(Arrays.binarySearch(arr, -5));        //
        System.out.println(Arrays.binarySearch(arr, 5));        //
        System.out.println(Arrays.binarySearch(arr, 25));        //
        System.out.println(Arrays.binarySearch(arr, 44));        //




    }
}
