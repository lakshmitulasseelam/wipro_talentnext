import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
	public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        employees.add("John");
        employees.add("Priya");
        employees.add("Ali");
        employees.add("Nina");

        System.out.println("Employee names using Iterator:");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
