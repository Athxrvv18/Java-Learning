// File: MainApp.java
import college.Result;

public class MainApp {
    public static void main(String[] args) {

        Result student1 = new Result(101, "Atharv", 75, 68, 80);
        Result student2 = new Result(102, "Rahul", 30, 35, 28);

        System.out.println("===== Student 1 Result =====");
        student1.displayResult();

        System.out.println("\n===== Student 2 Result =====");
        student2.displayResult();
    }
}
