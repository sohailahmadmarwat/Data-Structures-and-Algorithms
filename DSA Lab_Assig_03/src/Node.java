import java.util.Scanner;
class Node {
    int data;
    Node next, first, cur, pre;

    Node() {
        first = pre = null;
    }

    void entry() {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            Node newNode = new Node();
            System.out.print("Enter data: ");
            newNode.data = sc.nextInt();
            newNode.next = null;

            if (first == null) {
                first = newNode;
            } else {
                cur = first;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = newNode;
            }

            System.out.print("Do you want to add more nodes? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    void show() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
        cur = first;
        System.out.print("Linked List: ");
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    void displayOdd() {
        cur = first;
        System.out.print("Odd elements: ");
        while (cur != null) {
            if (cur.data % 2 != 0) {
                System.out.print(cur.data + " ");
            }
            cur = cur.next;
        }
        System.out.println();
    }

    void displayFromPosition(int pos) {
        cur = first;
        int count = 1;
        while (cur != null) {
            if (count >= pos) {
                System.out.print(cur.data + " ");
            }
            cur = cur.next;
            count++;
        }
        System.out.println();
    }

    void displayReverse(Node n) {
        if (n == null) return;
        displayReverse(n.next);
        System.out.print(n.data + " ");
    }

    void largestSmallest() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
        int largest = first.data, smallest = first.data;
        cur = first.next;
        while (cur != null) {
            if (cur.data > largest) largest = cur.data;
            if (cur.data < smallest) smallest = cur.data;
            cur = cur.next;
        }
        System.out.println("Largest: " + largest + ", Smallest: " + smallest);
    }

    void swap(int x, int y) {
        if (x == y) return;

        Node prevX = null, currX = first;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = first;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) return;

        if (prevX != null) prevX.next = currY;
        else first = currY;

        if (prevY != null) prevY.next = currX;
        else first = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    void toArray() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }
        int size = 0;
        cur = first;
        while (cur != null) {
            size++;
            cur = cur.next;
        }

        int arr[] = new int[size];
        int i = 0;
        cur = first;
        while (cur != null) {
            arr[i++] = cur.data;
            cur = cur.next;
        }

        System.out.print("Array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}


