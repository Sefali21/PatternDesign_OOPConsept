package C18_Linkedin_JavaCollections.List;

import C18_Linkedin_JavaCollections.List.ChallengeRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Challange {
    private List<Guest> chekinlist=new ArrayList<>(100);
    public static List<Guest> filterByFavoriteRoom(List<Guest> guests, ChallengeRoom room){


        return guests.stream()
                .filter(g->g.getPrefferedRooms().indexOf(room)==0)
                .collect(Collectors.toList());
    }

    public void checkIn(Guest guest) {
        if(guest.isLoyaltyProgramMember() && !this.chekinlist.isEmpty()) {
            int i=0;
            for (; i <this.chekinlist.size() ; i++) {
                if(this.chekinlist.get(i).isLoyaltyProgramMember()){
                    continue;
                }
                break;
            }
            this.chekinlist.add(i,guest);
        }else {
            this.chekinlist.add(guest);
        }
    }

    public void swapPosition (Guest guest1, Guest guest2) {
        int position1=this.chekinlist.indexOf(guest1);
        int position2=this.chekinlist.indexOf(guest2);
        if(position1 != -1 && position2 != -1) {
            this.chekinlist.set(position1,guest2);
            this.chekinlist.set(position2, guest1);
        }
    }

    public List<Guest> getChekinlist(){
        return List.copyOf(this.chekinlist);
    }


}
