package C18_Linkedin_JavaCollections.Set;

import C18_Linkedin_JavaCollections.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ApplicationCopyOf {
        public static void main(String[] args) {
            Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
            Room oxford=new Room("Oxford", "Suite", 5, 225);
            Room oxfordDuplicate=new Room("Oxford", "Suite", 5, 225);
            Room victoria=new Room("Victoria", "Suite", 5, 225);

            Collection<Room> otherRooms= Set.of(piccadily,oxford);
            //otherRooms.add(victoria);

            Collection<Room> rooms=new HashSet<>();
            rooms.add(piccadily);
            rooms.add(oxford);
            rooms.add(oxford);
            rooms.add(oxfordDuplicate);
            //now add voctoria to rooms
            rooms.add(victoria);


            Collection<Room> moreRooms=Set.copyOf(rooms);



            moreRooms.stream()
                    .map(Room::getRoomName)
                    .forEach(System.out::println);


            System.out.println("Test Room\n");
        Collection <Room> test=new ArrayList<>();
        test.add(oxford);
        test.add(oxford);
        test.add(piccadily);
        test.add(piccadily);
        test.add(oxfordDuplicate);
        test.add(oxfordDuplicate);
        test.add(victoria);
        test.add(victoria);
        test.add(victoria);
        test.add(victoria);

        test.stream()
            .forEach(System.out::println);

            System.out.println("\nHash Test Room\n");
        Collection<Room> testHash=new HashSet<>(test);
        testHash.stream()
                .forEach(System.out::println);
            System.out.println(testHash);


        }

}



