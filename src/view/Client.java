package view;

import controller.EmployeeManager;
import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    private static ArrayList<Employee> employeesListClient = EmployeeManager.employeeList;

    public static void main(String[] args) {


        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Thêm mới nhân viên");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Sửa thông tin nhân viên");
            System.out.println("4. xóa nhân viên khỏi danh sách");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    Employee newEmployee = creatNewEmployee();
                    EmployeeManager.addNewEmployee(newEmployee);
                    break;
                case 2:
                    showAllEmployee();
                    break;
                case 3:
                   editEmployee();
                    break;
                case 4:
                     deleteEmployee();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chưa nhập lựa chọn!");
            }
        }
    }

    public static void showAllEmployee(){
        for (Employee e : employeesListClient){
            System.out.println(e);
        }
    }

    public static void deleteEmployee(){
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("1. Xóa nhân viên theo mã");
        System.out.println("2. Xóa nhân viên theo tên");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        if (choice == 1){
            deleteEmployeeByID();
        }
        if (choice == 2){
            deleteEmployeeByName();
        }
    }



    public static void deleteEmployeeByID() {
        Scanner inputID = new Scanner(System.in);
        System.out.println(" Nhập ID nhân viên muốn xóa: ");
        String ID = inputID.nextLine();

//        for (int i = 0; i < employeesListClient.size(); i++) {
//            if (employeesListClient.get(i).getEmployeeID().equals(ID)) {
//                employeesListClient.remove(i);
//            }
//        }

        int deleteIndex = EmployeeManager.findEmpoyeeIndexById(ID);
        EmployeeManager.removeEmployeeByIndex(deleteIndex);
    }

    public static void deleteEmployeeByName() {
        Scanner inputName = new Scanner(System.in);
        System.out.println(" Nhập tên nhân viên muốn xóa: ");
        String name = inputName.nextLine();

        int deleteIndex = EmployeeManager.findEmployeeIndexByName(name);
        EmployeeManager.removeEmployeeByIndex(deleteIndex);
    }



//    public static void addNewEmployee(){
//        int choice = -1;
//        Scanner inputChoice = new Scanner(System.in);
//        while (choice!=0){
//            System.out.println("Add new employee:");
//            System.out.println("1. New part time");
//            System.out.println("2. New full time ");
//            System.out.println("0. Return to main menu ");
//            choice = inputChoice.nextInt();
//            switch (choice){
//                case 1:
//                    Employee fulltimeEmployee = creatNewFulltimeEmployee();
//                    EmployeeManager.addNewEmployee(fulltimeEmployee);
//                    break;
//                case 2:
//                    Employee parttimeEmployee = createNewPartTimeEmployee();
//                    EmployeeManager.addNewEmployee(parttimeEmployee);
//                    break;
//                case 0:
//                    return;
//                default:
//                    System.out.println("please let's choose one!");
//
//
//            }
//        }
//    }

    public static Employee creatNewEmployee() {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        Employee newEmployee = null;
        System.out.println("1. Thêm mới nhân viên Fulltime");
        System.out.println("2. Thêm mới nhân viên Parttime");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        if (choice == 1) {
            newEmployee = creatNewFulltimeEmployee();
        }
        if (choice == 2) {
            newEmployee = createNewPartTimeEmployee();
        }
        return newEmployee;
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


    public static void  editEmployee(){
        Scanner input = new Scanner(System.in);
        int choice = -1;
        System.out.println("1. Sửa nhân viên theo id");
        System.out.println("2. Sửa nhân viên theo tên");
        System.out.println("Nhập lựa chọn: ");
        choice = input.nextInt();
        if (choice == 1){
            editEmployeeByID();
        }
        if (choice == 2){
            editEmployeeByName();
        }
    }

    public static void editEmployeeByID(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên muốn sửa: ");
        String editID = input.nextLine();
        Employee editEmployee = creatNewEmployee();
        int editIndex = EmployeeManager.findEmpoyeeIndexById(editID);
        EmployeeManager.editEmployeeByIndex(editIndex,editEmployee);
    }

    public static void editEmployeeByName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên nguyên liệu muốn sửa: ");
        String editName = input.nextLine();

        Employee editEmployee = creatNewEmployee();
        int editIndex = EmployeeManager.findEmployeeIndexByName(editName);
        EmployeeManager.editEmployeeByIndex(editIndex,editEmployee);
    }


}




