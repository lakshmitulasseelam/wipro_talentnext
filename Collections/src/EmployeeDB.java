import java.util.ArrayList;
public class EmployeeDB {
	ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        return list.removeIf(emp -> emp.empId == empId);
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for Employee ID " + empId + " is: " + e.salary;
            }
        }
        return "Employee not found.";
    }

}
