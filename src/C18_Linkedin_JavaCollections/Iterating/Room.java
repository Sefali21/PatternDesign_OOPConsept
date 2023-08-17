package C18_Linkedin_JavaCollections.Iterating;

import java.util.Objects;

public class Room {
    private String name;
    private String type;
    private int capacity;
    private double price;
    private boolean isPetFriendly;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return capacity == room.capacity && Double.compare(room.price, price) == 0 && Objects.equals(name, room.name) && Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity, price);
    }

    public Room(String name, String type, int capacity, double price) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", isPetFriendly=" + isPetFriendly +
                '}';
    }

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        isPetFriendly = petFriendly;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
