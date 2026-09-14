import java.util.Scanner;
public class TestEmployee_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        int sal = sc.nextInt();
        System.out.print("Enter working hours per day: ");
        int hours = sc.nextInt();
        Employee_data emp = new Employee_data();
        emp.getInfo(sal, hours);
        emp.AddSal();
        emp.AddWork();
        emp.displaySalary();
    }
}
