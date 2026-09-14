import java.util.Scanner;
public class InsertDeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.print("Numbers in Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nEnter location: ");
        int loc = sc.nextInt();
        System.out.print("Enter element to insert: ");
        int elem = sc.nextInt();

        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == loc) {
                newArr[i] = elem;
            } else {
                newArr[i] = arr[j++];
            }
        }

        System.out.print("Array after insertion: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nEnter location to delete: ");
        int delLoc = sc.nextInt();

        int[] delArr = new int[newArr.length - 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == delLoc) continue;
            delArr[j++] = newArr[i];
        }

        System.out.print("Array after deletion: ");
        for (int num : delArr) {
            System.out.print(num + " ");
        }
    }
}
