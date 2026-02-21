/* Question:
Create a base class  :

Attributes: name, age

Method: display()

Create a subclass Employee:

Additional attribute: salary

Override display() method to show salary also

In main():

Create an Employee object

Call display()

👉 Focus: Inheritance + Method Overriding + super keyword. */

public class Que3 {

    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.displayDetails();

    }
}

class Person {
    String name;
    int age;

    Person() {
        name = "Atharv";
        age = 19;
    }

    public void displayDetails() {
        System.out.println("NAME : " + this.name + " AGE : " + this.age);
    }

}

class Employee extends Person {

    float salary;

    Employee(){
        salary = 19999f;
    }

    public void displayDetails() {
        System.out.println(" NAME : " + this.name + " AGE : " + this.age + " SALARY : " + salary);
    }
}