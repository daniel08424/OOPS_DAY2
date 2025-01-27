package oops_concepts.abstractClass;

public class Abstraction {
    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        student.studentName("Naveen");
        student.studentAge(20);
        student.show();
    }
}

abstract class Class{
    public abstract void studentName(String name);

    public abstract void studentAge(int age);

    public abstract void show();
}

class StudentDetails extends Class{

    String name;
    int age;

    @Override
    public void studentName(String name) {
        this.name = name;
    }

    @Override
    public void studentAge(int age) {
        this.age = age;
    }

    @Override
    public void show() {
        System.out.println("The name is " + name + " and the age is " + age);
    }
}
