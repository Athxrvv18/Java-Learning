class Student {
    int roll;
    String name;
    int[] marks;   // Array of 3 subjects

    // Normal Constructor
    Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;   // Direct reference copy
    }

    // Copy Constructor (Shallow Copy)
    Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
        this.marks = s.marks;   // Same array reference
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] m = {85, 90, 80};

        Student s1 = new Student(101, "Atharv", m);
        Student s2 = new Student(s1);   // Copy constructor

        // Changing copied object marks
        s2.marks[0] = 50;

        s1.display();
        System.out.println("-----");
        s2.display();
    }
}
