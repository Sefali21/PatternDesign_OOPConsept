package C18_Linkedin_JavaCollections.Iterating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ApplicationRemove {
    public static void main(String[] args) {
        Room cambridge=new Room("Cambridge", "Premiere Room", 4, 175);
        Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
        Room westminister=new Room("Westminister", "Premiere Room", 4, 200);
        Room oxford=new Room("Oxford", "Suit", 5, 225);
        Room victoria=new Room("Victoria", "Suit", 5, 225);



        Collection<Room> rooms=new ArrayList<>(Arrays.asList(piccadily,cambridge,westminister,oxford,victoria));
        oxford.setPetFriendly(true);
        victoria.setPetFriendly(true);

        //remove for-each method ile
/*
        Collection<Room> removeRooms=new ArrayList<>();
        for (Room room:rooms ) {
            if(room.isPetFriendly()) {
                //rooms.remove(room);       //eger bu türlü yaparsak bazi odalari listeden silmiyor,
                                              cunku bir öncekini sildigi icin iterator bir sonrakini atliyor,
                                              halbuki sonraki yok, bir geriye kaymis oldu
                removeRooms.add(room);
            }
        }

        rooms.removeAll(removeRooms);

        System.out.println("\nLine 32\n");
        rooms.stream()
                .forEach(r-> System.out.println(r.getName()));

        System.out.println("\nLine 36\n");
*/


        //daha efektiv cozüm icin
        Iterator<Room> iterator= rooms.iterator();
        while (iterator.hasNext()) {
            Room room=iterator.next();

            if(room.isPetFriendly()) iterator.remove();
        }

        rooms.stream()
                .forEach(r-> System.out.println(r.getName()));
    }
}
