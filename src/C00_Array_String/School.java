package C00_Array_String;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        //String [][][][] students=new String[2][4][2][20];
        String [][][] students= {{{"5-A-1M","5-A-2M","5-A-3M"},{"5-A-1J","5-A-2J","5-A-3J"}},
                                 {{"5-B-001M","5-B-002M","5-B-003M"},{"5-B-111J","5-B-112J","5-B-113J"}}};

        System.out.println(Arrays.deepToString(students));

        int [][] liste={{-11,3,6,8},{2,5,9},{1,3,-5},{12,23,24},{230}};
        int min= liste[0][0];
        int max= liste[0][0];
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j <liste[i].length ; j++) {
                if(liste[i][j]<min) min=liste[i][j];
                if(liste[i][j]>max) max=liste[i][j];
            }
        }
        System.out.println(String.format("Min : %s and max : %s",min,max));

        System.out.println("Call the method");
        maxAndMin(liste);
    }

    public static void maxAndMin(int [] [] arr){
        int min= arr[0][0];
        int max= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]<min) min=arr[i][j];
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        System.out.println(String.format("Min : %s and max : %s",min,max));
    }
}
