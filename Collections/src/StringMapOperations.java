import java.util.HashMap;
import java.util.*;
public class StringMapOperations {
	public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("One", "Apple");
        map.put("Two", "Banana");
        map.put("Three", "Cherry");

        // a) Check if a key exists
        System.out.println("Contains key 'Two'? " + map.containsKey("Two"));

        // b) Check if a value exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // c) Iterate using Iterator
        System.out.println("Iterating over HashMap:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
