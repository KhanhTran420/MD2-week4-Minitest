import java.util.Scanner;

public class Method {
    // Duyệt mảng employee để hiển thị nhân viên
    public static void displayEmployee(Employee[] employees){
        for (Employee e: employees
        ){
            System.out.println(e);
        }
    }

     // Thêm mới nhân viên
    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee){
        // Khai báo mảng mới
        Employee[] newEmployeeList = new Employee[employees.length + 1];
        // Copy mảng cũ sang mảng mới
        for (int i = 0; i < employees.length ; i++) {
            newEmployeeList[i] = employees[i];
        }
        // Gán nhân viên mới vào phần tử cuối
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }


    public static Employee creatNewFulltimeEmployee(){
        Scanner inputIDFT = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên Fulltime: ");
        String employeeID = inputIDFT.nextLine();

        Scanner inputFullNameFT = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Fulltime: ");
        String fullName = inputFullNameFT.nextLine();

        Scanner inputAgeFT = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Fulltime: ");
        int age = inputAgeFT.nextInt();

        Scanner inputPhoneFT = new Scanner(System.in);
        System.out.println("Nhập SĐT nhân viên Fulltime: ");
        String phoneNumber = inputPhoneFT.nextLine();

        Scanner inputEmailFT = new Scanner(System.in);
        System.out.println("Nhập email nhân viên Fulltime: ");
        String email = inputEmailFT.nextLine();


        Scanner inputBonusFT = new Scanner(System.in);
        System.out.println("Nhập tiền thưởng nhân viên Fulltime: ");
        int bonus = inputBonusFT.nextInt();

        Scanner inputFineMoneyFT = new Scanner(System.in);
        System.out.println("Nhập tiền phạt nhân viên Fulltime: ");
        int fineMoney = inputFineMoneyFT.nextInt();

        Scanner inputBaseSalaryFT = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản nhân viên Fulltime: ");
        int baseSalary = inputBaseSalaryFT.nextInt();

        Employee newEmployee = new FulltimeEmployee(employeeID, fullName, age, phoneNumber, email, bonus, fineMoney, baseSalary);
        return newEmployee;

    }

    public static Employee createNewPartTimeEmployee() {
        Scanner inputIDPT = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên PartTime: ");
        String employeeID = inputIDPT.nextLine();

        Scanner inputFullNamePT = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên PartTime: ");
        String fullName = inputFullNamePT.nextLine();

        Scanner inputAgePT = new Scanner(System.in);
        System.out.println("Nhập tuổi của nhân viên PartTime");
        int age = inputAgePT.nextInt();

        Scanner inputPhonePT = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên PartTime: ");
        String phoneNumber = inputPhonePT.nextLine();

        Scanner inputEmailPT = new Scanner(System.in);
        System.out.println("Nhập email nhân viên PartTime: ");
        String email = inputEmailPT.nextLine();

        Scanner inputHourPT = new Scanner(System.in);
        System.out.println("Nhập số giờ làm nhân viên PartTime: ");
        double hour = inputHourPT.nextDouble();

        Employee newEmployee = new ParttimeEmployee(employeeID, fullName, age, phoneNumber, email, hour);
        return newEmployee;
    }

    public static double getAllTimeEmployeeSalary(Employee[] employees){
        double sum = 0;
        double avg = 0;
        int count = 0;
        for (int i = 0; i < employees.length ; i++) {
            sum += employees[i].getNetSalary();
            count++;
        }
        avg=sum/count;
        return  avg;
    }


    public static void EmployeeFTLowerSalary(Employee[] employees){
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] instanceof FulltimeEmployee){
                double netSalary = employees[i].getNetSalary();
                if(netSalary < getAllTimeEmployeeSalary(employees)){
                    System.out.println(employees[i].getFullName());
                }
            }

        }
    }

    public static double SumSalaryPartTime(Employee[] employees){
        double sum = 0;
        for (int i = 0; i < employees.length ; i++) {
            if(employees[i] instanceof ParttimeEmployee){
                sum = sum + employees[i].getNetSalary();
            }

        }
        return sum;
    }
    public static void SortSalaryFullTime(Employee[] employees) {
        int temp = 0;
        for (int i = 0; i < employees.length ; i++) {
            for (int j = i+1; j < employees.length ; j++) {
                if(employees[j] instanceof FulltimeEmployee){
                    if (employees[j].getNetSalary() < employees[i].getNetSalary()){

                    }
                }
            }
        }
    }
}
