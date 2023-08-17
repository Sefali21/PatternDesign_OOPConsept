package C18_Linkedin_JavaCollections.Iterating.Challange;

import java.util.Objects;

public class Room {

    String name;
    String type;
    int capacity;
    double preise;

    public Room(String name, String type, int capacity, double preise) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.preise = preise;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", preise=" + preise +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return capacity == room.capacity && Double.compare(room.preise, preise) == 0 && Objects.equals(name, room.name) && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity, preise);
    }


    //    double discount;
//    int capacity;
//    double rate;
//    String type;





}
