package C02_multiDimensionalArrays;

import java.util.Arrays;

public class C04_AddAllElementsinOneArray {
    public static void main(String[] args) {
        int [][] arr={{ 3 },{ 1,2,8 },{ 10,11,12,13 }};
        System.out.println(Arrays.toString(addElementsAnotherArray(arr)));
        arr= new int[][]{addElementsAnotherArray(arr)};
        System.out.println(Arrays.toString(arr));
        int [][] addIndexarr={{ 1 },{ 1,2 },{ 1,2,3 }};
        System.out.println(Arrays.toString(addsameIndexElementsnewArray(addIndexarr)));
        System.out.println("New method");
        System.out.println(Arrays.toString(addSameIndexElementsToNewArrayV1(addIndexarr)));

    }

    public static int [] addElementsAnotherArray(int [][] arr){
        int[] newarr =new int[arr.length];
        int add=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                add+=arr[i][j];
            }
            newarr[i]=add;
            add=0;
        }
        return newarr;
    }

    public static int [] addsameIndexElementsnewArray(int [][] arr){
        int[] newarr =new int[arr.length];
        int add=0;
        int j;
        for (int i = 0; i < arr.length ; i++) {
            for (j=0; j <arr[i].length ; j++) {
                if (i==j){
                    add+=arr[i][j];
                } else if (i<j) {
                    add+=arr[i+(j-i)][i+(j-i)];
                }
            }
            //add+=arr[i][j];
            newarr[i]=add;
            add=0;
        }
        return newarr;
    }

//    public static int [] addSameIndexElementsToNewArray(int [][] arr){
//        //find the length of the lengthiest array in arr
//        int arrayLength=0;
//        int sum=0;
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                if(arr[i].length>arrayLength) arrayLength=arr[i].length;
//            }
//        }
//        //declare and initialize the newarr with arrayLength
//        int []newarr=new int[arrayLength];
//        int len=0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <arrayLength ; j++) {
//                len=i;
//                if (j<=arr.length){
//                    sum+=arr[j][i];
//                    System.out.println("arr[j][i]"+arr[j][i]);
//                } else if (j>arr.length) {
//                    sum+=arr[j][len];
//                    System.out.println("arr[j][i]"+arr[j][len]);
//                }
//            }
//            newarr[i]=sum;
//        }
//
//        //return the newArr which added all the same index of inner arrays of outer arr
//        return newarr;
//    }

    public static int [] addSameIndexElementsToNewArrayV1(int [][] arr){
        //find the length of the lengthiest array in arr
        int arrayLength=0;
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i].length>arrayLength) arrayLength=arr[i].length;
            }
        }
        //declare and initialize the newarr with arrayLength
        int []newarr=new int[arrayLength];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arrayLength ; j++) {
                try {
                    sum+=arr[j][i];
                    System.out.println("arr[j][i]"+arr[j][i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.print("");
                }
            }
            newarr[i]=sum;
            sum=0;
        }

        //return the newArr which added all the same index of inner arrays of outer arr
        return newarr;
    }

    public static int[] sumSameIndexes(int[][] arr) {
        // Find the length of the lengthiest inner array in arr
        int maxLength = 0;
        for (int[] innerArr : arr) {
            if (innerArr.length > maxLength) {
                maxLength = innerArr.length;
            }
        }

        // Create the new array to store the sums
        int[] newarr = new int[maxLength];

        // Loop through the inner arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Add the element to the corresponding index in the new array
                newarr[j] += arr[i][j];
            }
        }

        return newarr;
    }
}
