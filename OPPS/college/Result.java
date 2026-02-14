public // File: Result.java
package college;

public class Result extends Marks {

    public Result(int rollNo, String name, int sub1, int sub2, int sub3) {
        super(rollNo, name, sub1, sub2, sub3);
    }

    public void displayResult() {
        displayStudent();
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());

        if (calculateAverage() >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
 Result {
    
    
}
