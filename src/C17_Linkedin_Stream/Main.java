package C17_Linkedin_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] scores=new Integer[]{80,66,73,92,43};
        Stream<Integer> scoresStream= Arrays.stream(scores);

        List<String> shoppingList=new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shoppingListStream=shoppingList.stream();

        shoppingListStream.sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(item -> System.out.println(item));


        List<String> shoppingListSorted= shoppingList.stream().sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .toList();
        System.out.println("Shopping List sorted:"+shoppingListSorted);
        System.out.println(shoppingList);

        Stream<String> lettersStream=Stream.of("a","b","c");

    }
}
