class Account {
    int emp_id;
    String emp_name;
    int balance;
    double rateOfInterest;
    Account() {
        emp_id = 0;
        emp_name = "Unknown";
        balance = 0;
        rateOfInterest = 0.0;
    }
    Account(int id, String name, int bal, double roi) {
        emp_id = id;
        emp_name = name;
        balance = bal;
        rateOfInterest = roi;
    }
    int get_balance() {
        return balance;
    }
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " cents");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " cents");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void display_balance() {
        int dollars = balance / 100;
        int cents = balance % 100;
        System.out.printf("Current Balance: $%d.%02d\n", dollars, cents);
    }
    void display_account() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + emp_name + " (ID: " + emp_id + ")");
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        display_balance();
    }
}

