class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;
    Employee(String n, int y, int s, String a) {
        name = n;
        yearOfJoining = y;
        salary = s;
        address = a;
    }
    void display() {
        System.out.printf("%-12s %-17d %-10d %-15s%n", name, yearOfJoining, salary, address);
    }
}


