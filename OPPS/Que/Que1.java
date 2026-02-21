/* Question:
Create a class Student with:

Attributes: name, rollNo, marks

Method: displayDetails()

In main():

Create 2 student objects

Assign values

Print their details

 👉 Focus: Constructor, object creation, method calling. */

public class Que1 {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Atharv";
        s1.rollNo = 101;
        s1.marks = 99.99f;

        s2.name = "Sid";
        s2.rollNo = 102;
        s2.marks = 99.89f;

        s1.displayDetails();
        s2.displayDetails();

    }
}

class Student {
    String name;
    int rollNo;
    float marks;

    public void displayDetails() {
        System.out.println("NAME : " + name + " ROLL NO :  " + rollNo + " MAKRS :  " + marks);
    }
}
