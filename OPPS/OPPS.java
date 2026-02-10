public class OPPS {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(10);
        System.out.println(p1.getColor() + " " + p1.getTip());

    }
}

class Pen {

    private String color;
    private int Tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.Tip;
    }
    void setColor(String Color) {
        this.color = Color; 
    }

    void setTip(int Tip) {
        this.Tip = Tip;
    }
}