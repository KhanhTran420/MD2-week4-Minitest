public class ParttimeEmployee extends Employee {
    private double workHour;

    public ParttimeEmployee(){

    }

    public ParttimeEmployee(double workHour) {
        this.workHour = workHour;
    }

    public ParttimeEmployee(String employeeID, String fullName, int age, String phoneNumber, String email, double workHour) {
        super(employeeID, fullName, age, phoneNumber, email);
        this.workHour = workHour;
    }
}

