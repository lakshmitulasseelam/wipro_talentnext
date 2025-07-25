
public class MainApp {
	public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "John", "john@example.com", "Male", 50000);
        Employee e2 = new Employee(102, "Sara", "sara@example.com", "Female", 60000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        e1.GetEmployeeDetails();
        e2.GetEmployeeDetails();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);
        System.out.println("After deletion:");
        for (Employee e : db.list) {
            e.GetEmployeeDetails();
        }
    }

}
