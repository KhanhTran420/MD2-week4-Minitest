import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FulltimeEmployee("PT01", "Tran Quoc Khanh", 23, "0344937058", "KhanhTran@gmail.com", 9000000, 6000000, 15000000);
        employees[1] = new FulltimeEmployee("PT01", "Nguyen Phan Giang", 28, "0384396836", "GiangNguyen@gmail.com", 8000000, 4000000, 12000000);
        employees[2] = new FulltimeEmployee("PT01", "Tran Dat", 27, "0344837034", "DatTran@gmail.com", 8000000, 9000000, 10000000);
        employees[3] = new ParttimeEmployee("PT01", "Nguyen Minh Tuan", 28, "0344893409", "TuanNguyen@gmail.com", 30);
        employees[4] = new ParttimeEmployee("PT01", "Canh Le", 26, "0365382956", "CanhLe@gmail.com", 40);


        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Hiển thị lương trung bình toàn bộ nhân viên");
            System.out.println("3. Hiển thụ nhân viên FullTime có lương thấp hơn trung bình toàn công ty");
            System.out.println("4. Hiển thị số lương phải trả cho nhân viên Part Time");
            System.out.println("5. Thứ tự nhân viên Full Time theo lương tăng dần");
            System.out.println("6. Thêm mới nhân viên Full Time");
            System.out.println("7. Thêm mới nhân viên Part Time");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice){
                case 1:
                    System.out.println("số lượng nhân viên có trong công ty là: " + employees.length);

                    System.out.println("Danh sách nhân viên: ");
                    Method.displayEmployee(employees);
                    break;
                case 2:
                    System.out.println("Lương trung bình toàn bộ nhân viên là: " + Method.getAllTimeEmployeeSalary(employees));
                    break;
                case 3:
                    System.out.println("Nhân viên Full Time có lương thấp hơn lương trung bình toàn công ty: ");
                    Method.EmployeeFTLowerSalary(employees);
                    break;
            }
        }
    }

}




