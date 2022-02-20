public class ParttimeEmployee extends Employee {
    public static final  int SALARYPERHOUR = 100000;
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

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }


    public  double getNetSalary(){
        double result = workHour * SALARYPERHOUR;
        return result;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "employeeID='" + super.getEmployeeID() + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", workHours=" + workHour +
                '}';
    }
}

