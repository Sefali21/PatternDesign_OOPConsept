package C02_multiDimensionalArrays;

import java.util.Arrays;

public class C05_sumOfLastIndex {
    public static void main(String[] args) {
        int[][] numbers={{3,4,5},{5,2,7},{1,9,0,7},{1},{36,1}};
        
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
             sum+=numbers[i][numbers[i].length-1];
        }
        System.out.println(sum);

        int[]arr={2,4,5,3,2,5,1,5,3,7};


        int counter=0;
        for (int i = 0; i < arr.length-1; i++) {
            for ( int j=i+1; j <arr.length-1 ; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        int[]newarr=new int[counter];
        for (int i = 0; i < newarr.length; i++) {
            for ( int j=i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    newarr[i]=j;
                }
            }
        }
        System.out.println(Arrays.toString(newarr));

        int [] newarrwo=new int[arr.length-counter];
        for (int i = 0; i < newarrwo.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]!=newarr[i]){
                    newarrwo[i]=arr[j];
            }
            }
        }
        arr=newarrwo;
        System.out.println(Arrays.toString(arr));

    }
}
