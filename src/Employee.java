public class Employee extends Person{

    private double salary;

    public Employee(){
        System.out.println("Inside Employee default;");
    }


    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("Inside Employee Parameterised");
    }
}
