public class INHERNTINCE{

 class Student{
    int rollNo;
    String name;

    Student(int rollNo , String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}



    public static void main(String[] args) {
        Student s1 = new Student(101, "atharv");
        System.out.println(s1.rollNo + " " + s1.name);
    }

}