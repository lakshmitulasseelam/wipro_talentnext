import java.util.*;
public class TreeSetOperations {
	public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Zara");
        names.add("Bob");
        names.add("Mira");
        names.add("Alice");

      
        System.out.println("Reversed TreeSet:");
        Iterator<String> descIt = names.descendingIterator();
        while (descIt.hasNext()) {
            System.out.println(descIt.next());
        }

 
        System.out.println("\nTreeSet using Iterator:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

      
        String searchName = "Bob";
        if (names.contains(searchName)) {
            System.out.println("\n" + searchName + " exists in TreeSet.");
        } else {
            System.out.println("\n" + searchName + " does not exist in TreeSet.");
        }
    }

}
