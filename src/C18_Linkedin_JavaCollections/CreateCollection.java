package C18_Linkedin_JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CreateCollection {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();
        c.add("SUP Fahren");
        c.add("Lesen");
        c.add("Laufen");
        c.add("Lesen");

        System.out.println("Collection ArrayList c:"+c);
        Collection<String> neuVersionC=new HashSet<>(c);
        System.out.println(neuVersionC);
        System.out.println("Collection ArrayList c:"+c);
    }
}
