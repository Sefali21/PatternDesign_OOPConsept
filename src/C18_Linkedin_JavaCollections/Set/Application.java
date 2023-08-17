package C18_Linkedin_JavaCollections.Set;

import C18_Linkedin_JavaCollections.Room;

import java.net.CookieHandler;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        Room piccadily=new Room("Piccadily", "Guest Room", 3, 125);
        Room oxford=new Room("Oxford", "Suite", 5, 225);
        Room oxfordDuplicate=new Room("Oxford", "Suite", 5, 225);
        Room victoria=new Room("Victoria", "Suite", 5, 225);

        Collection<Room> otherRooms= Set.of(piccadily,oxford);

        Collection<Room> rooms=new HashSet<>();
        rooms.add(piccadily);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);

        rooms.stream()
                .map(Room::getRoomName)
                .forEach(System.out::println);
    }
}
