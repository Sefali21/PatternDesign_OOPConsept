package C00_Array_String;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayC_02 {
    public static void main(String[] args) {
        String strprimitive="Java ist ein Insel!";
        String [] strnonprimitive=new String[1];
        strnonprimitive [0]="Java ist nicht schwer, sondern leicht";
        System.out.println(strprimitive);
        System.out.println(strnonprimitive);
        for (var c:strnonprimitive ) {
            System.out.println(c);
        }

        //Q-1
        //declare  an int array with length 5
        int [] q1=new int[55];
        //call random
        Random random=new Random();
        //and initialize with random
        for (int i = 0; i <q1.length ; i++) {
            q1[i]= random.nextInt(100);
        }

        //print all elements of array
        for (var c:q1 ) {
            System.out.print(c+" ");
        }

        //add +2 all elements
        for (int i = 0; i < q1.length; i++) {
            q1[i]+=2;
        }

        //print with Array.toString()
        System.out.println("print new arr with toString()");
        int [] arr=arrAddition(q1);
        System.out.println(Arrays.toString(arr));

        //add +4 all elements
        arr=arrAddition(q1, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for (var c:q1 ) {
            System.out.print(c+" ");
        }



        //Q-2
        //calculate the sum of numbers
        System.out.println();
        int result=0;
        for (int i = 0; i <q1.length ; i++) {
            if (q1[i]>=0){
                result+=q1[i];
            }
        }
        System.out.println("Result: "+result);

        //Q-3
        //shift the elements to the right one by one and make the last one the first element
        System.out.println("shift the elements to the right one by one and make the last one the first element");
        System.out.println(Arrays.toString(shiftelemets(q1)));
//        int temp=0;
//        for (int i = 0; i <q1.length ; i++) {
//            try {
//                temp=q1[i+1];
//            } catch (ArrayIndexOutOfBoundsException e) { q1[0]=q1[i];}
//            try {
//                q1[i+1]=q1[i];
//            } catch (ArrayIndexOutOfBoundsException e) {
//                q1[q1.length-1]=q1[q1.length-2];
//            }
//            q1[i]=temp;
//        }
//        for (var c:q1 ) {
//            System.out.print(c+" ");
//        }

        //Q-4
        String [] strArr=new String[7];
        strArr[0]="Exception";
        strArr[1]="Ex";
        strArr[2]="Excep";
        strArr[3]="Excep";
        strArr[4]="Handling";
        strArr[5]="Hand";
        strArr[6]="Hand";
        for (int i = 0; i <strArr.length ; i++) {
            if (strArr[i].equalsIgnoreCase("Hand")) System.out.println(i + "->"+ strArr[i]);
        }
        for (int i = 0; i <q1.length ; i++) {
            if (q1[i]==10) System.out.println(i + "->"+ q1[i]);
        }
        System.out.println(Arrays.toString(numberOfRepeats(q1)));
        System.out.println(contains(q1, 10));

        //Q-5
        System.out.println("------------------------------------------------------");
        System.out.println("Create an Array");
        Scanner scanner=new Scanner(System.in);
        System.out.println("How long is this array");
        int length=scanner.nextInt();
        System.out.println(Arrays.toString(createArray(length)));

        System.out.println("**************************************************************");
        System.out.println("Default constructor");
        CreateArray_01 arrClass=new CreateArray_01();
        //arrClass.setLength(length);
        //arrClass.createArray();
        //System.out.println(arrClass.toString());
        System.out.println(Arrays.toString(arrClass.createArray()));

        System.out.println("----------------------------------------------------------------");
        System.out.println("constructor with length args");
        CreateArray_01 arrClass1=new CreateArray_01(length);
        //arrClass1.setLength(length);
        //arrClass1.createArray();
        System.out.println(Arrays.toString(arrClass1.createArray()));

        System.out.println("-------------------------------------------");


//[0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 0, 1, 0, 1, 0, 1, 1, 0, 2, 2, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 2, 1, 0, 1, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 2, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 1, 0, 1, 0, 2, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1]
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 2, 0, 0, 0, 1, 2, 0, 0, 0, 0, 1, 2, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 2, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 2, 1, 0, 2, 0, 0, 0, 1, 1, 0, 0, 1, 2, 0, 1, 1, 1, 0, 2, 0, 1, 1, 1, 0, 1, 1, 3, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 2, 0, 1, 1, 0]
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 3, 0, 0, 0, 0, 0, 1, 0, 2, 2, 0, 0, 1, 1, 3, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 2, 2, 0, 0, 2, 2, 1, 0, 0, 1, 0, 2, 0, 0, 1, 1, 0, 0, 2, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0]
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 2, 1, 1, 0, 0, 0, 3, 2, 1, 0, 0, 1, 0, 0, 2, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 2, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 3, 0, 0, 1, 1, 1, 2, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 0, 1, 0]
    }

    public static int [] arrAddition(int [] arr){   //add all elements +2 with method()
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=2;
        }
        return arr;
    }
    public static int [] arrAddition(int [] arr, int a){  ////add all elements a with method()
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=a;
        }
        return arr;
    }

    public static int[] shiftelemets(int [] arr){
        int temp=arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }

    public static int[] numberOfRepeats(int [] arr){
        int [] replist=new int[101];
        int repeat;
        for (int i = 0; i <101 ; i++) {
            repeat=0;
            for (int j = 0; j < arr.length ; j++) {

                if(arr[j]==i){
                    repeat++;
                    replist[i]=repeat;
                }
            }
        }
        return replist;
    }

    public static int contains(int [] arr, int a){
        int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==a) counter++;
        }
        System.out.println("Array contains "+a+" "+counter+" times ");
        return counter;
    }

    public static int[] createArray(int length){
        int [] arr =new int[length];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(String.format("Type %s. element",i+1));
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}
