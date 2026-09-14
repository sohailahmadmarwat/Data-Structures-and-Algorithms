import java.util.Scanner;
public class TestNode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Node ob = new Node();
        Node root = null;
        int choice;

        do {
            System.out.println("\n```````BST MENU```````");
            System.out.println("[1]. Create Binary Tree");
            System.out.println("[2]. Traverse Binary Tree");
            System.out.println("  [2.1] Depth First Search (All cases)");
            System.out.println("  [2.2] Breadth First Search");
            System.out.println("[3]. Find smallest and largest node");
            System.out.println("[4]. Find depth of the Tree");
            System.out.println("[5]. Search particular node");
            System.out.println("[6]. Count Total Nodes");
            System.out.println("[7]. Display nodes of particular level");
            System.out.println("[8]. Delete particular node");
            System.out.println("[9]. Count all leaf nodes");
            System.out.println("[10]. Exit");
            System.out.print("\nMy choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter root data: ");
                    root = new Node();
                    root.data = s.nextInt();
                    root.left = null;
                    root.right = null;

                    char ch = 'y';
                    while (ch == 'y' || ch == 'Y') {
                        ob.create(root);
                        System.out.print("Add more (Y/N)? ");
                        ch = s.next().charAt(0);
                    }
                    break;

                case 2:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                        break;
                    }
                    System.out.println("\n[2.1] Depth First Search(all cases)");
                    System.out.println("[2.2] Breadth First Search");
                    System.out.print("Enter choice: ");
                    int subChoice = s.nextInt();

                    if (subChoice == 1) {
                        System.out.print("\nPre-order Traversal: ");
                        ob.pre(root);
                        System.out.print("\nIn-order Traversal: ");
                        ob.In(root);
                        System.out.print("\nPost-order Traversal: ");
                        ob.post(root);
                        System.out.println();
                    } else if (subChoice == 2) {
                        System.out.print("BFS Traversal: ");
                        ob.BFS(root);
                        System.out.println();
                    } else {
                        System.out.println("Invalid choice...");
                    }
                    break;

                case 3:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        ob.MIN(root);
                        ob.MAX(root);
                    }
                    break;

                case 4:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.println("Depth/Height of tree: " + ob.height(root));
                    }
                    break;

                case 5:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.print("Enter value to search: ");
                        int target = s.nextInt();
                        if (ob.search(target, root)) {
                            System.out.println("Successful Search.");
                        } else {
                            System.out.println("False Search.");
                        }
                    }
                    break;

                case 6:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.println("Total nodes: " + ob.countNodes(root));
                    }
                    break;

                case 7:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.print("Enter level to display: ");
                        int level = s.nextInt();
                        int height = ob.height(root);
                        if (level < 1 || level > height) {
                            System.out.println("Invalid level...Tree height is " + height);
                        } else {
                            System.out.print("Nodes at level " + level + ": ");
                            ob.displayLevelNodes(root, level);
                            System.out.println();
                        }
                    }
                    break;

                case 8:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.print("Enter value to delete: ");
                        int delVal = s.nextInt();
                        root = ob.deleteNode(root, delVal);
                        System.out.println("Node deleted successfully.");
                    }
                    break;

                case 9:
                    if (root == null) {
                        System.out.println("Tree is empty.");
                    } else {
                        System.out.println("Total leaf nodes: " + ob.countLeafNodes(root));
                    }
                    break;

                case 10:
                    System.out.println("Exiting......");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 10);
    }
}
