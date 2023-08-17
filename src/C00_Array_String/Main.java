package C00_Array_String;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        names.add("name-1");
        names.add("name-2");
        names.add("name-3");
        names.add(3,"name-4");
        System.out.println(names);
//        for (var c:names ) {
//            System.out.println(c);
//        }
        System.out.println(names.get(3));
        names.set(3, "names--4 with set methode");
        System.out.println(names);

        System.out.println(names.indexOf("name-1"));
        names.add("name-1");
        names.add("name-2");
        names.add("name-3");
        names.add("name-1");
        names.add("name-2");
        names.add("name-3");
        names.add("name-1");
        names.add("name-2");
        names.add("name-3");
        names.add("name-1");
        names.add("name-2");
        names.add("name-3");
        names.add("name-4");
        names.add("name-5");
        names.add("name-6");
        names.add("name-7");
        names.add("name-8");
        names.add("name-8");
        names.add("name-9");
        names.add("name-9");
        System.out.println("vor dem while-Loop");
        System.out.println(names);

//        while (names.iterator().hasNext()){
//            for (int i = 0; i < names.size(); i++) {
//                for (int j = i+1; j < names.size(); j++) {
//                    if(names.get(i) == names.get(j)){
//                        names.remove(j);
//                    }
//                }
//            }
//        }



        method1(2,3);




    }
    public static void method1(float f, int i){
        System.out.println("method 1");
    }
    public static void method1(double f, double i){
        System.out.println("method 2");
    }

}