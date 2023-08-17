package C04_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsExamples {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        String [] strArr={"A","b","c"};
        names= Arrays.asList(strArr);
        System.out.println(names);
        names.set(0,"g");
        System.out.println(names);
        System.out.println(Arrays.toString(strArr));
    }
}
