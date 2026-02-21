/*

4️⃣ Medium–Hard – Polymorphism

Question:
Create a class Shape:

Method area()

Create subclasses:

Circle

Rectangle

Override area() in both classes.

In main():

Create reference of Shape

Assign it to Circle object

Assign it to Rectangle object

Call area() for both

👉 Focus: Runtime Polymorphism (Dynamic Method Dispatch).*/

public class Que4 {

    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.Area(3, 5);
        s2.Area(10, 7);

    }
}

class Shape {

    void Area(int l, int w) {
    }
}

class Circle extends Shape {

    void Area( int pi ,int r) {
        System.out.println("Area of circle is " + 3.14 * (r * r));
    }
}

class Rectangle extends Shape {

    void Area(int l, int w) {
        System.out.println("Area of Reactage : " + l * w);

    }

}