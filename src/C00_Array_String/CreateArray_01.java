package C00_Array_String;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray_01 {
    private int length;


    public CreateArray_01() {
        System.out.println("Type length of array");
        Scanner scanner=new Scanner(System.in);
        length= scanner.nextInt();
        //setLength(length);

    }

    public CreateArray_01(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        int[] arr=createArray();
        return "C00_Array_String.CreateArray_01{" +
                "length= " + length +
                "array "+ Arrays.toString(arr)+
                '}';
    }

    public int[] createArray(){
        int [] arr =new int[this.length];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(String.format("Type your %s element",i+1));
            arr[i]=scanner.nextInt();
        }
        return arr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }




}
