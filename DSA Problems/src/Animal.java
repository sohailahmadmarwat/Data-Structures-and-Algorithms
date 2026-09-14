class Animal {
    public String name;
    public int feedingTime;
    Animal(String n, int time) {
        name = n;
        feedingTime = time;
    }
    public void display() {
        System.out.println("Animal Name: " + name);
        System.out.println("Feeding Time: " + feedingTime + ":00");
    }
}