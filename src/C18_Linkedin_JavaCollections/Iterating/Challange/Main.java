package C18_Linkedin_JavaCollections.Iterating.Challange;

public class Main {

    RoomService service;
    Room [] rooms;
    public void main(String[] args) {
        Room cambridge=new Room("Cambridge", "Premiere Room", 4, 175);
        Room manchester=new Room("Manchester", "Suite", 5, 250);
        Room piccadilly=new Room("Piccadilly", "Guest Room", 3, 125);
        Room oxford=new Room("Oxford", "Suite", 5, 225);
        Room victoria=new Room("Victoria", "Suite", 5, 225);
        Room westminister=new Room("Westminister", "Premiere Room", 4, 200);

        this.rooms=new Room[]{cambridge, manchester, piccadilly, oxford, victoria, westminister};
        this.service=new RoomService();
        this.service.createRooms(rooms);
    }
}
