import java.util.*;

public class ContactList {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("John", 987654321);
        contacts.put("Priya", 912345678);
        contacts.put("Ali", 998877665);

        // a) Check if key exists
        System.out.println("Contains 'Priya'? " + contacts.containsKey("Priya"));

        // b) Check if value exists
        System.out.println("Contains number 987654321? " + contacts.containsValue(987654321));

        // c) Iterate using Iterator
        System.out.println("Contact list:");
        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
