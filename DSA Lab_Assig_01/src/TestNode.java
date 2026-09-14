public class TestNode {
    public static void main(String[] args) {
        Node ob = new Node();
        System.out.println("=== Create Initial List ===");
        ob.entry();
        ob.display();
        System.out.println("\n=== Delete Smallest ===");
        ob.delSmallestInfo();
        ob.display();
        System.out.println("\n=== Delete All Occurrences ===");
        ob.delGivenInfo();
        ob.display();
        System.out.println("\n=== Return Kth Element ===");
        ob.returnKth();
        System.out.println("\n=== Delete Kth Element ===");
        ob.delKth();
        ob.display();
        System.out.println("\n=== Divide List into Two ===");
        ob.dividelist();
        System.out.println("\n=== Merge Two Lists ===");
        ob.mergeList();
        System.out.println("\n=== Insert Item ===");
        ob.insertItem();
        ob.display();
        System.out.println("\n=== Program Finished ===");
    }
}
