import java.util.Scanner;
public class Node {
    int data;
    Node first, pre, cur, next, back;
    Node() {
        first = null;
    }
     Scanner s = new Scanner(System.in);
    public void entry() {
       
        char ch = 'y';
        while (ch == 'y' || ch == 'Y') {
            cur = new Node();
            System.out.print("Enter Node data: ");
            cur.data = s.nextInt();
            cur.next = null;

            if (first == null) {
                cur.back = null;
                first = pre = cur;
            } else {
                cur.back = pre;
                pre.next = cur;
                pre = cur;
            }
            System.out.print("Do you want to add more? (y/n): ");
            ch = s.next().charAt(0);
        }
    }
    public void display() {
        Node temp = first;
        System.out.println("List Elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void delSmallestInfo() {
        if (first == null) {
            System.out.println("List is empty!");
        }
        int smallest = first.data;
        Node temp = first;
        while (temp != null) {
            if (temp.data < smallest) {
                smallest = temp.data;
            }
            temp = temp.next;
        }
        temp = first;
        while (temp.data != smallest) {
            temp = temp.next;
        }
        if (temp == first) {
            first = temp.next;
            if (first != null) {
                first.back = null;
            }
        } else if (temp.next == null) {
            temp.next = null;
            temp.back = null;
        } else {
            temp.back = temp.next;
            temp.next = temp.back;
        }
        System.out.println("Deleted node with smallest info: " + smallest);
    }

    public void delGivenInfo() {
        if (first == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("Enter data whose all ocurances u want to delete: ");
        int target = s.nextInt();

        Node temp = first;
        int flag =0;

        while (temp != null) {
            if (temp.data == target) {
                flag =1;
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.back = null;
                    }
                    temp = first;
                } else if (temp.next == null) {
                    temp.back.next = null;
                    temp = null;
                } else {
                    Node nextTemp = temp.next;
                    temp.back.next = temp.next;
                    temp.next.back = temp.back;
                    temp = nextTemp;
                }
            } else {
                temp = temp.next;
            }
        }
        if (flag==1) {
            System.out.println("All occurrences of " + target + " deleted.");
        } else {
            System.out.println("No node found with info " + target);
        }
    }

    // ---------------- Part 3: Return Kth ----------------
    public int returnKth() {
        System.out.print("Enter the kth element: ");
        int k = s.nextInt();

        Node temp = first;
        int counter = 1;
        while (temp != null) {
            if (counter == k) {
                System.out.println("Kth element (" + k + ") is: " + temp.data);
                return temp.data;
            }
            counter++;
            temp = temp.next;
        }
        System.out.println("Index out of bound!");
        System.exit(0);
        return 0;
    }

    // ---------------- Part 4: Delete Kth ----------------
    public void delKth() {
        System.out.print("Enter the kth element to delete: ");
        int k = s.nextInt();

        Node temp = first;
        int counter = 1;
        int flag =0;
        while (temp != null) {
            if (counter == k) {
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.back = null;
                    }
                } else if (temp.next == null) {
                    temp.next = null;
                    temp.back = null;
                } else {
                    temp.back = temp.next;
                    temp.next = temp.back;
                }
                flag=1;
                break;
            }
            counter++;
            temp = temp.next;
        }

        if (flag==1) {
            System.out.println("Deleted kth element: " + k);
        } else {
            System.out.println("Index out of bound cannot delete.");
        }
    }

    // ---------------- Part 5: Divide List ----------------
    public void dividelist() {
        if (first == null) {
            System.out.println("List is empty!");
            return;
        }

        // count nodes
        int counter = 0;
        Node temp = first;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        temp = first;
        Node sublist1 = new Node();
        Node sublist2 = new Node();

        int n = 1;
        while (n <= counter / 2) {
            sublist1.cur = new Node();
            sublist1.cur.data = temp.data;
            if (sublist1.first == null) {
                sublist1.first = sublist1.pre = sublist1.cur;
            } else {
                sublist1.pre.next = sublist1.cur;
                sublist1.cur.back = sublist1.pre;
                sublist1.pre = sublist1.cur;
            }
            temp = temp.next;
            n++;
        }

        while (n <= counter) {
            sublist2.cur = new Node();
            sublist2.cur.data = temp.data;
            if (sublist2.first == null) {
                sublist2.first = sublist2.pre = sublist2.cur;
            } else {
                sublist2.pre.next = sublist2.cur;
                sublist2.cur.back = sublist2.pre;
                sublist2.pre = sublist2.cur;
            }
            temp = temp.next;
            n++;
        }

        System.out.println("_________");
        System.out.println("New List 1:");
        sublist1.display();
        System.out.println("New List 2:");
        sublist2.display();
    }

    // ---------------- Part 6: Merge Lists ----------------
    public void mergeList() {
        Node list1 = new Node();
        Node list2 = new Node();

        System.out.println("Enter Elements of List 1:");
        list1.entry();
        System.out.println("Enter Elements of List 2:");
        list2.entry();

        Node temp = list1.first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2.first;
        if (list2.first != null) {
            list2.first = temp;
            list2.back = temp;
        }

        first = list1.first;

        System.out.println("Merged List:");
        display();
    }

    // ---------------- Part 7: Insert Unique ----------------
    public void insertItem() {
        System.out.print("Enter item to be inserted: ");
        int m = s.nextInt();

        Node temp = first;
        while (temp != null) {
            if (temp.data == m) {
                System.out.println("Cannot Insert! Node already exists.");
                return;
            }
            if (temp.next != null) {
                temp = temp.next;
            } else {
                break;
            }
        }

        Node newNode = new Node();
        newNode.data = m;
        if (first == null) {
            first = newNode;
        } else {
            temp.next = newNode;
            newNode.back = temp;
        }
        System.out.println("Inserted: " + m);
    }
}
