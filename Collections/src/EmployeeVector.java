import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {
	public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(201, "Arun", "arun@example.com", "Male", 45000));
        employees.add(new Employee(202, "Divya", "divya@example.com", "Female", 55000));

        System.out.println("Using Iterator:");
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            it.next().GetEmployeeDetails();
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> en = employees.elements();
        while (en.hasMoreElements()) {
            en.nextElement().GetEmployeeDetails();
        }
    }
}
