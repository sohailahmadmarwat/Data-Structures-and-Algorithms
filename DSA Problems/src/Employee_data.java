import java.util.Scanner;
class Employee_data {
    int salary;
    int workHours;
    void getInfo(int sal, int hours) {
        salary = sal;
        workHours = hours;
    }
    void AddSal() {
        if (salary < 50000) {
            salary += 1000;
        }
    }
    void AddWork() {
        if (workHours > 6) {
            salary += 500;
        }
    }
    void displaySalary() {
        System.out.println("Final Salary of Employee: Rs. " + salary);
    }
}

