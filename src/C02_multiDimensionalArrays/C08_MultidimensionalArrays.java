package C02_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MultidimensionalArrays {
    public static void main(String[] args) {
        int [][] arr={{ 3 },{ 1,2,8,88,99,101,201,1001 },{ 10,11,12,13 }};
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("{ ");
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("} ");
        }
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
    }
}
