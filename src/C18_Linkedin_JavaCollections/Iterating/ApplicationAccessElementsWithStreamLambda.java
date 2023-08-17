package C18_Linkedin_JavaCollections.Iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ApplicationAccessElementsWithStreamLambda {
    public static void main(String[] args) {
        Room cambridge=new Room("Cambridge", "Premiere Room", 4, 175);
        Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
        Room westminister=new Room("Westminister", "Premiere Room", 4, 200);
        Room oxford=new Room("Oxford", "Suit", 5, 225);
        Room victoria=new Room("Victoria", "Suit", 5, 225);



        Collection<Room> rooms=new ArrayList<>(Arrays.asList(piccadily,cambridge,westminister,oxford,victoria));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);


//        for (Room room:rooms ) {
//            if(room.isPetFriendly()) {
//                System.out.println(room.getName());
//
//            }
//        }


        //first source
        //System.out.format("Testing %s with result %b%n",room.getName(),room.isPetFriendly());     //%n ile \n format formatinda ayni
        rooms.stream()
                .filter(Room::isPetFriendly)                 //return room.isPetFriendly(); })
                .forEach(room -> System.out.println(room.getName()));



//            .filter(new Predicate<Room>() {
//
//            @Override
//            public boolean test(Room room) {
//                //System.out.format("Testing %s with result %b%n",room.getName(),room.isPetFriendly());     //%n ile \n format formatinda ayni
//                return room.isPetFriendly();
//            }
//        })


//            .forEach(new Consumer<Room>() {
//            @Override
//            public void accept(Room room) {
//                System.out.println(room.getName());
//            }
//        });


    }
}
