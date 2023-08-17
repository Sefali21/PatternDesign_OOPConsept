package C04_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethods {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        numbers.add(3);
        numbers.add(5);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        System.out.println(numbers.get(1));

        System.out.println(numbers.contains(3));

        List<Integer> allNumbers=new ArrayList<>();
        allNumbers.add(3);
        allNumbers.add(5);
        allNumbers.add(7);
        allNumbers.add(1);

        System.out.println(allNumbers.containsAll(numbers));
    }
}
