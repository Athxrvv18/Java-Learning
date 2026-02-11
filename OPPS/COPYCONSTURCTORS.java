public class COPYCONSTURCTORS {
    

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "atharv";
        s1.rollNo= 101;
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        System.out.println(s1.name + " " + s1.rollNo + s1.marks[0] + s1.marks[1]);

        student s2 = new student(s1);
        s1.marks[0] = 80;
        s1.marks[1] = 70;

    }
}

class student{
    int rollNo;
    String name;
    int marks[];

    student()
   
}
