/*
Question:
Create a class Rectangle:

Attributes: length, width

Constructor to initialize values

Method area() to return area

Method perimeter() to return perimeter

In main():

Create object using constructor

Print area and perimeter

👉 Focus: Constructor + returning values from methods. */

public class Que2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.Area();
        r1.perimeter();
    }
}

class Rectangle {
    float length;
    float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void Area() {

        System.out.println("Area of Reactange : " + length * width);
    }

    public void perimeter() {
        System.out.println("PERIMERTER OF REACTAGE : " + 2 * (length + width));
    }

}
