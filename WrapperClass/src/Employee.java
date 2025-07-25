
public class Employee implements Cloneable {
	String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

 class WrapperClass5M {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101, 50000.0);
        Employee empClone = emp1.clone();

       
        emp1.name = "Alice";
        emp1.salary = 60000.0;

        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("Cloned Employee:");
        empClone.display();
    }
}

