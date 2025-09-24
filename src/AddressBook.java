import java.util.*;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    // Add a single buddy
    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null){
            this.buddies.add(buddy);
        }
    }

    // Remove a single buddy
    public void removeBuddy(int index) {
        if (index >= 0 && index < this.buddies.size()) {
            this.buddies.remove(index);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book!");

        BuddyInfo buddy = new BuddyInfo("John Doe");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

        System.out.println("Hi");

    }
}


