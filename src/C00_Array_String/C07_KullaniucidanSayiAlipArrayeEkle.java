package C00_Array_String;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullaniucidanSayiAlipArrayeEkle {
    public static void main(String[] args) {
        int [] arr={3,5,8};

        //ask user to add elemnts to arr

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers want to add new elements to Array");
        int count=scanner.nextInt();
        int [] numbersToAdd=new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print(String.format("Type %s number",i+1));
            try {
                numbersToAdd[i]= scanner.nextInt();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int [] newarr=addArraytoAnotherAnArray(arr,numbersToAdd);
        arr=newarr;
        System.out.println(Arrays.toString(arr));

        int [] arrcallAmehodFromAnotherClass=C06_ArrayeBirElemanEkleme.addNewElemtsAnArray(arr,99,98,100,101);
        //System.out.println(Arrays.toString(arrcallAmehodFromAnotherClass));
        arr=arrcallAmehodFromAnotherClass;
        System.out.println(Arrays.toString(arr));

    }

    public static int[] addArraytoAnotherAnArray(int [] arr, int [] addToAnArray){
        int []newarr=new int[arr.length+addToAnArray.length];
        for (int i = 0; i < arr.length+ addToAnArray.length ; i++) {
            if(i< arr.length){
                newarr[i]=arr[i];
            }else {
                newarr[i]=addToAnArray[i- arr.length];
            }
        }
        arr=newarr;
        return arr;
    }
}
