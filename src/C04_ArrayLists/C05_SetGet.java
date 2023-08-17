package C04_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_SetGet {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("sefali");
        names.add("Zehran");
        names.add("Ömeren");
        names.add("Ömeren");
        names.add("Betty");
        names.add("Minnosch");
        names.add("Minnosch");


        names.add(2,"New Name");
        System.out.println(names);

        names.set(1,"Zehrann");
        System.out.println(names.get(1));
        System.out.println(names);

        System.out.println(names.indexOf("Zehrann"));
        System.out.println(names.lastIndexOf("Ömeren"));


    }
}
