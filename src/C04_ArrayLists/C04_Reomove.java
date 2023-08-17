package C04_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Reomove {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("sefali");
        names.add("Zehran");
        names.add("Ömeren");
        names.add("Ömeren");
        names.add("Betty");
        names.add("Minnosch");
        names.add("Minnosch");

        System.out.println(names);

        System.out.println(names.remove("Hasan"));
        System.out.println(names.remove("Minnosch"));
        System.out.println(names.remove(0));
        System.out.println(names);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);

        System.out.println(numbers);

        System.out.println(numbers.remove("1"));
        Integer deleteElement=1;   //int olarak tanimlarsak java 1'i index olarak algiliyor
        System.out.println(numbers.remove(deleteElement));
        System.out.println(numbers);

        numbers.clear();
        System.out.println(numbers);
















    }
}
