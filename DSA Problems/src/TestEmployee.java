public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("M. Umar", 2021, 30000, "Islamabad");
        Employee e2 = new Employee("Adil Khan", 2010, 50000, "Lahore");
        Employee e3 = new Employee("Zubair", 1999, 20000, "D.I.Khan");
        System.out.printf("%-12s %-17s %-10s %-15s%n", "Name", "Year of joining", "Salary", "Address");
        System.out.println("---------------------------------------------------------------");
        e1.display();
        e2.display();
        e3.display();
    }
}