package C04_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_DeleteRepetition {
    public static void main(String[] args) {
        //Delete repetition
        int [] arr={2,4,5,3,2,5,1,5,3,7};

        // Die Großte Proplem ist length von Array, zu ändern.
        //ArrayList benutzt grundlage von Array aber die length von Array ist nicht fest.

        List<Integer> newListwoRepetition= new ArrayList<>();
        System.out.println(newListwoRepetition);
//        for (var c:arr ) {
//            newListwoRepetition.add(c);
//        }
//        System.out.println(newListwoRepetition);
//        for (int i = 0; i < arr.length-1 ; i++) {
//           for (int j=0; j < arr.length-2 ; j++) {
//                if(arr[i]==arr[j+1]) {
//                    if (newListwoRepetition.lastIndexOf(arr[j+1])!=newListwoRepetition.indexOf(arr[j+1])) {
//                        newListwoRepetition.remove((Integer) arr[j + 1]);
//                    }
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            if(!newListwoRepetition.contains(arr[i])){
                newListwoRepetition.add(arr[i]);
            }
        }

        arr=new int[newListwoRepetition.size()];

        Iterator iterator=newListwoRepetition.iterator();
        int counter=0;
        while (newListwoRepetition.iterator().hasNext()){
            arr[counter]=newListwoRepetition.iterator().next();
            counter++;
        }
        for (var c:newListwoRepetition ) {
            System.out.println(c);
        }
        System.out.println("ende des While-Loop");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=newListwoRepetition.get(i);
        }
        System.out.println("Arr: "+Arrays.toString(arr));

        System.out.println(newListwoRepetition);


    }
}
