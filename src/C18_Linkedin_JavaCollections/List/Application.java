package C18_Linkedin_JavaCollections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Collection<String> list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.addAll(List.of("E", "F", "G"));

        List<String> list2=new ArrayList<>();
        list2.addAll(0,List.of("A","B","C","D","E"));






    }

}
