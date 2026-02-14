public // File: Marks.java
package college;

public class Marks extends Student {
    protected int sub1, sub2, sub3;

    public Marks(int rollNo, String name, int sub1, int sub2, int sub3) {
        super(rollNo, name);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public int calculateTotal() {
        return sub1 + sub2 + sub3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}
 Marks {
    
}
