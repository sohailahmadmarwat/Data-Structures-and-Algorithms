class TestNTS {
    public static void main(String[] args) {
        NTS ob = new NTS();
        ob.entry();
        System.out.println("\nTotal Students: "+ob.size());
        ob.count_pass_fail();
        ob.deleteFailStudents();
        ob.display();
    }
}
