import java.util.Scanner;
public class NTS {
    int std_id;
    String std_name;
    int marks_obt;
    String address;
    NTS next, back, first, pre;

    NTS() {
        first = null;
    }

    void entry() {
        Scanner s = new Scanner(System.in);
        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {
            NTS cur = new NTS();
            System.out.print("Enter Roll No: ");
            cur.std_id = s.nextInt();
            s.nextLine();
            System.out.print("Enter Name: ");
            cur.std_name = s.nextLine();
            System.out.print("Enter Marks: ");
            cur.marks_obt = s.nextInt();
            s.nextLine();
            System.out.print("Enter Address: ");
            cur.address = s.nextLine();

            cur.next = null;
            cur.back = null;

            if (first == null) {
                first = pre = cur;
            } else {
                pre.next = cur;
                cur.back = pre;
                pre = cur;
            }

            System.out.print("Add another student? (y/n): ");
            ch = s.next().charAt(0);
        }
    }
            
    int size() {
        int count = 0;
        NTS temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void count_pass_fail() {
        int pass = 0, fail = 0;
        NTS temp = first;

        System.out.println("\nAll Student Records:");
        while (temp != null) {
            System.out.println("Std_ID: " + temp.std_id + ", Std_Name: " + temp.std_name +", Obt_Marks: " + temp.marks_obt+", Address: " + temp.address);

            if (temp.marks_obt >= 50) {
                pass++;
            } else {
                fail++;
            }
            temp = temp.next;
        }

        System.out.println("\nTotal Passed: " + pass);
        System.out.println("Total Failed: " + fail);
    }

    void deleteFailStudents() {
        System.out.println("\nDeleting failed students...");
        NTS temp = first;

        while (temp != null) {
            if (temp.marks_obt < 50) {
                
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.back = null;
                    }
                } else {
                    if (temp.back != null) {
                        temp.back.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.back = temp.back;
                    }
                }
            }
            temp = temp.next;
        }
    }

    void display() {
        NTS temp = first;
        System.out.println("\nRemaining Students:");
        while (temp != null) {
            System.out.println("Roll No: " + temp.std_id +", Name: " + temp.std_name +", Marks: " + temp.marks_obt+", Address: " + temp.address);
            temp = temp.next;
        }
    }
}

