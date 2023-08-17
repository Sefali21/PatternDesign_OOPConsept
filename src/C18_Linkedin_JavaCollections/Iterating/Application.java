package C18_Linkedin_JavaCollections.Iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        Room cambridge=new Room("Cambridge", "Premiere Room", 4, 175);
        Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
        Room westminister=new Room("Westminister", "Premiere Room", 4, 200);
        Room oxford=new Room("Oxford", "Suit", 5, 225);
        Room victoria=new Room("Victoria", "Suit", 5, 225);



        Collection<Room> rooms=new ArrayList<>(Arrays.asList(piccadily,cambridge,westminister,oxford,victoria));


        //create iterator
        Iterator<Room> iterator= rooms.iterator();
//        System.out.println(iterator.next().getName());
//        System.out.println(iterator.next().getName());
//        System.out.println(iterator.next().getName());
        //System.out.println(iterator.next().getName());

        Iterator<Room>iterator1=rooms.iterator();
        System.out.println(iterator1.next().getName());

        while ((iterator.hasNext())){
            Room room=iterator.next();
            System.out.printf("%s, %.2f%n",room.getName(),room.getPrice());

        }

        //ikinci loop yazmadi
//        while ((iterator.hasNext())){
//            Room room=iterator.next();
//            System.out.printf("%s, %.2f%n",room.getName(),room.getPrice());
//
//        }

        for (Room room:rooms) {
            System.out.println(room.getName());
        }





    }
}
