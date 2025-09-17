import java.util.*;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    // Add a single buddy
    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    // Remove a single buddy
    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book!");

        BuddyInfo buddy = new BuddyInfo("John Doe");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}


