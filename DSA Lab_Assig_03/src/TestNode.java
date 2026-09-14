import java.util.Scanner;
public class TestNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node list = new Node();
        int choice;
        do {
            System.out.println("\n1. Data Entry");
            System.out.println("2. Data Display");
            System.out.println("3. Display Odd Elements");
            System.out.println("4. Display From Position");
            System.out.println("5. Display Reverse");
            System.out.println("6. Largest & Smallest");
            System.out.println("7. Swap Two Elements");
            System.out.println("8. Convert to Array");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.entry();
                    break;
                case 2:
                    list.show();
                    break;
                case 3:
                    list.displayOdd();
                    break;
                case 4:
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.displayFromPosition(pos);
                    break;
                case 5:
                    System.out.print("Reverse order: ");
                    list.displayReverse(list.first);
                    System.out.println();
                    break;
                case 6:
                    list.largestSmallest();
                    break;
                case 7:
                    System.out.print("Enter first element: ");
                    int x = sc.nextInt();
                    System.out.print("Enter second element: ");
                    int y = sc.nextInt();
                    list.swap(x, y);
                    break;
                case 8:
                    list.toArray();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }
}