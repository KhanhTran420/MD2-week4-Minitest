public class FulltimeEmployee extends  Employee {
    private int bonus;
    private int fineMoney;
    private int baseSalary;

    public FulltimeEmployee(){

    }

    public FulltimeEmployee(int bonus, int fineMoney, int baseSalary) {
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public FulltimeEmployee(String employeeID, String fullName, int age, String phoneNumber, String email, int bonus, int fineMoney, int baseSalary) {
        super(employeeID, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.fineMoney = fineMoney;
        this.baseSalary = baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(int fineMoney) {
        this.fineMoney = fineMoney;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public  double getNetSalary(){
        double result = baseSalary + (bonus - fineMoney);
        return  result;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "employeeID='" + super.getEmployeeID() + '\'' +
                ", fullName='" + super.getFullName() + '\'' +
                ", age=" + super.getAge() +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", bonus=" + bonus +
                ", fineMoney=" + fineMoney +
                ", basicSalary=" + baseSalary +
                '}';
    }
}
