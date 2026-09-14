import java.util.Scanner;
public class TestAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Animal Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Feeding Time (hour 0-23): ");
        int time = sc.nextInt();

        Animal a = new Animal(name, time);

        System.out.println("\n--- Animal Details ---");
        a.display();

        sc.close();
    }
}