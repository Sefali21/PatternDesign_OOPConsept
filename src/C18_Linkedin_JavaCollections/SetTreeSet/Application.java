package C18_Linkedin_JavaCollections.SetTreeSet;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Collection<Integer> numbers= Arrays.asList(500,1500,2500,1000,3000,2000);

        NavigableSet<Integer> numberTree=new TreeSet<>(numbers);

        numberTree
                //.descendingSet()
                //.headSet(1750)                                   //1750'den kücük olanlar
                //.tailSet(1750)                          //1750'den büyük olanlar
                .subSet(1750,3000)          //1750 ve 3000 arasinda olanlar
                .stream()
                .forEach(System.out::println);

        System.out.println("\nnumberTree.lower(750)");
        System.out.println(numberTree.lower(750));          //750'den kücük olanlar
        System.out.println("\nnumberTree.higher(750)");
        System.out.println(numberTree.higher(750));

        Collection<Integer> numbersTreeTest=new TreeSet<>();
        numbersTreeTest=Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,10,1,4,8,7,5,6);

        System.out.println("size of  numbersTreeTest: "+numbersTreeTest.size());
        Collection<Integer> numbers2HashSet=new HashSet<>(numbersTreeTest);
        System.out.println("size of  numbers2HashSet: "+numbers2HashSet.size());

        NavigableSet<Integer> numbersTreeTestNavigable=new TreeSet<>(numbersTreeTest);

        System.out.println("\n.descendingSet()\n");
        numbersTreeTestNavigable
                .descendingSet()
                .forEach(r-> System.out.print(r+" "));

        System.out.println("\nfilter(integer-> integer>5 )\n");
        numbersTreeTestNavigable
                .stream().
                filter(integer-> integer>5 )
                .forEach(i -> System.out.print(i+" "));

        System.out.println("\n+3 operation to collect");
        Collection<Integer> newListwithStreamPlus3= numbersTreeTest
                .stream()
                .map(integer -> integer+3)
                .toList();
        System.out.println(newListwithStreamPlus3);
        System.out.println(numbersTreeTest);


    }
}
