package C18_Linkedin_JavaCollections.List;

import java.util.Objects;

public class ChallengeRoom {
    private String roomName;
    private String roomType;
    private int roomCapacity;
    private double roomPreis;

    public ChallengeRoom(String roomName, String roomType, int roomCapacity, double roomPreis) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
        this.roomPreis = roomPreis;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", roomPreis=" + roomPreis +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        System.out.format("Comparing %s with %s%n",this.roomName, ((ChallengeRoom)o).roomName);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChallengeRoom room = (ChallengeRoom) o;
        return Objects.equals(roomName, room.roomName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomName);
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public double getRoomPreis() {
        return roomPreis;
    }

    public void setRoomPreis(double roomPreis) {
        this.roomPreis = roomPreis;
    }
}
