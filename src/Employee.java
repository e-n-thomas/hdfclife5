public class Employee {
    private String name;
    private String role;
    private int salary;

    public Employee(String name, String role,int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    public int getSalary() {return salary;}
}
