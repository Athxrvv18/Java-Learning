public class CONSTRUCTERS {
    

    public static void main(String[] args) {

        Student s1 = new Student("Atharv");
        System.out.println(s1.name);

    }
}

class Student{

    String name;

    Student(String name ){
        this.name = name;
        System.out.println("CONSTRUTOR IS CREATED : ");

    }
}
