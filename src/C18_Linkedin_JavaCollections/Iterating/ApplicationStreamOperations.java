package C18_Linkedin_JavaCollections.Iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class ApplicationStreamOperations {
    public static void main(String[] args) {
        Room cambridge=new Room("Cambridge", "Premiere Room", 4, 175);
        Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
        Room westminister=new Room("Westminister", "Premiere Room", 4, 200);
        Room oxford=new Room("Oxford", "Suit", 5, 225);
        Room victoria=new Room("Victoria", "Suit", 5, 225);



        Collection<Room> rooms=new ArrayList<>(Arrays.asList(piccadily,cambridge,westminister,oxford,victoria));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);


        Collection<Room> petFriendlyRooms=rooms.stream().filter(Room::isPetFriendly).toList();              //...collect(Collectors.toList());

        petFriendlyRooms.stream()
                .map(Room::getName)                                                                 //map(room-> room.getName()).
                .forEach(System.out::println);

        double totalRevenue=petFriendlyRooms.stream()
                .mapToDouble(Room::getPrice)                                //.mapToDouble( value-> value.getPrice() )
                .sum();

        System.out.println(totalRevenue);


/*        Collection<Room> petFriendlyRooms=new ArrayList<>();


        //uzun method
        rooms.stream()
                .filter(Room::isPetFriendly)               //.filter(room -> room.isPetFriendly())
                .forEach(petFriendlyRooms::add);     //.forEach( room -> petFriendlyRooms.add(room) );


        petFriendlyRooms.stream()
                .forEach( room-> System.out.println(room.getName()) );        //.forEach( room-> System.out.println(room) );

*/


    }
}
