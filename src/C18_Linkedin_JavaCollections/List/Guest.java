package C18_Linkedin_JavaCollections.List;

import C18_Linkedin_JavaCollections.Room;

import java.util.ArrayList;
import java.util.List;

public class Guest {
    private String firstName;
    private String lastName;
    private boolean loyaltyProgramMember;
    private List<Room> prefferedRooms=new ArrayList<>();

    public Guest(String firstName, String lastName, boolean loyaltyProgramMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyProgramMember = loyaltyProgramMember;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isLoyaltyProgramMember() {
        return loyaltyProgramMember;
    }

    public void setLoyaltyProgramMember(boolean loyaltyProgramMember) {
        this.loyaltyProgramMember = loyaltyProgramMember;
    }

    public List<Room> getPrefferedRooms() {
        return prefferedRooms;
    }

    public void setPrefferedRooms(List<Room> prefferedRooms) {
        this.prefferedRooms = prefferedRooms;
    }
}
