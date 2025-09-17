import java.util.*;

public class AddressBook {
    private List<BuddyInfo> Buddies;

    public AddressBook() {
        this.Buddies = new ArrayList<>();
    }
    public void addBuddy(List<BuddyInfo> Buddy){
        this.Buddies.add((BuddyInfo) Buddy);
    }
    public void removeBuddy(List<BuddyInfo> Buddy){
        this.Buddies.remove((BuddyInfo) Buddy);
    }
    public static void main(String[] args) {
        System.out.println("Address Book!");
    }
}
