package controller;


import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;
import storage.EmployeeFromFileBinary;
import storage.IEployeeData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    //    // Duyệt mảng employee để hiển thị nhân viên
//    public static void displayEmployee(ArrayList<Employee> arr){
//        for (int i = 0; i < arr.size() ; i++) {
//            System.out.println(arr.get(i));
//        }
//    }
    public static IEployeeData emloyeeData = new EmployeeFromFileBinary();
    public static ArrayList<Employee> employeeList = emloyeeData.readFile();

    public static void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        try {
            emloyeeData.writeFile(employeeList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getEmployeeById(String employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            if (employee.getEmployeeID().equals(employeeId)) {
                return i;
            }
        }
        return -1;
    }

    public static void editEmployeeByIndex(int index, Employee employee) {
        employeeList.set(index, employee);
        try {
            emloyeeData.writeFile(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
