import java.util.Scanner;
public class MyDate {
    int day;
    int month;
    int year;

    void get(){
    Scanner s = new Scanner(System.in);
        System.out.println("Enter day:");
        day = s.nextInt();
         System.out.println("Enter month:");
        month = s.nextInt();
         System.out.println("Enter year:");
        year = s.nextInt();
    }
    
    void display(){
        System.out.println("Formatted Date: "+day+"/"+month+"/"+year);
    }
}
