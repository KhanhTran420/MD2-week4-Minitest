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
}
