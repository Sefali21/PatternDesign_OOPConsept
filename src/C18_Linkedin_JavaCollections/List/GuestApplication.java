package C18_Linkedin_JavaCollections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GuestApplication {
    public static void main(String[] args) {
        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);

        List<Guest> checkinList = new ArrayList<>();
        checkinList.add(john);
        checkinList.add(maria);
        checkinList.add(0, sonia);
        checkinList.add(1, siri);
        //System.out.println(checkinList);
        checkinList.stream()
                .forEach(guest -> System.out.println(guest.getFirstName()));

        checkinList.get(3).setLoyaltyProgramMember(true);
        checkinList.addAll(1, List.of(maria, siri));
        print(checkinList);
        Collection<Guest> hashSetCheckinList = new HashSet<>(checkinList);


    }




        public static void print (List<Guest> list){
        System.out.format("%n--List Contents--%n");
        for (int i = 0; i < list.size() ; i++) {
            Guest guest = list.get(i);
            System.out.format("%d: %s %n", i, guest.getFirstName());
        }
       }
}


