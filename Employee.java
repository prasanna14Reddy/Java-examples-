// Superclass Employee
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary() {
        System.out.println(name + "'s monthly salary is: $" + salary);
    }
}

// Subclass Professor
class Professor extends Employee {
    private int teachingHours;

    public Professor(String name, double salary, int teachingHours) {
        super(name, salary);
        this.teachingHours = teachingHours;
    }

    @Override
    public void calculateSalary() {
        double totalSalary = salary + (teachingHours * 50); // Assume $50 per teaching hour
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Subclass AdministrativeStaff
class AdministrativeStaff extends Employee {
    private String department;

    public AdministrativeStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void calculateSalary() {
        // Assume an additional $500 for administrative duties
        double totalSalary = salary + 500;
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Subclass Janitor
class Janitor extends Employee {
    private int hoursWorked;

    public Janitor(String name, double salary, int hoursWorked) {
        super(name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        // Assume $10 per hour for janitorial work
        double totalSalary = salary + (hoursWorked * 10);
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create different types of employees
        Employee[] employees = new Employee[3];
        employees[0] = new Professor("Dr. Smith", 5000, 40); // Professor with 40 teaching hours
        employees[1] = new AdministrativeStaff("John Doe", 3000, "HR"); // Administrative staff in HR department
        employees[2] = new Janitor("Jane Doe", 2000, 80); // Janitor worked for 80 hours

        // Calculate total monthly salary for all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.calculateSalary();
            totalSalary += employee.salary;
        }
        System.out.println("Total monthly salary for all employees: $" + totalSalary);
    }
}
// Subclass Secretary
class Secretary extends Employee {
    private double bonus;

    public Secretary(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        // Assume a bonus added to the salary
        double totalSalary = salary + bonus;
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create different types of employees
        Employee[] employees = new Employee[4];
        employees[0] = new Professor("Dr. Smith", 5000, 40); // Professor with 40 teaching hours
        employees[1] = new AdministrativeStaff("John Doe", 3000, "HR"); // Administrative staff in HR department
        employees[2] = new Janitor("Jane Doe", 2000, 80); // Janitor worked for 80 hours
        employees[3] = new Secretary("Alice", 2500, 200); // Secretary with a $200 bonus

        // Calculate total monthly salary including benefits for all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.calculateSalary();
            totalSalary += employee.salary;
        }
        System.out.println("Total monthly salary for all employees: $" + totalSalary);
    }
}// Subclass Secretary
class Secretary extends Employee {
    private double bonus;

    public Secretary(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        // Assume a bonus added to the salary
        double totalSalary = salary + bonus;
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create different types of employees
        Employee[] employees = new Employee[4];
        employees[0] = new Professor("Dr. Smith", 5000, 40); // Professor with 40 teaching hours
        employees[1] = new AdministrativeStaff("John Doe", 3000, "HR"); // Administrative staff in HR department
        employees[2] = new Janitor("Jane Doe", 2000, 80); // Janitor worked for 80 hours
        employees[3] = new Secretary("Alice", 2500, 200); // Secretary with a $200 bonus

        // Calculate total monthly salary including benefits for all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.calculateSalary();
            totalSalary += employee.salary;
        }
        System.out.println("Total monthly salary for all employees: $" + totalSalary);
    }
}// Superclass
class Parent {
    int x = 10;
}

// Subclass
class Child extends Parent {
    int x = 20; // This shadows the 'x' field in the superclass
}
