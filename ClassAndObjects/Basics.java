package oops_concepts.ClassAndObjects;

public class Basics {
    public static void main(String[] args) {
        Student student = new Student("Ram",'A',12);
        student.display();
    }
}

class Student{
    String studentName;
    char section;
    int rollNo;
    Student(String studentName,char section,int rollNo){
        this.studentName = studentName;
        this.section = section;
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println(studentName);
        System.out.println(section);
        System.out.println(rollNo);
    }

}
