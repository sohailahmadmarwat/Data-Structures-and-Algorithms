import java.util.Scanner;
public class Node {
    int data;
    Node left, right;
    int rear, front, h;
    Node[] q = new Node[100];
    
    Node() {
        front = rear = -1;
    }
    
    Scanner s = new Scanner(System.in);

    void create(Node ptr) {
    Node newnode = new Node();
    System.out.println("Enter data:");
    newnode.data = s.nextInt();
    newnode.left = null;
    newnode.right = null;
    Node temp = null;

    while (ptr != null) {
        if (newnode.data == ptr.data) {
            System.out.println("Duplicate value!");
            return;
        }
        
        if (newnode.data < ptr.data) {
            temp = ptr;
            ptr = ptr.left;
        } else {
            temp = ptr;
            ptr = ptr.right;
        }
    }
    
    if (newnode.data < temp.data) {
        temp.left = newnode;
    } else {
        temp.right = newnode;
    }
}
    
    void pre(Node ptr) {
        if (ptr != null) {
            System.out.print(ptr.data + " ");
            pre(ptr.left);
            pre(ptr.right);
        }
    }

    void In(Node ptr) {
        if (ptr != null) {
            In(ptr.left);
            System.out.print(ptr.data + " ");
            In(ptr.right);
        }
    }

    void post(Node ptr) {
        if (ptr != null) {
            post(ptr.left);
            post(ptr.right);
            System.out.print(ptr.data + " ");
        }
    }
    
    // DFS (Depth First Search)
    void DFS(Node ptr) {
        if (ptr != null) {
            System.out.print(ptr.data + " ");
            DFS(ptr.left);
            DFS(ptr.right);
        }
    }

    void Enq(Node x) {
        if (rear >= q.length - 1) {
            System.out.println("Queue is Full.");
            return;
        }
        rear++;
        q[rear] = x;
        if (front == -1) {
            front = 0;
        }
    }

    Node Deq() {
        if (front == -1) {
            System.out.println("Queue is Empty.");
            return null;
        }
        Node temp = q[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return temp;
    }

    boolean isEmpty() {
        return front == -1;
    }
    
    //BFS (Breadth First Search)
    void BFS(Node ptr) {
        if (ptr == null) {
            System.out.println("Tree is empty.");
            return;
        }
        
        Enq(ptr);
        
        while (!isEmpty()) {
            Node temp = Deq();
            System.out.print(temp.data + " ");
            
            if (temp.left != null) {
                Enq(temp.left);
            }
            if (temp.right != null) {
                Enq(temp.right);
            }
        }
    }

    int MIN(Node ptr) {
        if (ptr == null) {
            System.out.println("Tree is empty.");
            return -1;
        }
        while(ptr.left != null) {
            ptr = ptr.left;
        }
        System.out.println("MINIMUM : " + ptr.data);
        return ptr.data;
    }

    int MAX(Node ptr) {
        if (ptr == null) {
            System.out.println("Tree is empty.");
            return -1;
        }
        while(ptr.right != null) {
            ptr = ptr.right;
        }
        System.out.println("MAXIMUM : " + ptr.data);
        return ptr.data;
    }

    int height(Node ptr) {
        if (ptr == null) {
            return 0;
        }
        
        int l = height(ptr.left);
        int r = height(ptr.right);
        
        if (l > r) {
            return 1 + l;
        } else {
            return 1 + r;
        }
    }

    boolean search(int target, Node root) {
        if (root == null) {
            return false;
        }
        
        if (root.data == target) {
            return true;
        } else if (target < root.data) {
            return search(target, root.left);
        } else {
            return search(target, root.right);
        }
    }

    int countNodes(Node ptr) {
        if (ptr == null) {
            return 0;
        }
        return 1 + countNodes(ptr.left) + countNodes(ptr.right);
    }
    
    void displayLevelNodes(Node ptr, int level) {
        if (ptr == null) {
            return;
        }
        
        if (level == 1) {
            System.out.print(ptr.data + " ");
        } else if (level > 1) {
            displayLevelNodes(ptr.left, level - 1);
            displayLevelNodes(ptr.right, level - 1);
        }
    }

    Node deleteNode(Node ptr, int key) {
        if (ptr == null) {
            System.out.println("Node not found!");
            return ptr;
        }
        
        if (key < ptr.data) {
            ptr.left = deleteNode(ptr.left, key);
        } else if (key > ptr.data) {
            ptr.right = deleteNode(ptr.right, key);
        } else {
            // Node with only one child or no child
            if (ptr.left == null) {
                return ptr.right;
            } else if (ptr.right == null) {
                return ptr.left;
            }
            
            // Node with two children: Get inorder successor
            ptr.data = minValue(ptr.right);
            
            // Delete the inorder successor
            ptr.right = deleteNode(ptr.right, ptr.data);
        }
        return ptr;
    }
    
    int minValue(Node ptr) {
        int minv = ptr.data;
        while (ptr.left != null) {
            minv = ptr.left.data;
            ptr = ptr.left;
        }
        return minv;
    }

    int countLeafNodes(Node ptr) {
        if (ptr == null) {
            return 0;
        }
        if (ptr.left == null && ptr.right == null) {
            return 1;
        }
        return countLeafNodes(ptr.left) + countLeafNodes(ptr.right);
    }
}

