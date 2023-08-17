package C18_Linkedin_JavaCollections.Iterating.Challange;

import java.net.CookieHandler;
import java.util.*;

public class RoomService {
    private Collection<Room> inventory;

    public RoomService(){
        this.inventory=new LinkedHashSet<>();
    }

    public void applyDiscount(final double discount){

    }

    public Collection<Room> getRoomByCapacity(final int requiredCapacity){

        return null;
    }

    public Collection<Room> getRoomByRateAndType(final double rate, final String type){

        return null;
    }

    public boolean hasRoom(Room room){
        return this.inventory.contains(room);
    }

    public Collection<Room> createRooms(Room [] rooms){
        Iterator<Room> roomIterator= Arrays.stream(rooms).iterator();
//        for (Room tmp:rooms ) {
//            createRooms().add(roomIterator.next());
//        }
        return List.of(rooms);
    }


}
