package com.example.cloning;


class Employee implements Cloneable {
    String name;
    int age;
    double salary;

  
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

    
    public static void main(String[] args) {
        try {
           
            Employee emp1 = new Employee("Alice", 25, 50000);
            System.out.println("Original Employee:");
            emp1.printDetails();

            Employee empClone = emp1.clone();
            System.out.println("\nCloned Employee:");
            empClone.printDetails();

          
            emp1.name = "Bob";
            emp1.age = 30;
            emp1.salary = 60000;

            System.out.println("\nAfter modifying original employee:");

            System.out.println("Original Employee:");
            emp1.printDetails();

            System.out.println("Cloned Employee:");
            empClone.printDetails();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
